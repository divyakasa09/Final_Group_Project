/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reports;

import Doctor.Doctor;
import Lab.LabTests;
import Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author thran
 */
public class TestReportDirectory {
    ArrayList<TestReport> reports;
   
    public TestReportDirectory() {
        this.reports = new ArrayList<TestReport>();
    }

    public ArrayList<TestReport> getReports() {
        return reports;
    }

    public void setReports(ArrayList<TestReport> reports) {
        this.reports = reports;
    }
    
            
            public TestReport addReport(
            Doctor doctor,
            Patient patient,
            LabTests labtest
            
    )
    
    {
        TestReport trs = new TestReport(doctor, patient, labtest);
        this.reports.add(trs);
        return trs;
    }
    
    public TestReport findTestReport(String rid)
    {
        for(TestReport tr : this.reports)
        {
            if (tr.getReportId().equals(rid))
            {
                return tr;
            }
        }
        
        return null;
    }
}
