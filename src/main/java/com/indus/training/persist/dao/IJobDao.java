package com.indus.training.persist.dao;

import com.indus.training.persist.entity.Job;
import com.indus.training.persist.exceptions.JobDaoException;

/**
 * Interface for CRUD operations related to the Job entity.
 */
public interface IJobDao {
	/**
	 * Inserts a new job into the database.
	 *
	 * @param jobObj The job object to be inserted.
	 * @return True if the insertion is successful, false otherwise.
	 * @throws JobDaoException If an error occurs during insertion.
	 */
	public Boolean insertJob(Job job) throws JobDaoException;

	/**
	 * Retrieves a job from the database using its ID.
	 *
	 * @param jobId The ID of the job to retrieve.
	 * @return The job object with the specified ID, or null if not found.
	 * @throws JobDaoException If an error occurs during retrieval.
	 */
	public Job fetchJobById(String jobId) throws JobDaoException;

	/**
	 * Updates the job details of a job identified by its ID.
	 *
	 * @param jobId     The ID of the job to update.
	 * @param job The new job details to set.
	 * @return True if the update is successful, false otherwise.
	 * @throws JobDaoException If an error occurs during the update.
	 */
	public Boolean updateJobById(String jobId, Job job) throws JobDaoException;

	/**
	 * Deletes a job from the database using its ID.
	 *
	 * @param jobId The ID of the job to delete.
	 * @return True if the deletion is successful, false otherwise.
	 * @throws JobDaoException If an error occurs during deletion.
	 */
	public Boolean deleteJobById(String jobId) throws JobDaoException;
}
