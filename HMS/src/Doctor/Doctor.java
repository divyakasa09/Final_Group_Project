/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;
import Hospital.Hospital;
import Lab.LabTests;
import UserAccount.UserAccount;
import Person.Person;

/**
 *
 * @author divya
 */
public class Doctor extends Person { 
    private static int count = 0;  
    String degree;
    String speciality;
    Float consulatationFee;
    Float totalRevenue;
    UserAccount userAcc;
    LabTests labTest;
    Hospital hospital;
    public Doctor(
            String firstName,
            String lastName,
            String email,
            String address,
            String phoneNummber,
            String degree,
            String speciality,
            Float consultationFee
    ) 
    {
           super();
           this.id = "DOC-" + count++;
           this.firstName = firstName;
           this.lastName = lastName;
           this.email = email;
           this.address = address;
           this.phoneNumber = phoneNummber;
           this.userAcc = new UserAccount();
           this.degree = degree;
           this.speciality = speciality;
           this.totalRevenue = Float.parseFloat("0.0");
           this.consulatationFee = consultationFee;
      }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Doctor.count = count;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Float getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(Float totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
    
    public UserAccount getUserAcc() {
        return userAcc;
    }

    public void setUserAcc(UserAccount userAcc) {
        this.userAcc = userAcc;
    }
    
    public Float getConsulatationFee() {
        return consulatationFee;
    }

    public void setConsulatationFee(Float consulatationFee) {
        this.consulatationFee = consulatationFee;
    }

    public LabTests getLabTest() {
        return labTest;
    }

    public void setLabTest(LabTests labTest) {
        this.labTest = labTest;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    
}