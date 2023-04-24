/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurance;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author divya
 */
public class InsurancePlans {
    
     private String planID;
     private String planName;
     private int costperMonth;
     private int costperAnnum = 12 * costperMonth;
     private float coveragePercentage;

    public InsurancePlans( String planID, String planName, int costperMonth, float coveragePercentage ) {
        super();

        this.planID = planID;
        this.planName = planName;
        this.costperMonth = costperMonth;
        this.coveragePercentage = coveragePercentage;
       
        
    }
    
    public String getPlanID() {
        return planID;
    }

    public void setPlanID(String planID) {
        this.planID = planID;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public int getCostperMonth() {
        return costperMonth;
    }

    public void setCostperMonth(int costperMonth) {
        this.costperMonth = costperMonth;
    }

    public int getCostperAnnum() {
        return costperAnnum;
    }

    public void setCostperAnnum(int costperAnnum) {
        this.costperAnnum = costperAnnum;
    }

    public float getCoveragePercentage() {
        return coveragePercentage;
    }

    public void setCoveragePercentage(float coveragePercentage) {
        this.coveragePercentage = coveragePercentage;
    }
     
    
     
}