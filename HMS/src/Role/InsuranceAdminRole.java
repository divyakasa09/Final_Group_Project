/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Business;
import UI.InsuranceJPanels.InsAgentJFrame;
import UI.InsuranceJPanels.InsuranceAdminRoleJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author divya
 */
public class InsuranceAdminRole  extends Role{
    @Override
    public JFrame createWorkArea(Business business, UserAccount useraccount) {
        return new InsuranceAdminRoleJFrame(business, useraccount);
    }

    @Override
    public String getName() {
        return "Insurance Admin";
    }
}
