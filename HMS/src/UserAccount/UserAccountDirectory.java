/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAccount;

import Role.Role;
import java.util.ArrayList;
import UserAccount.UserAccount;
/**
 *
 * @author divya
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> useraccountlist;
    
    public UserAccountDirectory() {
        this.useraccountlist = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUseraccountList() {
        return useraccountlist;
    }

    public void setUseraccountList(ArrayList<UserAccount> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public UserAccount createUserAccount(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.useraccountlist.add(user);
        return user;
    }
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.useraccountlist) {
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public boolean checkIfUsernameIsAlreadyTaken(String username)
    {
        for(UserAccount ua : this.useraccountlist)
        {
            if (ua.getUsername().equals(username))
            {
                return true;
            }
        }
        return false;
    }
    public void deleteUser(String accountId)
    {
        useraccountlist.remove(accountId);
    }
    public UserAccount getUserAccountByPersonId(String personId) {
    for (UserAccount ua : this.getUseraccountList()) {
        if (ua.getPersonId() == personId) {
            return ua;
        }
    }
    return null;
}
 
    // all other required methods to be implemented below
    
}

