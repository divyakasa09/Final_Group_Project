/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurance;

import Patient.Patient;

/**
 *
 * @author MC
 */
public class InsuranceEnrollment {
    private static int count = 0;
    public String enrollmentId;
    public Patient patient;
    public InsurancePlans insurancePlan;
    public String status;
    public boolean isActive;

    public InsuranceEnrollment(Patient patient, InsurancePlans insurancePlan) {
        this.enrollmentId = "INS-ENR-" + count++;
        this.patient = patient;
        this.insurancePlan = insurancePlan;
        this.status = "Requested";
        this.isActive = false;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public InsurancePlans getInsurancePlan() {
        return insurancePlan;
    }

    public void setInsurancePlan(InsurancePlans insurancePlan) {
        this.insurancePlan = insurancePlan;
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
    
    public void approveEnrollment(Patient patient)
    {
        this.setStatus("Approved");
        this.setIsActive(true);
        this.getPatient().setInsurancePlan(this.insurancePlan);
    }
    
    public void rejectEnrollment()
    {
        this.setStatus("Rejected");
        this.setIsActive(false);
    }
    
    
    
}
