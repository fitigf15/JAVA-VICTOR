package edu.ub.prog2.GomezFarrusVictor.model;

import edu.ub.prog2.utils.ImageFile;
import java.io.File;
import java.io.Serializable;
import java.util.Date;

/**
 * Classe que representa una imatge de l'album
 * @author Victor Gomez Farrus @UB
 */
public class Imatge extends ImageFile implements Serializable{

    private File arxImatge;                 //fitxer imatge
    
    /**
     * Constructor
     * @param sc
     */
    public Imatge(String filepath){
        this.arxImatge=new File(filepath);
    }
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
    /**
     * Retorna un string amb totes les dades de la imatge
     * @return imatgeString
     */
    public String toString(){
    	Date lastmod=new Date(this.arxImatge.lastModified());
        return this.arxImatge.getAbsolutePath()+ ", ultima modificacio:" + lastmod.toString();
    }

}
