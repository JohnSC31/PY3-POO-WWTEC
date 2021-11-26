
package wwtec.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import wwtec.view.ConfigWindow;
import wwtec.model.*;

public class ConfigController implements ActionListener {
    
    ConfigWindow view;
    MainController mainController;
    
    private ArrayList<Army> armyArray;
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
        this.armyArray = new ArrayList<>();
        _init_();
    }
    
    public void _init_(){
        // action listeners
        view.getBtnBack().addActionListener(this);
        view.getBntSave().addActionListener(this);
        loadArmyImages();
        setlblImages();
        createArmy();
        chargeConfiguration();
    }
    
    
    public void createArmy(){
        this.dragon = new Aerial("Dragon", 0, 0, 0, 0, 0, 0);
        this.balloon = new Aerial("Balloon", 0, 0, 0, 0, 0, 0);
        this.archer = new MidRange("Archer", 0, 0, 0, 0, 0, 0);
        this.wizard = new MidRange("Wizard", 0, 0, 0, 0, 0, 0);
        this.barbarian = new ContactSoldier("Barbarian", 0, 0, 0, 0, 0 ,0);
        this.pekka = new ContactSoldier("PEKKA",  0 ,0 ,0 ,0 ,0 ,0);
        this.prince = new Impact("Prince",  0, 0, 0, 0, 0, 0);
        this.hogRider = new Impact("HogRider", 0, 0, 0, 0, 0, 0);
        this.cannon = new Collision("Cannon" ,  0, 0, 0, 0, 0, 0);
        this.sprinkles = new Collision("Sprinkles" ,  0, 0, 0, 0, 0, 0);
        
        armyArray.add(dragon);
        armyArray.add(balloon);
        armyArray.add(archer);
        armyArray.add(wizard);
        armyArray.add(barbarian);
        armyArray.add(pekka);
        armyArray.add(prince);
        armyArray.add(hogRider);
        armyArray.add(cannon);
        armyArray.add(sprinkles);
     
    }
    
    private void loadArmyImages(){
        try {
            this.dragonIcon = new ImageIcon(new File("./src/media/attackComponents/Dragon.png").getCanonicalPath());
            this.balloonIcon = new ImageIcon(new File("./src/media/attackComponents/Balloon.png").getCanonicalPath());
            this.archerIcon = new ImageIcon(new File("./src/media/attackComponents/Archer.png").getCanonicalPath());
            this.cannonIcon = new ImageIcon(new File("./src/media/attackComponents/Cannon.png").getCanonicalPath());
            this.barbarianIcon = new ImageIcon(new File("./src/media/attackComponents/Barbarian.png").getCanonicalPath());
            this.hogRiderIcon= new ImageIcon(new File("./src/media/attackComponents/HogRider.png").getCanonicalPath());
            this.pekkaIcon = new ImageIcon(new File("./src/media/attackComponents/PEKKA.png").getCanonicalPath());
            this.princeIcon = new ImageIcon(new File("./src/media/attackComponents/Prince.png").getCanonicalPath());
            this.sprinklesIcon = new ImageIcon(new File("./src/media/attackComponents/Sprinkles.png").getCanonicalPath());
            this.wizardIcon = new ImageIcon(new File("./src/media/attackComponents/Wizard.png").getCanonicalPath());
        } catch (IOException ex) {
            System.out.println("Error al cargar imagenes de las defensas");
        }
    }
    
    private void setlblImages(){
        int width = view.getLblContact1().getWidth();
        int heigth = view.getLblContact1().getHeight();
        
        view.getLblContact1().setIcon(MainController.resizeIcon(barbarianIcon, width, heigth));
        view.getLblContact2().setIcon(MainController.resizeIcon(pekkaIcon, width, heigth));
        view.getLblAerial1().setIcon(MainController.resizeIcon(dragonIcon, width, heigth));
        view.getLblAerial2().setIcon(MainController.resizeIcon(balloonIcon, width, heigth));
        view.getLblMidRange1().setIcon(MainController.resizeIcon(archerIcon, width, heigth));
        view.getLblMidRange2().setIcon(MainController.resizeIcon(wizardIcon, width, heigth));
        view.getLblCollision1().setIcon(MainController.resizeIcon(cannonIcon, width, heigth));
        view.getLblCollision2().setIcon(MainController.resizeIcon(sprinklesIcon, width, heigth));
        view.getLblImpact1().setIcon(MainController.resizeIcon(princeIcon, width, heigth));
        view.getLblImpact2().setIcon(MainController.resizeIcon(hogRiderIcon, width, heigth));
        
    }
    
    private void saveConfiguration(){
        
        // setLife
        this.dragon.setLife(Integer.parseInt(view.getTxfLifeA1().getText()));
        this.balloon.setLife(Integer.parseInt(view.getTxfLifeA2().getText()));
        this.archer.setLife(Integer.parseInt(view.getTxfLifeM1().getText()));
        this.wizard.setLife(Integer.parseInt(view.getTxfLifeM2().getText()));
        this.barbarian.setLife(Integer.parseInt(view.getTxfLifeC1().getText()));
        this.pekka.setLife(Integer.parseInt(view.getTxfLifeC2().getText()));
        this.cannon.setLife(Integer.parseInt(view.getTxfLifeCo1().getText()));
        this.sprinkles.setLife(Integer.parseInt(view.getTxfLifeCo2().getText()));
        this.prince.setLife(Integer.parseInt(view.getTxfLifeI1().getText()));
        this.hogRider.setLife(Integer.parseInt(view.getTxfLifeI2().getText()));
        
        //setHits
        this.dragon.setHit(Integer.parseInt(view.getTxfHitsA1().getText()));
        this.balloon.setHit(Integer.parseInt(view.getTxfHitsA2().getText()));
        this.archer.setHit(Integer.parseInt(view.getTxfHitsM1().getText()));
        this.wizard.setHit(Integer.parseInt(view.getTxfHitsM2().getText()));
        this.barbarian.setHit(Integer.parseInt(view.getTxfHitsC1().getText()));
        this.pekka.setHit(Integer.parseInt(view.getTxfHitsC2().getText()));
        this.cannon.setHit(Integer.parseInt(view.getTxfHitsCo1().getText()));
        this.sprinkles.setHit(Integer.parseInt(view.getTxfHitsCo2().getText()));
        this.prince.setHit(Integer.parseInt(view.getTxfHitsI1().getText()));
        this.hogRider.setHit(Integer.parseInt(view.getTxfHitsI2().getText()));
        
        //setAparittionLevel
        this.dragon.setApparitionLevel(Integer.parseInt(view.getTxfLevelA1().getText()));
        this.balloon.setApparitionLevel(Integer.parseInt(view.getTxfLevelA2().getText()));
        this.archer.setApparitionLevel(Integer.parseInt(view.getTxfLevelM1().getText()));
        this.wizard.setApparitionLevel(Integer.parseInt(view.getTxfLevelM2().getText()));
        this.barbarian.setApparitionLevel(Integer.parseInt(view.getTxfLevelC1().getText()));
        this.pekka.setApparitionLevel(Integer.parseInt(view.getTxfLevelC2().getText()));
        this.cannon.setApparitionLevel(Integer.parseInt(view.getTxfLevelCo1().getText()));
        this.sprinkles.setApparitionLevel(Integer.parseInt(view.getTxfLevelCo2().getText()));
        this.prince.setApparitionLevel(Integer.parseInt(view.getTxfLevelI1().getText()));
        this.hogRider.setApparitionLevel(Integer.parseInt(view.getTxfLevelI2().getText()));
        
        //setSpaces
        this.dragon.setSpaces(Integer.parseInt(view.getTxfSpacesA1().getText()));
        this.balloon.setSpaces(Integer.parseInt(view.getTxfSpacesA2().getText()));
        this.archer.setSpaces(Integer.parseInt(view.getTxfSpacesM1().getText()));
        this.wizard.setSpaces(Integer.parseInt(view.getTxfSpacesM2().getText()));
        this.barbarian.setSpaces(Integer.parseInt(view.getTxfSpacesC1().getText()));
        this.pekka.setSpaces(Integer.parseInt(view.getTxfSpacesC2().getText()));
        this.cannon.setSpaces(Integer.parseInt(view.getTxfSpacesCo1().getText()));
        this.sprinkles.setSpaces(Integer.parseInt(view.getTxfSpacesCo2().getText()));
        this.prince.setSpaces(Integer.parseInt(view.getTxfSpacesI1().getText()));
        this.hogRider.setSpaces(Integer.parseInt(view.getTxfSpacesI2().getText()));
        
        //setPrices
        this.dragon.setPrice(Integer.parseInt(view.getTxfPriceA1().getText()));
        this.balloon.setPrice(Integer.parseInt(view.getTxfPriceA2().getText()));
        this.archer.setPrice(Integer.parseInt(view.getTxfPriceM1().getText()));
        this.wizard.setPrice(Integer.parseInt(view.getTxfPriceM2().getText()));
        this.barbarian.setPrice(Integer.parseInt(view.getTxfPriceC1().getText()));
        this.pekka.setPrice(Integer.parseInt(view.getTxfPriceC2().getText()));
        this.cannon.setPrice(Integer.parseInt(view.getTxfPriceCo1().getText()));
        this.sprinkles.setPrice(Integer.parseInt(view.getTxfPriceCo2().getText()));
        this.prince.setPrice(Integer.parseInt(view.getTxfPriceI1().getText()));
        this.hogRider.setPrice(Integer.parseInt(view.getTxfPriceI2().getText()));
        
        saveArmyArray();
        for (Army a : armyArray) {
            a.print();
        }
    }
    
    private void chargeConfiguration(){
        getArmyArray();
        
        //cargar barbaro
        view.getTxfLifeC1().setText(armyArray.get(4).getLife() + "");
        view.getTxfHitsC1().setText(armyArray.get(4).getHit() + "");
        view.getTxfSpacesC1().setText(armyArray.get(4).getSpaces() + "");
        view.getTxfLevelC1().setText(armyArray.get(4).getApparitionLevel() + "");
        view.getTxfPriceC1().setText(armyArray.get(4).getPrice() + "");
        
        //cargar pekka
        view.getTxfLifeC2().setText(armyArray.get(5).getLife() + "");
        view.getTxfHitsC2().setText(armyArray.get(5).getHit() + "");
        view.getTxfSpacesC2().setText(armyArray.get(5).getSpaces() + "");
        view.getTxfLevelC2().setText(armyArray.get(5).getApparitionLevel() + "");
        view.getTxfPriceC2().setText(armyArray.get(5).getPrice() + "");
        
        //cargar dragon
        view.getTxfLifeA1().setText(armyArray.get(0).getLife() + "");
        view.getTxfHitsA1().setText(armyArray.get(0).getHit() + "");
        view.getTxfSpacesA1().setText(armyArray.get(0).getSpaces() + "");
        view.getTxfLevelA1().setText(armyArray.get(0).getApparitionLevel() + "");
        view.getTxfPriceA1().setText(armyArray.get(0).getPrice() + "");
        
        //cargar globo
        view.getTxfLifeA2().setText(armyArray.get(1).getLife() + "");
        view.getTxfHitsA2().setText(armyArray.get(1).getHit() + "");
        view.getTxfSpacesA2().setText(armyArray.get(1).getSpaces() + "");
        view.getTxfLevelA2().setText(armyArray.get(1).getApparitionLevel() + "");
        view.getTxfPriceA2().setText(armyArray.get(1).getPrice() + "");
        
        
        //cargar arquera
        view.getTxfLifeM1().setText(armyArray.get(2).getLife() + "");
        view.getTxfHitsM1().setText(armyArray.get(2).getHit() + "");
        view.getTxfSpacesM1().setText(armyArray.get(2).getSpaces() + "");
        view.getTxfLevelM1().setText(armyArray.get(2).getApparitionLevel() + "");
        view.getTxfPriceM1().setText(armyArray.get(2).getPrice() + "");
        
        //cargar mago
        view.getTxfLifeM2().setText(armyArray.get(3).getLife() + "");
        view.getTxfHitsM2().setText(armyArray.get(3).getHit() + "");
        view.getTxfSpacesM2().setText(armyArray.get(3).getSpaces() + "");
        view.getTxfLevelM2().setText(armyArray.get(3).getApparitionLevel() + "");
        view.getTxfPriceM2().setText(armyArray.get(3).getPrice() + "");
        
        //cargar cañón
        view.getTxfLifeCo1().setText(armyArray.get(8).getLife() + "");
        view.getTxfHitsCo1().setText(armyArray.get(8).getHit() + "");
        view.getTxfSpacesCo1().setText(armyArray.get(8).getSpaces() + "");
        view.getTxfLevelCo1().setText(armyArray.get(8).getApparitionLevel() + "");
        view.getTxfPriceCo1().setText(armyArray.get(8).getPrice() + "");
        
        //cargar chispitas
        view.getTxfLifeCo2().setText(armyArray.get(9).getLife() + "");
        view.getTxfHitsCo2().setText(armyArray.get(9).getHit() + "");
        view.getTxfSpacesCo2().setText(armyArray.get(9).getSpaces() + "");
        view.getTxfLevelCo2().setText(armyArray.get(9).getApparitionLevel() + "");
        view.getTxfPriceCo2().setText(armyArray.get(9).getPrice() + "");
        
        //cargarPrincipe
        view.getTxfLifeI1().setText(armyArray.get(6).getLife() + "");
        view.getTxfHitsI1().setText(armyArray.get(6).getHit() + "");
        view.getTxfSpacesI1().setText(armyArray.get(6).getSpaces() + "");
        view.getTxfLevelI1().setText(armyArray.get(6).getApparitionLevel() + "");
        view.getTxfPriceI1().setText(armyArray.get(6).getPrice() + "");
        
        //cargarMontapuerco
        view.getTxfLifeI2().setText(armyArray.get(7).getLife() + "");
        view.getTxfHitsI2().setText(armyArray.get(7).getHit() + "");
        view.getTxfSpacesI2().setText(armyArray.get(7).getSpaces() + "");
        view.getTxfLevelI2().setText(armyArray.get(7).getApparitionLevel() + "");
        view.getTxfPriceI2().setText(armyArray.get(7).getPrice() + "");
    }
    
    private void saveArmyArray(){
        String matchJSON = gson.toJson(armyArray);
        FileManager.writeToFile(ARMYFILEPATH, matchJSON);
    }
    
    private void getArmyArray(){
        String fileStr = FileManager.readFile(ARMYFILEPATH);
        this.armyArray = gson.fromJson(fileStr, new TypeToken<ArrayList<Army>>(){}.getType()); 
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource().equals(view.getBtnBack())){
            // guardar la configuracion
            
            mainController.changeWindow(this.view, mainController.getMenuView());
        }
        
        else if(e.getSource().equals(view.getBntSave())){
            saveConfiguration();
        }
        
        
    }
    
    
}
