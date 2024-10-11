package com.indus.training.persist.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.indus.training.persist.dao.ILocationDao;
import com.indus.training.persist.entity.Location;
import com.indus.training.persist.exceptions.LocationDaoException;
import com.indus.training.persist.util.HibernateUtil;

public class LocationDaoImpl implements ILocationDao {

	@Override
	public Boolean insertLocation(Location locationObj) throws LocationDaoException {
		if (locationObj == null) {
			throw new LocationDaoException("Location Object Cannot be null");
		}
		Session session = null;
		Transaction transaction = null;
		boolean isInserted = false;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.save(locationObj);
			transaction.commit();
			isInserted = true;
		} catch (HibernateException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			System.out.println(e);
			throw new LocationDaoException("An error occurred while saving Location Object to database");
		}
		return isInserted;
	}

	@Override
	public Location fetchLocationById(Integer locationId) throws LocationDaoException {
		Session session = null;
		Location locationObj = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			locationObj = (Location) session.get(Location.class, locationId);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();
			}
			throw new LocationDaoException("An error occurred while fetching Location Details");
		}
		return locationObj;
	}

	@Override
	public Boolean updateLocationById(Integer locationId, Location location) throws LocationDaoException {
		Session session = null;
		Transaction transaction = null;
		Boolean isUpdated = false;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			Location existingLocation = (Location) session.get(Location.class, locationId);
			if (existingLocation != null) {
				existingLocation.setStreetAddress(location.getStreetAddress());
				existingLocation.setPostalCode(location.getPostalCode());
				existingLocation.setCity(location.getCity());
				existingLocation.setStateProvince(location.getStateProvince());
				existingLocation.setCountryId(location.getCountryId());
				session.update(existingLocation);
				transaction.commit();
				isUpdated = true;
			}
		} catch (HibernateException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw new LocationDaoException("An error occurred while updating Location Details");
		}
		return isUpdated;
	}

	
	@Override
	public Boolean deleteLocationById(Integer locationId) throws LocationDaoException {
		Session session = null;
		Transaction transaction = null;
		Boolean isDeleted = false;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			Location existingLocation = (Location) session.get(Location.class, locationId);
			if (existingLocation != null) {
				session.delete(existingLocation);
				transaction.commit();
				isDeleted = true;
			}
		} catch (HibernateException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw new LocationDaoException("An error occurred while deleting Location Object");
		}
		return isDeleted;
	}
}
