package edu.ub.prog2.GomezFarrusVictor.model;

import edu.ub.prog2.utils.ImageFile;
import edu.ub.prog2.utils.ImageList;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Classe que conte la llista d'imatges
 * Es la classe pare de BibliotecaImatges i AlbumImatges
 * @author Victor Gomez Farrus @UB
 */
public class LlistaImatges extends ImageList implements Serializable{
    
    private ArrayList<ImageFile> llista;   //LLista d'imatges
    private int maxtamany;   //Tamany maxim de la llista
    
    
    /**
     * Constructor
     */
    public LlistaImatges(){
        this.llista = new ArrayList<ImageFile>();
        this.maxtamany=100;
    }
     /**
     * Retorna el nombre d'elements que hi ha a la llista.
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
    public void addImage(ImageFile i) throws ExcepcioImatgeNoExisteix,ExcepcioImatgeRepetida {
        if(!isFull()){
            Imatge img=(Imatge)i;
            this.llista.add(img);
        }
    } 
    /**
     * Elimina una imatge de la llista si coincideix amb la imatge passada.
     * @param imageFile
     */
    @Override
    public void removeImage(ImageFile i) {
        boolean deleted=false;
        ListIterator litr = this.llista.listIterator();
        Imatge img;
        while(litr.hasNext()&&!deleted) {
            img =(Imatge)litr.next();
            if(img.getFullPath().equals(i.getFullPath())){
                this.llista.remove(img);
                deleted=true;
            }
        }
    }
    /**
     * Retorna la imatge a la posicio indicada de la llista.
     * @param index
     * @return imageFile
     */
    @Override
    public ImageFile getAt(int i) {
        return (ImageFile)this.llista.get(i);
    }
    /**
     * Indica si la llista esta� plena
     * Es un metode intern a la classe.
     * @return isFull
     */
    @Override
    public boolean isFull() {
        return this.llista.size()==this.maxtamany;
    }  
    /**
     * Metode per obtenir un string amb totes les dades
     * @return toString
     */
    @Override
    public String toString(){
    	if(this.llista.isEmpty()){
    		return null;
    	}else{
	        String s="Llista:\n";
	        for(int i = 0;i<this.llista.size();i++){
	            s=s+i+". "+this.llista.get(i).toString()+"\n";
	        }
	        return s;
    	}
    }
    /**
     * Metode per saber si la llista conte una imatge
     * @param imatge
     * @return contains
     */
    public boolean contains(Imatge img){
    	boolean contains=false;
    	for(int i=0;i<this.llista.size();i++){
    		if(this.llista.get(i).getFullPath().equals(img.getFullPath())){
    			contains=true;
    		}
    	}
    	return contains;
    }
    /**
     * Metode per saber si la llista esta buida
     * @return isEmpty
     */
    public boolean isEmpty(){
    	return this.llista.isEmpty();
    }
    /**
     * Metode per canviar el tamany maxim de la llista
     * @param maxTamany
     */
    public void setMaxTamany(int i){
    	this.maxtamany=i;
    }
    /**
     * Metode per posar les dades tal i com estaven al principi
     */
    @Override
    public void clear() {
        this.llista.clear();
        this.maxtamany=100;
    }
    /**
     * Metode per obtenir un array amb les dades de llista 
     * @return arrayImgFile
     */
    public ImageFile[] getArrayImgFile(){
        /** NO FUNCIONA EL CAST, EL FAIG MANUALMENT
        return (ImageFile[]) this.llista.toArray();
        * */
        ImageFile[] array=new ImageFile[this.llista.size()];
        for(int i=0;i<this.llista.size();i++){
            array[i]=this.llista.get(i);
        }
        return array;
    }
    

}
