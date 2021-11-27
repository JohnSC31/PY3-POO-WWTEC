/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wwtec.controller;

import interfaces.iWindow;
import java.awt.Image;
import javax.swing.ImageIcon;
import wwtec.model.*;
import wwtec.view.*;


public class MainController {
    
    // pantallas
    private MenuWindow menuView;
    private ConfigWindow configView;
    private GameWindow gameView;
    private ArmyWindow armyView;
    private GamesWindow gamesView;
    
    // modelos
    private Configuration configuration;
    private Game game;

    //controladores
    private MenuController menuController;
    private ConfigController configController;
    private GameController gameController;
    private ArmyController armyController;
    private GamesController gamesController;
    
    public MainController(){
        startMenu();
    }
    
    
    
    // -------------------------------------------------- METODOS ----------------------------------------------------------------------
    public void startMenu(){
        this.menuView = new MenuWindow();
        this.menuController = new MenuController(menuView, this);
        showWindow(menuView);
    }
    
    public void startConfig(){
        this.configView = new ConfigWindow();
        this.configController = new ConfigController(this.configView, this);
    }
    
    public void startGame(Game game){
        // comenzar un juego o continuar uno existente
        this.gameView = new GameWindow();
        this.gameController = new GameController(gameView, this, game);
        changeWindow(menuView, gameView);
    }
    
    // adminsitracion del ejercito
    public void startAdminArmy(Game game){
        this.armyView = new ArmyWindow();
        this.armyController = new ArmyController(this.armyView, this, game);
        showWindow(armyView);
    }
    
    // las partidas guardadas
    public void startGames(){
        this.gamesView = new GamesWindow();
        this.gamesController = new GamesController(this.gamesView, this);
        changeWindow(this.menuView, this.gamesView);
    }



    // ------------------- METODOS GENERALES ------------------------
    // recibe 2 iventanas colocar una en invisible y la otra en visible
    public void changeWindow(iWindow fromWindow, iWindow toWindow){
        fromWindow.visibility(false); // esconde la anterior
        toWindow.visibility(true); // muestra la siguientes
    }
    
    public void showWindow(iWindow window){
        window.visibility(true);
    }
    
    public void closeWindow(iWindow window){
        window.visibility(false);
    }
    
    // recibe un imageicon y le cambia el tamano al correspondiente
    public static ImageIcon resizeIcon(ImageIcon icon, int width, int height ){
        Image iconImage = icon.getImage();
        Image resizedIconImage = iconImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedIconImage);
    }
    
    
    
    // ----------------------------------------------- GETTERS AND SETTERS --------------------------------------------------------------

    public MenuWindow getMenuView() {
        return menuView;
    }

    public ConfigWindow getConfigView() {
        return configView;
    }

    public GameController getGameController() {
        return gameController;
    }
    
    
}
