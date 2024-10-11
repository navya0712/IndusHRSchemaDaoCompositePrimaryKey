package com.indus.training.persist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ----------------------------------------- --------
 * ---------------------------- JOB_ID NOT NULL VARCHAR2(10) JOB_TITLE NOT NULL
 * VARCHAR2(35) MIN_SALARY NUMBER(6) MAX_SALARY NUMBER(6) /** Represents a job
 * with details about the job title, salary range, and job ID.
 *
 */
@Entity
@Table(name = "JOBS")
public class Job {
	@Id
	private String jobId;

	@Column(name = "JOB_TITLE")
	private String jobTitle;
	@Column(name = "MIN_SALARY")
	private Integer minSalary;
	@Column(name = "MAX_SALARY")
	private Integer maxSalary;

	/**
	 * Default constructor for the Job class.
	 */
	public Job() {

	}

	/**
	 * Gets the job ID.
	 * 
	 * @return The job ID.
	 */
	public String getJobId() {
		return jobId;
	}

	/**
	 * Sets the job ID.
	 * 
	 * @param jobId The job ID to set.
	 */
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	/**
	 * Gets the job title.
	 * 
	 * @return The job title.
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * Sets the job title.
	 * 
	 * @param jobTitle The job title to set.
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * Gets the minimum salary for the job.
	 * 
	 * @return The minimum salary.
	 */
	public Integer getMinSalary() {
		return minSalary;
	}

	/**
	 * Sets the minimum salary for the job.
	 * 
	 * @param minSalary The minimum salary to set.
	 */
	public void setMinSalary(Integer minSalary) {
		this.minSalary = minSalary;
	}

	/**
	 * Gets the maximum salary for the job.
	 * 
	 * @return The maximum salary.
	 */
	public Integer getMaxSalary() {
		return maxSalary;
	}

	/**
	 * Sets the maximum salary for the job.
	 * 
	 * @param maxSalary The maximum salary to set.
	 */
	public void setMaxSalary(Integer maxSalary) {
		this.maxSalary = maxSalary;
	}

}
