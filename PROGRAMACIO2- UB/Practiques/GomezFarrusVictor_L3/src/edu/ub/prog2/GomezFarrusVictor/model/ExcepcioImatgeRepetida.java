package edu.ub.prog2.GomezFarrusVictor.model;

import edu.ub.prog2.utils.VisorException;

/**
 * Classe representa l'excepcio que es llançara quan hi hagi una imatge repetida 
 * @author Victor Gomez Farrus @UB
 */
public class ExcepcioImatgeRepetida extends VisorException{
    /**
     * Constructor
     */
    public ExcepcioImatgeRepetida(){
        super();
    }
    /**
     * Sobrecarrega de constructor amb un missatge
     * @param msg 
     */
    public ExcepcioImatgeRepetida(String msg){
        super(msg);
    }    
}
