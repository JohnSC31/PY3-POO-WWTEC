
package wwtec.model;

import javax.swing.ImageIcon;


public abstract class GameEntity {
    
    private int iCoord;
    private int jCoord; // posiicion en la matriz de la ventana
    private ImageIcon icon; // representacion basica visua del elemento
    private int life;
    private boolean passThrough;
    private boolean dead; // indica si el elemento ha sido destruido o esta muerto

    public GameEntity(int iCoord, int jCoord, ImageIcon icon, int life, boolean passThrough) {
        this.iCoord = iCoord;
        this.jCoord = jCoord;
        this.icon = icon;
        this.life = life;
        this.passThrough = passThrough;
        this.dead = false;
    }
    
    
    // ---------------------------------------- METODOS ----------------------------------------------------------------------------
    // metodo que le permita recibir ataques morir o ser destruido
    public void receiveDamage(int damage){
        this.life-= damage;
        if(life <= 0) die();
    }
    // metodo para morir o desaparecer
    public void die(){
        this.dead = true;
    }
    
    
    // ------------------------------------- GETTERS AND SETTERS --------------------------------------------

    public int getiCoord() {
        return iCoord;
    }

    public void setiCoord(int iCoord) {
        this.iCoord = iCoord;
    }

    public int getjCoord() {
        return jCoord;
    }

    public void setjCoord(int jCoord) {
        this.jCoord = jCoord;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isPassThrough() {
        return passThrough;
    }

    public void setPassThrough(boolean passThrough) {
        this.passThrough = passThrough;
    }

    public boolean isDead() {
        return dead;
    }
    
    
    
}
