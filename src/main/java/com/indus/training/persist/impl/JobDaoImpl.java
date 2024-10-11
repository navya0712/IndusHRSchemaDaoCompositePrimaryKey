package com.indus.training.persist.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.indus.training.persist.dao.IJobDao;
import com.indus.training.persist.entity.Job;
import com.indus.training.persist.exceptions.JobDaoException;
import com.indus.training.persist.util.HibernateUtil;

public class JobDaoImpl implements IJobDao {

	@Override
	public Boolean insertJob(Job job) throws JobDaoException {
		if (job == null) {
			throw new JobDaoException("Job Object Cannot be null");
		}
		Session session = null;
		boolean isInserted = false;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.getTransaction().begin();
			Job existingJob = (Job) session.get(Job.class, job.getJobId());
			if (existingJob == null) {
				session.save(job);
				isInserted = true;
			}
			session.getTransaction().commit();
		} catch (HibernateException e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			System.out.println(e);
			throw new JobDaoException("An error Occured while Saving Job Object to database");
			
		}
		return isInserted;
	}

	@Override
	public Job fetchJobById(String jobId) throws JobDaoException {
		Session session = null;
		Job jobObj = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.getTransaction().begin();
			jobObj = (Job) session.get(Job.class, jobId);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			throw new JobDaoException("An error occured while fetching Job Details");
		}
		return jobObj;
	}

	@Override
	public Boolean updateJobById(String jobId, Job job) throws JobDaoException {
		Session session = null;
		boolean isUpdated = false;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.getTransaction().begin();
			Job existingJob = (Job) session.get(Job.class, jobId);
			if (existingJob != null) {
				existingJob.setJobTitle(job.getJobTitle());
				existingJob.setMinSalary(job.getMinSalary());
				existingJob.setMaxSalary(job.getMaxSalary());
				session.update(existingJob);
				isUpdated = true;
			}
			session.getTransaction().commit();
		} catch (HibernateException e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			throw new JobDaoException("An error occured while Updating Job Details");

		}
		return isUpdated;
	}


	@Override
	public Boolean deleteJobById(String jobId) throws JobDaoException {
		Session session = null;
		boolean isDeleted = false;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.getTransaction().begin();
			Job existingJob = (Job) session.get(Job.class, jobId);
			if (existingJob != null) {
				session.delete(existingJob);
				isDeleted = true;
				session.getTransaction().commit();
			}
		} catch (HibernateException e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			throw new JobDaoException("An error occurred while deleting the Job Object");

		}

		return isDeleted;
	}

}
