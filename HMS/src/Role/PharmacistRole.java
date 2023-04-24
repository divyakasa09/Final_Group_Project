/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Business;
import UI.PatientJPanels.PatientJFrame;
import UI.PharmacyJPanels.PharmacistJFrame;
import UI.ReceptionistJPanels.ReceptionistJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author divya
 */
public class PharmacistRole extends Role {
    @Override
    public String getName()
    {
        return "Pharmacist";
    }
    
    @Override
    public JFrame createWorkArea(Business business, UserAccount useraccount) {
        return new PharmacistJFrame(business,useraccount);
    } 
}
