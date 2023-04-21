/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Doctor.Doctor;
import Patient.Patient;
import java.util.Date;

/**
 *
 * @author MC
 */
public class Appointment {
    private static int count = 0;
    
    public String appointmentId;
    public Patient patient;
    public Doctor doctor;
    public Date appointmentDate;
    public int appointmentHour;
    //scheduled, completed, cancelled
    public String status;
    
    public Appointment(Patient patient, Doctor doctor, Date appointmentDate, int appointmentHour)
    {
        this.appointmentId = "APP-" + count++;
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
        this.appointmentHour = appointmentHour;
        this.status = "Scheduled";
    }
    
    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }
    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public int getAppointmentHour() {
        return appointmentHour;
    }

    public void setAppointmentHour(int appointmentHour) {
        this.appointmentHour = appointmentHour;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
