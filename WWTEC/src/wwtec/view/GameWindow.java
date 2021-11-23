
package wwtec.view;

import interfaces.iWindow;
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(lblLevel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(pnlBattleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLevel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBattleField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblLevel;
    private javax.swing.JPanel pnlBattleField;
    // End of variables declaration//GEN-END:variables

    public JLabel getLblLevel() {
        return lblLevel;
    }

    public JPanel getPnlBattleField() {
        return pnlBattleField;
    }

    // -------------------------------------------------------- GETTERS AND SETTERS ---------------------------------------------------

    @Override
    public void visibility(boolean visible) {
        this.setVisible(visible);
    }
    

}
