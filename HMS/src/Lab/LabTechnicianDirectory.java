/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

import java.util.ArrayList;

/**
 *
 * @author thran
 */
public class LabTechnicianDirectory {
    ArrayList<LabTechnician> labTechnicians;
    
    public LabTechnicianDirectory() {
        this.labTechnicians = new ArrayList<LabTechnician>();
    } 

    public ArrayList<LabTechnician> getLabTechnicians() {
        return this.labTechnicians;
    }

    public void setLabTechnicians(ArrayList<LabTechnician> labTechs) {
        this.labTechnicians = labTechs;
    }
    
    public LabTechnician addTechnician(
            String firstName,
            String lastName,
            String email,
            String address,
            String phoneNumber
        )
    {
        LabTechnician lt = new LabTechnician(firstName, lastName, email, address, phoneNumber);
        this.labTechnicians.add(lt);
        return lt;
    }
    
    public LabTechnician findLabTechnician(String techId)
    {
        for(LabTechnician lt: this.labTechnicians) {
            if(lt.getId().equals(techId)) {
                return lt;
            }
        }      
        return null;
    }
}
