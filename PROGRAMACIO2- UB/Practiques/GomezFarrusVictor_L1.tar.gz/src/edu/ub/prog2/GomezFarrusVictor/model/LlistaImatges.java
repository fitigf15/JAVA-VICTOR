package edu.ub.prog2.GomezFarrusVictor.model;

import edu.ub.prog2.utils.ImageFile;
import edu.ub.prog2.utils.ImageList;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author Victor Gomez Farrus @UB
 */
public class LlistaImatges extends ImageList implements Serializable{
    
    
    //Atributs
    
    
    private ArrayList<Imatge> llista;   //LLista d'imatges
    private static int maxtamany=100;   //Tamany maxim de la llista
    
    
    /**
     * Constructor
     */
    public LlistaImatges(){
        this.llista = new ArrayList<Imatge>();
    }
    
    
    //Mètodes abstractes
    
    
     /**
     * Retorna el nombre d’elements que hi ha a la llista.
     * @return numElemLlista
     */
    @Override 
    public int getSize() {
        return this.llista.size();
    }
    /**
     * @param imageFile
     * Afegeix una nova imatge a la llista.
     */
    @Override
    public void addImage(ImageFile i) {
        if(!isFull()){
            Imatge img=(Imatge)i;
            this.llista.add(img);
            System.out.println("Imatge afegida!");
        }else{
            System.out.println("El visor esta complet");
        }
    } 
    /**
     * Elimina una imatge de la llista si coincideix amb la imatge passada.
     * @param imageFile
     */
    @Override
    public void removeImage(ImageFile i) {
        if (this.llista.contains(i)){
            boolean stop=false;
            ListIterator litr = this.llista.listIterator();
            Imatge img;
            while(litr.hasNext()&&!stop) {
                img =(Imatge)litr.next();
                if(img.getFullPath().equals(i.getFullPath())){
                    this.llista.remove(img);
                    stop=true;
                    System.out.println("Imatge eliminada!");
                }
            }
        }else{
            System.out.println("L'imatge no es troba dins la llista");
        }
    }
    /**
     * Retorna la imatge a la posició indicada de la llista.
     * @param i
     * @return imageFile
     */
    @Override
    public ImageFile getAt(int i) {
        return (ImageFile)this.llista.get(i);
    }
    /**
     * Indica si la llista està plena
     * És un mètode intern a la classe.
     * @return isFull
     */
    @Override
    protected boolean isFull() {
        return this.llista.size()==maxtamany;
    }  


}
