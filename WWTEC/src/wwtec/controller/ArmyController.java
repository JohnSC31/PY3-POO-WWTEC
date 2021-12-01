
package wwtec.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public static ArrayList<Army> buyedArmy;
    private ArrayList<JLabel> armyCount;
    private int armyCounter;

    public ArmyController(ArmyWindow view, MainController mainController, Game game) {
        this.view = view;
        this.mainController = mainController;
        this.game = game;
        this.buyButtons = new ArrayList<>();
        this.buyedArmy = new ArrayList<>();
        this.armyCount = new ArrayList<>();
        this.armyCounter = 0;
        _init_();
    }
    
    private void _init_(){
        // se colocan los action listeners
        chargeArmy();
        view.getBtnBack().addActionListener(this);
        // carga los datos del ejercito actual, del dinero y todo lo demas
        setData();
    }
    
    // setea el valor del presupuesto y la cantidad para el ejercito en los labels correspondientes
    private void setData(){
        this.view.getLblBudget().setText("Presupueto: " + this.game.getBudget());
        this.view.getLblArmySpace().setText("Espacio: " + this.armyCounter + "/" + this.game.getMaxArmy());
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
            armyCount.add(cantidad);
            buyButton.addActionListener(this);
            buyButtons.add(buyButton);
        }
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(view.getBtnBack())){
            mainController.closeWindow(view);
            mainController.getGameController().refreshGameData();
        }
        
        for (int i = 0; i < buyButtons.size(); i++) {
                if(e.getSource().equals(buyButtons.get(i))){
                    try {
                        if(this.game.getBudget() - ConfigController.armyArray.get(i).getPrice() >= 0 && this.armyCounter + ConfigController.armyArray.get(i).getSpaces() <= this.game.getMaxArmy()){
                            this.game.setBudget(this.game.getBudget() - ConfigController.armyArray.get(i).getPrice());
                            this.armyCounter += ConfigController.armyArray.get(i).getSpaces();
                            buyedArmy.add((Army)ConfigController.armyArray.get(i).clone());
                            armyCount.get(i).setText((Integer.parseInt(armyCount.get(i).getText()) + 1 ) + "");
                            
                            setData();
                        }

                } catch (CloneNotSupportedException ex) {
                    Logger.getLogger(ArmyController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    
    
}
