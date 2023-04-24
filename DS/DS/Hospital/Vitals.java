/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;
import Patient.Patient;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author mrudu
 */
public class Vitals {
    private static int count = 0;
    String vitalId;
    Patient patient;
    String bloodPressure;
    int heartRate;
    float weight;
    float height;
    String recordedDate;
    
    public Vitals(
            Patient patient, 
            String bloodPressure, 
            int heartRate, 
            float weight, 
            float height)
    {
        this.vitalId = "VIT-" + count++;
        this.patient = patient;
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
        this.weight = weight;
        this.height = height;
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        this.recordedDate = timeStamp;
    }
    
    public String getVitalId() {
        return vitalId;
    }

    public void setVitalId(String vitalId) {
        this.vitalId = vitalId;
    }
    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getRecordedDate() {
        return recordedDate;
    }

    public void setRecordedDate(String recordedDate) {
        this.recordedDate = recordedDate;
    }
}
