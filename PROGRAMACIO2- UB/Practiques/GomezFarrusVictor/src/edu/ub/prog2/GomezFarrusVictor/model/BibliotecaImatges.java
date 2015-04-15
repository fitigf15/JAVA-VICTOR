/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.GomezFarrusVictor.model;

import edu.ub.prog2.utils.ImageFile;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author mat.aules
 */
public class BibliotecaImatges extends LlistaImatges{
    private ArrayList<Imatge> bibl;
    
    public BibliotecaImatges(){
        this.bibl=new ArrayList<Imatge>();
    }
    
    @Override
    public void addImage(ImageFile i){
        Imatge img=(Imatge)i;
        File fitx=new File(img.getFullPath());
        if(!bibl.contains(img)&&fitx.exists()){
            this.bibl.add(img);
            //System.out.println("Imatge afegida a la biblioteca!");
        }/*else{
            System.out.println("El fitxer no existeix o ja es troba a la biblioteca");
            
        } */ 
    }
    @Override
    public boolean isFull(){
        return false;
    }
    
    
}
