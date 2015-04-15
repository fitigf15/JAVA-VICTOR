package edu.ub.prog2.GomezFarrusVictor.model;

import edu.ub.prog2.utils.VisorException;

/**
 * Classe representa l'excepcio que es llançara quan hi hagi una imatge que no existeixi 
 * @author Victor Gomez Farrus @UB
 */
public class ExcepcioImatgeNoExisteix extends VisorException{
    /**
     * Constructor
     */
    public ExcepcioImatgeNoExisteix(){
        super();
    }
    /**
     * Sobrecarrega de constructor amb un missatge
     * @param msg 
     */
    public ExcepcioImatgeNoExisteix(String msg){
        super(msg);
    }
}
