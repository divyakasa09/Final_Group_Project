/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Business;
import UI.PharmacyJPanels.PharmacyAdminRoleJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author thran
 */
public class PharmacyAdminRole extends Role {
    @Override
    public JFrame createWorkArea(Business business, UserAccount useraccount) {
        return new PharmacyAdminRoleJFrame(business, useraccount);
    }

    @Override
    public String getName() {
        return "Pharmacy Admin";
    }
}
