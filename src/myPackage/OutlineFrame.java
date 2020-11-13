/** This Class is designed to be the parent of all frames that has all the common buttons and labels that repeated over all frames **/ 

package myPackage;

import javax.swing.*; 

public class OutlineFrame extends javax.swing.JFrame {

    /** Variables **/
    private int xMouse, yMouse;
    
    /** Constructor **/ 
    public OutlineFrame() {        
        /** Set Nimbus Project Design **/
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WordAnalyzerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WordAnalyzerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WordAnalyzerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WordAnalyzerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

     /** WARNING: Do NOT modify (PreBuilt)**/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelHelp = new javax.swing.JLabel();
        LabelExit = new javax.swing.JLabel();
        LabelMin = new javax.swing.JLabel();
        LabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Frame1"); // NOI18N
        setSize(new java.awt.Dimension(1100, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myPackage/helpExited.png"))); // NOI18N
        LabelHelp.setLabelFor(LabelHelp);
        LabelHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelHelpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelHelpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelHelpMouseExited(evt);
            }
        });
        getContentPane().add(LabelHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1026, 3, 20, 20));

        LabelExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myPackage/DarkClos.png"))); // NOI18N
        LabelExit.setLabelFor(LabelExit);
        LabelExit.setToolTipText("");
        LabelExit.setName("LabelExit"); // NOI18N
        LabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelExitMouseExited(evt);
            }
        });
        getContentPane().add(LabelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 3, 20, 20));

        LabelMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myPackage/DarkMin.png"))); // NOI18N
        LabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelMinMouseExited(evt);
            }
        });
        getContentPane().add(LabelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1048, 3, 20, 20));

        LabelBackground.setBackground(new java.awt.Color(255, 255, 255));
        LabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myPackage/WordAnalyzerFrame.jpg"))); // NOI18N
        LabelBackground.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        LabelBackground.setAlignmentX(0);
        LabelBackground.setAlignmentY(0);
        LabelBackground.setName("LabelBackground"); // NOI18N
        LabelBackground.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                LabelBackgroundMouseDragged(evt);
            }
        });
        LabelBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LabelBackgroundMousePressed(evt);
            }
        });
        getContentPane().add(LabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Label Background: Drag around screen **/ 
    private void LabelBackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBackgroundMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_LabelBackgroundMouseDragged
    
    //** Label Background: Initial Coordinates **/
    private void LabelBackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBackgroundMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_LabelBackgroundMousePressed
    
    //** Label Exit: Exit Motion / Exit **/
    private void LabelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitMouseEntered
        LabelExit.setIcon(new ImageIcon(getClass().getResource("LightClose.png")));
    }//GEN-LAST:event_LabelExitMouseEntered

    private void LabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LabelExitMouseClicked

    //** Label Min: Min Motion / Minimize **/
    private void LabelMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelMinMouseEntered
        LabelMin.setIcon(new ImageIcon(getClass().getResource("LightMini.png")));
    }//GEN-LAST:event_LabelMinMouseEntered

    private void LabelMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelMinMouseExited
        LabelMin.setIcon(new ImageIcon(getClass().getResource("DarkMin.png")));
    }//GEN-LAST:event_LabelMinMouseExited

    private void LabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelMinMouseClicked
        this.setState(WordAnalyzerFrame.ICONIFIED);
    }//GEN-LAST:event_LabelMinMouseClicked

    private void LabelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitMouseExited
        LabelExit.setIcon(new ImageIcon(getClass().getResource("DarkClos.png")));
    }//GEN-LAST:event_LabelExitMouseExited

    private void LabelHelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelHelpMouseEntered
        LabelHelp.setIcon(new ImageIcon(getClass().getResource("helpEntered.png")));
    }//GEN-LAST:event_LabelHelpMouseEntered

    private void LabelHelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelHelpMouseExited
        LabelHelp.setIcon(new ImageIcon(getClass().getResource("helpExited.png")));
    }//GEN-LAST:event_LabelHelpMouseExited

    private void LabelHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelHelpMouseClicked
        myPackage.ProjectManager.enableHelpFrame();  
    }//GEN-LAST:event_LabelHelpMouseClicked
    
    public void callInitComponents()
    {
        initComponents();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBackground;
    private javax.swing.JLabel LabelExit;
    private javax.swing.JLabel LabelHelp;
    private javax.swing.JLabel LabelMin;
    // End of variables declaration//GEN-END:variables
}
