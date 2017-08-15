package com.insurance.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.insurance.pojo.patient.PatientHealth;

public class PatientHealthData implements RowMapper<PatientHealth> {
   public PatientHealth mapRow(ResultSet rs, int rowNum) throws SQLException {
	   PatientHealth ph = new PatientHealth();
	   ph.setId(rs.getLong("id"));
	   ph.setPatientId(rs.getLong("patientId"));
      
      return ph;
   }
}