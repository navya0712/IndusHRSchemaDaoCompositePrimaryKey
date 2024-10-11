package com.indus.training.persist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents a department with its ID, name, manager ID, and location ID. Name
 * Null? Type ----------------------------------------- --------
 * ---------------------------- DEPARTMENT_ID NOT NULL NUMBER(4) DEPARTMENT_NAME
 * NOT NULL VARCHAR2(30) MANAGER_ID NUMBER(6) LOCATION_ID NUMBER(4)
 * 
 */
@Entity
@Table(name = "DEPARTMENTS")
public class Department {
	/**
	 * The unique identifier for the department.
	 */
	@Id
	private Integer departmentId;

	/**
	 * The name of the department.
	 */
	@Column(name = "DEPARTMENT_NAME")
	private String departmentName;
	/**
	 * The ID of the manager.
	 */
	@Column(name = "MANAGER_ID")
	private Integer managerId;
	/**
	 * The ID of the location of the department.
	 */
	@Column(name = "LOCATION_ID")
	private Integer locationId;

	/**
	 * Default Constructor for creating Department Object
	 */
	public Department() {

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
	 * @param departmentId the department ID to set
	 */
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * Gets the department name.
	 * 
	 * @return the department name
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * Sets the department name.
	 * 
	 * @param departmentName the department name to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
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
	 * @param managerId the manager ID to set
	 */
	public void setManagerId(Integer managetId) {
		this.managerId = managetId;
	}

	/**
	 * Gets the location ID.
	 * 
	 * @return the location ID
	 */
	public Integer getLocationId() {
		return locationId;
	}

	/**
	 * Sets the location ID.
	 * 
	 * @param locationId the location ID to set
	 */
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

}
