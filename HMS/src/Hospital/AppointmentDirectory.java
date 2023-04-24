/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Doctor.Doctor;
import Patient.Patient;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MC
 */
public class AppointmentDirectory {
    
    public ArrayList<Appointment> appointments;
    
    public AppointmentDirectory()
    {
        this.appointments = new ArrayList<Appointment>();
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }
    
    public Appointment addAppointment(Hospital hospital, Patient patient, Doctor doctor, Date aptDate, String aptHour)
    {
        Appointment apt = new Appointment(hospital, patient, doctor, aptDate, aptHour);
        this.appointments.add(apt);
        return apt;
    }
    
    public Appointment findAppointment(String aptId)
    {
        for(Appointment apt : this.appointments)
        {
            if (apt.getAppointmentId().equals(aptId))
            {
                return apt;
            }
        }
        return null;
    }
    
    public Appointment cancelAppointment(String aptId)
    {
        Appointment apt = findAppointment(aptId);
        apt.setStatus("Cancelled");
        return apt;
    }
    
    public Appointment completeAppointment(String aptId)
    {
        Appointment apt = findAppointment(aptId);
        apt.setStatus("Complete");
        return apt;
    }
    
}
