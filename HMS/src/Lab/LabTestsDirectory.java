/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

import Doctor.Doctor;
import Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author thran
 */
public class LabTestsDirectory {
    ArrayList<LabTests> labTests;

    public LabTestsDirectory() {
        this.labTests = new ArrayList<LabTests>();
    }

    public ArrayList<LabTests> getLabTests() {
        return labTests;
    }

    public void setLabTests(ArrayList<LabTests> labTests) {
        this.labTests = labTests;
    }
    
    public LabTests scheduleALabTest(Doctor doctor, Patient patient, Lab lab, String procedureName)
    {
        LabTests lt = new LabTests(doctor, patient, lab, procedureName);
        this.labTests.add(lt);
        return lt;
    }
}
