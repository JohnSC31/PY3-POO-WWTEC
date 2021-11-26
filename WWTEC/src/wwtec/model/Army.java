/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wwtec.model;

import interfaces.iAttack;
import javax.swing.ImageIcon;

/**
 *
 * @author josa
 */
public abstract class Army implements iAttack{
    
    private String name;
    private ImageIcon aparence;
    private int life; 
    private int hit; // cantidad de golpes por segundo
    private int level; // nivel de aparición
    private int spaces; // espacios que ocupa
    private int apparitionLevel;
    private int price; 

    public Army(String name, ImageIcon aparence, int life, int hit, int level, int spaces, int apparitionLevel, int price) {
        this.name = name;
        this.aparence = aparence;
        this.life = life;
        this.hit = hit;
        this.level = level;
        this.spaces = spaces;
        this.apparitionLevel = apparitionLevel;
        this.price = price;
    }
    
    public void print(){
        System.out.println("Nombre: " + name + " Vida: " + life + " Golpes por s.: " + hit + " Espacios: " + spaces + " Nivel de aparicion: " + apparitionLevel + " Precio: " + price);
    
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageIcon getAparence() {
        return aparence;
    }

    public void setAparence(ImageIcon aparence) {
        this.aparence = aparence;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSpaces() {
        return spaces;
    }

    public void setSpaces(int spaces) {
        this.spaces = spaces;
    }

    public int getApparitionLevel() {
        return apparitionLevel;
    }

    public void setApparitionLevel(int apparitionLevel) {
        this.apparitionLevel = apparitionLevel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
    
    
}
