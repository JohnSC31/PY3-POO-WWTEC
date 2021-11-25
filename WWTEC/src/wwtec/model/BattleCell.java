
package wwtec.model;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import static wwtec.model.Game.BATTLE_CELL_SIZE;


public class BattleCell extends JLabel{
    
    GameEntity element;
    
    public BattleCell(){
        this.element = null;
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.setOpaque(true);
        this.setBackground(new Color(53, 130, 97));
    }

    public GameEntity getElement() {
        return element;
    }

    public void setElement(GameEntity element) {
        this.element = element;
    }
    
    
    
    
}
