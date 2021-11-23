
package wwtec.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import wwtec.model.Game;
import wwtec.view.MenuWindow;


public class MenuController implements ActionListener{
    
    MenuWindow view;
    MainController mainController;
    
    public MenuController(MenuWindow view, MainController mainController){
        this.view = view;
        this.mainController = mainController;
        
        _init_();
    }
    
    private void _init_(){
        // action listeners
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
        }
        
        if(e.getSource().equals(view.getBtnLoadGame())){
            // se presiona cargar partida
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
    
}
