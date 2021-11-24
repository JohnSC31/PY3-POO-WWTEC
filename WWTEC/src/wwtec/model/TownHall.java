
package wwtec.model;

import javax.swing.ImageIcon;


public class TownHall extends Structure{
    
    private int booty; // botin (dinero total)
    
    public TownHall(int i, int j, ImageIcon icon, int life, boolean passThrough, int booty) {
        super(i, j, icon, life, passThrough);
        this.booty = booty;
    }
    
}
