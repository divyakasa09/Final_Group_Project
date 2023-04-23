/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

import Lab.LabTestsDirectory;

/**
 *
 * @author divya
 */
public class Lab {
    private static int count = 0;
    
    public String labId;
    public String labName;
    public String labAddress;
    public String labPhone;
    public LabTestsDirectory labTests;

    public Lab(String labName, String labAddress, String labPhone) {
        this.labId = "LAB-" + count++;
        this.labName = labName;
        this.labAddress = labAddress;
        this.labPhone = labPhone;
        this.labTests = new LabTestsDirectory();
    }

    public String getLabId() {
        return labId;
    }

    public void setLabId(String labId) {
        this.labId = labId;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getLabAddress() {
        return labAddress;
    }

    public void setLabAddress(String labAddress) {
        this.labAddress = labAddress;
    }

    public String getLabPhone() {
        return labPhone;
    }

    public void setLabPhone(String labPhone) {
        this.labPhone = labPhone;
    }

    public LabTestsDirectory getLabTests() {
        return labTests;
    }

    public void setLabTests(LabTestsDirectory labTests) {
        this.labTests = labTests;
    }
    
    public String ToString()
    {
        return this.labId;
    }
    
}
