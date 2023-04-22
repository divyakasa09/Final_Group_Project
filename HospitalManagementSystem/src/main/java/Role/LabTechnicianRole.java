/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Business;
import UI.InsuranceJPanels.InsuranceAgentJFrame;
import UI.LabJPanels.LabJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author divya
 */
public class LabTechnicianRole extends Role {
    @Override
    public JFrame createWorkArea(Business business, UserAccount useraccount) {
        return new LabJFrame(business,useraccount);
    }
} 
