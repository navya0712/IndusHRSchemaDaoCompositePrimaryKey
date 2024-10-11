package com.indus.training.persist.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * Table EMPLOYEES Name Null? Type -----------------------------------------
 * -------- ---------------------------- EMPLOYEE_ID NOT NULL NUMBER(6)
 * FIRST_NAME VARCHAR2(20) LAST_NAME NOT NULL VARCHAR2(25) EMAIL NOT NULL
 * VARCHAR2(25) PHONE_NUMBER VARCHAR2(20) HIRE_DATE NOT NULL DATE JOB_ID NOT
 * NULL VARCHAR2(10) SALARY NUMBER(8,2) COMMISSION_PCT NUMBER(2,2) MANAGER_ID
 * NUMBER(6) DEPARTMENT_ID NUMBER(4) Represents Employee entity
 */
@Entity
@Table(name = "EMPLOYEES")
public class Employee {
	/**
	 * Employee's unique ID.
	 */
	@Id
	private Integer employeeId;

	/**
	 * Employee's first name.
	 */
	@Column(name = "FIRST_NAME")
	private String firstName;
	/**
	 * Employee's last name.
	 */
	@Column(name = "LAST_NAME")
	private String lastName;
	/**
	 * Employee's email address.
	 */
	@Column(name = "EMAIL")
	private String email;
	/**
	 * Employee's phone number.
	 */
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	/**
	 * Date the employee was hired.
	 */
	@Column(name = "HIRE_DATE")
	private Date hireDate;
	/**
	 * Job identifier for the employee.
	 */
	@Column(name = "JOB_ID")
	private String jobId;
	/**
	 * Employee's salary.
	 */
	@Column(name = "SALARY")
	private Double salary;
	/**
	 * Employee's commission percentage.
	 */
	@Column(name = "COMMISSION_PCT")
	private Double commissionPct;
	/**
	 * ID of the employee's manager.
	 */
	@Column(name = "MANAGER_ID")
	private Integer managerId;
	/**
	 * ID of the department the employee belongs to.
	 */
	@Column(name = "DEPARTMENT_ID")
	private Integer departmentId;

	/**
	 * Default constructor for the Employee class.
	 */
	public Employee() {

	}

	/**
	 * Gets the employee ID.
	 * 
	 * @return the employee ID
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * Sets the employee ID.
	 * 
	 * @param employeeId the new employee ID
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * Gets the first name.
	 * 
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 * 
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 * 
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 * 
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the email address.
	 * 
	 * @return the email address
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email address.
	 * 
	 * @param email the new email address
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the phone number.
	 * 
	 * @return the phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the phone number.
	 * 
	 * @param phoneNumber the new phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Gets the hire date.
	 * 
	 * @return the hire date
	 */
	public Date getHireDate() {
		return hireDate;
	}

	/**
	 * Sets the hire date.
	 * 
	 * @param hireDate the new hire date
	 */
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	/**
	 * Gets the job ID.
	 * 
	 * @return the job ID
	 */
	public String getJobId() {
		return jobId;
	}

	/**
	 * Sets the job ID.
	 * 
	 * @param jobId the new job ID
	 */
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	/**
	 * Gets the salary.
	 * 
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * Sets the salary.
	 * 
	 * @param salary the new salary
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	/**
	 * Gets the commission percentage.
	 * 
	 * @return the commission percentage
	 */
	public Double getCommissionPct() {
		return commissionPct;
	}

	/**
	 * Sets the commission percentage.
	 * 
	 * @param commissionPct the new commission percentage
	 */
	public void setCommissionPct(Double commissionPct) {
		this.commissionPct = commissionPct;
	}

	/**
	 * Gets the manager ID.
	 * 
	 * @return the manager ID
	 */
	public Integer getManagerId() {
		return managerId;
	}

	/**
	 * Sets the manager ID.
	 * 
	 * @param managerId the new manager ID
	 */
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	/**
	 * Gets the department ID.
	 * 
	 * @return the department ID
	 */
	public Integer getDepartmentId() {
		return departmentId;
	}

	/**
	 * Sets the department ID.
	 * 
	 * @param departmentId the new department ID
	 */
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

}
