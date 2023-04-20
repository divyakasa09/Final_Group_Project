/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurance;

import Patient.Patient;
import Role.PatientRole;
import UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MC
 */
public class InsuranceAgentDirectory {
    ArrayList<InsuranceAgent> insuranceAgents;
    
    public InsuranceAgentDirectory() {
        this.insuranceAgents = new ArrayList<InsuranceAgent>();
    } 

    public ArrayList<InsuranceAgent> getInsuranceAgents() {
        return this.insuranceAgents;
    }

    public void setInsuranceAgents(ArrayList<InsuranceAgent> insAgents) {
        this.insuranceAgents = insAgents;
    }
    
    public InsuranceAgent addAgent(
            String firstName,
            String lastName,
            String email,
            String address,
            String phoneNumber
        )
    {
        InsuranceAgent ia = new InsuranceAgent(firstName, lastName, email, address, phoneNumber);
        this.insuranceAgents.add(ia);
        return ia;
    }
    
    public InsuranceAgent findInsuranceAgent(String agentId)
    {
        for(InsuranceAgent ia: this.insuranceAgents) {
            if(ia.getId().equals(agentId)) {
                return ia;
            }
        }      
        return null;
    }
//  public void deleteAgent(InsuranceAgent insuranceAgent)
//    {
//        insuranceAgents.remove(insuranceAgent);
//    }
  public void removeAgent(String agentId) {
        for(InsuranceAgent ia: this.insuranceAgents) {
            if(ia.getId().equals(agentId)) {
                this.insuranceAgents.remove(ia);
              //  this.business.getInsuranceAgents().removeAgent(ia);
                

                break;
                
               
            }
        }
    }
 public void deleteAgent(InsuranceAgent insuranceAgent)
    {
        insuranceAgents.remove(insuranceAgent);
    }
    
}
