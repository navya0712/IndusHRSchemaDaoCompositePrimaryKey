package com.indus.training.persist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Name Null? Type ----------------------------------------- --------
 * ---------------------------- LOCATION_ID NOT NULL NUMBER(4) STREET_ADDRESS
 * VARCHAR2(40) POSTAL_CODE VARCHAR2(12) CITY NOT NULL VARCHAR2(30)
 * STATE_PROVINCE VARCHAR2(25) COUNTRY_ID CHAR(2) Represents a Location entity
 */
@Entity
@Table(name = "LOCATIONS")
public class Location {
	@Id
	private Integer locationId;

	@Column(name = "STREET_ADDRESS")
	private String streetAddress;
	@Column(name = "POSTAL_CODE")
	private String postalCode;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE_PROVINCE")
	private String stateProvince;
	@Column(name = "COUNTRY_ID")
	private String countryId;

	/**
	 * Default constructor for the Location class.
	 */
	public Location() {

	}

	/**
	 * Gets the location ID.
	 *
	 * @return The location ID.
	 */
	public Integer getLocationId() {
		return locationId;
	}

	/**
	 * Sets the location ID.
	 *
	 * @param locationId The new location ID.
	 */
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	/**
	 * Gets the street address.
	 *
	 * @return The street address.
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * Sets the street address.
	 *
	 * @param streetAddress The new street address.
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * Gets the postal code.
	 *
	 * @return The postal code.
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Sets the postal code.
	 *
	 * @param postalCode The new postal code.
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * Gets the city.
	 *
	 * @return The city.
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city The new city.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the state or province.
	 *
	 * @return The state or province.
	 */
	public String getStateProvince() {
		return stateProvince;
	}

	/**
	 * Sets the state or province.
	 *
	 * @param stateProvince The new state or province.
	 */
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	/**
	 * Gets the country ID.
	 *
	 * @return The country ID.
	 */
	public String getCountryId() {
		return countryId;
	}

	/**
	 * Sets the country ID.
	 *
	 * @param countryId The new country ID.
	 */
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

}
