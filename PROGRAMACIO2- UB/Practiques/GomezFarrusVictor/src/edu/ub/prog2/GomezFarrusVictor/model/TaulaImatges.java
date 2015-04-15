package edu.ub.prog2.GomezFarrusVictor.model;

import edu.ub.prog2.utils.ImageFile;
import edu.ub.prog2.utils.ImageList;
import java.io.Serializable;

/**
 *
 * @author Victor Gomez Farrus @UB
 */
public class TaulaImatges extends ImageList implements Serializable{
    
    //Atributs
    
    
    private Imatge[] taula;             //Llista d'imatges
    private static int maxtamany=100;   //Tamany maxim de la llista
    private int size;                   //Numero d'elements
    
    
    /**
     * Constructor
     */
    public TaulaImatges(){
        this.taula=new Imatge[maxtamany];
        this.size=0;
    }
    
    //Mètodes abstractes
    
    
    /**
     * Retorna el nombre d’elements que hi ha a la llista.
     * @return numElemLlista
     */
    @Override 
    public int getSize() {
        return this.size;
    }
    
    /**
     * @param imageFile
     * Afegeix una nova imatge a la llista.
     */
    @Override
    public void addImage(ImageFile i) {
        if(!isFull()){
            Imatge img=(Imatge)i;
            taula[this.size]=img;
            this.size++;
            //System.out.println("Imatge afegida!");
        }/*else{
            System.out.println("El visor esta complet");
        }*/
    }
    
    /**
     * Elimina una imatge de la llista si coincideix amb la imatge passada.
     * @param imageFile
     */
    @Override
    public void removeImage(ImageFile i) {
        boolean deleted=false;
        for(int idx=0; idx<this.size&&!deleted;idx++){
            if (this.taula[idx].getFullPath().equals(i.getFullPath())){
                this.taula[idx]=null;
                for(int k=idx+1;k<this.size;k++){
                    this.taula[k-1]=this.taula[k];
                }
                this.taula[this.size-1]=null;
                this.size--;
                deleted=true;
                //System.out.println("Imatge eliminada!");
            }
        }
        /*if(!deleted){
            System.out.println("L'imatge no es troba dins la llista");
        }*/
     }
    
    /**
     * Retorna la imatge a la posició indicada de la llista.
     * @param i
     * @return imageFile
     */
    @Override
    public ImageFile getAt(int i) {
        return (ImageFile)this.taula[i];
    }
    /**
     * Indica si la llista està plena
     * És un mètode intern a la classe.
     * @return isFull
     */
    @Override
    protected boolean isFull() {
        return this.size==maxtamany;
    }
   
}
