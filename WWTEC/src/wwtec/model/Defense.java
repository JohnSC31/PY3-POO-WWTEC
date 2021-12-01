
package wwtec.model;

import interfaces.iAttack;
import javax.swing.ImageIcon;
import wwtec.model.Game.ArmyType;


public class Defense extends Structure implements iAttack{
    
    private int range;
    private int damage;
    private ArmyType objType;
    private String name;
    
    // thread para el ataque
    private DefenseThread defenseThread;
    
    public Defense(int i, int j, String icon, int life, ArmyType objType, int range, int damage, String name, boolean passThrough, BattleCell[][] battleField) {
        super(i, j, icon, life, passThrough);
        this.objType = objType;
        this.range = range;
        this.damage = damage;
        this.name = name;
        this.defenseThread = new DefenseThread(this, battleField);
        this.defenseThread.start();
    }

    @Override
    public void attack() {
        // se ataca al enemigo
    }
    
    // --------------------------------- GETTERS AND SETTERS -----------------------------------------------------------
    public int getRange() {
        return range;
    }

    public int getDamage() {
        return damage;
    }

    public ArmyType getObjType() {
        return objType;
    }

    public String getName() {
        return name;
    }
    
    
}
