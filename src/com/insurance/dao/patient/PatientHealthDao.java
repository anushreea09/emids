package com.insurance.dao.patient;

import java.util.List;

public interface PatientHealthDao {
	/**
	 * Get a User object based on id
	 * @param id
	 * @return
	 */
	public PatientHealthDao getId(Long id);
	
	/**
	 * Get a list of Users
	 */
	public List<PatientHealthDao> getPatientHealthList(String queryString, Object[] values);
	
	/**
	 * Get a list of Users
	 */
	public List<PatientHealthDao> getPatientHealthList(String queryString, Object[] values, int limit);

	/**
	 * Save a User
	 */
	public void savePatient(PatientHealthDao o);
	
	/**
	 * Update a User
	 */
	public void updatePatient(PatientHealthDao o);

	/**
	 * Delete a User
	 */
	public void deletePatient(Long id);

}