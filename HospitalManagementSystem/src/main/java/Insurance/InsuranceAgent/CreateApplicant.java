/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurance.InsuranceAgent;

import Insurance.Plans.InsurancePlans;

/**
 *
 * @author divya
 */
public class CreateApplicant {
    public static int count=0;
    private int ApplicationID;
    private String FirstName;
    private String LastName;
    private String applicationDate;
    private int age;
    private String  gender;
    String mobilenumber;
    String SSN;
    InsurancePlans plans;
    
    
    public CreateApplicant() {
         this.applicationDate=applicationDate;
        
        CreateApplicant.count= count+1;
        this.ApplicationID=count;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CreateApplicant.count = count;
    }

    public int getApplicationID() {
        return ApplicationID;
    }

    public void setApplicationID(int ApplicationID) {
        this.ApplicationID = ApplicationID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public InsurancePlans getPlans() {
        return plans;
    }

    public void setPlans(InsurancePlans plans) {
        this.plans = plans;
    }
    
      
    
    
    
}
