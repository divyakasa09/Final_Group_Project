/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Business;
import UI.LabJPanels.LabAdminJFrame;
import UI.LabJPanels.LabTechniciansJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author divya
 */
public class LabAdminRole extends Role{
 @Override
    public String getName()
    {
        return "Lab Admin";
    }
    
    @Override
    public JFrame createWorkArea(Business business, UserAccount useraccount) {
        return new LabAdminJFrame(business, useraccount);
    }   
}
