package com.insurance.dao.patient;

import java.util.List;

import com.insurance.pojo.patient.Patient;

public interface PatientDao {
	/**
	 * Get a User object based on id
	 * @param id
	 * @return
	 */
	public Patient getPatient(Long id);
	
	/**
	 * Get a list of Users
	 */
	public List<PatientDao> getPatientList(String queryString, Object[] values);
	
	/**
	 * Get a list of Users
	 */
	public List<PatientDao> getPatientList(String queryString, Object[] values, int limit);

	/**
	 * Save a User
	 */
	public void savePatient(PatientDao o);
	
	/**
	 * Update a User
	 */
	public void updatePatient(PatientDao o);

	/**
	 * Delete a User
	 */
	public void deletePatient(Long id);

}