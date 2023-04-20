/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurance;

import Business.Business;
import Patient.Patient;
import Person.Person;
import Role.PatientRole;
import UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author MC
 */
public class InsuranceAgent extends Person{
    private static int count = 0;
    
    public InsuranceAgent(
            String firstName,
            String lastName,
            String email,
            String address,
            String phoneNummber
            
    ) 
    {
           super();
           this.id = "INS-AGENT-" + count++;
           this.firstName = firstName;
           this.lastName = lastName;
           this.email = email;
           this.address = address;
           this.phoneNumber = phoneNummber;
    }
    
}
