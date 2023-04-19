/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Doctor.DoctorDirectory;
import Hospital.AppointmentDirectory;
import Hospital.HospitalDirectory;
import Insurance.InsuranceAgentDirectory;
import Insurance.InsuranceEnrollmentDirectory;
import Insurance.InsurancePlanDetails;
import Lab.LabTestsDirectory;
import Lab.TestRequestDirectory;
import Patient.PatientDirectory;
import Pharmacy.MedicineDirectory;
import Prescription.PrescriptionDirectory;
import Reports.TestReportDirectory;
import Role.InsuranceAdminRole;
import Role.LabTechnicianRole;
import Role.PharmacistRole;
import Role.PharmacyAdminRole;
import Role.SystemAdminRole;
import UserAccount.UserAccountDirectory;
import Role.HospitalAdminRole;
import Role.LabAdminRole;
/**
 *
 * @author divya
 */
public class Business {
    HospitalDirectory hospitals;
    PatientDirectory patients;
    InsuranceAgentDirectory insuranceAgents;
    LabTestsDirectory labTestsList;
    InsurancePlanDetails insurancePlans;   
    UserAccountDirectory topLevelUserAccountDirectory;
    InsuranceEnrollmentDirectory insuranceEnrollmentRequests;
    AppointmentDirectory appointments;
    MedicineDirectory medicines;
    TestRequestDirectory testPerformRequests;
    PrescriptionDirectory prescriptions;
    TestReportDirectory reports;
    DoctorDirectory doctorDir;

    public Business() {
        this.hospitals = new HospitalDirectory();
        //this.pharmacies = new PharmacyDirectory();
        this.insurancePlans = new InsurancePlanDetails();
        this.topLevelUserAccountDirectory = new UserAccountDirectory();
        this.patients = new PatientDirectory();
        this.insuranceAgents = new InsuranceAgentDirectory();
        this.labTestsList = new LabTestsDirectory();
        this.insuranceEnrollmentRequests = new InsuranceEnrollmentDirectory();
        this.appointments = new AppointmentDirectory();
        this.medicines = new MedicineDirectory();
        this.reports = new TestReportDirectory();
        this.prescriptions = new PrescriptionDirectory();
        this.doctorDir= new DoctorDirectory();
        this.testPerformRequests = new TestRequestDirectory();
        this.topLevelUserAccountDirectory.createUserAccount("admin", "admin", new SystemAdminRole());
        this.topLevelUserAccountDirectory.createUserAccount("pharmacist", "admin", new PharmacistRole());
        this.topLevelUserAccountDirectory.createUserAccount("labtech","admin",new LabTechnicianRole());
         this.topLevelUserAccountDirectory.createUserAccount("Insurance", "admin", new InsuranceAdminRole());
       this.topLevelUserAccountDirectory.createUserAccount("PharAdmin", "admin", new PharmacyAdminRole());
       this.topLevelUserAccountDirectory.createUserAccount("Lab", "admin", new LabAdminRole());
         this.topLevelUserAccountDirectory.createUserAccount("Hospital", "admin", new HospitalAdminRole());
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
    
    public LabTestsDirectory getLabTestsList() {
        return labTestsList;
    }

    public void setLabTestsList(LabTestsDirectory labTestsList) {
        this.labTestsList = labTestsList;
    }

    public TestRequestDirectory getTestPerformRequests() {
        return testPerformRequests;
    }

    public void setTestPerformRequests(TestRequestDirectory testPerformRequests) {
        this.testPerformRequests = testPerformRequests;
    }
    
    public TestReportDirectory getReports() {
        return reports;
    }

    public void setReports(TestReportDirectory reports) {
        this.reports = reports;
    }  

    public DoctorDirectory getDoctorDir() {
        return doctorDir;
    }

    public void setDoctorDir(DoctorDirectory doctorDir) {
        this.doctorDir = doctorDir;
    }
    
    
}
