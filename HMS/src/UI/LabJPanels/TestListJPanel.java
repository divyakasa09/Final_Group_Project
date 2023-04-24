/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.LabJPanels;

import Business.Business;
import Lab.TestRequest;
import Patient.Patient;
import Reports.TestReport;
import UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thran
 */
public class TestListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TestListJPanel
     */
     public Business business;
    public UserAccount userAccount;
    DefaultTableModel testListTableModel;
    public TestListJPanel() {
        initComponents();
        displayTestLists();
        
    }
    public TestListJPanel(Business business, UserAccount userAccount) {
        initComponents();
        this.business = business;
        this.userAccount = userAccount;
        this.testListTableModel = (DefaultTableModel) patientTestListTable.getModel();
        
        displayTestLists();
    }
    public void displayTestLists() {

        ArrayList<TestReport> trs = this.business.getReports().getReports();
        if (trs.size() >= 0) {
            testListTableModel.setRowCount(0);
            for (TestReport r : trs) {
                Object row[] = new Object[6];
                row[0] = r.getReportId();
                row[1] = r.getDoctor().getFirstName() + ' ' + r.getDoctor().getLastName();
//                row[2] = r.getPatient().getId();
                row[2] = r.getPatient().getFirstName() + ' ' + r.getPatient().getLastName();
                row[3] = r.getLabtest().getProcedureName();
                row[4] = r.getStatus();
                row[5] = r.getLabtest().getPrice();

                testListTableModel.addRow(row);
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

        evaluatorEllipse2D1 = new org.jdesktop.swing.animation.timing.evaluators.EvaluatorEllipse2D();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTestListTable = new javax.swing.JTable();
        performTestBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientTestListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Doctor Name", "Patient Name", "Test Name", "Status", "Pricce"
            }
        ));
        jScrollPane1.setViewportView(patientTestListTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 470, 100));

        performTestBtn.setText("Perform Test");
        performTestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                performTestBtnActionPerformed(evt);
            }
        });
        add(performTestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hospital Management System");
        jPanel2.add(jLabel5);

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void performTestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_performTestBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = patientTestListTable.getSelectedRow();
        String patientId = patientTestListTable.getValueAt(selectedRowIndex, 2).toString();
        Patient cp = this.business.getPatients().findPatient(patientId);

        String RequestId = patientTestListTable.getValueAt(selectedRowIndex, 0).toString();
        TestRequest tr = this.business.getTestPerformRequests().findRequest(RequestId);
        tr.setStatus("test performed");

        
        displayTestLists();

    }//GEN-LAST:event_performTestBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swing.animation.timing.evaluators.EvaluatorEllipse2D evaluatorEllipse2D1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientTestListTable;
    private javax.swing.JButton performTestBtn;
    // End of variables declaration//GEN-END:variables
}