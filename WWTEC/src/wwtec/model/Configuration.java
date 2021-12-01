
package wwtec.model;

// configuracion del juego

public class Configuration {
    
    private int minDefenseIncrease;
    private int maxDefenseIncrease;
    private int minBootyIncrease;
    private int maxBootyIncrease;

    public Configuration() {
        this.minDefenseIncrease = 50;
        this.maxDefenseIncrease = 100;
        this.minBootyIncrease = 100;
        this.maxBootyIncrease = 250;
    }

    
    
    // --------------------------------------------- GETTERS AND SETTERS -----------------------------------------------------
    public int getMinDefenseIncrease() {
        return minDefenseIncrease;
    }

    public void setMinDefenseIncrease(int minDefenseIncrease) {
        this.minDefenseIncrease = minDefenseIncrease;
    }

    public int getMaxDefenseIncrease() {
        return maxDefenseIncrease;
    }

    public void setMaxDefenseIncrease(int maxDefenseIncrease) {
        this.maxDefenseIncrease = maxDefenseIncrease;
    }

    public int getMinBootyIncrease() {
        return minBootyIncrease;
    }

    public void setMinBootyIncrease(int minBootyIncrease) {
        this.minBootyIncrease = minBootyIncrease;
    }

    public int getMaxBootyIncrease() {
        return maxBootyIncrease;
    }

    public void setMaxBootyIncrease(int maxBootyIncrease) {
        this.maxBootyIncrease = maxBootyIncrease;
    }
    
    
    
    
    
    
}
