package com.insurance.dao.patient;

import java.util.List;

public interface PatientHabitsDao {
	/**
	 * Get a User object based on id
	 * @param id
	 * @return
	 */
	public PatientHabitsDao getId(Long id);
	
	/**
	 * Get a list of Users
	 */
	public List<PatientHabitsDao> getPatientHabbitsList(String queryString, Object[] values);
	
	/**
	 * Get a list of Users
	 */
	public List<PatientHabitsDao> getPatientHabbitsList(String queryString, Object[] values, int limit);

	/**
	 * Save a User
	 */
	public void savePatient(PatientHabitsDao o);
	
	/**
	 * Update a User
	 */
	public void updatePatient(PatientHabitsDao o);

	/**
	 * Delete a User
	 */
	public void deletePatient(Long id);

}