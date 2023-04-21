/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurance.InsuranceAgent;

import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class ApplicantDirectory {
      private ArrayList<CreateApplicant> applicantList;
      
      
      
       
    public ApplicantDirectory()
    {
        this.applicantList = new ArrayList<CreateApplicant>();
    } 

    public ArrayList<CreateApplicant> getApplicantList() {
        return applicantList;
    }

    public void setApplicantList(ArrayList<CreateApplicant> applicantList) {
        this.applicantList = applicantList;
    }
    
    
    public CreateApplicant addApplicant()
    {
        CreateApplicant applicant=new CreateApplicant();
        applicantList.add(applicant);
        return applicant;
    }
    
    public void deleteApplicant(CreateApplicant applicant)
    {
        applicantList.remove(applicant);
    }  
    
    
    
    
}
