

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
    
    private String playerName; // nombre del jugador creador del juego
    
    //private MainController mainController; (no veo la necesidad de la referencia del controlador principal)
    private int level;
    private BattleCell[][] battleField; // campo de batalla, compuesto de celdas de batalla
    // private ejercito
    private Village village;
    
    // imagenes de las defensa
    public final String townHallIcon = "TownHall.png";
    public final String airDefenseIcon = "Air_Defense.png";
    public final String bombIcon = "Bomb.png";
    public final String cannonIcon = "Cannon.png";
    public final String mortarIcon = "Mortar.png";
    public final String towerIcon = "Tower.png";
    public final String wallIcon = "Wall.png";
    
    // variables para el crecimiento de la aldeas
    private int townHallBooty = 1000; // dato inicial
    
    private int airDefenseLife = 90;
    private int airDefenseDamage = 20;
    
    private int bombLife = 1;
    private int bombDamage = 60;
    
    private int cannonLife = 50;
    private int cannonDamage = 15;
    
    private int mortarLife = 60;
    private int mortarDamage = 25;
    
    private int towerLife = 40;
    private int towerDamage = 25;
    
    private int wallLife = 50;
    
    public enum ArmyType {
        LAND, 
        AIR
    }
    
    public Game(String playerName){
        this.level = 1;
        this.playerName = playerName;
        // inicializacion del campo de batalla
        initBattleField();
        generateVillage(); // se genera la aldea inicial
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
    
    private ImageIcon loadDefenseImage(String fileName){
        ImageIcon icon = null;
        try {
            icon = new ImageIcon(new File("./src/media/" + fileName).getCanonicalPath());
        } catch (IOException ex) {
            System.out.println("Error al cargar imagenes de las defensas");
        }
        return icon;
    }
    
    
    // genera un nuevo pueblo de forma aleatoria y lo coloca en la matriz y le setea los valores correspondientes
    public void generateVillage(){
        unsetVillage();
        generateVillageWalls();
        displayElementBattlefield(new TownHall(10, 10, loadDefenseImage(this.townHallIcon), 100, townHallBooty)); // en el centro
        generateVillageDefenses();
    }
    
    private void generateVillageWalls(){
        for(int i = VILLAGE_MIN; i <= VILLAGE_MAX; i++){
            displayElementBattlefield(new Wall(VILLAGE_MIN, i, loadDefenseImage(this.wallIcon), 50)); // horizontal arriba
            displayElementBattlefield(new Wall(VILLAGE_MAX, i, loadDefenseImage(this.wallIcon), 50)); // horizontal abajos
            displayElementBattlefield(new Wall(i, VILLAGE_MIN, loadDefenseImage(this.wallIcon), 50)); // vertical izquierda
            displayElementBattlefield(new Wall(i, VILLAGE_MAX, loadDefenseImage(this.wallIcon), 50)); // vertical derecha
        }
    }
    
    public void unsetVillage(){
        for(int i = 0; i < BATTLEFIELD_ROWS; i++){
            for(int j = 0; j < BATTLEFIELD_COLS; j++){
                this.battleField[i][j].setElement(null);
                this.battleField[i][j].setIcon(null);
            }   
        }
    }
    
    private void generateVillageDefenses(){
        generateVillageDefense(4, loadDefenseImage(this.cannonIcon), cannonLife, ArmyType.LAND, 5, cannonDamage, "Cannon", false); // 4 canones
        generateVillageDefense(2, loadDefenseImage(this.mortarIcon), mortarLife, ArmyType.LAND, 10, mortarDamage, "Mortar", false); // 2 morteros
        generateVillageDefense(1, loadDefenseImage(this.airDefenseIcon), airDefenseLife, ArmyType.LAND, 15, airDefenseDamage, "AirDefense", false); // 1 defensa aerea
        generateVillageDefense(3, loadDefenseImage(this.towerIcon), towerLife, ArmyType.LAND, 6, towerDamage, "Tower", false); // 3 torres
        generateVillageDefense(2, loadDefenseImage(this.bombIcon), bombLife, ArmyType.LAND, 2, bombDamage, "Bomb", true); // 2 bombas
        
        
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
    
    // realiza una suma en el nivel y en las estatisticas de las defensas y en el botin
    public void levelUp(){
        this.level++;
        
        // aumento del botin aumento del actual entre un 100 y un 250 % esos numeros deben venir de las configuraciones
        townHallBooty += ((new Random().nextInt(250-100+1) + 100) * townHallBooty / 100);
        
        // aumento de la vida y dano de las defensas entre un 50 y 100%
        airDefenseLife += ((new Random().nextInt(100-50+1) + 50) * airDefenseLife / 100);
        airDefenseDamage += ((new Random().nextInt(100-50+1) + 50) * airDefenseDamage / 100);
        
        bombLife += ((new Random().nextInt(100-50+1) + 50) * bombLife / 100);
        bombDamage += ((new Random().nextInt(100-50+1) + 50) * bombDamage / 100);
        
        cannonLife += ((new Random().nextInt(100-50+1) + 50) * cannonLife / 100);
        cannonDamage += ((new Random().nextInt(100-50+1) + 50) * cannonDamage / 100);
        
        mortarLife += ((new Random().nextInt(100-50+1) + 50) * mortarLife / 100);
        mortarDamage += ((new Random().nextInt(100-50+1) + 50) * mortarDamage / 100);
        
        towerLife += ((new Random().nextInt(100-50+1) + 50) * towerLife / 100);
        towerDamage += ((new Random().nextInt(100-50+1) + 50) * towerDamage / 100);
        
        wallLife += ((new Random().nextInt(100-50+1) + 50) * wallLife / 100);
        
    }
    
    
    // ------------------------------------------------------- GETTERS AND SETTERS ------------------------------------------------------------
    public int getLevel() {
        return level;
    }

    public int getTownHallBooty() {
        return townHallBooty;
    }

    public BattleCell[][] getBattleField() {
        return battleField;
    }

    public String getPlayerName() {
        return playerName;
    }
    
    
    
    
    
}
