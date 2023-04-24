/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;
import Doctor.DoctorDirectory;
import Patient.PatientDirectory;
import Staff.StaffDirectory;
import UserAccount.UserAccountDirectory;

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
    String email;
    DoctorDirectory doctors;
    PatientDirectory patients;
    StaffDirectory staff;
    UserAccountDirectory userAccounts;

    public Hospital(String hospitalName, String address, String phoneNumber, String email) {
        this.hospitalId = "HOS-" + count++;
        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.doctors = new DoctorDirectory();
        this.patients = new PatientDirectory();
        this.staff = new StaffDirectory();
        this.userAccounts = new UserAccountDirectory();
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
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public UserAccountDirectory getUserAccounts() {
        return userAccounts;
    }

    public void setUserAccounts(UserAccountDirectory userAccounts) {
        this.userAccounts = userAccounts;
    }
}
