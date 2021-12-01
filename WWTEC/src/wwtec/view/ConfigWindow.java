
package wwtec.view;

import interfaces.iWindow;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
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
        txtfMinDefenseIncrease = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtfMaxDefenseIncrease = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfMaxBootyIncrease = new javax.swing.JTextField();
        txtfMinBootyIncrease = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pnlContact1 = new javax.swing.JPanel();
        LifeC1 = new javax.swing.JLabel();
        HitsC1 = new javax.swing.JLabel();
        spaceC1 = new javax.swing.JLabel();
        levelC1 = new javax.swing.JLabel();
        priceC1 = new javax.swing.JLabel();
        txfLife = new javax.swing.JTextField();
        txfSpaces = new javax.swing.JTextField();
        txfHits = new javax.swing.JTextField();
        txfLevel = new javax.swing.JTextField();
        txfPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txfname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        bntSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Configuracion");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Crecimiento de defensa");

        txtfMinDefenseIncrease.setText("50");

        jLabel3.setText("%");

        jLabel4.setText("%");

        txtfMaxDefenseIncrease.setText("100");

        jLabel5.setText("Crecimiento de bienes");

        jLabel6.setText("%");

        txtfMaxBootyIncrease.setText("250");

        txtfMinBootyIncrease.setText("100");

        jLabel7.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtfMinDefenseIncrease, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtfMaxDefenseIncrease, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtfMinBootyIncrease, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtfMaxBootyIncrease, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(txtfMinDefenseIncrease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfMaxDefenseIncrease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfMinBootyIncrease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfMaxBootyIncrease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pnlContact1.setBackground(new java.awt.Color(255, 255, 255));

        LifeC1.setText("Vida:");

        HitsC1.setText("Golpes p/s:");

        spaceC1.setText("Espacios: ");

        levelC1.setText("Nivel de aparición:");

        priceC1.setText("Precio:");

        txfLife.setText("0");
        txfLife.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfLifeActionPerformed(evt);
            }
        });

        txfSpaces.setText("0");
        txfSpaces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfSpacesActionPerformed(evt);
            }
        });

        txfHits.setText("0");
        txfHits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfHitsActionPerformed(evt);
            }
        });

        txfLevel.setText("0");
        txfLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfLevelActionPerformed(evt);
            }
        });

        txfPrice.setText("0");
        txfPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPriceActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Nombre:");

        txfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfnameActionPerformed(evt);
            }
        });

        jLabel10.setText("Tipo:");

        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aéreo", "De contacto", "Mediano alcance", "De choque", "De impacto" }));
        cmbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlContact1Layout = new javax.swing.GroupLayout(pnlContact1);
        pnlContact1.setLayout(pnlContact1Layout);
        pnlContact1Layout.setHorizontalGroup(
            pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContact1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
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
                    .addComponent(cmbType, 0, 173, Short.MAX_VALUE)
                    .addComponent(txfname)
                    .addComponent(txfHits)
                    .addComponent(txfLife)
                    .addComponent(txfSpaces)
                    .addComponent(txfLevel)
                    .addComponent(txfPrice))
                .addGap(97, 97, 97))
        );
        pnlContact1Layout.setVerticalGroup(
            pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContact1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(21, 21, 21)
                .addGroup(pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfLife, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LifeC1))
                .addGap(18, 18, 18)
                .addGroup(pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfHits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HitsC1))
                .addGap(18, 18, 18)
                .addGroup(pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfSpaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spaceC1))
                .addGap(18, 18, 18)
                .addGroup(pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelC1)
                    .addComponent(txfLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceC1)
                    .addComponent(txfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("Volver");

        bntSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntSave.setText("Agregar");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Crea un guerrero");

        jFileChooser1.setCurrentDirectory(new java.io.File("C:\\Users\\josaf\\Documents\\GitHub\\U\\PY3-POO-WWTEC\\WWTEC\\src\\media\\attackComponents"));
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Selecciona una imagen: ");

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
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlContact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack)
                            .addComponent(bntSave))
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlContact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(bntSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfLifeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfLifeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfLifeActionPerformed

    private void txfSpacesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfSpacesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfSpacesActionPerformed

    private void txfHitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfHitsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfHitsActionPerformed

    private void txfLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfLevelActionPerformed

    private void txfPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPriceActionPerformed

    private void txfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfnameActionPerformed

    private void cmbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTypeActionPerformed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    public JButton getBntSave() {
        return bntSave;
    }

    public JTextField getTxfLevel() {
        return txfLevel;
    }

    public JTextField getTxfLife() {
        return txfLife;
    }

    public JTextField getTxfName() {
        return txfname;
    }


    public JTextField getTxfPrice() {
        return txfPrice;
    }

    public JTextField getTxfSpaces() {
        return txfSpaces;
    }


    public JComboBox<String> getjCmbType() {
        return cmbType;
    }

    public JFileChooser getjFileChooser() {
        return jFileChooser1;
    }

    public JTextField getTxfHits() {
        return txfHits;
    }

    
    
    

   

    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HitsC1;
    private javax.swing.JLabel LifeC1;
    private javax.swing.JButton bntSave;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cmbType;
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
    private javax.swing.JLabel levelC1;
    private javax.swing.JPanel pnlContact1;
    private javax.swing.JLabel priceC1;
    private javax.swing.JLabel spaceC1;
    private javax.swing.JTextField txfHits;
    private javax.swing.JTextField txfLevel;
    private javax.swing.JTextField txfLife;
    private javax.swing.JTextField txfPrice;
    private javax.swing.JTextField txfSpaces;
    private javax.swing.JTextField txfname;
    private javax.swing.JTextField txtfMaxBootyIncrease;
    private javax.swing.JTextField txtfMaxDefenseIncrease;
    private javax.swing.JTextField txtfMinBootyIncrease;
    private javax.swing.JTextField txtfMinDefenseIncrease;
    // End of variables declaration//GEN-END:variables

    @Override
    public void visibility(boolean visible) {
        this.setVisible(visible);
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public JTextField getTxtfMaxBootyIncrease() {
        return txtfMaxBootyIncrease;
    }

    public JTextField getTxtfMaxDefenseIncrease() {
        return txtfMaxDefenseIncrease;
    }

    public JTextField getTxtfMinBootyIncrease() {
        return txtfMinBootyIncrease;
    }

    public JTextField getTxtfMinDefenseIncrease() {
        return txtfMinDefenseIncrease;
    }
    
    
    
    
    
}
