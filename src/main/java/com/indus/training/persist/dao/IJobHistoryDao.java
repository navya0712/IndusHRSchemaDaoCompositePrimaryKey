package com.indus.training.persist.dao;

import com.indus.training.persist.entity.JobHistory;
import com.indus.training.persist.entity.JobHistoryId;
import com.indus.training.persist.exceptions.JobHistoryDaoException;

/**
 * Interface for CRUD operations related to the JobHistory entity.
 */
public interface IJobHistoryDao {
	/**
	 * Inserts a new job history record into the database.
	 *
	 * @param jobHistoryObj The JobHistory object to be inserted.
	 * @return True if the insertion is successful, false otherwise.
	 * @throws JobHistoryDaoException If an error occurs during the insertion.
	 */
	public Boolean insertJobHistory(JobHistory jobHistory) throws JobHistoryDaoException;

	/**
	 * Retrieves a job history record from the database using the employee ID.
	 *
	 * @param employeeId The ID of the employee whose job history is to be
	 *                   retrieved.
	 * @return The JobHistory object with the specified employee ID, or null if not
	 *         found.
	 * @throws JobHistoryDaoException If an error occurs during retrieval.
	 */
	public JobHistory fetchJobHistoryById(JobHistoryId jobHistoryId) throws JobHistoryDaoException;

	/**
	 * Updates the end date of a job history record identified by the employee ID.
	 *
	 * @param employeeId The ID of the employee whose job history is to be updated.
	 * @param endDate    The new end date to set.
	 * @return True if the update is successful, false otherwise.
	 * @throws JobHistoryDaoException If an error occurs during the update.
	 */
	public Boolean updateJobHistoryById(JobHistoryId jobHistoryId, JobHistory jobHistory) throws JobHistoryDaoException;

	/**
	 * Deletes a job history record from the database using the employee ID.
	 *
	 * @param employeeId The ID of the employee whose job history is to be deleted.
	 * @return True if the deletion is successful, false otherwise.
	 * @throws JobHistoryDaoException If an error occurs during deletion.
	 */
	public Boolean deleteJobHistoryById(JobHistoryId jobHistoryId) throws JobHistoryDaoException;
}
