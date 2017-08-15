package com.insurance.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.insurance.pojo.patient.Patient;

public class PatientData implements RowMapper<Patient> {
   public Patient mapRow(ResultSet rs, int rowNum) throws SQLException {
	   Patient patient = new Patient();
	   patient.setId(rs.getLong("id"));
	   patient.setFirstName(rs.getString("firstname"));
	   patient.setAge(rs.getInt("age"));
      
      return patient;
   }
}