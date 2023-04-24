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
public class TestRequest {
    private static int count = 0;
    public String TestId;
    public Doctor doctor;
    public Patient patient;
    public LabTests labTest;
    public String status;
    public boolean isActive;
    
    public TestRequest(Doctor doctor,Patient patient, LabTests labTest) {
        this.TestId = "TEST-ID-" + count++;
        this.doctor = doctor;
        this.patient = patient;
        this.labTest = labTest;
        this.status = "Requested";
        this.isActive = false;
        // this is constructor
    }

    public String getTestId() {
        return TestId;
    }

    public void setTestId(String TestId) {
        this.TestId = TestId;
    }

    public Doctor getDoctor() {
        return doctor;
    }
    //this is getter and setter

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LabTests getLabTests() {
        return labTest;
    }

    public void setLabTests(LabTests labTests) {
        this.labTest = labTests;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    public void performTest(Patient patient)
    {
        this.setStatus("Performed test");
        this.setIsActive(true);
        this.getDoctor().setLabTest(this.labTest);
       
    }
}
