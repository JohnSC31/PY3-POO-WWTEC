
package wwtec.model;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import static wwtec.model.Game.BATTLE_CELL_SIZE;


public class BattleCell extends JLabel{
    
    GameEntity element;
    
    public BattleCell(){

    }

    public GameEntity getElement() {
        return element;
    }

    public void setElement(GameEntity element) {
        this.element = element;
    }
    
    
    
    
}
