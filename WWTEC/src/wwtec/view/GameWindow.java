
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
        lblDestruction = new javax.swing.JLabel();
        btnAttack = new javax.swing.JButton();
        btnNextLevel = new javax.swing.JButton();
        lblBooty = new javax.swing.JLabel();
        lblBooty1 = new javax.swing.JLabel();
        btnAdminArmy = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        lblDestruction.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDestruction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDestruction.setText("Destruccion: 0%");

        btnAttack.setText("Atacar");

        btnNextLevel.setText("Siguiente nivel");

        lblBooty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBooty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBooty.setText("0000");

        lblBooty1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblBooty1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBooty1.setText("Botin Actual");

        btnAdminArmy.setText("Ejercito");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("0/20");

        jLabel1.setText("Espacio:");

        jLabel3.setText("Dinero:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("0000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDestruction, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBooty, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBooty1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBattleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAttack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNextLevel, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(btnAdminArmy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNextLevel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdminArmy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(120, 120, 120)
                        .addComponent(btnAttack))
                    .addComponent(pnlBattleField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDestruction)
                        .addGap(23, 23, 23)
                        .addComponent(lblBooty1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBooty)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminArmy;
    private javax.swing.JButton btnAttack;
    private javax.swing.JButton btnNextLevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblBooty;
    private javax.swing.JLabel lblBooty1;
    private javax.swing.JLabel lblDestruction;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JPanel pnlBattleField;
    // End of variables declaration//GEN-END:variables

    public JLabel getLblLevel() {
        return lblLevel;
    }

    public JPanel getPnlBattleField() {
        return pnlBattleField;
    }

    public JButton getBtnNextLevel() {
        return btnNextLevel;
    }

    public JLabel getLblBooty() {
        return lblBooty;
    }

    public JLabel getLblDestruction() {
        return lblDestruction;
    }

    public JButton getBtnAdminArmy() {
        return btnAdminArmy;
    }

    public JButton getBtnAttack() {
        return btnAttack;
    }
    
    
    

    
    
    // -------------------------------------------------------- GETTERS AND SETTERS ---------------------------------------------------

    @Override
    public void visibility(boolean visible) {
        this.setVisible(visible);
    }
    

}
