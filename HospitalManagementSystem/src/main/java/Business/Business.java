/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Role.SystemAdminRole;
import UserAccount.UserAccountDirectory;

/**
 *
 * @author divya
 */
public class Business {
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
