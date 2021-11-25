
package wwtec.view;

import interfaces.iWindow;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GameWindow extends javax.swing.JFrame implements iWindow{

    
    public GameWindow() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLevel = new javax.swing.JLabel();
        pnlBattleField = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnArmy = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnGenLevel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLevel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLevel.setText("Nivel 1");

        pnlBattleField.setBackground(new java.awt.Color(255, 255, 255));
        pnlBattleField.setPreferredSize(new java.awt.Dimension(630, 630));

        javax.swing.GroupLayout pnlBattleFieldLayout = new javax.swing.GroupLayout(pnlBattleField);
        pnlBattleField.setLayout(pnlBattleFieldLayout);
        pnlBattleFieldLayout.setHorizontalGroup(
            pnlBattleFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        pnlBattleFieldLayout.setVerticalGroup(
            pnlBattleFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Destruccion: 0%");

        btnArmy.setText("Desplegar");

        jButton1.setText("Siguiente nivel");

        btnGenLevel.setText("Generar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGenLevel)
                .addGap(26, 26, 26)
                .addComponent(pnlBattleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnArmy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLevel)
                .addGap(404, 404, 404))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLevel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBattleField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(13, 13, 13)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(btnArmy))
                            .addComponent(btnGenLevel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArmy;
    private javax.swing.JButton btnGenLevel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JPanel pnlBattleField;
    // End of variables declaration//GEN-END:variables

    public JLabel getLblLevel() {
        return lblLevel;
    }

    public JPanel getPnlBattleField() {
        return pnlBattleField;
    }

    public JButton getBtnGenLevel() {
        return btnGenLevel;
    }

    
    
    // -------------------------------------------------------- GETTERS AND SETTERS ---------------------------------------------------

    @Override
    public void visibility(boolean visible) {
        this.setVisible(visible);
    }
    

}
