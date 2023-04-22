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
    
    public Vaccination addVaccination(Vaccination vaccination) {
        this.vaccinelist.add(vaccination);
        return vaccination;
    }
    public Vaccination createVaccination( 
            
            String vaccinationName,
            String vaccinationID,
            int Dosage,
            double price
            
            
             )
    {
        Vaccination vaccine= new Vaccination(vaccinationName);

       
        vaccine.setVaccinationName(vaccinationName);
        vaccine.setVaccinationID(vaccinationID);
        vaccine.setDosage(Dosage);
        vaccine.setPrice(price);
        
        
        this.vaccinelist.add(vaccine);

         return vaccine;
        
    }
}
