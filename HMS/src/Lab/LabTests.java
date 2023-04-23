/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

import Doctor.Doctor;
import Patient.Patient;

/**
 *
 * @author thran
 */
public class LabTests {
    private static int count = 0;
    
    public String testId;
    public Doctor doctor;
    public Patient patient;
    public Lab lab;
    public String procedureName;
    public String status;

    public LabTests(Doctor doctor, Patient patient, Lab lab, String procedureName) {
        this.testId = "LABTest-" + count++;
        this.doctor = doctor;
        this.patient = patient;
        this.lab = lab;
        this.procedureName = procedureName;
        this.status = "Scheduled";
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Lab getLab() {
        return lab;
    }

    public void setLab(Lab lab) {
        this.lab = lab;
    }

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }   
}
