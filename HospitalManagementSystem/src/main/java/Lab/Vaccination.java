/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author thran
 */
public class Vaccination {
    public static int count=0;
     String vaccinationName;
      String vaccinationID;
      int Dosage;
      double price;
      
      public Vaccination(String vaccinationName) {
        this.vaccinationName=vaccinationName;
        this.vaccinationID = "V-" + count++;
       
    }



    public String getVaccinationName() {
        return vaccinationName;
    }

    public void setVaccinationName(String vaccinationName) {
        this.vaccinationName = vaccinationName;
    }

    public String getVaccinationID() {
        return vaccinationID;
    }

    public void setVaccinationID(String vaccinationID) {
        this.vaccinationID = vaccinationID;
    }

    public int getDosage() {
        return Dosage;
    }

    public void setDosage(int Dosage) {
        this.Dosage = Dosage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
