/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Business;
import UI.DoctorJPanels.DoctorJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author divya
 */
public class DoctorRole extends Role {
    @Override
    public String getName()
    {
        return "Doctor";
    }
    
    @Override
    public JFrame createWorkArea(Business business, UserAccount useraccount) {
        return new DoctorJFrame(business,useraccount);
    }
}
