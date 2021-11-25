
package wwtec.model;

import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;


public class TownHall extends Structure{
    
    private int booty; // botin (dinero total)
    
    public TownHall(int i, int j, ImageIcon icon, int life, int booty) {
        super(i, j, icon, life, false);
        this.booty = booty;
    }
    
}
