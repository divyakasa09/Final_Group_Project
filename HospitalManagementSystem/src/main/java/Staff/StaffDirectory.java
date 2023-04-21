/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Staff;

import Patient.Patient;
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
    
}
