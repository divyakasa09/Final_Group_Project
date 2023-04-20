/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;
import Hospital.AppointmentDirectory;
import Person.Person;
import java.util.Date;
import Hospital.VitalsDirectory;
import Insurance.InsurancePlans;


/**
 *
 * @author divya
 */
public class Patient extends Person {
    Date dateOfBirth;
    VitalsDirectory vitals;
    InsurancePlans insurancePlan;
    AppointmentDirectory appointments;
    
    //add tests
    private static int count = 0;

    public Patient(String firstName,
            String lastName,
            String email,
            String address,
            String phoneNummber
            
    ) 
    {
           super();
           this.id = "PATIENT-" + count++;
           this.firstName = firstName;
           this.lastName = lastName;
           this.email = email;
           this.address = address;
           this.phoneNumber = phoneNummber;
          // this.dateOfBirth= dateOfBirth;
           this.vitals = new VitalsDirectory();
           this.appointments = new AppointmentDirectory();
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public InsurancePlans getInsurancePlan() {
        return insurancePlan;
    }

    public void setInsurancePlan(InsurancePlans insurancePlan) {
        this.insurancePlan = insurancePlan;
    }
    
    public VitalsDirectory getVitals() {
        return vitals;
    }

    public void setVitals(VitalsDirectory vitals) {
        this.vitals = vitals;
    }
    
    public AppointmentDirectory getAppointments() {
        return appointments;
    }

    public void setAppointments(AppointmentDirectory appointments) {
        this.appointments = appointments;
    }
}
