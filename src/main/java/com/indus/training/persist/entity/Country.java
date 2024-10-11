package com.indus.training.persist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents a country with its ID, name, and region ID. Name Null? Type
 * ----------------------------------------- --------
 * ---------------------------- COUNTRY_ID NOT NULL CHAR(2) COUNTRY_NAME
 * VARCHAR2(40) REGION_ID NUMBER
 * 
 */
@Entity
@Table(name = "COUNTRIES")
public class Country {
	/**
	 * The country's unique identifier (2 characters).
	 */
	@Id
	private String countryId;

	/**
	 * The name of the country.
	 */
	@Column(name = "COUNTRY_NAME")
	private String countryName;
	/**
	 * The region ID the country belongs to.
	 */
	@Column(name="REGION_ID")
	private Integer regionID;

	/**
	 * Default constructor for creating a Country object.
	 */
	public Country() {

	}

	/**
	 * Gets the country's ID.
	 * 
	 * @return the country ID
	 */
	public String getCountryId() {
		return countryId;
	}

	/**
	 * Sets the country's ID.
	 * 
	 * @param countryId the country ID to set
	 */
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	/**
	 * Gets the country's name.
	 * 
	 * @return the country name
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * Sets the country's name.
	 * 
	 * @param countryName the country name to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * Gets the region ID.
	 * 
	 * @return the region ID
	 */
	public Integer getRegionID() {
		return regionID;
	}

	/**
	 * Sets the region ID.
	 * 
	 * @param regionID the region ID to set
	 */
	public void setRegionID(Integer regionID) {
		this.regionID = regionID;
	}

}
