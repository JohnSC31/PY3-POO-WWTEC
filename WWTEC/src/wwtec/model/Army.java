/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wwtec.model;

import interfaces.iAttack;
import javax.swing.ImageIcon;
import wwtec.model.Game.ComponentAtackType;
import wwtec.model.Game.ArmyType;

/**
 *
 * @author josa
 */
public class Army extends GameEntity implements iAttack{
    
    private String name;
    //private ImageIcon aparence;
    private ComponentAtackType componentAtackType;
    private int life; 
    private int hit; // cantidad de golpes por segundo
    private int level; // nivel de aparición
    private int spaces; // espacios que ocupa
    private int apparitionLevel;
    private int price;
    private ArmyType armyType;

    public Army(String name, int life, int hit, int spaces, int apparitionLevel, int price, ImageIcon icon, ComponentAtackType componentAtackType, ArmyType armyType ) {
        super(0, 0, icon, life, false);
        this.name = name;
        this.life = life;
        this.hit = hit;
        this.level = 1;
        this.spaces = spaces;
        this.apparitionLevel = apparitionLevel;
        this.price = price;
        this.armyType = armyType;
        this.componentAtackType = componentAtackType;
    }

    
    
    public void print(){
        System.out.println("Nombre: " + name + " Vida: " + life + " Golpes por s.: " + hit + " Espacios: " + spaces + " Nivel de aparicion: " + apparitionLevel + " Precio: " + price + " ArmyType: " + armyType);
    
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Game.ArmyType getArmyType() {
        return armyType;
    }

    public ComponentAtackType getComponentAtackType() {
        return componentAtackType;
    }

    public void setComponentAtackType(ComponentAtackType componentAtackType) {
        this.componentAtackType = componentAtackType;
    }

    public void setArmyType(Game.ArmyType armyType) {
        this.armyType = armyType;
    }
    
    
    @Override
    public void attack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
