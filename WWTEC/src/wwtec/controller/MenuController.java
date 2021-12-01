
package wwtec.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import wwtec.model.Game;
import wwtec.view.MenuWindow;


public class MenuController implements ActionListener, KeyListener{
    
    MenuWindow view;
    MainController mainController;
    
    public MenuController(MenuWindow view, MainController mainController){
        this.view = view;
        this.mainController = mainController;
        
        _init_();
    }
    
    private void _init_(){
        // action listeners
        this.view.getTxtfPlayerName().addKeyListener(this);
        this.view.getBtnPlay().addActionListener(this);
        this.view.getBtnLoadGame().addActionListener(this);
        this.view.getBtnConfig().addActionListener(this);
        this.view.getBtnClose().addActionListener(this);
        
        view.getBtnPlay().setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(view.getBtnPlay())){
            // se presiona jugar
            // creamos una nueva partida con el nombre del jugador
            mainController.startGame(new Game(view.getTxtfPlayerName().getText(), mainController.getConfiguration())); // se inicia un nuevo juego
        }
        
        if(e.getSource().equals(view.getBtnLoadGame())){
            // se presiona cargar partida
            mainController.startGames();
        }
        
        if(e.getSource().equals(view.getBtnConfig())){
            // se presiona configuraciones
            mainController.startConfig();
            mainController.changeWindow(view, mainController.getConfigView());
        }
        
        if(e.getSource().equals(view.getBtnClose())){
            // se presiona cerrar
            System.exit(0);
        }
   
    }
    
    // ------------------------------------------------ KEY LISTENERS --------------------------------------S
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource().equals(view.getTxtfPlayerName())){
            view.getBtnPlay().setEnabled(!view.getTxtfPlayerName().getText().equals(""));
        }
    }
    
}
