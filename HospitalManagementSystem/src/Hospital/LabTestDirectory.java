/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Doctor.Doctor;
import Lab.Lab;
import Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author MC
 */
public class LabTestDirectory {
    
    ArrayList<LabTest> labTests;

    public LabTestDirectory() {
        this.labTests = new ArrayList<LabTest>();
    }

    public ArrayList<LabTest> getLabTests() {
        return labTests;
    }

    public void setLabTests(ArrayList<LabTest> labTests) {
        this.labTests = labTests;
    }
    
    public LabTest scheduleALabTest(Doctor doctor, Patient patient, Lab lab, String procedureName)
    {
        LabTest lt = new LabTest(doctor, patient, lab, procedureName);
        this.labTests.add(lt);
        return lt;
    }
    
    
    
}
