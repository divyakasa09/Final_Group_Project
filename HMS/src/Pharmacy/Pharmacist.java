/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy;

import Person.Person;
import Role.Role;

/**
 *
 * @author MC
 */
public class Pharmacist extends Person{
    float experience;
    private static int count = 0;
    
    public Pharmacist(String firstName, String lastName, String phone, String email, String address, float experience) 
    {
           super();
           this.id = "STAFF-" + count++;
           this.firstName = firstName;
           this.lastName = lastName;
           this.phoneNumber = phone;
           this.address = address;
           this.email = email;
           this.experience = experience;          
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
    
}
