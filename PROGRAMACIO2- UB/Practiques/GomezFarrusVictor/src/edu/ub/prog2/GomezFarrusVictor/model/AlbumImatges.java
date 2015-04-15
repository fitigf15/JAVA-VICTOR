/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.GomezFarrusVictor.model;

import edu.ub.prog2.utils.ImageFile;
import java.util.ArrayList;

/**
 *
 * @author mat.aules
 */
public class AlbumImatges extends LlistaImatges {
    private ArrayList<Imatge> alb;
    private int maxImatges;
    private String titol;
    private double[] long_lat;
    private Imatge portada;
    
    public AlbumImatges(int longitud,int latitud){
        this.alb=new ArrayList<Imatge>();
        this.maxImatges=10;
        this.long_lat[0]=longitud;
        this.long_lat[1]=latitud;
        this.portada=null; 
    }
    @Override
    public void addImage(ImageFile i){
        Imatge img=(Imatge)i;
        if (this.alb.isEmpty()){
            this.portada=img;
        }
        if(!isFull()){
            this.alb.add(img);
            //System.out.println("Imatge afegida a l'album!");
        }/*else{
            System.out.println("L'album està complet");
        }*/
          
    }
    @Override
    public boolean isFull(){
        return this.alb.size()>=10;
    }
    
    public void canviPortada(Imatge img){
        this.portada=img;
    }
    
    public void setTamany(int i){
        this.maxImatges=i;
    }
}
