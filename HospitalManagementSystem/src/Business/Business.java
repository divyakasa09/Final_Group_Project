/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Hospital.AppointmentDirectory;
import Hospital.HospitalDirectory;
import Insurance.InsuranceAgentDirectory;
import Insurance.InsuranceEnrollmentDirectory;
import Insurance.InsurancePlanDetails;
import Lab.LabDirectory;
import Patient.PatientDirectory;
import Pharmacy.MedicineDirectory;
import Prescription.PrescriptionDirectory;
import Role.PharmacistRole;
import Role.SystemAdminRole;
import UserAccount.UserAccountDirectory;

/**
 *
 * @author divya
 */
public class Business {
    HospitalDirectory hospitals;
    PatientDirectory patients;
    InsuranceAgentDirectory insuranceAgents;
    LabDirectory labs;
    InsurancePlanDetails insurancePlans;   
    UserAccountDirectory topLevelUserAccountDirectory;
    InsuranceEnrollmentDirectory insuranceEnrollmentRequests;
    AppointmentDirectory appointments;
    MedicineDirectory medicines;
    PrescriptionDirectory prescriptions;

    public Business() {
        this.hospitals = new HospitalDirectory();
        this.labs = new LabDirectory();
        //this.pharmacies = new PharmacyDirectory();
        this.insurancePlans = new InsurancePlanDetails();
        this.topLevelUserAccountDirectory = new UserAccountDirectory();
        this.patients = new PatientDirectory();
        this.insuranceAgents = new InsuranceAgentDirectory();
        this.insuranceEnrollmentRequests = new InsuranceEnrollmentDirectory();
        this.appointments = new AppointmentDirectory();
        this.medicines = new MedicineDirectory();
        this.prescriptions = new PrescriptionDirectory();
        this.topLevelUserAccountDirectory.createUserAccount("admin", "admin", new SystemAdminRole());
        this.topLevelUserAccountDirectory.createUserAccount("pharmacist", "admin", new PharmacistRole());
    }
    
    public PatientDirectory getPatients() {
        return patients;
    }

    public void setPatients(PatientDirectory patients) {
        this.patients = patients;
    }

    public InsuranceAgentDirectory getInsuranceAgents() {
        return insuranceAgents;
    }

    public void setInsuranceAgents(InsuranceAgentDirectory insuranceAgents) {
        this.insuranceAgents = insuranceAgents;
    }

    public UserAccountDirectory getTopLevelUserAccountDirectory() {
        return topLevelUserAccountDirectory;
    }

    public void setTopLevelUserAccountDirectory(UserAccountDirectory topLevelUserAccountDirectory) {
        this.topLevelUserAccountDirectory = topLevelUserAccountDirectory;
    }
   
    public static Business getInstance() {
        return new Business();
    }
    
    public HospitalDirectory getHospitals() {
        return hospitals;
    }

    public void setHospitals(HospitalDirectory hospitals) {
        this.hospitals = hospitals;
    }

    public LabDirectory getLabs() {
        return labs;
    }

    public void setLabs(LabDirectory labs) {
        this.labs = labs;
    }

    public InsurancePlanDetails getInsurancePlans() {
        return insurancePlans;
    }

    public void setInsurancePlans(InsurancePlanDetails insurancePlans) {
        this.insurancePlans = insurancePlans;
    }

    public InsuranceEnrollmentDirectory getInsuranceEnrollmentRequests() {
        return insuranceEnrollmentRequests;
    }

    public void setInsuranceEnrollmentRequests(InsuranceEnrollmentDirectory insuranceEnrollmentRequests) {
        this.insuranceEnrollmentRequests = insuranceEnrollmentRequests;
    }

    public AppointmentDirectory getAppointments() {
        return appointments;
    }

    public void setAppointments(AppointmentDirectory appointments) {
        this.appointments = appointments;
    }

    public MedicineDirectory getMedicines() {
        return medicines;
    }

    public void setMedicines(MedicineDirectory medicines) {
        this.medicines = medicines;
    }

    public PrescriptionDirectory getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(PrescriptionDirectory prescriptions) {
        this.prescriptions = prescriptions;
    }
    
}
