/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Business;
import UI.Nurse.NurseJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author divya
 */
public class NurseRole extends Role {
    
    @Override
    public String getName()
    {
        return "Nurse";
    }
    
   @Override
    public JFrame createWorkArea(Business business, UserAccount useraccount) {
        return new NurseJFrame(business,useraccount);
    } 
    
    
    
}
