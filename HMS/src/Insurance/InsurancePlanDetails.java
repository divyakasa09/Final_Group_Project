/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurance;


import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class InsurancePlanDetails {
    ArrayList<InsurancePlans> plansDirectory = new ArrayList<>();

    public InsurancePlanDetails() {
       
         this.plansDirectory = new ArrayList<InsurancePlans>();
        InsurancePlans plan1 = new InsurancePlans("plan1", "silver", 200, 0.50f);
        plansDirectory.add(plan1);
         InsurancePlans plan2 = new InsurancePlans("plan2", "gold", 300, 0.70f);
        plansDirectory.add(plan2);
         InsurancePlans plan3 = new InsurancePlans("plan2", "platinum", 300, 0.80f);
        plansDirectory.add(plan3); 
    }

    public ArrayList<InsurancePlans> getPlansDirectory() {
        return plansDirectory;
    }

    public void setPlansDirectory(ArrayList<InsurancePlans> plansDirectory) {
        this.plansDirectory = plansDirectory;
    }
    
    public InsurancePlans findInsurancePlan(String planId)
    {
        for(InsurancePlans ip : this.plansDirectory)
        {
            if(ip.getPlanID().equals(planId))
            {
                return ip;
            }
        }
        return null;
    }
}
