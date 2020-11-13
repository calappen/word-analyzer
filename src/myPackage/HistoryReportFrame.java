/** This Class is designed to handle the history reports frame **/ 

package myPackage;

import java.io.*; 
 
public class HistoryReportFrame extends OutlineFrame {

    /** Variables **/
    private File analyzedFile;
    private fileHandler handler;
    public static reportsHandler reports;
    
    /** Constructor **/ 
    public HistoryReportFrame(reportsHandler passReports) {
        this.setUndecorated(true);  //Remove default deocrations: has to be in the beginnig of the constructor to defeat isDisplayable
        initComponents();
        callInitComponents();
        this.setLocationRelativeTo(null); //set to middle of screen
        
        reports = passReports; 
        
        /** Display all analysis files to user **/ 
        TextAreaAnalysisComparison.setText(reports.displayReports());
    }
    
     /** WARNING: Do NOT modify (PreBuilt)**/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGridDivider = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaAnalysisComparison = new javax.swing.JTextArea();
        PanelUpload = new javax.swing.JPanel();
        ButtonBack2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Frame1"); // NOI18N
        setSize(new java.awt.Dimension(1100, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelGridDivider.setLayout(new java.awt.GridLayout(1, 0));

        TextAreaAnalysisComparison.setEditable(false);
        TextAreaAnalysisComparison.setColumns(20);
        TextAreaAnalysisComparison.setRows(5);
        jScrollPane1.setViewportView(TextAreaAnalysisComparison);

        PanelGridDivider.add(jScrollPane1);

        getContentPane().add(PanelGridDivider, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1020, 470));

        PanelUpload.setBackground(new java.awt.Color(235, 235, 235));
        PanelUpload.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "History Reports", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        PanelUpload.setForeground(new java.awt.Color(255, 204, 0));
        PanelUpload.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonBack2.setText("Back");
        ButtonBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBack2ActionPerformed(evt);
            }
        });
        PanelUpload.add(ButtonBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 500, 110, -1));

        getContentPane().add(PanelUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 83, 1060, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBack2ActionPerformed
        myPackage.ProjectManager.enableIntroFrame();
    }//GEN-LAST:event_ButtonBack2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack2;
    private javax.swing.JPanel PanelGridDivider;
    private javax.swing.JPanel PanelUpload;
    private javax.swing.JTextArea TextAreaAnalysisComparison;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
