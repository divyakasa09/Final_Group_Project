/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reports;

import Doctor.Doctor;
import Lab.LabTests;
import Patient.Patient;

/**
 *
 * @author thran
 */
public class TestReport {
    private static int count = 0;
    String reportId;
    Doctor doctor;
    Patient patient;
    LabTests labtest;
    String status;

public TestReport(Doctor doctor, Patient patient, LabTests labtest) {
        this.reportId = "REPORTid-" + count++;
        this.doctor = doctor;
        this.patient = patient;
        this.labtest = labtest;
        this.status = "Requested";
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        TestReport.count = count;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
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

    public LabTests getLabtest() {
        return labtest;
    }

    public void setLabtest(LabTests labtest) {
        this.labtest = labtest;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
