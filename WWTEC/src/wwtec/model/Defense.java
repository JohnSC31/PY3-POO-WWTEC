
package wwtec.model;

import interfaces.iAttack;
import javax.swing.ImageIcon;
import wwtec.model.Game.ArmyType;


public class Defense extends Structure implements iAttack{
    
    private int range;
    private int damage;
    private ArmyType objType;
    private String name;
    
    public Defense(int i, int j, ImageIcon icon, int life, boolean passThrough, ArmyType objType, int range, int damage, String name) {
        super(i, j, icon, life, passThrough);
        this.objType = objType;
        this.range = range;
        this.damage = damage;
        this.name = name;
    }

    @Override
    public void attack() {
        // se ataca al enemigo
    }
    
}
