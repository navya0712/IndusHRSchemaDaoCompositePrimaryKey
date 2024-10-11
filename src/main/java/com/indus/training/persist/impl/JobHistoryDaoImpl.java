package com.indus.training.persist.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.indus.training.persist.dao.IJobHistoryDao;
import com.indus.training.persist.entity.JobHistory;
import com.indus.training.persist.entity.JobHistoryId;
import com.indus.training.persist.exceptions.JobHistoryDaoException;
import com.indus.training.persist.util.HibernateUtil;

public class JobHistoryDaoImpl implements IJobHistoryDao {

	@Override
	public Boolean insertJobHistory(JobHistory jobHistory) throws JobHistoryDaoException {
		if (jobHistory == null) {
			throw new JobHistoryDaoException("JobHistory Object Cannot be null");
		}
		if (jobHistory.getId() == null) {
			throw new JobHistoryDaoException("JobHistory ID Cannot be null");
		}
		Session session = null;
		Boolean isInserted = false;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.getTransaction().begin();
			JobHistory existingJobHistory = (JobHistory) session.get(JobHistory.class, jobHistory.getId());
			if (existingJobHistory == null) {
				session.save(jobHistory);
				isInserted = true;
			}
			session.getTransaction().commit();
		} catch (HibernateException e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			System.out.println(e);
			throw new JobHistoryDaoException("An error occurred while Saving JobHistory Object to the database");
		}
		return isInserted;
	}

	@Override
	public JobHistory fetchJobHistoryById(JobHistoryId jobHistoryId) throws JobHistoryDaoException {
		if (jobHistoryId == null) {
			throw new JobHistoryDaoException("JobHistoryId Object Cannot be null");
		}
		Session session = null;
		JobHistory jobHistoryObj = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.getTransaction().begin();
			jobHistoryObj = (JobHistory) session.get(JobHistory.class, jobHistoryId);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			throw new JobHistoryDaoException("An error occurred while fetching JobHistory Details");
		}
		return jobHistoryObj;
	}

	@Override
	public Boolean updateJobHistoryById(JobHistoryId jobHistoryId, JobHistory jobHistory)
			throws JobHistoryDaoException {
		if (jobHistoryId == null) {
			throw new JobHistoryDaoException("JobHistoryId Object Cannot be null");
		}
		Session session = null;
		Boolean isUpdated = false;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.getTransaction().begin();
			JobHistory existingJobHistory = (JobHistory) session.get(JobHistory.class, jobHistoryId);
			if (existingJobHistory != null) {
				existingJobHistory.setJobId(jobHistory.getJobId());
				existingJobHistory.setDepartmentId(jobHistory.getDepartmentId());
				session.update(existingJobHistory);
				isUpdated = true;
			}
			session.getTransaction().commit();
		} catch (HibernateException e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			throw new JobHistoryDaoException("An error occurred while updating EndDate");
		}
		return isUpdated;
	}

	@Override
	public Boolean deleteJobHistoryById(JobHistoryId jobHistoryId) throws JobHistoryDaoException {
		if (jobHistoryId == null) {
			throw new JobHistoryDaoException("JobHistoryId Object Cannot be null");
		}
		Session session = null;
		Boolean isDeleted = false;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.getTransaction().begin();
			JobHistory existingJobHistory = (JobHistory) session.get(JobHistory.class, jobHistoryId);
			if (existingJobHistory != null) {
				session.delete(existingJobHistory);
				isDeleted = true;
				session.getTransaction().commit();
			}
		} catch (HibernateException e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			throw new JobHistoryDaoException("An error occurred while deleting JobHistory Object");
		}
		return isDeleted;
	}

}
