/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PatientJPanels;

import Business.Business;
import Hospital.Appointment;
import Insurance.InsurancePlans;
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
public class PatientPrescriptionsJPanel extends javax.swing.JPanel {

    public Business business;
    public UserAccount userAccount;
    DefaultTableModel prescTableModel;
    
    public PatientPrescriptionsJPanel() {
        initComponents();
    }
    
    public PatientPrescriptionsJPanel(Business business, UserAccount userAccount) {
        initComponents();
        this.business = business;
        this.userAccount = userAccount;
        this.prescTableModel = (DefaultTableModel) patPrescriptionsTable.getModel();
        
        displayPrescriptions();
    }
    
    public void displayPrescriptions()
    {
        ArrayList<Prescription> ps = this.business.getPrescriptions().getPrescriptions();
        if(ps.size() >= 0) {
            prescTableModel.setRowCount(0);
            for(Prescription p: ps) {
                if (p.getPatient().getId().equals(userAccount.getPersonId()))
                {
                    Object row[] = new Object[8];
                    row[0] = p.getDoctor().getFirstName() + ' ' + p.getDoctor().getLastName();
                    row[1] = p.getPatient().getFirstName() + ' ' + p.getPatient().getLastName();
                    row[2] = p.getMedicine().getMedicineName();
                    row[3] = p.getQuantity();
                    row[4] = p.getStatus();
                    row[5] = p.getMedicine().getPrice() * p.getQuantity();
                    if (p.getPatient().getInsurancePlan() != null)
                    {
                        InsurancePlans ip = p.getPatient().getInsurancePlan();
                        Float coverage = ip.getCoveragePercentage();

                        row[6] = (p.getMedicine().getPrice() * p.getQuantity()) * coverage;
                        row[7] = (p.getMedicine().getPrice() * p.getQuantity()) - ((p.getMedicine().getPrice() * p.getQuantity()) * coverage);

                    }
                    else{
                        row[6] = 0.00;
                        row[7] =  p.getMedicine().getPrice() * p.getQuantity();
                    }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        patPrescriptionsTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));

        patPrescriptionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor", "Patient", "Medicine", "Quantity", "Status", "Total Cost", "Paid by Ins", "Paid by Patient"
            }
        ));
        jScrollPane1.setViewportView(patPrescriptionsTable);

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
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patPrescriptionsTable;
    // End of variables declaration//GEN-END:variables
}
