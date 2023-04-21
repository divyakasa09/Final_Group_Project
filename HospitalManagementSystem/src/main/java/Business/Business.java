/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Insurance.Plans.InsurancePlanDetails;
import Role.InsuranceAgentRole;
import Role.SystemAdminRole;
import UserAccount.UserAccountDirectory;

/**
 *
 * @author divya
 */
public class Business {
   UserAccountDirectory topLevelUserAccountDirectory;
   InsurancePlanDetails planDirectory;

    public Business() {
         this.topLevelUserAccountDirectory = new UserAccountDirectory();
          this.topLevelUserAccountDirectory.createUserAccount("admin", "admin", new SystemAdminRole());
           this.topLevelUserAccountDirectory.createUserAccount("IA", "IA", new InsuranceAgentRole());
           this. planDirectory = new InsurancePlanDetails();
         
    }

    public UserAccountDirectory getTopLevelUserAccountDirectory() {
        return topLevelUserAccountDirectory;
    }

    public void setTopLevelUserAccountDirectory(UserAccountDirectory topLevelUserAccontDirectory) {
        this.topLevelUserAccountDirectory = topLevelUserAccountDirectory;
    }
   
    public static Business getInstance() {
        return new Business();
    }

    public InsurancePlanDetails getPlanDirectory() {
        return planDirectory;
    }

    public void setPlanDirectory(InsurancePlanDetails planDirectory) {
        this.planDirectory = planDirectory;
    }
   
}
