
package wwtec.model;

import java.util.logging.Level;
import java.util.logging.Logger;


public class DefenseThread extends Thread{
    
    private Defense defense;
    private GameEntity objective; // cambiar por la clase de los componenetes de ataque
    private BattleCell[][] battleField;
    
    private int lengthAreaRange;
    
    private boolean running;
    private boolean pause;
    
    public DefenseThread(Defense defense, BattleCell[][] battleField){
        this.defense = defense;
        this.running = true;
        this.pause = false;
        this.objective = null;
        this.lengthAreaRange = this.defense.getRange() * 2 + 1; // calcula el largo total del area de rango
        this.battleField = battleField;
    }
    
    // --------------------------------------- METODOS -------------------------------------------------------
    
    @Override
    public void run(){
    
        while(running){
            try {
                if(objective == null){
                    // busca un objetivo
                    searchObjective();
                }else{
                    // ataca al objetivo 
                    attackObjective();
                }

                sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error in thread defense");
            }
        
        }
    }
    
    public void stopRunning(){
        this.running = false;
    }
    
    public void pause(){
        this.pause = true;
    }
    
    public void resumen(){
        this.pause = false;
    }
    
    // busca un objetivo en el area de rango y lo setea como tal cuando lo encuentra
    private void searchObjective(){
        int initIRange = defense.getiCoord() - defense.getRange(); // calcula la posicion del cuadro inicial (lado superior derecho)
        int initJRange = defense.getjCoord() - defense.getRange();
        int iPos = initIRange, jPos = initJRange;
        for(int i = 0; i < lengthAreaRange; i++){
            for(int j = 0; j < lengthAreaRange; j++){
                
                GameEntity cellElement = battleField[iPos][jPos].getElement();
                if(cellElement != null){
                    // hacer un if para el tipo de tropa si es aereo o terrestre
                    this.objective = cellElement; // se fija el objetivo 
                }
                
                jPos++;
            }
            jPos = initJRange;
            iPos++;
        }
        
    }
    
    // una vez seteado el objetivo lo empieza atacar
    private void attackObjective(){
        objective.receiveDamage(defense.getDamage());
        if(objective.isDead()){
            this.objective = null;
            this.battleField[objective.getiCoord()][objective.getjCoord()].setElement(null); // se elimina de la matriz
            // para el thread que lo mueve y ataca verificar que no se mueva si esta muerdo
            // se debe eliminar de la matriz para evitar q
        }
        
        
    }

    
}
