
package wwtec.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import wwtec.view.ConfigWindow;
import wwtec.model.*;

public class ConfigController implements ActionListener {
    
    ConfigWindow view;
    MainController mainController;
    Configuration config;
    
    public static ArrayList<Army> armyArray = new ArrayList<>();
    private final Gson gson = new Gson();
    private final String ARMYFILEPATH = "./src/media/army.txt";
    private Army dragon, balloon, cannon, sprinkles, barbarian, pekka, prince, hogRider, archer, wizard;
    private ImageIcon dragonIcon, balloonIcon, cannonIcon, sprinklesIcon, barbarianIcon, pekkaIcon, princeIcon, hogRiderIcon, archerIcon, wizardIcon;
    
    /*private Aerial balloon;
    private Collision cannon;
    private Collision sprinkles;
    private ContactSoldier barbarian;
    private ContactSoldier pekka;
    private Impact prince;
    private Impact hogRider;
    private MidRange archeer;
    private MidRange wizard;*/
    
    public ConfigController(ConfigWindow view, MainController mainController){
        this.view = view;
        this.mainController = mainController;
        this.config = mainController.getConfiguration();
        _init_();
    }
    
    public void _init_(){
        // action listeners
        view.getBtnBack().addActionListener(this);
        view.getBntSave().addActionListener(this);
        
        // seteando los valores de la configuracion
        view.getTxtfMinDefenseIncrease().setText(this.config.getMinDefenseIncrease() + "");
        view.getTxtfMaxDefenseIncrease().setText(this.config.getMaxDefenseIncrease() + "");
        view.getTxtfMinBootyIncrease().setText(this.config.getMinBootyIncrease() + "");
        view.getTxtfMaxBootyIncrease().setText(this.config.getMaxBootyIncrease() + "");
        
    }
    
    private void addCharacter() throws IOException{
        String name = view.getTxfName().getText();
        int level = Integer.parseInt(view.getTxfLevel().getText());
        int life = Integer.parseInt(view.getTxfLife().getText());
        int hits = Integer.parseInt(view.getTxfHits().getText());
        int spaces = Integer.parseInt(view.getTxfSpaces().getText());
        int price = Integer.parseInt(view.getTxfPrice().getText());
        
        if (armyArray.isEmpty())
            armyArray.add(new Army(name,life, hits, spaces, level, price, new ImageIcon(view.getjFileChooser().getSelectedFile().getCanonicalPath())));
        
        else{
            boolean contains = false;
            for (Army a : armyArray){
                if (a.getName().equals(name)){
                    JOptionPane.showMessageDialog(view, "Ya existe un personaje agregado con el mismo nombre","Error", JOptionPane.ERROR_MESSAGE);
                    contains = true;
                    break;}
            }
            if (!contains)
                armyArray.add(new Army(name,life, hits, spaces, level, price, new ImageIcon(view.getjFileChooser().getSelectedFile().getCanonicalPath())));
                
        }
        
        for (Army a : armyArray)
            a.print();
    }
    
    
    private void saveArmyArray(){
        String matchJSON = gson.toJson(armyArray);
        FileManager.writeToFile(ARMYFILEPATH, matchJSON);
    }

    public ArrayList<Army> getArmyArray() {
        return armyArray;
    }
    
      // resetea los campos cuando se cree el componente de ataque
    private void resetAttackComponentForm(){
        view.getTxfName().setText("");
        view.getTxfLevel().setText("");
        view.getTxfLife().setText("");
        view.getTxfHits().setText("");
        view.getTxfSpaces().setText("");
        view.getTxfPrice().setText("");
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource().equals(view.getBtnBack())){
            // guardar la configuracion
            this.config.setMinDefenseIncrease(Integer.parseInt(view.getTxtfMinDefenseIncrease().getText()));
            this.config.setMaxDefenseIncrease(Integer.parseInt(view.getTxtfMaxDefenseIncrease().getText()));
            this.config.setMinBootyIncrease(Integer.parseInt(view.getTxtfMinBootyIncrease().getText()));
            this.config.setMaxBootyIncrease(Integer.parseInt(view.getTxtfMaxBootyIncrease().getText()));
            
            mainController.changeWindow(this.view, mainController.getMenuView());
        }
        
        else if(e.getSource().equals(view.getBntSave())){
            try {
                addCharacter();
                resetAttackComponentForm();
            } catch (IOException ex) {
                Logger.getLogger(ConfigController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
    
}
