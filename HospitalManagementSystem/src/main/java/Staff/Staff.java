/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Staff;

import Person.Person;
import UserAccount.UserAccount;
import Role.Role;

/**
 *
 * @author mrudu
 */
public class Staff extends Person {
    Role role;
    float experience;
    private static int count = 0;
    
    
    public Staff(String firstName, String lastName, Role role, float experience) 
    {
           super();
           this.id = "STAFF-" + count++;
           this.firstName = firstName;
           this.lastName = lastName;
           this.role = role;
           this.experience = experience;          
    }
}
