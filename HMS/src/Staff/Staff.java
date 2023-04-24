/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Staff;

import Hospital.Hospital;
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
    //Hospital hospital;
    private static int count = 0;
    
    public Staff(String firstName, String lastName, String phone, String email, String address, Role role, float experience) 
    {
           super();
           this.id = "STAFF-" + count++;
           this.firstName = firstName;
           this.lastName = lastName;
           this.phoneNumber = phone;
           this.address = address;
           this.email = email;
           this.role = role;
           this.experience = experience;          
    }
    
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
    
    
}
