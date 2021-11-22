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

    //controladores
    private MenuController menuController;
    
    
    public MainController(){
        startMenu();
    }
    
    
    
    // -------------------------------------------------- METODOS ----------------------------------------------------------------------
        private void startMenu(){
        this.menuView = new MenuWindow();
        this.menuController = new MenuController(menuView);
        showWindow(menuView);
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
    
}
