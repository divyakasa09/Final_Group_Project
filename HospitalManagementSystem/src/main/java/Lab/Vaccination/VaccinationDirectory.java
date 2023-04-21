/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab.Vaccination;

import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class VaccinationDirectory {
     private ArrayList<Vaccination> vaccinelist;
    
    public VaccinationDirectory()
    {
        this.vaccinelist=new ArrayList<Vaccination>();
    }

    public ArrayList<Vaccination> getVaccinelist() {
        return vaccinelist;
    }

    public void setVaccinelist(ArrayList<Vaccination> vaccinelist) {
        this.vaccinelist = vaccinelist;
    }
    
}

