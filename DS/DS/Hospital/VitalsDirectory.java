/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.util.ArrayList;
import Hospital.Vitals;
import Patient.Patient;

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
    
    public Vitals addVital(Patient patient, String bloodPressure, int heartRate, float weight, float height)
    {
        Vitals v = new Vitals(patient, bloodPressure, heartRate, weight, height);
        this.vitalsList.add(v);
        return v;
    }
    
    
    
}
