/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

/**
 *
 * @author divya
 */

import Business.Business;
import UserAccount.UserAccount;
import javax.swing.JFrame;





/**
 *
 * @author divya
 */
public abstract class Role  {
    
    private static String[] roles = {"doctor", "patient", "nurse", "admin","pharmacist","insuranceAgent","receptionist","labTechnician"};
    
    public static String[] getAllRoles() {
        return roles;
    }
    
    public abstract String getName();
    public abstract JFrame createWorkArea(Business business, UserAccount ua);
}

