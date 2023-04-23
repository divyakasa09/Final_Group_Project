/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy;

import java.util.Date;

/**
 *
 * @author thran
 */
public class Medicine {
    public static int count=0;
    String serialNumber;
    String medicineName;
    Date expiryDate;
    int availableCount;
    float price;
    
    public Medicine(String medicineName, Date expiryDate, int availableCount, float price) {
        this.serialNumber = "M-" + count++;
        this.medicineName=medicineName;
        this.expiryDate = expiryDate;
        this.availableCount = availableCount;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    } 
}