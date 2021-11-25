

package wwtec.model;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import wwtec.controller.MainController;


public class Game {
    
    public static final int BATTLE_CELL_SIZE = 30;
    public static final int BATTLEFIELD_ROWS = 21;
    public static final int BATTLEFIELD_COLS = 21;
    public static final int VILLAGE_MIN = 3;
    public static final int VILLAGE_MAX = 17;
    
    
    //private MainController mainController; (no veo la necesidad de la referencia del controlador principal)
    private int level;
    private BattleCell[][] battleField; // campo de batalla, compuesto de celdas de batalla
    // private ejercito
    private Village village;
    
    // imagenes de las defensas
    private ImageIcon townHallIcon;
    private ImageIcon airDefenseIcon;
    private ImageIcon bombIcon;
    private ImageIcon cannonIcon;
    private ImageIcon mortarIcon;
    private ImageIcon towerIcon;
    private ImageIcon wallIcon;
    
    // limites de la aldea
    
    
    public enum ArmyType {
        LAND, 
        AIR
    }
    
    public Game(){
        this.level = 1;
        // inicializacion del campo de batalla
        
        initBattleField();
        loadDefenseImages();
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
    
    private void loadDefenseImages(){
        try {
            this.townHallIcon = new ImageIcon(new File("./src/media/TownHall.png").getCanonicalPath());
            this.airDefenseIcon = new ImageIcon(new File("./src/media/Air_Defense.png").getCanonicalPath());
            this.bombIcon = new ImageIcon(new File("./src/media/Bomb.png").getCanonicalPath());
            this.cannonIcon = new ImageIcon(new File("./src/media/Cannon.png").getCanonicalPath());
            this.mortarIcon = new ImageIcon(new File("./src/media/Mortar.png").getCanonicalPath());
            this.towerIcon = new ImageIcon(new File("./src/media/Tower.png").getCanonicalPath());
            this.wallIcon = new ImageIcon(new File("./src/media/Wall.png").getCanonicalPath());
        } catch (IOException ex) {
            System.out.println("Error al cargar imagenes de las defensas");
        }
    }
    
    
    // genera un nuevo pueblo de forma aleatoria y lo coloca en la matriz y le setea los valores correspondientes
    public void generateVillage(){
        // resetear la aldea anterior
        generateVillageWalls();
        displayElementBattlefield(new TownHall(10, 10, this.townHallIcon, 100, 2000)); // en el centro
        generateVillageDefenses();
    }
    
    private void generateVillageWalls(){
        for(int i = VILLAGE_MIN; i <= VILLAGE_MAX; i++){
            displayElementBattlefield(new Wall(VILLAGE_MIN, i, this.wallIcon, 50)); // horizontal arriba
            displayElementBattlefield(new Wall(VILLAGE_MAX, i, this.wallIcon, 50)); // horizontal abajos
            displayElementBattlefield(new Wall(i, VILLAGE_MIN, this.wallIcon, 50)); // vertical izquierda
            displayElementBattlefield(new Wall(i, VILLAGE_MAX, this.wallIcon, 50)); // vertical derecha
        }
    }
    
    private void generateVillageDefenses(){
        generateVillageDefense(4, this.cannonIcon, 60, ArmyType.LAND, 5, 15, "Cannon", false); // 4 canones
        generateVillageDefense(2, this.mortarIcon, 50, ArmyType.LAND, 10, 20, "Mortar", false); // 2 morteros
        generateVillageDefense(1, this.airDefenseIcon, 90, ArmyType.LAND, 15, 20, "AirDefense", false); // 1 defensa aerea
        generateVillageDefense(3, this.towerIcon, 80, ArmyType.LAND, 6, 15, "Tower", false); // 3 torres
        generateVillageDefense(2, this.bombIcon, 10, ArmyType.LAND, 2, 50, "Bomb", true); // 2 bombas
        
        
    }
    
    private void generateVillageDefense(int amount, ImageIcon icon, int life, ArmyType objType, int range, int damage, String name, boolean passThrough){
        int iPos, jPos;
        for(int i = 0; i < amount; i++){
            do{
                iPos = new Random().nextInt(VILLAGE_MAX-VILLAGE_MIN+1) + VILLAGE_MIN;
                jPos = new Random().nextInt(VILLAGE_MAX-VILLAGE_MIN+1) + VILLAGE_MIN; 
            
            }while(!validElementBattlefield(iPos, jPos));
            
            displayElementBattlefield(new Defense(iPos, jPos, icon, life, objType, range, damage, name, passThrough));
        }
    }
    
    
    // setear un elemento grafico
    public void displayElementBattlefield(GameEntity element){
        if(validElementBattlefield(element.getiCoord(), element.getjCoord())){
            battleField[element.getiCoord()][element.getjCoord()].setElement(element);
            battleField[element.getiCoord()][element.getjCoord()].setIcon(MainController.resizeIcon(element.getIcon(), BATTLE_CELL_SIZE , BATTLE_CELL_SIZE));
        }else{
            System.out.println("No se pudo setear");
        }

    }
    
    // validar para colocar un elemento grafico
    public boolean validElementBattlefield(int iPos, int jPos){
        try{
            return battleField[iPos][jPos].getElement() == null;
            // validar tambien que se pueda pasar a traves de el
            
        }catch(ArrayIndexOutOfBoundsException e){
            return false;
        }
    }
    // eliminar un elemento grafico
    public void unsetElementBattleField(GameEntity element){
        battleField[element.getiCoord()][element.getjCoord()].setElement(null);
        battleField[element.getiCoord()][element.getjCoord()].setIcon(null);
    }
    // ------------------------------------------------------- GETTERS AND SETTERS ------------------------------------------------------------
    public int getLevel() {
        return level;
    }

    public BattleCell[][] getBattleField() {
        return battleField;
    }
    
    
    
}
