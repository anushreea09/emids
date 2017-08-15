package com.insurance.pojo.patient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class PatientHabits {
	
	private Long id;
	private Long patientId;
	
	private Boolean smoking;
	private Boolean alcohol;
	private Boolean dailyExercise;
	private Boolean drugs;
	private String createDate;
	private String updateDate;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public Boolean getSmoking() {
		return smoking;
	}

	public void setSmoking(Boolean smoking) {
		this.smoking = smoking;
	}

	public Boolean getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(Boolean alcohol) {
		this.alcohol = alcohol;
	}

	public Boolean getDailyExercise() {
		return dailyExercise;
	}

	public void setDailyExercise(Boolean dailyExercise) {
		this.dailyExercise = dailyExercise;
	}

	public Boolean getDrugs() {
		return drugs;
	}

	public void setDrugs(Boolean drugs) {
		this.drugs = drugs;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
}

