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
public class TestRequestDirectory {
    ArrayList<TestRequest> requests;
    
    public TestRequestDirectory() {
        this.requests = new ArrayList<TestRequest>();
    }

    public ArrayList<TestRequest> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<TestRequest> requests) {
        this.requests = requests;
    }
    public TestRequest addRequest(Doctor doctor,Patient patient, LabTests labTest)
    {
        TestRequest tr = new TestRequest(doctor, patient, labTest);
        this.requests.add(tr);
        return tr;
    }
    
    public TestRequest findRequest(String TestId)
    {
        for(TestRequest tr : this.requests)
        {
            if (tr.getTestId().equals(TestId))
            {
                return tr;
            }
        }
        return null;
    }
}
