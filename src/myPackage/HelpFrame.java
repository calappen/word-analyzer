/** This Class is designed to handle the help frame **/ 

package myPackage;

public class HelpFrame extends OutlineFrame {

    /** Variables **/
   
    /** Constructor **/ 
    public HelpFrame() {
        this.setUndecorated(true);  //Remove default deocrations: has to be in the beginnig of the constructor to defeat isDisplayable
        initComponents();
        callInitComponents();
        this.setLocationRelativeTo(null); //set to middle of screen
    }

     /** WARNING: Do NOT modify (PreBuilt)**/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGridDivider = new javax.swing.JPanel();
        WordAnalyzerTutorial1 = new javax.swing.JPanel();
        LabelUpload30 = new javax.swing.JLabel();
        LabelUpload31 = new javax.swing.JLabel();
        LabelUpload32 = new javax.swing.JLabel();
        LabelUpload33 = new javax.swing.JLabel();
        LabelUpload34 = new javax.swing.JLabel();
        LabelUpload35 = new javax.swing.JLabel();
        LabelUpload36 = new javax.swing.JLabel();
        LabelUpload37 = new javax.swing.JLabel();
        LabelUpload38 = new javax.swing.JLabel();
        LabelUpload39 = new javax.swing.JLabel();
        LabelUpload45 = new javax.swing.JLabel();
        LabelUpload40 = new javax.swing.JLabel();
        LabelUpload41 = new javax.swing.JLabel();
        LabelUpload42 = new javax.swing.JLabel();
        LbaelUpload43 = new javax.swing.JLabel();
        LabelUpload44 = new javax.swing.JLabel();
        About = new javax.swing.JPanel();
        LabelUpload1 = new javax.swing.JLabel();
        LabelUpload8 = new javax.swing.JLabel();
        LabelUpload3 = new javax.swing.JLabel();
        PanelTitle4 = new javax.swing.JLabel();
        LabelUpload6 = new javax.swing.JLabel();
        LabelUpload2 = new javax.swing.JLabel();
        LabelUpload9 = new javax.swing.JLabel();
        LabelUpload10 = new javax.swing.JLabel();
        LabelUpload11 = new javax.swing.JLabel();
        LabelUpload12 = new javax.swing.JLabel();
        LabelUpload7 = new javax.swing.JLabel();
        LabelUpload15 = new javax.swing.JLabel();
        LabelUpload14 = new javax.swing.JLabel();
        LabelUpload16 = new javax.swing.JLabel();
        LabelUpload17 = new javax.swing.JLabel();
        LabelUpload18 = new javax.swing.JLabel();
        PanelUpload1 = new javax.swing.JPanel();
        ButtonBack3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Frame1"); // NOI18N
        setSize(new java.awt.Dimension(1100, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelGridDivider.setLayout(new java.awt.GridLayout(1, 2, 3, 0));

        WordAnalyzerTutorial1.setBackground(new java.awt.Color(235, 235, 235));
        WordAnalyzerTutorial1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "WordAnalyzer Tutorial", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        WordAnalyzerTutorial1.setForeground(new java.awt.Color(255, 204, 0));
        WordAnalyzerTutorial1.setLayout(new java.awt.GridLayout(16, 0, 0, 3));

        LabelUpload30.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        LabelUpload30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelUpload30.setText("Welcome to Word Analyzer 1.0");
        WordAnalyzerTutorial1.add(LabelUpload30);

        LabelUpload31.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        LabelUpload31.setText("UPLOAD FILE:");
        WordAnalyzerTutorial1.add(LabelUpload31);

        LabelUpload32.setText("1. In the main window, search for your file by clicking the text bar");
        WordAnalyzerTutorial1.add(LabelUpload32);

        LabelUpload33.setText("2. In the file chooser, select your file and click open");
        WordAnalyzerTutorial1.add(LabelUpload33);

        LabelUpload34.setText("3. Click on \"Upload\"");
        WordAnalyzerTutorial1.add(LabelUpload34);

        LabelUpload35.setText("4. Now, you will see the content of your file on the left side");
        WordAnalyzerTutorial1.add(LabelUpload35);

        LabelUpload36.setText("5. Also, you will see the text analysis in the grids to the right");
        WordAnalyzerTutorial1.add(LabelUpload36);

        LabelUpload37.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        LabelUpload37.setText("SAVE ANALYSIS:");
        WordAnalyzerTutorial1.add(LabelUpload37);

        LabelUpload38.setText("1. In the main window, click on \"Save Analysis\"");
        WordAnalyzerTutorial1.add(LabelUpload38);

        LabelUpload39.setText("2. In the file directory, write the name of your analysis and click save");
        WordAnalyzerTutorial1.add(LabelUpload39);

        LabelUpload45.setText("3. Now, your analysis is saved with the date information");
        WordAnalyzerTutorial1.add(LabelUpload45);

        LabelUpload40.setText("4. You will find your analysis output in the same directory you saved it in");
        WordAnalyzerTutorial1.add(LabelUpload40);

        LabelUpload41.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        LabelUpload41.setText("VIEW HISTORY:");
        WordAnalyzerTutorial1.add(LabelUpload41);

        LabelUpload42.setText("1. Before viewing any history reports, save your analysis in the current session");
        WordAnalyzerTutorial1.add(LabelUpload42);

        LbaelUpload43.setText("2. In the main window, click on \"History Reports\"");
        WordAnalyzerTutorial1.add(LbaelUpload43);

        LabelUpload44.setText("3. Now, your will see all saved history analysis reports saved in this session");
        WordAnalyzerTutorial1.add(LabelUpload44);

        PanelGridDivider.add(WordAnalyzerTutorial1);

        About.setBackground(new java.awt.Color(235, 235, 235));
        About.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "About WordAnalyzer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        About.setForeground(new java.awt.Color(255, 204, 0));
        About.setLayout(new java.awt.GridLayout(16, 0, 0, 3));

        LabelUpload1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        LabelUpload1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelUpload1.setText("About Word Analyzer 1.0");
        About.add(LabelUpload1);

        LabelUpload8.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        LabelUpload8.setText("DEVELOPERS:");
        About.add(LabelUpload8);

        LabelUpload3.setText("1. Saja Matsah");
        About.add(LabelUpload3);

        PanelTitle4.setText("    Junior in Computer Science, Concentration in Infromation Assurance");
        About.add(PanelTitle4);

        LabelUpload6.setText("    Computing Informatics and Decisions Systems Engineering School");
        About.add(LabelUpload6);

        LabelUpload2.setText("    Ira. A. Fulton, Schools of Engineering");
        About.add(LabelUpload2);

        LabelUpload9.setText("2. Christopher Lappen");
        About.add(LabelUpload9);

        LabelUpload10.setText("    Senior in Digital Culture");
        About.add(LabelUpload10);

        LabelUpload11.setText("    Arts, Media and Engineering School");
        About.add(LabelUpload11);

        LabelUpload12.setText("    Herberger Institute School");
        About.add(LabelUpload12);

        LabelUpload7.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        LabelUpload7.setText("DESCRIPTION:");
        About.add(LabelUpload7);

        LabelUpload15.setText("    Word Analyzer 1.0 in an academic project for the class of CSE360: Introduction");
        About.add(LabelUpload15);

        LabelUpload14.setText("to Software Engineering. It has been developed as part of the curriculum to train");
        About.add(LabelUpload14);

        LabelUpload16.setText("students as industry software engineers, teahcing them the agile development ");
        About.add(LabelUpload16);

        LabelUpload17.setText("process of of creating efficent and reliable process. In addition, it upskills the ");
        About.add(LabelUpload17);

        LabelUpload18.setText("involvment of team work while executing deliverables and meeting deadlines. ");
        About.add(LabelUpload18);

        PanelGridDivider.add(About);

        getContentPane().add(PanelGridDivider, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1020, 470));

        PanelUpload1.setBackground(new java.awt.Color(235, 235, 235));
        PanelUpload1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        PanelUpload1.setForeground(new java.awt.Color(255, 204, 0));
        PanelUpload1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonBack3.setText("Back");
        ButtonBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBack3ActionPerformed(evt);
            }
        });
        PanelUpload1.add(ButtonBack3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 500, 110, -1));

        getContentPane().add(PanelUpload1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 83, 1060, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBack3ActionPerformed
        myPackage.ProjectManager.enableIntroFrame();
    }//GEN-LAST:event_ButtonBack3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel About;
    private javax.swing.JButton ButtonBack3;
    private javax.swing.JLabel LabelUpload1;
    private javax.swing.JLabel LabelUpload10;
    private javax.swing.JLabel LabelUpload11;
    private javax.swing.JLabel LabelUpload12;
    private javax.swing.JLabel LabelUpload14;
    private javax.swing.JLabel LabelUpload15;
    private javax.swing.JLabel LabelUpload16;
    private javax.swing.JLabel LabelUpload17;
    private javax.swing.JLabel LabelUpload18;
    private javax.swing.JLabel LabelUpload2;
    private javax.swing.JLabel LabelUpload3;
    private javax.swing.JLabel LabelUpload30;
    private javax.swing.JLabel LabelUpload31;
    private javax.swing.JLabel LabelUpload32;
    private javax.swing.JLabel LabelUpload33;
    private javax.swing.JLabel LabelUpload34;
    private javax.swing.JLabel LabelUpload35;
    private javax.swing.JLabel LabelUpload36;
    private javax.swing.JLabel LabelUpload37;
    private javax.swing.JLabel LabelUpload38;
    private javax.swing.JLabel LabelUpload39;
    private javax.swing.JLabel LabelUpload40;
    private javax.swing.JLabel LabelUpload41;
    private javax.swing.JLabel LabelUpload42;
    private javax.swing.JLabel LabelUpload44;
    private javax.swing.JLabel LabelUpload45;
    private javax.swing.JLabel LabelUpload6;
    private javax.swing.JLabel LabelUpload7;
    private javax.swing.JLabel LabelUpload8;
    private javax.swing.JLabel LabelUpload9;
    private javax.swing.JLabel LbaelUpload43;
    private javax.swing.JPanel PanelGridDivider;
    private javax.swing.JLabel PanelTitle4;
    private javax.swing.JPanel PanelUpload1;
    private javax.swing.JPanel WordAnalyzerTutorial1;
    // End of variables declaration//GEN-END:variables
}
