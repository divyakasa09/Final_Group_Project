/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.util.ArrayList;
import Hospital.Vitals;

/**
 *
 * @author mrudu
 */
public class VitalsDirectory {
    
    ArrayList<Vitals> vitalsList;

    public ArrayList<Vitals> getVitalsList() {
        return vitalsList;
    }

    public void setVitalsList(ArrayList<Vitals> vitalsList) {
        this.vitalsList = vitalsList;
    }
    
    public VitalsDirectory()
    {
        this.vitalsList = new ArrayList<Vitals>();
    }
    
    
    
}
