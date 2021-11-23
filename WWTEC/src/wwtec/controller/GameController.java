
package wwtec.controller;

import java.awt.Color;
import javax.swing.BorderFactory;
import wwtec.model.Game;
import static wwtec.model.Game.*;
import wwtec.view.GameWindow;


public class GameController {
    
    GameWindow view;
    MainController mainController;
    Game game;
    
    public GameController(GameWindow view, MainController mainController, Game game){
        this.view = view;
        this.mainController = mainController;
        
        this.game = game == null ? new Game() : game;
        
        _init_();
    }
    
    // inicializacion de la ventana
    private void _init_(){
        setBattleField();
    }
    
    // toma el battlefield del juego y lo imprime en el panel correspondiente
    private void setBattleField(){
        int x = 0, y = 0;
        for(int i = 0; i < BATTLEFIELD_ROWS; i++){
            for(int j = 0; j < BATTLEFIELD_COLS; j++){
                game.getBattleField()[i][j].setBounds(x, y, BATTLE_CELL_SIZE, BATTLE_CELL_SIZE);
                game.getBattleField()[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

                game.getBattleField()[i][j].setOpaque(true);
                if(i > 2 && i < 18 && j > 2 && j < 18) game.getBattleField()[i][j].setBackground(Color.RED);
                if(i == 10 && j == 10) game.getBattleField()[i][j].setBackground(Color.GREEN);
                view.getPnlBattleField().add(game.getBattleField()[i][j]);
                
                x += BATTLE_CELL_SIZE;
            }
            x = 0;
            y += BATTLE_CELL_SIZE;
        }
    }
    
}
