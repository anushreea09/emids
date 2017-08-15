package com.insurance.pojo.patient;



public class PatientHealth {
	
	private Long id;
	private Long patientId;

	private Boolean hypertension;
	private Boolean bloodPressure;
	private Boolean overweight;
	private Boolean bloodSugar;
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

	public Boolean getHypertension() {
		return hypertension;
	}

	public void setHypertension(Boolean hypertension) {
		this.hypertension = hypertension;
	}

	public Boolean getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(Boolean bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public Boolean getOverweight() {
		return overweight;
	}

	public void setOverweight(Boolean overweight) {
		this.overweight = overweight;
	}

	public Boolean getBloodSugar() {
		return bloodSugar;
	}

	public void setBloodSugar(Boolean bloodSugar) {
		this.bloodSugar = bloodSugar;
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

