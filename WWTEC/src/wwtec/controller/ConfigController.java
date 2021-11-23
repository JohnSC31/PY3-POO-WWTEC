
package wwtec.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import wwtec.view.ConfigWindow;


public class ConfigController implements ActionListener {
    
    ConfigWindow view;
    MainController mainController;
    
    public ConfigController(ConfigWindow view, MainController mainController){
        this.view = view;
        this.mainController = mainController;
        
        _init_();
    }
    
    public void _init_(){
        // action listeners
        view.getBtnBack().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource().equals(view.getBtnBack())){
            // guardar la configuracion
            mainController.changeWindow(this.view, mainController.getMenuView());
        }
    }
    
    
}
