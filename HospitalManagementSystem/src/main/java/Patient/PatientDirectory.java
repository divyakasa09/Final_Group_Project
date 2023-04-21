/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;
import Insurance.Insurance;
import java.util.ArrayList;
import java.util.Date;
import UserAccount.UserAccount;
import Role.PatientRole;

/**
 *
 * @author divya
 */
public class PatientDirectory {
    
    ArrayList<Patient> patientList;
    
    public PatientDirectory() {
        this.patientList = new ArrayList<Patient>();
    } 

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient addPatient(
            String firstName,
            String lastName,
            String email,
            String address,
            String phoneNumber,
            Date dateOfBirth, 
            Insurance insurancePlan,  
            String userName,
            String password
        )
    {
        Patient patient = new Patient(firstName, lastName, email, address, phoneNumber, dateOfBirth, insurancePlan);
        UserAccount ua = new UserAccount();
        ua.setUsername(userName);
        ua.setPassword(password);
        ua.setRole(new PatientRole());
        ua.setPersonId(patient.getId());
        patient.setUserAccount(ua);
        
        this.patientList.add(patient);
        
        return patient;
    }
    
    public Patient findPatient(String patientId)
    {
        for(Patient p: this.patientList) {
            if(p.getId().equals(patientId)) {
                return p;
            }
        }      
        return null;
    }
    
}
