/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

import Person.Person;

/**
 *
 * @author thran
 */
public class LabTechnician extends Person {
    private static int count = 0;
    
    public LabTechnician(
            String firstName,
            String lastName,
            String email,
            String address,
            String phoneNummber
    ) 
    {
           super();
           this.id = "LAB-TECH-" + count++;
           this.firstName = firstName;
           this.lastName = lastName;
           this.email = email;
           this.address = address;
           this.phoneNumber = phoneNummber;
    }
}
