
package wwtec.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import wwtec.model.Game;
import wwtec.view.ArmyWindow;


public class ArmyController implements ActionListener{
    
    private ArmyWindow view;
    private MainController mainController;
    private Game game;

    public ArmyController(ArmyWindow view, MainController mainController, Game game) {
        this.view = view;
        this.mainController = mainController;
        this.game = game;
        
        _init_();
    }
    
    private void _init_(){
        // se colocan los action listeners
        view.getBtnBack().addActionListener(this);
        // carga los datos del ejercito actual, del dinero y todo lo demas
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(view.getBtnBack())){
            mainController.closeWindow(view);
            mainController.getGameController().refreshGameData();
        }
    }
    
    
}
