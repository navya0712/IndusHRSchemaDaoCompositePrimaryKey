package com.indus.training.persist.dao;

import com.indus.training.persist.entity.Location;
import com.indus.training.persist.exceptions.LocationDaoException;

/**
 * Interface for CRUD operations related to the Location entity.
 */
public interface ILocationDao {
	/**
	 * Inserts a new location record into the database.
	 * 
	 * @param locationObj The Location object containing the data to be inserted.
	 * @return True if the insertion is successful, false otherwise.
	 * @throws LocationDaoException If an error occurs during the operation.
	 */
	public Boolean insertLocation(Location location) throws LocationDaoException;

	/**
	 * Retrieves a location record by its ID.
	 * 
	 * @param locationId The ID of the location to retrieve.
	 * @return The Location object with the specified ID.
	 * @throws LocationDaoException If an error occurs during the operation.
	 */
	public Location fetchLocationById(Integer locationId) throws LocationDaoException;

	/**
	 * Updates the street address of a location record.
	 * 
	 * @param locationId    The ID of the location to update.
	 * @param streetAddress The new street address.
	 * @return True if the update is successful, false otherwise.
	 * @throws LocationDaoException If an error occurs during the operation.
	 */
	public Boolean updateLocationById(Integer locationId, Location location) throws LocationDaoException;

	
	/**
	 * Deletes a location record by its ID.
	 * 
	 * @param locationId The ID of the location to delete.
	 * @return True if the deletion is successful, false otherwise.
	 * @throws LocationDaoException If an error occurs during the operation.
	 */
	public Boolean deleteLocationById(Integer locationId) throws LocationDaoException;
}
