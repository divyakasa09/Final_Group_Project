/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Business;
import UI.SystemAdminJPanels.SysAdminJFrame;
import UI.SystemAdminJPanels.SystemAdminJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author divya
 */
public class SystemAdminRole extends Role {
    @Override
    public String getName()
    {
        return "System Admin";
    }

    @Override
    public JFrame createWorkArea(Business business, UserAccount useraccount) {
        return new SysAdminJFrame(business,useraccount);
    }
    
}