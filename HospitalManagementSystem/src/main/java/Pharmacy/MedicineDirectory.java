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
    
    
    
    public Medicine addMedicine(Medicine medicine) {
        this.medicineList.add(medicine);
        return medicine;
    }
    public Medicine createMedicine( 
            
            String medicineName,
            Date expiryDate,
            boolean isAvailable,
            int availableCount,
            float price
          
             )
    {
        Medicine medicine= new Medicine(medicineName);

       
       // medicine.setSerialNumber(serialNumber);
        medicine.setMedicineName(medicineName);
        medicine.setExpiryDate(expiryDate);
        medicine.setIsAvailable(isAvailable);
        medicine.setAvailableCount(availableCount);
        medicine.setPrice(price);
        
        
        this.medicineList.add(medicine);

         return medicine;
        
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
//    public Medicine findMedicine(String serialNumber){
//        for(Medicine m: this.medicineList) {
//            
//            if(m.getSerialNumber().equals(serialNumber)) {
//                return m;
//            }
//        }
//        return null;
//    }
}
