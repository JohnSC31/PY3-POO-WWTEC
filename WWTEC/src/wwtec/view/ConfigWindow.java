
package wwtec.view;

import interfaces.iWindow;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ConfigWindow extends javax.swing.JFrame implements iWindow{

   
    public ConfigWindow() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pnlContact1 = new javax.swing.JPanel();
        LifeC1 = new javax.swing.JLabel();
        HitsC1 = new javax.swing.JLabel();
        spaceC1 = new javax.swing.JLabel();
        levelC1 = new javax.swing.JLabel();
        priceC1 = new javax.swing.JLabel();
        txfLifeC1 = new javax.swing.JTextField();
        txfSpacesC1 = new javax.swing.JTextField();
        txfHitsC1 = new javax.swing.JTextField();
        txfLevelC1 = new javax.swing.JTextField();
        txfPriceC1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txfLifeC2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        bntSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Configuracion");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Crecimiento de defensa");

        jTextField1.setText("50");

        jLabel3.setText("%");

        jLabel4.setText("%");

        jTextField2.setText("100");

        jLabel5.setText("Crecimiento de bienes");

        jLabel6.setText("%");

        jTextField3.setText("250");

        jTextField4.setText("100");

        jLabel7.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnlContact1.setBackground(new java.awt.Color(255, 255, 255));

        LifeC1.setText("Vida:");

        HitsC1.setText("Golpes p/s:");

        spaceC1.setText("Espacios: ");

        levelC1.setText("Nivel de aparición:");

        priceC1.setText("Precio:");

        txfLifeC1.setText("0");
        txfLifeC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfLifeC1ActionPerformed(evt);
            }
        });

        txfSpacesC1.setText("0");
        txfSpacesC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfSpacesC1ActionPerformed(evt);
            }
        });

        txfHitsC1.setText("0");
        txfHitsC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfHitsC1ActionPerformed(evt);
            }
        });

        txfLevelC1.setText("0");
        txfLevelC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfLevelC1ActionPerformed(evt);
            }
        });

        txfPriceC1.setText("0");
        txfPriceC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPriceC1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Nombre:");

        txfLifeC2.setText("0");
        txfLifeC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfLifeC2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Tipo:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aéreo", "De contacto", "Mediano alcance", "De choque", "De impacto" }));

        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout pnlContact1Layout = new javax.swing.GroupLayout(pnlContact1);
        pnlContact1.setLayout(pnlContact1Layout);
        pnlContact1Layout.setHorizontalGroup(
            pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContact1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContact1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlContact1Layout.createSequentialGroup()
                        .addGroup(pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(LifeC1)
                            .addComponent(HitsC1)
                            .addComponent(spaceC1)
                            .addComponent(levelC1)
                            .addComponent(priceC1))
                        .addGap(34, 34, 34)
                        .addGroup(pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, 0, 261, Short.MAX_VALUE)
                            .addComponent(txfLifeC2)
                            .addComponent(txfHitsC1)
                            .addComponent(txfLifeC1)
                            .addComponent(txfSpacesC1)
                            .addComponent(txfLevelC1)
                            .addComponent(txfPriceC1))
                        .addGap(97, 97, 97))))
        );
        pnlContact1Layout.setVerticalGroup(
            pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContact1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfLifeC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(21, 21, 21)
                .addGroup(pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfLifeC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LifeC1))
                .addGap(18, 18, 18)
                .addGroup(pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfHitsC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HitsC1))
                .addGap(18, 18, 18)
                .addGroup(pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfSpacesC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spaceC1))
                .addGap(18, 18, 18)
                .addGroup(pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelC1)
                    .addComponent(txfLevelC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceC1)
                    .addComponent(txfPriceC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("Volver");

        bntSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntSave.setText("Guardar Configuración");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Crea un guerrero");

        jFileChooser1.setCurrentDirectory(new java.io.File("C:\\Users\\josaf\\Documents\\GitHub\\U\\PY3-POO-WWTEC\\WWTEC\\src\\media\\attackComponents"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(941, 941, 941)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bntSave)
                                    .addComponent(btnBack))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlContact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlContact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(bntSave)
                        .addGap(31, 31, 31)
                        .addComponent(btnBack)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfLifeC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfLifeC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfLifeC1ActionPerformed

    private void txfSpacesC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfSpacesC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfSpacesC1ActionPerformed

    private void txfHitsC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfHitsC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfHitsC1ActionPerformed

    private void txfLevelC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfLevelC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfLevelC1ActionPerformed

    private void txfPriceC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPriceC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPriceC1ActionPerformed

    private void txfLifeC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfLifeC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfLifeC2ActionPerformed

    public JButton getBntSave() {
        return bntSave;
    }

    public JTextField getTxfHitsA1() {
        return txfHitsA1;
    }

    public JTextField getTxfHitsA2() {
        return txfHitsA2;
    }

    public JTextField getTxfHitsC1() {
        return txfHitsC1;
    }

    public JTextField getTxfHitsC2() {
        return txfHitsC2;
    }

    public JTextField getTxfHitsCo1() {
        return txfHitsCo1;
    }

    public JTextField getTxfHitsCo2() {
        return txfHitsCo2;
    }

    public JTextField getTxfHitsI1() {
        return txfHitsI1;
    }

    public JTextField getTxfHitsI2() {
        return txfHitsI2;
    }

    public JTextField getTxfHitsM1() {
        return txfHitsM1;
    }

    public JTextField getTxfHitsM2() {
        return txfHitsM2;
    }

    public JTextField getTxfLevelA1() {
        return txfLevelA1;
    }

    public JTextField getTxfLevelA2() {
        return txfLevelA2;
    }

    public JTextField getTxfLevelC1() {
        return txfLevelC1;
    }

    public JTextField getTxfLevelC2() {
        return txfLevelC2;
    }

    public JTextField getTxfLevelCo1() {
        return txfLevelCo1;
    }

    public JTextField getTxfLevelCo2() {
        return txfLevelCo2;
    }

    public JTextField getTxfLevelI1() {
        return txfLevelI1;
    }

    public JTextField getTxfLevelI2() {
        return txfLevelI2;
    }

    public JTextField getTxfLevelM1() {
        return txfLevelM1;
    }

    public JTextField getTxfLevelM2() {
        return txfLevelM2;
    }

    public JTextField getTxfLifeA1() {
        return txfLifeA1;
    }

    public JTextField getTxfLifeA2() {
        return txfLifeA2;
    }

    public JTextField getTxfLifeC1() {
        return txfLifeC1;
    }

    public JTextField getTxfLifeC2() {
        return txfLifeC2;
    }

    public JTextField getTxfLifeCo1() {
        return txfLifeCo1;
    }

    public JTextField getTxfLifeCo2() {
        return txfLifeCo2;
    }

    public JTextField getTxfLifeI1() {
        return txfLifeI1;
    }

    public JTextField getTxfLifeI2() {
        return txfLifeI2;
    }

    public JTextField getTxfLifeM1() {
        return txfLifeM1;
    }

    public JTextField getTxfLifeM2() {
        return txfLifeM2;
    }

    public JTextField getTxfPriceA1() {
        return txfPriceA1;
    }

    public JTextField getTxfPriceA2() {
        return txfPriceA2;
    }

    public JTextField getTxfPriceC1() {
        return txfPriceC1;
    }

    public JTextField getTxfPriceC2() {
        return txfPriceC2;
    }

    public JTextField getTxfPriceCo1() {
        return txfPriceCo1;
    }

    public JTextField getTxfPriceCo2() {
        return txfPriceCo2;
    }

    public JTextField getTxfPriceI1() {
        return txfPriceI1;
    }

    public JTextField getTxfPriceI2() {
        return txfPriceI2;
    }

    public JTextField getTxfPriceM1() {
        return txfPriceM1;
    }

    public JTextField getTxfPriceM2() {
        return txfPriceM2;
    }

    public JTextField getTxfSpacesA1() {
        return txfSpacesA1;
    }

    public JTextField getTxfSpacesA2() {
        return txfSpacesA2;
    }

    public JTextField getTxfSpacesC1() {
        return txfSpacesC1;
    }

    public JTextField getTxfSpacesC2() {
        return txfSpacesC2;
    }

    public JTextField getTxfSpacesCo1() {
        return txfSpacesCo1;
    }

    public JTextField getTxfSpacesCo2() {
        return txfSpacesCo2;
    }

    public JTextField getTxfSpacesI1() {
        return txfSpacesI1;
    }

    public JTextField getTxfSpacesI2() {
        return txfSpacesI2;
    }

    public JTextField getTxfSpacesM1() {
        return txfSpacesM1;
    }

    public JTextField getTxfSpacesM2() {
        return txfSpacesM2;
    }

    public JLabel getLblAerial1() {
        return lblAerial1;
    }

    public JLabel getLblAerial2() {
        return lblAerial2;
    }

    public JLabel getLblCollision1() {
        return lblCollision1;
    }

    public JLabel getLblCollision2() {
        return lblCollision2;
    }

    public JLabel getLblContact1() {
        return lblContact1;
    }

    public JLabel getLblContact2() {
        return lblContact2;
    }

    public JLabel getLblImpact1() {
        return lblImpact1;
    }

    public JLabel getLblImpact2() {
        return lblImpact2;
    }

    public JLabel getLblMidRange1() {
        return lblMidRange1;
    }

    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HitsC1;
    private javax.swing.JLabel LifeC1;
    private javax.swing.JButton bntSave;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel levelC1;
    private javax.swing.JPanel pnlContact1;
    private javax.swing.JLabel priceC1;
    private javax.swing.JLabel spaceC1;
    private javax.swing.JTextField txfHitsC1;
    private javax.swing.JTextField txfLevelC1;
    private javax.swing.JTextField txfLifeC1;
    private javax.swing.JTextField txfLifeC2;
    private javax.swing.JTextField txfPriceC1;
    private javax.swing.JTextField txfSpacesC1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void visibility(boolean visible) {
        this.setVisible(visible);
    }

    public JButton getBtnBack() {
        return btnBack;
    }
    
    
}
