/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class LabDirectory {
    
    public ArrayList<Lab> labs;

    public LabDirectory() {
        this.labs = new ArrayList<Lab>();
    }

    public ArrayList<Lab> getLabs() {
        return labs;
    }

    public void setLabs(ArrayList<Lab> labs) {
        this.labs = labs;
    }
    
    public Lab addLab(String labName, String labAddress, String labPhone)
    {
        Lab lab = new Lab(labName, labAddress, labPhone);
        this.labs.add(lab);
        return lab;
    }
    
    public Lab findLab(String labId)
    {
        for(Lab lab: this.labs)
        {
            if(lab.getLabId().equals(labId))
            {
                return lab;
            }
        }
        return null;
    }
    
    
}
