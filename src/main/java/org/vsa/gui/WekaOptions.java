package org.vsa.gui;

import java.awt.Container;
import javax.swing.JDialog;
import org.vsa.WekaConfig;

/**
 * WekaOptions
 */
public class WekaOptions extends JDialog {

    /**
     * Creates new form WekaOptions
     * 
     * @param parent
     */
    public WekaOptions(Container parent) {
        initComponents();
        this.setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboBoxAlgorytmy = new javax.swing.JComboBox();
        CheckBoxFiltry = new javax.swing.JCheckBox();
        ComboBoxFiltry = new javax.swing.JComboBox();
        ButtonAkcpet = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextFiledFolds = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Opções");

        ComboBoxAlgorytmy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "J48", "Naive Bayes", "Lazy IBk", "Random Tree", "SMO", "PART", "Decision Table", "Multi Layer", "Kstar" }));

        CheckBoxFiltry.setText("por favor, use o filtro de dados");
        CheckBoxFiltry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboboxFiltryitemchange(evt);
            }
        });

        ComboBoxFiltry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CSF greedy", "CSF best first", "Filtered CSF greedy", "Filtered CSF best first", "Consistency greedy", "Consistency best first" }));
        ComboBoxFiltry.setEnabled(false);

        ButtonAkcpet.setText("Aceitar");
        ButtonAkcpet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonAkcpetMouseClicked(evt);
            }
        });

        ButtonCancel.setText("Cancelar");
        ButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCancelMouseClicked(evt);
            }
        });

        jLabel1.setText("Algoritimo:");

        jLabel2.setText("Filtros:");

        TextFiledFolds.setText("10");

        jLabel3.setText("Dobras de avaliação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonAkcpet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonCancel))
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(ComboBoxAlgorytmy, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(CheckBoxFiltry)
                    .addComponent(ComboBoxFiltry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFiledFolds, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxAlgorytmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckBoxFiltry)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxFiltry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFiledFolds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAkcpet)
                    .addComponent(ButtonCancel))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboboxFiltryitemchange(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboboxFiltryitemchange
        ComboBoxFiltry.setEnabled(!ComboBoxFiltry.isEnabled());
    }//GEN-LAST:event_comboboxFiltryitemchange

    private void ButtonAkcpetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAkcpetMouseClicked
        WekaConfig wekaConfig = WekaConfig.getInstance();
        
        wekaConfig.setFilter(ComboBoxFiltry.getSelectedItem().toString());
        wekaConfig.setFilterBool(CheckBoxFiltry.isSelected());
        wekaConfig.setAlgorithm(ComboBoxAlgorytmy.getSelectedItem().toString());
        wekaConfig.setFolds(Integer.parseInt(TextFiledFolds.getText()));
        setVisible(false);
        dispose();
    }//GEN-LAST:event_ButtonAkcpetMouseClicked

    private void ButtonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCancelMouseClicked
        setVisible(false);
        dispose();
    }//GEN-LAST:event_ButtonCancelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAkcpet;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JCheckBox CheckBoxFiltry;
    private javax.swing.JComboBox ComboBoxAlgorytmy;
    private javax.swing.JComboBox ComboBoxFiltry;
    private javax.swing.JTextField TextFiledFolds;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
