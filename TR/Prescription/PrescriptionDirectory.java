/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prescription;

import Doctor.Doctor;
import Patient.Patient;
import Pharmacy.Medicine;
import java.util.ArrayList;

/**
 *
 * @author MC
 */
public class PrescriptionDirectory {
    ArrayList<Prescription> prescriptions;

    public PrescriptionDirectory() {
        this.prescriptions = new ArrayList<Prescription>();
    }

    public ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(ArrayList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }
    
    public Prescription addPrescription(
            Doctor doctor,
            Patient patient,
            Medicine medicine,
            int quantity
    )
    
    {
        Prescription ps = new Prescription(doctor, patient, medicine, quantity);
        this.prescriptions.add(ps);
        return ps;
    }
    
    public Prescription findPrescription(String pid)
    {
        for(Prescription p : this.prescriptions)
        {
            if (p.getPrescriptionId().equals(pid))
            {
                return p;
            }
        }
        
        return null;
    }
    
    
    
}
