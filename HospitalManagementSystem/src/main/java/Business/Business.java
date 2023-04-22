/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Lab.TestDirectory;
import Lab.VaccinationDirectory;
import Pharmacy.MedicineDirectory;
import Role.LabTechnicianRole;
import Role.PharmacistRole;
import Role.SystemAdminRole;
import UserAccount.UserAccountDirectory;

/**
 *
 * @author divya
 */
public class Business {
   UserAccountDirectory topLevelUserAccountDirectory;
   MedicineDirectory medicineDir;
   VaccinationDirectory vaccineDir;
   TestDirectory testDir;

    public Business() {
         this.topLevelUserAccountDirectory = new UserAccountDirectory();
         this.medicineDir = new MedicineDirectory();
         this.vaccineDir = new VaccinationDirectory();
         this.testDir= new TestDirectory();
          this.topLevelUserAccountDirectory.createUserAccount("admin", "admin", new SystemAdminRole());
          
          this.topLevelUserAccountDirectory.createUserAccount("pharmacy", "pharmacy", new PharmacistRole());
          this.topLevelUserAccountDirectory.createUserAccount("lab", "lab", new LabTechnicianRole());
    }

    public UserAccountDirectory getTopLevelUserAccountDirectory() {
        return topLevelUserAccountDirectory;
    }

    public void setTopLevelUserAccountDirectory(UserAccountDirectory topLevelUserAccountDirectory) {
        this.topLevelUserAccountDirectory = topLevelUserAccountDirectory;
    }

    public MedicineDirectory getMedicineDir() {
        return medicineDir;
    }

    public void setMedicineDir(MedicineDirectory medicineDir) {
        this.medicineDir = medicineDir;
    }

    public VaccinationDirectory getVaccineDir() {
        return vaccineDir;
    }

    public void setVaccineDir(VaccinationDirectory vaccineDir) {
        this.vaccineDir = vaccineDir;
    }

    public TestDirectory getTestDir() {
        return testDir;
    }

    public void setTestDir(TestDirectory testDir) {
        this.testDir = testDir;
    }
    
    
    
   
    public static Business getInstance() {
        return new Business();
    }
   
}
