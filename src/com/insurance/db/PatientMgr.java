package com.insurance.db;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.insurance.dao.patient.PatientDao;
import com.insurance.pojo.patient.Patient;

public class PatientMgr implements PatientDao {
   private DataSource dataSource;
   private JdbcTemplate jdbcTemplateObject;
   
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }
   
   public Patient getPatient(Long id) {
      String SQL = "select * from patient where id = ?";
      Patient patient = jdbcTemplateObject.queryForObject(SQL, 
         new Object[]{id}, new PatientData());
      
      return patient;
   }


@Override
public List<PatientDao> getPatientList(String queryString, Object[] values) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<PatientDao> getPatientList(String queryString, Object[] values,
		int limit) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void savePatient(PatientDao o) {
	// TODO Auto-generated method stub
	
}

@Override
public void updatePatient(PatientDao o) {
	// TODO Auto-generated method stub
	
}

@Override
public void deletePatient(Long id) {
	// TODO Auto-generated method stub
	
}
 
}