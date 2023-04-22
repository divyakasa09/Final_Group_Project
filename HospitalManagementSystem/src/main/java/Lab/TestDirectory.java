/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class TestDirectory {
    private ArrayList<Test> labTestList;
    
    public TestDirectory()
    {
        this.labTestList = new ArrayList<Test>();
    

//    public ArrayList<Test> getLabTestList() {
//        return labTestList;
//    }
//
//    public void setLabTestList(ArrayList<Test> labTestList) {
//        this.labTestList = labTestList;
//    }
    labTestList.add(new Test("MRI", 300));
        labTestList.add(new Test("CT-Scan", 250));
        labTestList.add(new Test("Blood Sugar Levels", 50));
        labTestList.add(new Test("Complete Blood Count", 80));
        labTestList.add(new Test("X-ray", 190));
    }

    public ArrayList<Test> getLabTestList() {
        return new ArrayList<>(labTestList);
    }
    
    
//        Test test1= new Test("MRI",300);
//        Test test2= new Test("CT-Scan", 250);
//        Test test3= new Test("Blood Sugar Levels", 50);
//        Test test4= new Test("Complete Blood Count", 80);
//        Test test5= new Test("X-ray",190);
      
//        this.labTestList.add(test1);
//        this.labTestList.add(test2);
//        this.labTestList.add(test3);
//        this.labTestList.add(test4);
//        this.labTestList.add(test5);
    }
    
    
    
    

