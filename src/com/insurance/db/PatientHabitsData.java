package com.insurance.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.insurance.pojo.patient.PatientHabits;

public class PatientHabitsData implements RowMapper<PatientHabits> {
   public PatientHabits mapRow(ResultSet rs, int rowNum) throws SQLException {
	   PatientHabits ph = new PatientHabits();
	   ph.setId(rs.getLong("id"));
	   ph.setPatientId(rs.getLong("patientId"));
      
      return ph;
   }
}