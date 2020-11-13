/** This Class is designed to handle the main frame **/ 

package myPackage;
import javax.swing.*; 
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*; 
import java.util.*;
import java.awt.Color;
import java.text.DateFormat;  

public class WordAnalyzerFrame extends OutlineFrame {

    /** Variables **/
    private File analyzedFile;
    private fileHandler handler;
    private static reportsHandler reports;
    private String defaultDirectory; 
    private String currentTextDirectory; 
    private boolean first = false; 

    /** Constructor **/ 
    public WordAnalyzerFrame() {
        this.setUndecorated(true);  //Remove default deocrations: has to be in the beginnig of the constructor to defeat isDisplayable
        initComponents();
        callInitComponents();
        this.setLocationRelativeTo(null); //set to middle of screen
        
        /** Create Reports Keeper **/ 
        reports = new reportsHandler(); 
        
        /** defaultDirectory is used in (Save Analysis) **/ 
        defaultDirectory = TextDirectory.getText(); 
    }
    
     /** WARNING: Do NOT modify (PreBuilt)**/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelUpload = new javax.swing.JPanel();
        LabelFileName = new javax.swing.JLabel();
        TextDirectory = new javax.swing.JTextField();
        ButtonUpload = new javax.swing.JButton();
        PanelDivider = new javax.swing.JPanel();
        PanelContent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaContent = new javax.swing.JTextArea();
        TextAreaContent.setVisible(true);
        PanelAnalyze = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numLines = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        numBlankLines = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        numSpaces = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        numWords = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        numSentences = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        aveCharLine = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        aveWordLine = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        aveWordLength = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lexicalDensity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        commonWords = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        SaveAnalysis = new javax.swing.JButton();
        History = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setName("Frame1"); // NOI18N
        setSize(new java.awt.Dimension(1100, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelUpload.setBackground(new java.awt.Color(235, 235, 235));
        PanelUpload.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Upload", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        PanelUpload.setForeground(new java.awt.Color(255, 204, 0));
        PanelUpload.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelFileName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelFileName.setText("File Name: ");
        PanelUpload.add(LabelFileName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        TextDirectory.setEditable(false);
        TextDirectory.setForeground(new java.awt.Color(204, 204, 204));
        TextDirectory.setText("Click to Choose File");
        TextDirectory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextDirectoryMouseClicked(evt);
            }
        });
        PanelUpload.add(TextDirectory, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 860, -1));

        ButtonUpload.setText("Upload");
        PanelUpload.add(ButtonUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 110, -1));

        getContentPane().add(PanelUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 83, 1060, 60));

        PanelDivider.setBackground(new java.awt.Color(235, 235, 235));
        PanelDivider.setLayout(new java.awt.GridLayout(1, 2));

        PanelContent.setBackground(PanelDivider.getBackground());
        PanelContent.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "File Content", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        PanelContent.setLayout(new java.awt.GridLayout(1, 0));

        TextAreaContent.setEditable(false);
        TextAreaContent.setColumns(20);
        TextAreaContent.setForeground(new java.awt.Color(204, 204, 204));
        TextAreaContent.setRows(5);
        TextAreaContent.setText("No File Uploaded");
        jScrollPane1.setViewportView(TextAreaContent);
        TextAreaContent.getAccessibleContext().setAccessibleName("");

        PanelContent.add(jScrollPane1);

        PanelDivider.add(PanelContent);

        PanelAnalyze.setBackground(PanelDivider.getBackground());
        PanelAnalyze.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "File Analysis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("Number of Lines:");
        jLabel1.setPreferredSize(new java.awt.Dimension(170, 35));

        numLines.setEditable(false);
        numLines.setForeground(new java.awt.Color(204, 204, 204));
        numLines.setText("No Results");
        numLines.setPreferredSize(PanelAnalyze.getPreferredSize());

        jLabel2.setText("Number of Blank Lines:");
        jLabel2.setPreferredSize(new java.awt.Dimension(170, 35));

        numBlankLines.setEditable(false);
        numBlankLines.setForeground(new java.awt.Color(204, 204, 204));
        numBlankLines.setText("No Results");
        numBlankLines.setPreferredSize(PanelAnalyze.getPreferredSize());

        jLabel3.setText("Number of Spaces:");
        jLabel3.setPreferredSize(new java.awt.Dimension(170, 35));

        numSpaces.setEditable(false);
        numSpaces.setForeground(new java.awt.Color(204, 204, 204));
        numSpaces.setText("No Results");
        numSpaces.setPreferredSize(PanelAnalyze.getPreferredSize());

        jLabel4.setText("Number of Words:");
        jLabel4.setToolTipText("");
        jLabel4.setAlignmentY(0.0F);
        jLabel4.setPreferredSize(new java.awt.Dimension(170, 35));

        numWords.setEditable(false);
        numWords.setForeground(new java.awt.Color(204, 204, 204));
        numWords.setText("No Results");
        numWords.setPreferredSize(PanelAnalyze.getPreferredSize());

        jLabel5.setText("Number of Sentences:");
        jLabel5.setPreferredSize(new java.awt.Dimension(170, 35));

        numSentences.setEditable(false);
        numSentences.setForeground(new java.awt.Color(204, 204, 204));
        numSentences.setText("No Results");
        numSentences.setPreferredSize(PanelAnalyze.getPreferredSize());

        jLabel6.setText("Average Characters Per Line:");
        jLabel6.setPreferredSize(new java.awt.Dimension(170, 35));

        aveCharLine.setEditable(false);
        aveCharLine.setForeground(new java.awt.Color(204, 204, 204));
        aveCharLine.setText("No Results");
        aveCharLine.setPreferredSize(PanelAnalyze.getPreferredSize());

        jLabel7.setText("Average Words Per Line:");
        jLabel7.setPreferredSize(new java.awt.Dimension(170, 35));

        aveWordLine.setEditable(false);
        aveWordLine.setForeground(new java.awt.Color(204, 204, 204));
        aveWordLine.setText("No Results");
        aveWordLine.setPreferredSize(PanelAnalyze.getPreferredSize());

        jLabel8.setText("Average Word Length:");
        jLabel8.setPreferredSize(new java.awt.Dimension(170, 35));

        aveWordLength.setEditable(false);
        aveWordLength.setForeground(new java.awt.Color(204, 204, 204));
        aveWordLength.setText("No Results");
        aveWordLength.setPreferredSize(PanelAnalyze.getPreferredSize());

        jLabel9.setText("Lexical Density:");
        jLabel9.setPreferredSize(new java.awt.Dimension(170, 35));

        lexicalDensity.setEditable(false);
        lexicalDensity.setForeground(new java.awt.Color(204, 204, 204));
        lexicalDensity.setText("No Results");
        lexicalDensity.setPreferredSize(PanelAnalyze.getPreferredSize());

        jLabel10.setText("Most Common Words:");

        commonWords.setEditable(false);
        commonWords.setForeground(new java.awt.Color(204, 204, 204));
        commonWords.setText("No Results");

        jPanel1.setBackground(new java.awt.Color(235, 235, 235));
        jPanel1.setLayout(new java.awt.GridLayout(1, 3));

        SaveAnalysis.setText("Save Anlyasis");
        SaveAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAnalysisActionPerformed(evt);
            }
        });
        jPanel1.add(SaveAnalysis);

        History.setText("History Reports");
        History.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryActionPerformed(evt);
            }
        });
        jPanel1.add(History);

        javax.swing.GroupLayout PanelAnalyzeLayout = new javax.swing.GroupLayout(PanelAnalyze);
        PanelAnalyze.setLayout(PanelAnalyzeLayout);
        PanelAnalyzeLayout.setHorizontalGroup(
            PanelAnalyzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAnalyzeLayout.createSequentialGroup()
                .addGroup(PanelAnalyzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAnalyzeLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(numLines, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAnalyzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelAnalyzeLayout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(numBlankLines, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelAnalyzeLayout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(numSpaces, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelAnalyzeLayout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(numWords, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelAnalyzeLayout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(numSentences, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelAnalyzeLayout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(aveCharLine, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAnalyzeLayout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(aveWordLine, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelAnalyzeLayout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(aveWordLength, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelAnalyzeLayout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(lexicalDensity, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelAnalyzeLayout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(commonWords, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0))
            .addGroup(PanelAnalyzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelAnalyzeLayout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 18, Short.MAX_VALUE)))
        );
        PanelAnalyzeLayout.setVerticalGroup(
            PanelAnalyzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAnalyzeLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(PanelAnalyzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numLines, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAnalyzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numBlankLines, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAnalyzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numSpaces, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAnalyzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numWords, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAnalyzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numSentences, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAnalyzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aveCharLine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAnalyzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aveWordLine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAnalyzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aveWordLength, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAnalyzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lexicalDensity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAnalyzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(commonWords, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(PanelAnalyzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAnalyzeLayout.createSequentialGroup()
                    .addGap(0, 433, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        PanelDivider.add(PanelAnalyze);

        getContentPane().add(PanelDivider, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1060, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextDirectoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextDirectoryMouseClicked

        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("txt files (*.txt)", "txt");
        JFileChooser fileChooser = new JFileChooser(); //filter file types
        fileChooser.setFileFilter(fileFilter);
        fileChooser.setDialogTitle("Choose a file");
        fileChooser.showOpenDialog(this);
        
        /** Display Directory to file **/
        TextDirectory.setText(fileChooser.getSelectedFile().getAbsolutePath());
        TextDirectory.setEditable(false);
        TextDirectory.setForeground(Color.black);
       
        /** Update current text Directory **/ 
        currentTextDirectory = fileChooser.getSelectedFile().getAbsolutePath();
        analyzedFile = fileChooser.getSelectedFile();
        first = true; 
        
        /** Connect Directory to file triggered at ButtonUpload **/
        ButtonUpload.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                    if(first)
                    {                    
                        /** Create fileHandler Object **/ 
                        handler = new fileHandler(analyzedFile);

                        /** Display file content in JFrame **/ 
                        try
                        {
                            /** Save Text file to array list of String **/ 
                            handler.saveText();

                            /** Display and Save File Content for the method handlefile to work  **/
                            FileReader reader = new FileReader(analyzedFile);
                            BufferedReader buffer = new BufferedReader(reader); //read line by line
                            String strBuffer, text = "";

                            TextAreaContent.setText(null);
                            while((strBuffer = buffer.readLine()) != null)
                            {
                                text += strBuffer + "\n";
                            }
                            TextAreaContent.setText(text);
                            TextAreaContent.setForeground(Color.black);

                            /** Analyze and Process Text **/ 
                            handleFile();

                            /** Remove all Punctuations **/ 
                            TextAreaContent.setText(null);                            
                            TextAreaContent.setText(handler.displayAfterRemovedPunctuations()); 

                            buffer.close();
                            reader.close(); 
                        }
                        catch(Exception e2) {System.out.println(e2);}; //Catches exception FileNotFound

                        first = false;
                        
                    }
                    
            }
        });
    }//GEN-LAST:event_TextDirectoryMouseClicked

    private void SaveAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAnalysisActionPerformed
        
        /** Only save when there is an actual directory **/ 
        if(! TextDirectory.getText().equals(defaultDirectory))
        {
            /** Save Analysis as .text **/
            FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("txt files (*.txt)", "txt");
            String desktopPath = System.getProperty("user.home") + "/Desktop";
            JFileChooser fileChooser = new JFileChooser(desktopPath); //filter file types
            fileChooser.setFileFilter(fileFilter);
            fileChooser.setDialogTitle("Save a file");
            int saved = fileChooser.showSaveDialog(this);

            if(saved == JFileChooser.APPROVE_OPTION)
            {
                File saveFile = new File(fileChooser.getSelectedFile()+".txt");
                try
                {
                    FileWriter writer = new FileWriter(saveFile);
                    BufferedWriter bufferWriter = new BufferedWriter(writer);

                    /** Save all analysis manually in a string to be written in file **/
                    String fileAnalysis = "Word Analyzer 1.0\r\n";
                    fileAnalysis += "\r\n" + jLabel1.getText() + "\t\t" + numLines.getText();
                    fileAnalysis += "\r\n" + jLabel2.getText() + "\t\t" + numBlankLines.getText();
                    fileAnalysis += "\r\n" + jLabel3.getText() + "\t\t" + numSpaces.getText();
                    fileAnalysis += "\r\n" + jLabel4.getText() + "\t\t" + numWords.getText();
                    fileAnalysis += "\r\n" + jLabel5.getText() + "\t\t" + numSentences.getText();
                    fileAnalysis += "\r\n" + jLabel6.getText() + "\t\t" + aveCharLine.getText();
                    fileAnalysis += "\r\n" + jLabel7.getText() + "\t\t" + aveWordLine.getText();
                    fileAnalysis += "\r\n" + jLabel8.getText() + "\t\t" + aveWordLength.getText();
                    fileAnalysis += "\r\n" + jLabel9.getText() + "\t\t" + lexicalDensity.getText();
                    fileAnalysis += "\r\n" + jLabel10.getText() + "\t\t" + commonWords.getText();

                    /** Date of Analysis **/ 
                    Date saveDate = new Date();
                    fileAnalysis += "\r\n\r\nDate: " + DateFormat.getDateInstance().format(saveDate);

                    /** Write and close file writer **/
                    writer.write(fileAnalysis);

                    /** Save to reports ArrayList **/ 
                    reports.addReport(saveFile.getName(), DateFormat.getDateInstance().format(saveDate), (fileAnalysis + "\r\n"), saveFile.getAbsolutePath()); 

                    /** Close After Writing */ 
                    writer.close();
                }
                
                catch (IOException ex){
                }
            }
        }
    }//GEN-LAST:event_SaveAnalysisActionPerformed

    private void HistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryActionPerformed
        myPackage.ProjectManager.enableReportFrame(reports);      
    }//GEN-LAST:event_HistoryActionPerformed
    
    private void handleFile()
    {
       try
        {
            /** Analyze and Process Text **/ 
            if(TextAreaContent.getText() != "") 
            {
               /** Number of Lines **/ 
               numLines.setText(handler.countLines() + "");
               numLines.setForeground(Color.black);

               /** Number of Blank Lines **/ 
               numBlankLines.setText(handler.countBlankLines() + "");
               numBlankLines.setForeground(Color.black);

               /** Number of Words **/ 
               numWords.setText(handler.countWords() + "");
               numWords.setForeground(Color.black);
               
               /** Number of Spaces **/ 
               numSpaces.setText(handler.countSpaces() + "");
               numSpaces.setForeground(Color.black);
               
               /** Number of Spaces **/ 
               numSentences.setText(handler.countSentences() + "");
               numSentences.setForeground(Color.black);
               
               /** Average Chars Per Line **/ 
               aveCharLine.setText(handler.charAve() + "");
               aveCharLine.setForeground(Color.black);
               
               /** Average Words Per Line **/ 
               aveWordLine.setText(handler.wordsAve() + "");
               aveWordLine.setForeground(Color.black);
               
               /** Average Word Length **/
               aveWordLength.setText(handler.aveWordLength() + "");
               aveWordLength.setForeground(Color.black);
               
               /** Lexical Density **/ 
               lexicalDensity.setText(handler.lexicalDensity() + "");
               lexicalDensity.setForeground(Color.black);
               
               /** Most Common Words **/ 
               commonWords.setText(handler.mostCommon() + "");
               commonWords.setForeground(Color.black);
           }

        }
        catch(Exception e2) {System.out.println(e2);}; //Catches exception FileNotFound
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonUpload;
    private javax.swing.JButton History;
    private javax.swing.JLabel LabelFileName;
    private javax.swing.JPanel PanelAnalyze;
    private javax.swing.JPanel PanelContent;
    private javax.swing.JPanel PanelDivider;
    private javax.swing.JPanel PanelUpload;
    private javax.swing.JButton SaveAnalysis;
    private javax.swing.JTextArea TextAreaContent;
    private javax.swing.JTextField TextDirectory;
    private javax.swing.JTextField aveCharLine;
    private javax.swing.JTextField aveWordLength;
    private javax.swing.JTextField aveWordLine;
    private javax.swing.JTextField commonWords;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lexicalDensity;
    private javax.swing.JTextField numBlankLines;
    private javax.swing.JTextField numLines;
    private javax.swing.JTextField numSentences;
    private javax.swing.JTextField numSpaces;
    private javax.swing.JTextField numWords;
    // End of variables declaration//GEN-END:variables
}
