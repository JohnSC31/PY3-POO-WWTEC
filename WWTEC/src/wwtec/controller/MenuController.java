
package wwtec.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import wwtec.model.Game;
import wwtec.view.MenuWindow;


public class MenuController implements ActionListener{
    
    MenuWindow view;
    
    public MenuController(MenuWindow view){
        this.view = view;
        
        _init_();
    }
    
    private void _init_(){
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
        }
        
        if(e.getSource().equals(view.getBtnClose())){
            // se presiona cerrar
        }
        
        
        
        
    }
    
}
