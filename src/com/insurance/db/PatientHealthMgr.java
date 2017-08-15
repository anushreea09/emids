
package com.insurance.db;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.insurance.dao.patient.PatientDao;
import com.insurance.dao.patient.PatientHealthDao;
import com.insurance.pojo.patient.Patient;
import com.insurance.pojo.patient.PatientHealth;

public class PatientHealthMgr implements PatientHealthDao {
   private DataSource dataSource;
   private JdbcTemplate jdbcTemplateObject;
   
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }
   
   public PatientHealth getPatient(Long id) {
      String SQL = "select * from patienthealth where patientid = ?";
      PatientHealth patient = jdbcTemplateObject.queryForObject(SQL, 
         new Object[]{id}, new PatientHealthData());
      
      return patient;
   }

@Override
public PatientHealthDao getId(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<PatientHealthDao> getPatientHealthList(String queryString,
		Object[] values) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<PatientHealthDao> getPatientHealthList(String queryString,
		Object[] values, int limit) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void savePatient(PatientHealthDao o) {
	// TODO Auto-generated method stub
	
}

@Override
public void updatePatient(PatientHealthDao o) {
	// TODO Auto-generated method stub
	
}

@Override
public void deletePatient(Long id) {
	// TODO Auto-generated method stub
	
}

}