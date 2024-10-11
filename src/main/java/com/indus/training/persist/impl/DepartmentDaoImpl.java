package com.indus.training.persist.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.indus.training.persist.dao.IDepartmentDao;
import com.indus.training.persist.entity.Department;
import com.indus.training.persist.exceptions.DepartmentDaoException;
import com.indus.training.persist.util.HibernateUtil;

/**
 * Implementation of the {@code IDepartmentDao} interface. Provides
 * implementation methods for adding, retrieving, updating, and deleting
 * departments from the database.
 */
public class DepartmentDaoImpl implements IDepartmentDao {

	/**
	 * Inserts a new department.
	 * 
	 * @param deptObj The department to be inserted.
	 * @return True if the department was successfully added, false otherwise.
	 * @throws DepartmentDaoException If there is an issue with the operation.
	 */
	@Override
	public Boolean insertDepartment(Department deptObj) throws DepartmentDaoException {
		if (deptObj == null) {
			throw new DepartmentDaoException("Department Object Cannot be null");
		}
		Session session = null;
		Boolean isInserted = false;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.getTransaction().begin();
			Department existingDepartment = (Department) session.get(Department.class, deptObj.getDepartmentId());
			if (existingDepartment == null) {
				session.save(deptObj);
				isInserted = true;
			}
			session.getTransaction().commit();
		} catch (HibernateException e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			throw new DepartmentDaoException("An error Occured while Saving Department Object to database");
		}
		return isInserted;
	}

	/**
	 * Retrieves a department by its ID.
	 * 
	 * @param deptId The ID of the department to retrieve.
	 * @return The department with the specified ID, or null if not found.
	 * @throws DepartmentDaoException If there is an issue with the operation.
	 */
	@Override
	public Department fetchDepartmentById(Integer departmentId) throws DepartmentDaoException {
		Session session = null;
		Department deptObj = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.getTransaction().begin();
			deptObj = (Department) session.get(Department.class, departmentId);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			throw new DepartmentDaoException("An error occured while fetching Country Details");
		}
		return deptObj;
	}

	/**
	 * Updates the Department details of a department identified by its ID.
	 * 
	 * @param deparmenttId The ID of the department to update.
	 * @param department   The new department details for the department.
	 * @return True if the update was successful, false otherwise.
	 * @throws DepartmentDaoException If there is an issue with the operation.
	 */
	@Override
	public Boolean updateDepartmentById(Integer departmentId, Department department) throws DepartmentDaoException {
		Session session = null;
		boolean isUpdated = false;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.getTransaction().begin();
			Department existingDepartment = (Department) session.get(Department.class, departmentId);
			if (existingDepartment != null) {
				existingDepartment.setLocationId(department.getLocationId());
				existingDepartment.setDepartmentName(department.getDepartmentName());
				existingDepartment.setManagerId(department.getManagerId());
				session.update(existingDepartment);
				isUpdated = true;
			}
			session.getTransaction().commit();
		} catch (HibernateException e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			throw new DepartmentDaoException("An error occured while Updating Department");

		}
		return isUpdated;
	}

	/**
	 * Deletes a department by its ID.
	 * 
	 * @param deptId The ID of the department to delete.
	 * @return True if the deletion was successful, false otherwise.
	 * @throws DepartmentDaoException If there is an issue with the operation.
	 */
	@Override
	public Boolean deleteDepartmentById(Integer departmentId) throws DepartmentDaoException {
		Session session = null;
		Boolean isDeleted = false;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.getTransaction().begin();
			Department existingDepartment = (Department) session.get(Department.class, departmentId);
			if (existingDepartment != null) {
				session.delete(existingDepartment);
				isDeleted = true;
				session.getTransaction().commit();
			}
		} catch (HibernateException e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			throw new DepartmentDaoException("An error occurred while deleting the Department Object");

		}

		return isDeleted;
	}

}
