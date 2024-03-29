/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.InsuranceJPanels;

import UI.PatientJPanels.*;
import Business.Business;
import Doctor.Doctor;
import Hospital.Hospital;
import Insurance.InsuranceEnrollment;
import Insurance.InsurancePlans;
import Patient.Patient;
import UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MC
 */
public class InsurancePlansJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InsurancePlansJPanel
     */
    public Business business;
    public UserAccount userAccount;
    DefaultTableModel insPlansTableModel;
    
    public InsurancePlansJPanel(Business business, UserAccount userAccount) {
        initComponents();
        this.business = business;
        this.userAccount = userAccount;
        this.insPlansTableModel = (DefaultTableModel) insEnrollmentsTable.getModel();
        
        displayInsurancePlans();
    }
    
    public void displayInsurancePlans()
    {
        ArrayList<InsuranceEnrollment> ips = this.business.getInsuranceEnrollmentRequests().getEnrollments();
        if(ips.size() >= 0) {
            insPlansTableModel.setRowCount(0);
            for(InsuranceEnrollment h: ips) {
                Object row[] = new Object[5];
                row[0] = h.getEnrollmentId();
                row[1] = h.getPatient().getId();
                row[2] = h.getPatient().getFirstName() + ' ' + h.getPatient().getLastName();
                row[3] = h.getInsurancePlan().getPlanName();
                row[4] = h.getStatus();
                insPlansTableModel.addRow(row);
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
        insEnrollmentsTable = new javax.swing.JTable();
        approveBtn = new javax.swing.JButton();
        enrollmentStatusLabel = new javax.swing.JLabel();
        rejectBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));

        insEnrollmentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Enrollment Id", "PatientId", "Patient Name", "Plan Name", "Status"
            }
        ));
        insEnrollmentsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(insEnrollmentsTable);

        approveBtn.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        approveBtn.setText("Approve");
        approveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveBtnActionPerformed(evt);
            }
        });

        rejectBtn.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rejectBtn.setText("Reject");
        rejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hospital Management System");
        jPanel2.add(jLabel5);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setText("Enrollment Requests");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(rejectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(enrollmentStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(approveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rejectBtn)
                    .addComponent(approveBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enrollmentStatusLabel)
                .addContainerGap(224, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void approveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveBtnActionPerformed

        int selectedRowIndex = insEnrollmentsTable.getSelectedRow();
        String patientId = insEnrollmentsTable.getValueAt(selectedRowIndex, 1).toString();
        Patient currentPatient = this.business.getPatients().findPatient(patientId);
        
        String enrollmentId = insEnrollmentsTable.getValueAt(selectedRowIndex, 0).toString();
        InsuranceEnrollment ie = this.business.getInsuranceEnrollmentRequests().findEnrollment(enrollmentId);
        
        ie.approveEnrollment(currentPatient);
        displayInsurancePlans();
    }//GEN-LAST:event_approveBtnActionPerformed

    private void rejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBtnActionPerformed
        int selectedRowIndex = insEnrollmentsTable.getSelectedRow();
        String patientId = insEnrollmentsTable.getValueAt(selectedRowIndex, 1).toString();
        Patient currentPatient = this.business.getPatients().findPatient(patientId);
        
        String enrollmentId = insEnrollmentsTable.getValueAt(selectedRowIndex, 0).toString();
        InsuranceEnrollment ie = this.business.getInsuranceEnrollmentRequests().findEnrollment(enrollmentId);
        
        ie.rejectEnrollment();
        displayInsurancePlans();
    }//GEN-LAST:event_rejectBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveBtn;
    private javax.swing.JLabel enrollmentStatusLabel;
    private javax.swing.JTable insEnrollmentsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rejectBtn;
    // End of variables declaration//GEN-END:variables
}
