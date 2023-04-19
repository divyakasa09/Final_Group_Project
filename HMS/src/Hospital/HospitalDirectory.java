/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Business.Business;
import Doctor.Doctor;
import UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class HospitalDirectory {
    ArrayList<Hospital> hospitals;
    Doctor doctor;
    

    public ArrayList<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(ArrayList<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    public HospitalDirectory() {
        this.hospitals = new ArrayList<Hospital>();
    }
    
    public Hospital addHospital(String hospitalName, String address, String phoneNumber, String email)
    {
        Hospital hospital = new Hospital(hospitalName, address, phoneNumber, email);
        this.hospitals.add(hospital);
        return hospital;
    }
    
    public Hospital findHospital(String hospitalId)
    {
        for (Hospital h : this.hospitals)
        {
            if (h.getHospitalId().equals(hospitalId))
            {
                return h;
            }
        }
        return null;
    }
    
    public Hospital findHospitalByName(String hospitalName)
    {
        for (Hospital h : this.hospitals)
        {
            if (h.getHospitalName().equals(hospitalName))
            {
                return h;
            }
        }
        return null;
    }
  
    
}
