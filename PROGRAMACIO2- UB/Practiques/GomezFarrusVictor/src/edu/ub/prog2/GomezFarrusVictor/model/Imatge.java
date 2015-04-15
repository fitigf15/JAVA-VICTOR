package edu.ub.prog2.GomezFarrusVictor.model;

import edu.ub.prog2.utils.ImageFile;
import java.io.File;
import java.io.Serializable;
import java.util.Date;

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
    public Imatge(String filepath){
        this.arxImatge=new File(filepath);
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
        Date lastmod=new Date(this.arxImatge.lastModified());
        return this.arxImatge.getAbsolutePath()+ " última modificació:" + lastmod.toString();
    }

}
