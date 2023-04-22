/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.ReceptionistJPanels;

import Business.Business;
import Doctor.Doctor;
import Hospital.Appointment;
import Hospital.Hospital;
import Insurance.InsurancePlans;
import Patient.Patient;
import UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MC
 */
public class RecAppointmentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RecAppointmentsJPanel
     */
    public Business business;
    public UserAccount userAccount;
    DefaultTableModel aptsTableModel;
    
    public RecAppointmentsJPanel() {
        initComponents();
    }
    
    public RecAppointmentsJPanel(Business business, UserAccount userAccount) {
        initComponents();
        this.business = business;
        this.userAccount = userAccount;
        this.aptsTableModel = (DefaultTableModel) recApptsTable.getModel();
        
        displayAppointments();
    }
    
    public void displayAppointments()
    {
        ArrayList<Appointment> aps = this.business.getAppointments().getAppointments();
        if(aps.size() >= 0) {
            aptsTableModel.setRowCount(0);
            for(Appointment a: aps) {
                Object row[] = new Object[10];
                Patient p = a.getPatient();
                row[0] = a.getAppointmentId();
                row[1] = a.getHospital().getHospitalName();
                row[2] = a.getDoctor().getId() + ';' + a.getDoctor().getFirstName() + ' ' + a.getDoctor().getLastName();
                row[3] = p.getFirstName() + ' ' + p.getLastName();
                row[4] = a.getAppointmentDate();
                row[5] = a.getAppointmentHour();
                row[6] = a.getCost();
                row[7] = a.getStatus();
                
                if (p.getInsurancePlan() != null)
                {
                    InsurancePlans ip = p.getInsurancePlan();
                    Float coverage = ip.getCoveragePercentage();
                    
                    row[8] = a.getCost() * coverage;
                    row[9] = a.getCost() - (a.getCost() * coverage);
                    
                }
                else{
                    row[8] = 0.00;
                    row[9] = a.getCost();
                }
                
                aptsTableModel.addRow(row);
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
        recApptsTable = new javax.swing.JTable();
        approveAptBtn = new javax.swing.JButton();
        rejectAptBtn = new javax.swing.JButton();

        recApptsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Apt Id", "Hospital", "Doctor", "Patient", "Date", "Time", "Total Cost", "Status", "Paid by Insurance", "Paid by Patient"
            }
        ));
        jScrollPane1.setViewportView(recApptsTable);

        approveAptBtn.setText("Approve");
        approveAptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveAptBtnActionPerformed(evt);
            }
        });

        rejectAptBtn.setText("Reject");
        rejectAptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectAptBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(approveAptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(rejectAptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approveAptBtn)
                    .addComponent(rejectAptBtn))
                .addContainerGap(352, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void approveAptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveAptBtnActionPerformed
        int selectedRowIndex = recApptsTable.getSelectedRow();
        String aptId = recApptsTable.getValueAt(selectedRowIndex, 0).toString();
        Appointment apt = this.business.getAppointments().findAppointment(aptId);
        apt.setStatus("Approved");
        
        displayAppointments(); 
    }//GEN-LAST:event_approveAptBtnActionPerformed

    private void rejectAptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectAptBtnActionPerformed
        int selectedRowIndex = recApptsTable.getSelectedRow();
        String aptId = recApptsTable.getValueAt(selectedRowIndex, 0).toString();
        Appointment apt = this.business.getAppointments().findAppointment(aptId);
        apt.setStatus("Rejected");
        
        displayAppointments();                          
    }//GEN-LAST:event_rejectAptBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveAptBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable recApptsTable;
    private javax.swing.JButton rejectAptBtn;
    // End of variables declaration//GEN-END:variables
}
