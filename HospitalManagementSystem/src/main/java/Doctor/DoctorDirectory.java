/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;
import java.util.ArrayList;
import Role.DoctorRole;
import UserAccount.UserAccount;

/**
 *
 * @author divya
 */
public class DoctorDirectory {
    ArrayList<Doctor> doctorsList;
    
    public DoctorDirectory() {
        this.doctorsList = new ArrayList<Doctor>();
    } 

    public ArrayList<Doctor> getDoctorsList() {
        return doctorsList;
    }

    public void setDoctorsList(ArrayList<Doctor> doctorsList) {
        this.doctorsList = doctorsList;
    }
    
    public Doctor addDoctor(
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        String address,
        String degree,
        String speciality,
        String userName,
        String password,
        Float consultationFee
    )
    {
        Doctor doctor = new Doctor(
                firstName,
                lastName,
                email,
                address,
                phoneNumber,
                degree,
                speciality,
                consultationFee);
        
        UserAccount ua = new UserAccount();
        ua.setUsername(userName);
        ua.setPassword(password);
        ua.setRole(new DoctorRole());
        ua.setPersonId(doctor.getId());
        doctor.setUserAcc(ua);
        
        this.doctorsList.add(doctor);
        
        return doctor;
    }
    
    public Doctor findDoctor(String doctorId)
    {
        for(Doctor d: this.doctorsList) {
            if(d.getId().equals(doctorId)) {
                return d;
            }
        }      
        return null;
    }
    
}
