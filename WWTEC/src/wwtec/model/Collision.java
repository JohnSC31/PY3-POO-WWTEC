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
public class Collision extends Army {
    
    private String name;
    private ImageIcon aparence;
    private int life; 
    private int hit; // cantidad de golpes por segundo
    private int level; // nivel de aparición
    private int spaces; // espacios que ocupa
    private int apparitionLevel;
    private int price;

    public Collision(String name, ImageIcon aparence, int life, int hit, int level, int spaces, int apparitionLevel, int price) {
        super(name, aparence, life, hit, level, spaces, apparitionLevel, price);
    }

    @Override
    public void attack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
