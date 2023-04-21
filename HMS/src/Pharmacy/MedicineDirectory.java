/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author thran
 */
public class MedicineDirectory {
    private ArrayList<Medicine> medicineList;
    
    public MedicineDirectory()
    {
        this.medicineList = new ArrayList<Medicine>();
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    public Medicine createMedicine
    (    
        String medicineName,
        Date expiryDate,
        int availableCount,
        float price
    )
    {
        Medicine medicine= new Medicine(medicineName, expiryDate, availableCount, price);       
        this.medicineList.add(medicine);
        return medicine;   
    }
    
    public Medicine findMedicine(String serialNumber){
        for(Medicine m: this.medicineList) {
            
            if(m.getSerialNumber().equals(serialNumber)) {
                return m;
            }
        }
        return null;
    }
    
    public Medicine findMedicineByName(String medName){
        for(Medicine m: this.medicineList) {
            
            if(m.getMedicineName().equals(medName)) {
                return m;
            }
        }
        return null;
    }
    
    public Medicine refillStock(String serialNumber, int quantity)
    {
        Medicine m = findMedicine(serialNumber);
        m.setAvailableCount(m.getAvailableCount() + quantity);
        return m;
    }
    public boolean removeMedicine(Medicine medicine) {
    if (medicineList.contains(medicine)) {
        medicineList.remove(medicine);
        return true;
    }
    return false;
}
}
    
    
//    public boolean checkIfMedicineExists(String serialNumber)
//    {
//        for(Medicine m: this.medicineList) {
//            
//            if(m.getSerialNumber().equals(serialNumber)) {
//                return true;
//            }
//        }
//        return false;
//    }
//    
//    
//    
