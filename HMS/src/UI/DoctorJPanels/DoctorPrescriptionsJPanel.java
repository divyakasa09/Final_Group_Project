/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.DoctorJPanels;

import Business.Business;
import Doctor.Doctor;
import Hospital.Appointment;
import Hospital.Hospital;
import Hospital.Vitals;
import Patient.Patient;
import Pharmacy.Medicine;
import Prescription.Prescription;
import UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MC
 */
public class DoctorPrescriptionsJPanel extends javax.swing.JPanel {

    public Business business;
    public UserAccount userAccount;
    DefaultTableModel prescTableModel;
    
    public DoctorPrescriptionsJPanel() {
        initComponents();
    }
    
    public DoctorPrescriptionsJPanel(Business business, UserAccount userAccount) {
        initComponents();
        this.business = business;
        this.userAccount = userAccount;
        this.prescTableModel = (DefaultTableModel) docPrescriptionsTable.getModel();
        
        displayPrescriptions();
        populateDropdowns();
    }
    
    public void populateDropdowns()
    {
        ArrayList<Patient> pts = new ArrayList<Patient>();
        ArrayList<Appointment> aps = this.business.getAppointments().getAppointments();
        for(Appointment a: aps) 
        {
            if (a.getDoctor().getId().equals(userAccount.getPersonId()))
            {
                pts.add(a.getPatient());
            }
        }
        
        for (Patient p : pts)
        {
            patCBox.addItem(p.getId() + ';' + p.getFirstName() + ' ' + p.getLastName());
        }
        
        ArrayList<Medicine> meds = this.business.getMedicines().getMedicineList();
        
        for (Medicine m : meds)
        {
            medicineCBox.addItem(m.getSerialNumber() + ';' + m.getMedicineName());
        }
    }
    
    public void displayPrescriptions()
    {
        ArrayList<Prescription> ps = this.business.getPrescriptions().getPrescriptions();
        if(ps.size() >= 0) {
            prescTableModel.setRowCount(0);
            for(Prescription p: ps) {
                if (p.getDoctor().getId().equals(userAccount.getPersonId()))
                {
                    Object row[] = new Object[5];
                    row[0] = p.getDoctor().getFirstName() + ' ' + p.getDoctor().getLastName();
                    row[1] = p.getPatient().getFirstName() + ' ' + p.getPatient().getLastName();
                    row[2] = p.getMedicine().getMedicineName();
                    row[3] = p.getQuantity();
                    row[4] = p.getStatus();
                    prescTableModel.addRow(row);
                } 
            }
        }        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        patCBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        medicineCBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        medQuantityTextField = new javax.swing.JTextField();
        sendPresBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        docPrescriptionsTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(173, 245, 245));

        jLabel1.setText("Select a Patient");

        jLabel2.setText("Medicine");

        jLabel3.setText("Quantity");

        sendPresBtn.setText("Send Prescription");
        sendPresBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendPresBtnActionPerformed(evt);
            }
        });

        docPrescriptionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Doctor", "Patient", "Medicine", "Quantity", "Status"
            }
        ));
        jScrollPane1.setViewportView(docPrescriptionsTable);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hospital Management System");
        jPanel2.add(jLabel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(medicineCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(medQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sendPresBtn)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(68, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(patCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(medicineCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(medQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(sendPresBtn)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(391, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendPresBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendPresBtnActionPerformed
        // TODO add your handling code here:
        String patientId = patCBox.getSelectedItem().toString().split(";")[0];
        String medSNo = medicineCBox.getSelectedItem().toString().split(";")[0];
        int quantity = Integer.parseInt(medQuantityTextField.getText());
        Patient p = this.business.getPatients().findPatient(patientId);
        Medicine m = this.business.getMedicines().findMedicine(medSNo);
        Doctor doc = null;
        
        for(Hospital h : this.business.getHospitals().getHospitals())
        {
            for (Doctor d : h.getDoctors().getDoctorsList())
            {
                if(d.getId().equals(userAccount.getPersonId()))
                {
                    doc = d;
                    break;
                }
            }
        }
        
        this.business.getPrescriptions().addPrescription(doc, p, m, quantity);
        displayPrescriptions();        
    }//GEN-LAST:event_sendPresBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable docPrescriptionsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField medQuantityTextField;
    private javax.swing.JComboBox<String> medicineCBox;
    private javax.swing.JComboBox<String> patCBox;
    private javax.swing.JButton sendPresBtn;
    // End of variables declaration//GEN-END:variables
}
