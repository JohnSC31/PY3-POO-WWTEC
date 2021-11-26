/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wwtec.model;

import javax.swing.ImageIcon;

/**
 *
 * @author josa
 */
public class Aerial extends Army{
   

    public Aerial(String name, int live, int hit, int level, int spaces, int apparitionLevel, int price) {
        super(name, live, hit, level, spaces, apparitionLevel, price);
    }

    @Override
    public void attack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
