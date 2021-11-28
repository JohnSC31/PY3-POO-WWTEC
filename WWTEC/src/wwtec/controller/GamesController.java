
package wwtec.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import wwtec.view.GamesWindow;


public class GamesController implements ActionListener{
    
    private GamesWindow view;
    private MainController mainController;

    public GamesController(GamesWindow view, MainController mainController) {
        this.view = view;
        this.mainController = mainController;
        
        _init_();
    }
    
    private void _init_(){
        // agregar los listeners
        this.view.getBtnBack().addActionListener(this);
        // obtener el arreglo de juegos del archivo y cargarlos
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // cuando se presione un boton de jugar carga la partida en al pantalla de partida
        
        if(e.getSource().equals(this.view.getBtnBack())){
            mainController.changeWindow(view, mainController.getMenuView());
        }
    }
    
    
}
