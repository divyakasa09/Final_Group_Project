/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;
import UserAccount.UserAccount;
import Doctor.Doctor;
import Person.Person;
import java.util.Date;
import Hospital.Hospital;
import Hospital.VitalsDirectory;
import Insurance.Insurance;


/**
 *
 * @author divya
 */
public class Patient extends Person {
    Date dateOfBirth;
    Hospital hospital;
    Doctor doctor;
    UserAccount userAccount;
    VitalsDirectory vitals;
    Insurance insurancePlan;
    
    //add tests
    private static int count = 0;

    public Patient(String firstName,
            String lastName,
            String email,
            String address,
            String phoneNummber,
            Date dateOfBirth, 
            Insurance insurancePlan  ) {
           super();
           this.id = "PATIENT-" + count++;
           this.firstName = firstName;
           this.lastName = lastName;
           this.email = email;
           this.address = address;
           this.phoneNumber = phoneNummber;
           this.userAccount = new UserAccount();
           this.dateOfBirth= dateOfBirth;
           this.insurancePlan = insurancePlan;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public Insurance getInsurancePlan() {
        return insurancePlan;
    }

    public void setInsurancePlan(Insurance insurancePlan) {
        this.insurancePlan = insurancePlan;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    public VitalsDirectory getVitals() {
        return vitals;
    }

    public void setVitals(VitalsDirectory vitals) {
        this.vitals = vitals;
    }
}
