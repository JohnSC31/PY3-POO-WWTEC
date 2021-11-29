
package wwtec.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import wwtec.model.Army;
import wwtec.model.Game;
import wwtec.view.ArmyWindow;


public class ArmyController implements ActionListener{
    
    private ArmyWindow view;
    private MainController mainController;
    private Game game;
    private ArrayList<JButton> buyButtons;

    public ArmyController(ArmyWindow view, MainController mainController, Game game) {
        this.view = view;
        this.mainController = mainController;
        this.game = game;
        this.buyButtons = new ArrayList<>();
        _init_();
    }
    
    private void _init_(){
        // se colocan los action listeners
        chargeArmy();
        view.getBtnBack().addActionListener(this);
        // carga los datos del ejercito actual, del dinero y todo lo demas
    }
    
    
    private void chargeArmy(){
        ArrayList<Army> armyArray = ConfigController.armyArray;
        int x = 15;
        int y = 10;
               
        for (Army a : armyArray){
            JLabel armyName = new JLabel(a.getName());
            JLabel armyPrice= new JLabel("Precio: "+a.getPrice());
            armyName.setBounds(20, y, 80 , 20);
            armyPrice.setBounds(110, y, 120 , 20);
            JButton buyButton = new JButton("Comprar");
            buyButton.setBounds(200, y, 90 , 20);
            
            view.getPnlArmy().add(armyName);
            view.getPnlArmy().add(armyPrice);
            view.getPnlArmy().add(buyButton);
            JLabel armyName2 = new JLabel(a.getName());
            armyName2.setBounds(20, y, 80 , 20);
            JLabel cantidad = new JLabel("0");
            cantidad.setBounds(100, y , 20,20);
            view.getPnlMyArmy().add(cantidad);
            view.getPnlMyArmy().add(armyName2);
            y += 25;
            buyButtons.add(buyButton);
        }
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(view.getBtnBack())){
            mainController.closeWindow(view);
            mainController.getGameController().refreshGameData();
        }
    }
    
    
}
