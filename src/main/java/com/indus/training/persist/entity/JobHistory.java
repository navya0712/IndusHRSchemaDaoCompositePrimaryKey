package com.indus.training.persist.entity;



import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Name Null? Type ----------------------------------------- --------
 * ---------------------------- EMPLOYEE_ID NOT NULL NUMBER(6) START_DATE NOT
 * NULL DATE END_DATE NOT NULL DATE JOB_ID NOT NULL VARCHAR2(10) DEPARTMENT_ID
 * NUMBER(4) Represents the job history of an employee.
 *
 */
@Entity
@Table(name = "JOB_HISTORY")
public class JobHistory {
	@EmbeddedId
	private JobHistoryId id;
	@Column(name="JOB_ID")
	private String jobId;
	@Column(name="DEPARTMENT_ID")
	private Integer departmentId;

	/**
	 * Default Constructor for JobHistory class
	 */
	public JobHistory() {

	}

	public JobHistoryId getId() {
		return id;
	}

	public void setId(JobHistoryId jobHistoryId) {
		this.id = jobHistoryId;
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
	 * Gets the department ID.
	 *
	 * @return The department ID.
	 */
	public Integer getDepartmentId() {
		return departmentId;
	}

	/**
	 * Sets the department ID.
	 *
	 * @param departmentId The department ID to set.
	 */
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

}
