
package wwtec.model;

import java.util.ArrayList;


public class Village extends ArrayList<Structure>{
    
    private int life; // la vida total inicial de todo el pueblo
    
    public Village(){
        this.life = 0;
    }
    
    // --------------------------------------------------- METODOS  ----------------------------------------------------------------------------------
    public void addStructure(Structure newStructure){
        this.life += newStructure.getLife();
        this.add(newStructure);
    }
    
    // el procentaje del pueblo que sigue en pie a 100 se le resta este resultado y obtenemos el porcentaje de destruccion
    public int lifePercentage(){
        int actualLife = 0;
        for(int i = 0; i < this.size(); i++){
            actualLife += this.get(i).getLife();
        }
        
        return (actualLife * 100)/ this.life;
    }
}
