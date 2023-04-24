/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdminJPanels;

import Business.Business;
import Hospital.Appointment;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author thran
 */
public class DepartmentChartJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DepartmentChartJPanel
     */
    Business business;
    public DepartmentChartJPanel() {
        initComponents();
    }
 public DepartmentChartJPanel(Business business) {
        initComponents();
        this.business= business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chartpanel = new javax.swing.JPanel();
        generateCharts = new javax.swing.JButton();
        deptRevChartBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout chartpanelLayout = new javax.swing.GroupLayout(chartpanel);
        chartpanel.setLayout(chartpanelLayout);
        chartpanelLayout.setHorizontalGroup(
            chartpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        chartpanelLayout.setVerticalGroup(
            chartpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        add(chartpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 640, 460));

        generateCharts.setText("Patients in each Dept");
        generateCharts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateChartsActionPerformed(evt);
            }
        });
        add(generateCharts, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 180, -1));

        deptRevChartBtn.setText("Revenue per Dept");
        deptRevChartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptRevChartBtnActionPerformed(evt);
            }
        });
        add(deptRevChartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 210, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void generateChartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateChartsActionPerformed
        //patients
        
        ArrayList<Appointment> apts= this.business.getAppointments().getAppointments();
        int cardiologyPatients = 0;
        int pcPatients = 0;
        int generalMedPatients = 0;
        int surgeonPatients = 0;
        
        for (Appointment a : apts)
        {
            if (a.getDoctor().getSpeciality() == "Cardiology")
            {
                cardiologyPatients = cardiologyPatients + 1;
            }
            else if (a.getDoctor().getSpeciality() == "Primary Care")
            {
                pcPatients = pcPatients + 1;
            }
            else if (a.getDoctor().getSpeciality() == "General Medicine")
            {
                generalMedPatients = generalMedPatients + 1;
            }
            else{
                surgeonPatients = surgeonPatients + 1;
            }
        }
        
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue(" Cardiology", cardiologyPatients);
        dataset.setValue(" Primary Care", pcPatients);
        dataset.setValue(" General Medicine", generalMedPatients);
        dataset.setValue(" Surgery", surgeonPatients);
        
        JFreeChart chart = ChartFactory.createPieChart(
            "Patients per Department", // Chart title
            dataset, // Dataset
            true, // Legend
            true, // Tooltips
            false // URLs
        );

        // Step 4: Customize the chart
        PiePlot plot = (PiePlot) chart.getPlot();
        ChartFrame frame = new ChartFrame("Pie Chart",chart);
        frame.setVisible(true);
        frame.setSize(450,500);
    }//GEN-LAST:event_generateChartsActionPerformed

    private void deptRevChartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptRevChartBtnActionPerformed
        ArrayList<Appointment> apts= this.business.getAppointments().getAppointments();
        Float cardiologyPatients = 0.00f;
        Float pcPatients = 0.00f;
        Float generalMedPatients = 0.00f;
        Float surgeonPatients = 0.00f;
        
        for (Appointment a : apts)
        {
            if (a.getDoctor().getSpeciality() == "Cardiology")
            {
                cardiologyPatients = cardiologyPatients + a.getCost();
            }
            else if (a.getDoctor().getSpeciality() == "Primary Care")
            {
                pcPatients = pcPatients + a.getCost();
            }
            else if (a.getDoctor().getSpeciality() == "General Medicine")
            {
                generalMedPatients = generalMedPatients + a.getCost();
            }
            else{
                surgeonPatients = surgeonPatients + a.getCost();
            }
        }
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
        dataset.setValue(cardiologyPatients, "Cardiology", "NumPatients");
        dataset.setValue(pcPatients, " Primary Care", "NumPatients");
        dataset.setValue(generalMedPatients, "General Medicine", "NumPatients");
        dataset.setValue(surgeonPatients, " Surgery", "NumPatients");
        
        JFreeChart chart = ChartFactory.createBarChart(
            "Patients per Department",
            "Department",
            "Num of Patients",
            dataset, PlotOrientation.VERTICAL, true, true, false
        );

        // Step 4: Customize the chart
        Plot plot = chart.getPlot();
        ChartFrame frame = new ChartFrame("Dept Bar Chart",chart);
        frame.setVisible(true);
        frame.setSize(450,500);
    }//GEN-LAST:event_deptRevChartBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chartpanel;
    private javax.swing.JButton deptRevChartBtn;
    private javax.swing.JButton generateCharts;
    // End of variables declaration//GEN-END:variables
}