package edu.ub.prog2.GomezFarrusVictor.model;

import edu.ub.prog2.utils.ImageFile;
import java.io.File;

/**
 * Classe que conte la biblioteca d'imatges
 * Hereta les propietats de LlistaImatges
 * @author Victor Gomez Farrus @UB
 */
public class BibliotecaImatges extends LlistaImatges{
    
    /**
     * Constructor
     * Inicialitza els atributs i posa un tamany maxim(mai se sobrepassara)
     */
    public BibliotecaImatges(){
        super.setMaxTamany(1);
    }
    /**
     * Sobrecarrega de addImage a LlistaImatges
     * Comprova que la imatge existeixi i que no estigui dins
     * la biblioteca
     * Si la biblioteca esta buida, la primera imatge  que afegim
     * sera la portada
     * Augmenta el tamany maxim
     */
    @Override
    public void addImage(ImageFile i){
        Imatge img=(Imatge)i;
        File fitx=new File(img.getFullPath());
        if((!super.contains(img))&&fitx.exists()){
            super.addImage(img);
            super.setMaxTamany(super.getSize()+1);
        }
        
    }
    /**
     * Sobrecarrega de toString de LlistaImatges 
     * Metode adaptat per la biblioteca
     */
    @Override
    public String toString(){
    	if(super.isEmpty()){
    		return null;
    	}else{
	        String s="Biblioteca:\n";
	        for(int i = 0;i<super.getSize();i++){
	            s=s+(i+1)+". "+super.getAt(i).toString()+"\n";
	        }
	        return s;
    	}
    }
    
}
