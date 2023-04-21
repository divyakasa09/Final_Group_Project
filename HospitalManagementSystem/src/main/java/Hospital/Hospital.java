/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;
import Doctor.DoctorDirectory;
import Patient.PatientDirectory;
import Staff.StaffDirectory;

/**
 *
 * @author divya
 */
public class Hospital {
    private static int count = 0;
    String hospitalId;
    String hospitalName;
    String address;
    String phoneNumber;
    DoctorDirectory doctors;
    PatientDirectory patients;
    StaffDirectory staff;

    public Hospital(String hospitalName, String address, String phoneNumber) {
        this.hospitalId = "HOS-" + count++;
        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.doctors = new DoctorDirectory();
        this.patients = new PatientDirectory();
        this.staff = new StaffDirectory();
    }
    
    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }
    
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public DoctorDirectory getDoctors() {
        return doctors;
    }

    public void setDoctors(DoctorDirectory doctors) {
        this.doctors = doctors;
    }

    public PatientDirectory getPatients() {
        return patients;
    }

    public void setPatients(PatientDirectory patients) {
        this.patients = patients;
    }

    public StaffDirectory getStaff() {
        return staff;
    }

    public void setStaff(StaffDirectory staff) {
        this.staff = staff;
    }
}
