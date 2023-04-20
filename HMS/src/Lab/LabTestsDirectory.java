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
    
    public LabTests scheduleALabTest(Doctor doctor, Patient patient, String procedureName, float price)
    {
        LabTests lt = new LabTests(doctor, patient, procedureName, price);
        this.labTests.add(lt);
        return lt;
    }
     public LabTests createLabTests
    (    
        String procedureName,
        float price
    )
    {
        LabTests test= new LabTests(procedureName, price);       
        this.labTests.add(test);
        return test;   
    }
    public LabTests findLabTests(String testId){
        for(LabTests l: this.labTests) {
            
            if(l.getTestId().equals(testId)) {
                return l;
            }
        }
        return null;
    }
    
    public LabTests findLabtestsByName(String procedureName){
        for(LabTests l: this.labTests) {
            
            if(l.getProcedureName().equals(procedureName)) {
                return l;
            }
        }
        return null;
    }
   public void removeLabTests(LabTests test) {
        labTests.remove(test);
    }
}
