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
        setMaxTamany(1);
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
    public void addImage(ImageFile i) throws ExcepcioImatgeRepetida,ExcepcioImatgeNoExisteix{
        Imatge img=(Imatge)i;
        File fitx=new File(img.getFullPath());
        String ext=img.getFullPath().substring(img.getFullPath().indexOf('.'));
        if(fitx.exists()&&(ext.equals(".jpg")||ext.equals(".png")||".gif".equals(ext)||ext.equals(".bmp"))){
            if(!contains(img)){
                super.addImage(img);
                setMaxTamany(getSize()+1);
            }else{
                throw new ExcepcioImatgeRepetida("Es tracta d'una imatge repetida:\n"+i.getFullPath()+"  ja es troba a la biblioteca.");
            }
        }else{
            throw new ExcepcioImatgeNoExisteix("Aquesta imatge no existeix:\n"+i.getFullPath());
        }
        
    }
    /**
     * Sobrecarrega de toString de LlistaImatges 
     * Metode adaptat per la biblioteca
     */
    @Override
    public String toString(){
    	if(isEmpty()){
    		return null;
    	}else{
	        String s="Biblioteca:\n";
	        for(int i = 0;i<getSize();i++){
	            s=s+(i+1)+". "+getAt(i).toString()+"\n";
	        }
	        return s;
    	}
    }
    
    public String[] toStringArray(){
        String[] s = new String[super.getSize()];
        for(int i=0;i<super.getSize();i++){
            Imatge img=(Imatge)super.getAt(i);
            s[i]=img.getName();
        }
        return s;
    }
    
}
