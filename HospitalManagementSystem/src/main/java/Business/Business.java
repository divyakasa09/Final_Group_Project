/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Hospital.HospitalDirectory;
import Insurance.InsuranceDirectory;
import Lab.LabDirectory;
import Pharmacy.PharmacyDirectory;
import Role.SystemAdminRole;
import UserAccount.UserAccountDirectory;

/**
 *
 * @author divya
 */
public class Business {
    
    HospitalDirectory hospitals;
    LabDirectory labs;
    PharmacyDirectory pharmacies;
    InsuranceDirectory insurancePlans;   
    UserAccountDirectory topLevelUserAccountDirectory;

    public Business() {
         this.topLevelUserAccountDirectory = new UserAccountDirectory();
          this.topLevelUserAccountDirectory.createUserAccount("admin", "admin", new SystemAdminRole());
    }

    public UserAccountDirectory getTopLevelUserAccountDirectory() {
        return topLevelUserAccountDirectory;
    }

    public void setTopLevelUserAccountDirectory(UserAccountDirectory topLevelUserAccountDirectory) {
        this.topLevelUserAccountDirectory = topLevelUserAccountDirectory;
    }
   
    public static Business getInstance() {
        return new Business();
    }
   
}
