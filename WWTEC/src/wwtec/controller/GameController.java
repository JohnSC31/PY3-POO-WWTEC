
package wwtec.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import wwtec.model.Game;
import static wwtec.model.Game.*;
import wwtec.view.GameWindow;


public class GameController implements ActionListener{
    
    private GameWindow view;
    private MainController mainController;
    private Game game;
    
    public GameController(GameWindow view, MainController mainController, Game game){
        this.view = view;
        this.mainController = mainController;
        
        this.game = game;
        
        _init_();
    }
    
    // inicializacion de la ventana
    private void _init_(){
        this.view.getBtnNextLevel().addActionListener(this);
        this.view.getBtnAdminArmy().addActionListener(this);
        this.view.getBtnAttack().addActionListener(this);
        
        setBattleField();
    }
    
    // toma el battlefield del juego y lo imprime en el panel correspondiente
    private void setBattleField(){
        int x = 0, y = 0;
        for(int i = 0; i < BATTLEFIELD_ROWS; i++){
            for(int j = 0; j < BATTLEFIELD_COLS; j++){
                game.getBattleField()[i][j].setBounds(x, y, BATTLE_CELL_SIZE, BATTLE_CELL_SIZE);
                view.getPnlBattleField().add(game.getBattleField()[i][j]);
                
                x += BATTLE_CELL_SIZE;
            }
            x = 0;
            y += BATTLE_CELL_SIZE;
        }
        
        // se setean los datos basicos
        refreshGameData();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.view.getBtnNextLevel())){
            this.game.levelUp();
            this.game.generateVillage();
            refreshGameData();
        }
        
        if(e.getSource().equals(this.view.getBtnAdminArmy())){
            mainController.startAdminArmy(game);
        }
        
        if(e.getSource().equals(this.view.getBtnAttack())){
            game.generateArmy(); // desplegar el armamento
        }
    }
    
    // actualiza en la pantalla los valores del juego
    public void refreshGameData(){
        
        this.view.setTitle("Jugador: " + game.getPlayerName()); // nombre del jugador en partida
        
        this.view.getLblLevel().setText("Nivel " + game.getLevel());
        this.view.getLblBooty().setText(game.getTownHallBooty() + "");
        this.view.getLblBudget().setText(game.getBudget() + "");
        // actualizar datos del ejercito (cantidad actual/ total disponible)
        // actualizar el dinero
    }

    public Game getGame() {
        return game;
    }
    
    
}
