/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Staff;

import Doctor.Doctor;
import Hospital.Hospital;
import Patient.Patient;
import Role.DoctorRole;
import Role.Role;
import UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author mrudu
 */
public class StaffDirectory {
    
    ArrayList<Staff> staffList;
    
    public StaffDirectory() {
        this.staffList = new ArrayList<Staff>();
    } 

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(ArrayList<Staff> staffList) {
        this.staffList = staffList;
    }
    
    public Staff addStaffMember(
        Hospital hospital,
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        String address,
        Role role,
        Float experience
    )
    {
        Staff staff = new Staff(firstName, lastName, email, email, address, role, experience);   
        /*UserAccount ua = new UserAccount();
        ua.setUsername(userName);
        ua.setPassword(password);
        ua.setRole(role);
        ua.setPersonId(staff.getId());
        staff.setUserAcc(ua);
        */
        
        hospital.getStaff().getStaffList().add(staff);
        
        return staff;
    }
    
    public Staff findStaffMember(String staffId)
    {
        for(Staff d: this.staffList) {
            if(d.getId().equals(staffId)) {
                return d;
            }
        }      
        return null;
    }
    
}
