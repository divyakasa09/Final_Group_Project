/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prescription;

import Doctor.Doctor;
import Patient.Patient;
import Pharmacy.Medicine;

/**
 *
 * @author mrudu
 */
public class Prescription {
    private static int count = 0;
    String prescriptionId;
    Doctor doctor;
    Patient patient;
    Medicine medicine;
    int quantity;
    String status;

    public Prescription(Doctor doctor, Patient patient, Medicine medicine, int quantity) {
        this.prescriptionId = "PRES-" + count++;
        this.doctor = doctor;
        this.patient = patient;
        this.medicine = medicine;
        this.quantity = quantity;
        this.status = "Requested";
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    
    
    
    
}
