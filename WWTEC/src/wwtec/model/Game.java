

package wwtec.model;

import wwtec.controller.MainController;


public class Game {
    
    public static final int BATTLE_CELL_SIZE = 30;
    public static final int BATTLEFIELD_ROWS = 21;
    public static final int BATTLEFIELD_COLS = 21;
    
    //private MainController mainController; (no veo la necesidad de la referencia del controlador principal)
    private int level;
    private BattleCell[][] battleField; // campo de batalla, compuesto de celdas de batalla
    // private ejercito
    private Village village;
    
    public enum ArmyType {
        LAND, 
        AIR
    }
    
    public Game(){
        this.level = 1;
        // inicializacion del campo de batalla
        
        initBattleField();
    }
    
    // ------------------------------------------------------- METODOS ------------------------------------------------------------
    
    private void initBattleField(){
        this.battleField = new BattleCell[BATTLEFIELD_ROWS][BATTLEFIELD_COLS];
        for(int i = 0; i < BATTLEFIELD_ROWS; i++){
            for(int j = 0; j < BATTLEFIELD_COLS; j++){
                this.battleField[i][j] = new BattleCell();
            }   
        }
    }
    
    
    // genera un nuevo pueblo de forma aleatoria y lo coloca en la matriz y le setea los valores correspondientes
    public void generateVillage(){
        
        
    }
    
    
    // ------------------------------------------------------- GETTERS AND SETTERS ------------------------------------------------------------
    public int getLevel() {
        return level;
    }

    public BattleCell[][] getBattleField() {
        return battleField;
    }
    
    
    
}
