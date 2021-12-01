
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
import wwtec.model.Game.ArmyType;
import wwtec.model.Game.ComponentAtackType;

public class ConfigController implements ActionListener {
    
    ConfigWindow view;
    MainController mainController;
    Configuration config;
    
    public static ArrayList<Army> armyArray = new ArrayList<>();
    private static Gson gson = new Gson();
    private static String ARMYFILEPATH = "./src/media/army.txt";
    
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
        setArmyArray();
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
        String type = view.getjCmbType().getModel().getElementAt(view.getjCmbType().getSelectedIndex());
        ArmyType armyType = ArmyType.LAND;
        ComponentAtackType componentType = ComponentAtackType.CONTACT;
        
        
        switch (type) {
            case "De contacto":
                armyType = ArmyType.LAND;
                componentType = ComponentAtackType.CONTACT;
                break;
            case "Mediado alcance":
                armyType = ArmyType.LAND;
                componentType = ComponentAtackType.MIDRANGE;
                break;
            case "Aéreo":
                armyType = ArmyType.AIR;
                componentType = ComponentAtackType.MIDRANGE;
                break;
            case "De Choque":
                armyType = ArmyType.LAND;
                componentType = ComponentAtackType.COLLISION;
                break;
            case "De impacto":
                armyType = ArmyType.LAND;
                componentType = ComponentAtackType.IMPACT;
                break;
            default:
                break;
        }
            
        if (armyArray.isEmpty())
            armyArray.add(new Army(name,life, hits, spaces, level, price, view.getjFileChooser().getSelectedFile().getCanonicalPath(),componentType,armyType));
        
        else{
            boolean contains = false;
            for (Army a : armyArray){
                if (a.getName().equals(name)){
                    JOptionPane.showMessageDialog(view, "Ya existe un personaje agregado con el mismo nombre","Error", JOptionPane.ERROR_MESSAGE);
                    contains = true;
                    break;}
            }
            if (!contains)
                armyArray.add(new Army(name,life, hits, spaces, level, price, view.getjFileChooser().getSelectedFile().getCanonicalPath(),componentType,armyType));
                
        }
        
        for (Army a : armyArray)
            a.print();
        
        saveArmyArray();
    }
    
    
    private void saveArmyArray(){
        String JSON = gson.toJson(armyArray);
        FileManager.writeToFile(ARMYFILEPATH, JSON);
    }

    public static void setArmyArray() {
        String armyStr = FileManager.readFile(ARMYFILEPATH);
        armyArray = gson.fromJson(armyStr, new TypeToken<ArrayList<Army>>(){}.getType());
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
