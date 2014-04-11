package org.vsa.gui;

import java.awt.Cursor;
import java.io.IOException;
import java.util.List;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.vsa.Config;
import org.vsa.api.Interrogation;
import org.vsa.api.VsaSystem;
import org.vsa.audio.AudioException;
import org.vsa.gui.classes.ClassifyTask;
import org.vsa.gui.classes.GenerateArffTask;
import org.vsa.gui.classes.InterrogationListModel;
import org.vsa.util.FileUtil;
import org.vsa.weka.Classification;
import org.vsa.weka.Evaluate;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48;
import weka.core.Instances;

/**
 * MainWindow
 */
public class MainWindow extends JFrame {

    /**
     * vsaSystem
     */
    private final VsaSystem vsaSystem = new VsaSystem();

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        // init components
        initComponents();

        // set list model
        lbInterrogations.setModel(new InterrogationListModel(vsaSystem));
    }

    /**
     * @return the vsaSystem
     */
    public VsaSystem getVsaSystem() {
        return vsaSystem;
    }
    
    /**
     * getSelectedInterrogation
     * 
     * @return 
     */
    public Interrogation getSelectedInterrogation() {
        // get interrogation from list
        Interrogation interrogation = (Interrogation)lbInterrogations.getSelectedValue();

        // return value
        return interrogation;
    }
    
    public List<Object> getSelectedInterrogations() {
        return lbInterrogations.getSelectedValuesList();
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbInterrogations = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuExit = new javax.swing.JMenuItem();
        mnuAction = new javax.swing.JMenu();
        mnuNewInterrogation = new javax.swing.JMenuItem();
        mnuDetails = new javax.swing.JMenuItem();
        mnuClassify = new javax.swing.JMenuItem();
        mnuGenerateArff = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VSA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Przesłuchania"));

        jScrollPane1.setViewportView(lbInterrogations);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );

        mnuFile.setText("Plik");

        mnuExit.setText("Wyjście");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        mnuFile.add(mnuExit);

        jMenuBar1.add(mnuFile);

        mnuAction.setText("Akcja");

        mnuNewInterrogation.setText("Nowe przesłuchanie");
        mnuNewInterrogation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNewInterrogationActionPerformed(evt);
            }
        });
        mnuAction.add(mnuNewInterrogation);

        mnuDetails.setText("Sczegóły");
        mnuDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDetailsActionPerformed(evt);
            }
        });
        mnuAction.add(mnuDetails);

        mnuClassify.setText("Klasyfikuj");
        mnuClassify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClassifyActionPerformed(evt);
            }
        });
        mnuAction.add(mnuClassify);

        mnuGenerateArff.setText("Generuj Arff");
        mnuGenerateArff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGenerateArffActionPerformed(evt);
            }
        });
        mnuAction.add(mnuGenerateArff);

        jMenuBar1.add(mnuAction);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuNewInterrogationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNewInterrogationActionPerformed
        try {
            throw new Exception("Feature not implemented.");
        } catch(Exception e) {
            
            // show exception message
            JOptionPane.showMessageDialog(this, e.getLocalizedMessage());
        }
    }//GEN-LAST:event_mnuNewInterrogationActionPerformed

    private void mnuGenerateArffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGenerateArffActionPerformed
        GenerateArffTask generateArffTask = new GenerateArffTask(this);
        generateArffTask.execute();
    }//GEN-LAST:event_mnuGenerateArffActionPerformed

    private void mnuClassifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClassifyActionPerformed
        ClassifyTask classifyTask = new ClassifyTask(this);
        classifyTask.execute();
    }//GEN-LAST:event_mnuClassifyActionPerformed

    private void mnuDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDetailsActionPerformed
        GenerateArffTask summaryTask = new GenerateArffTask(this);
        summaryTask.execute();
    }//GEN-LAST:event_mnuDetailsActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnuExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lbInterrogations;
    private javax.swing.JMenu mnuAction;
    private javax.swing.JMenuItem mnuClassify;
    private javax.swing.JMenuItem mnuDetails;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuGenerateArff;
    private javax.swing.JMenuItem mnuNewInterrogation;
    // End of variables declaration//GEN-END:variables
}
