package com.insurance.controller.patient;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.insurance.db.PatientHabitsMgr;
import com.insurance.db.PatientHealthMgr;
import com.insurance.db.PatientMgr;
import com.insurance.pojo.patient.Patient;
import com.insurance.pojo.patient.PatientHabits;
import com.insurance.pojo.patient.PatientHealth;

@Controller
public class PatientInsuranceController {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

    public static PatientMgr patient_template = (PatientMgr)context.getBean("patientMgr");
    public static PatientHealthMgr patienthealth_template = (PatientHealthMgr)context.getBean("patientHealthMgr");
    public static PatientHabitsMgr patienthabits_template = (PatientHabitsMgr)context.getBean("patientHabitsMgr");
   
    /*public static void main(String[] args) {
      PatientMgr patient_template = (PatientMgr)context.getBean("patientMgr"); 
      Patient patient = patient_template.getPatient(1L);
      System.out.print("ID : " + patient.getId() );
      System.out.print(", firstName : " + patient.getFirstName() );
      System.out.println(", age : " + patient.getAge());
   }*/
   
   @RequestMapping(value="/ui/insurance/patient", method=RequestMethod.GET)
	public ModelAndView doPatientData(
			HttpServletRequest request,
			HttpServletResponse response) { 
		System.out.println("Display");
		return new ModelAndView("/WEB-INF/jsp/insurance_quote.jsp");
	}
   
   @RequestMapping(value="/ui/insurance/patient/report/{id}", method=RequestMethod.GET)
	public ModelAndView doGetPatientReport(
			@PathVariable(value="id") Long id,
			HttpServletRequest request,
			HttpServletResponse response) { 
	   
	   
	   Long premium = 5000L;	
		Patient patient = patient_template.getPatient(id);
		PatientHealth phealth = patienthealth_template.getPatient(patient.getPatientId());
		PatientHabits phabits = patienthabits_template.getPatient(patient.getPatientId());
		
		if(patient != null){
			if(patient.getAge() < 18){
				request.setAttribute("premium",premium);
			} else {
				if(patient.getAge() >= 18 && patient.getAge() < 40 ){
					premium = (long) (premium + (0.1*5000));
				} else if(patient.getAge() >= 40 ){
					premium = (long) (premium + (0.2*5000));
				} 
				if(patient.getGender().equals("Male")){
					premium = (long) (premium + (0.2*premium));
				}
				if(phealth != null){
					if(phealth.getBloodPressure() == true) 
						premium = (long) (premium + (0.1*premium));
					if(phealth.getBloodSugar() == true)
						premium = (long) (premium + (0.1*premium));
					if(phealth.getHypertension() == true)
						premium = (long) (premium + (0.1*premium));
					if(phealth.getOverweight() == true)
						premium = (long) (premium + (0.1*premium));		
				}
				if(phabits != null){
					if(phabits.getDailyExercise() == true)
						premium = (long) (premium - (0.3*premium));
					if(phabits.getAlcohol() == true)
						premium = (long) (premium + (0.3*premium));
					if(phabits.getSmoking() == true)
						premium = (long) (premium + (0.3*premium));
					if(phabits.getDrugs() == true)
						premium = (long) (premium + (0.3*premium));
				}
				request.setAttribute("premium",premium);
			}
		}
		return new ModelAndView("/WEB-INF/jsp/patient_report.jsp");
	}
}