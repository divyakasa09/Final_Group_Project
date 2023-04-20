/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurance;

import Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author MC
 */
public class InsuranceEnrollmentDirectory {
    ArrayList<InsuranceEnrollment> enrollments;

    public InsuranceEnrollmentDirectory() {
        this.enrollments = new ArrayList<InsuranceEnrollment>();
    }

    public ArrayList<InsuranceEnrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(ArrayList<InsuranceEnrollment> enrollments) {
        this.enrollments = enrollments;
    }
    
    public InsuranceEnrollment addEnrollment(Patient patient, InsurancePlans insurancePlan)
    {
        InsuranceEnrollment ie = new InsuranceEnrollment(patient, insurancePlan);
        this.enrollments.add(ie);
        return ie;
    }
    
    public InsuranceEnrollment findEnrollment(String enrollmentId)
    {
        for(InsuranceEnrollment ie : this.enrollments)
        {
            if (ie.getEnrollmentId().equals(enrollmentId))
            {
                return ie;
            }
        }
        return null;
    }
    
}
