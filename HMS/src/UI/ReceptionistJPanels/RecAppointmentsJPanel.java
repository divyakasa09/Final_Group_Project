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
                Object row[] = new Object[11];
                Patient p = a.getPatient();
                row[0] = a.getAppointmentId();
                row[1] = a.getHospital().getHospitalName();
                row[2] = a.getDoctor().getId() + ';' + a.getDoctor().getFirstName() + ' ' + a.getDoctor().getLastName();
                row[3] = p.getFirstName() + ' ' + p.getLastName();
               
                row[4] = a.getAppointmentDate();
                row[5] = a.getAppointmentHour();
                row[6] = a.getCost();
                row[7]= p.getEmail();
                row[8] = a.getStatus();
                
                if (p.getInsurancePlan() != null)
                {
                    InsurancePlans ip = p.getInsurancePlan();
                    Float coverage = ip.getCoveragePercentage();
                    
                    row[9] = a.getCost() * coverage;
                    row[10] = a.getCost() - (a.getCost() * coverage);
                    
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
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        recApptsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Apt Id", "Hospital", "Doctor", "Patient", "Date", "Time", "Total Cost", "Patient Email ID", "Status", "Paid by Insurance", "Paid by Patient"
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

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Hospital Management System");
        jPanel2.add(jLabel12);

        jButton1.setText("Send Email");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(approveAptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(rejectAptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approveAptBtn)
                    .addComponent(rejectAptBtn)
                    .addComponent(jButton1))
                .addContainerGap(114, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

    EmailJFrame newFrame = new EmailJFrame();
    newFrame.setVisible(true);
    
    // Hide the current JFrame
    this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveAptBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable recApptsTable;
    private javax.swing.JButton rejectAptBtn;
    // End of variables declaration//GEN-END:variables
}
