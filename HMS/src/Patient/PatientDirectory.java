/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;
import java.util.ArrayList;
import java.util.Date;

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
            String phoneNumber
           
        )
    {
        Patient patient = new Patient(firstName, lastName, email, address, phoneNumber);
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
    
    public ArrayList<Patient> findPatientsByName(String patientName)
    {
        ArrayList<Patient> pts = new ArrayList<Patient>();
        
        for(Patient p: this.patientList) {
            if (p.getFirstName().toLowerCase().contains(patientName.toLowerCase()) || p.getLastName().toLowerCase().contains(patientName.toLowerCase()))
            {
                pts.add(p);
            }
        }
        return pts;
    }
    
}
