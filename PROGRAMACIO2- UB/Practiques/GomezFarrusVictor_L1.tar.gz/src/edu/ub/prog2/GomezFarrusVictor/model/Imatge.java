package edu.ub.prog2.GomezFarrusVictor.model;

import edu.ub.prog2.utils.ImageFile;
import java.io.File;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Victor Gomez Farrus @UB
 */
public class Imatge extends ImageFile implements Serializable{
   
    
    // Atributs 
    
    
    private File arxImatge;                 //fitxer imatge
    
    /**
     * Constructor
     * @param sc
     */
    public Imatge(Scanner sc){
        this.arxImatge=null;
        boolean terminacions;
        do{
            System.out.println("Digueu la ruta on es troba la imatge");
            this.arxImatge=new File(sc.nextLine());
            
            if(!this.arxImatge.isFile()){
            
                System.out.println("L'arxiu no existeix");
                this.arxImatge=null;
            }else{
                terminacions=getExtension().equals(".png")||getExtension().equals(".jpg")||
                    getExtension().equals(".tiff")||getExtension().equals(".bmp")||
                    getExtension().equals(".gif");
                if(!terminacions){
                System.out.println("L'arxiu existeix però no és una imatge");
                this.arxImatge=null;
                }
            }

        }while(this.arxImatge == null);  
    }
    
    // Mètodes abstractes
    
    /**
    * Retorna l'extensio de la imatge.
    * @return imageExtension
    */
    @Override
    public String getExtension() {
        return this.arxImatge.getAbsolutePath().substring(this.arxImatge.getAbsolutePath().indexOf("."));
    }
    
    /**
     * Retorna el cami de la imatge.
     * @return imagePath
     */
    @Override
    public String getFullPath() {
        return this.arxImatge.getAbsolutePath();
    }

}
