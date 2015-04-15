
package edu.ub.prog2.GomezFarrusVictor.model;

import edu.ub.prog2.utils.ImageFile;

/**
 * Classe que conte l'album d'imatges
 * Hereta les propietats de LlistaImatges
 * @author Victor Gomez Farrus @UB
 */
public class AlbumImatges extends LlistaImatges {
    private String titol;
    private double[] long_lat;
    private Imatge portada;
    /**
     * Constructor sobrecarregat
     * Inicialitza els atributs segons els parametres
     */
    public AlbumImatges(String title,double[] posGPS){
        this.long_lat=posGPS;
        this.portada=null; 
        this.titol=title;
        setMaxTamany(10);
    }
    /**
     * Metode per posar una posicio GPS
     * @param [longitud,latitud]
     */
    public void setLongLat(double[] longLat){
        if(longLat.length==2){
            this.long_lat=longLat;
        }
    }
    /**
     * Sobrecarrega de addImage de LlistaImatges
     * Si l'album esta buit quan afegim una imatge
     * aquesta sera la portada
     */
    @Override
    public void addImage(ImageFile i) throws ExcepcioImatgeNoExisteix, ExcepcioImatgeRepetida{
        Imatge img=(Imatge)i;
        if (isEmpty()){
            this.portada=img;
        }
        super.addImage(img);
          
    }
    /**
     * Metode per posar una imatge de portada de l'album
     * @param Imatge
     */
    public void setPortada(Imatge img){
        this.portada=img;
    }
    /**
     * Metode per posar titol a l'album
     * @param titol
     */
    public void setTitle(String s){
    	this.titol=s;
    }
    /**
     * Metode per obtenir el titol de l'album
     * @return 
     */
    public String getTitle(){
        return this.titol;
    }
    /**
     * Sobrecarrega de toString de LlistaImatges
     * Metode adaptat per l'album
     */
    @Override
    public String toString(){
    	if(isEmpty()){
    		return null;
    	}else{
    		String s="Album:\n";
    		s=s+"Titol: "+this.titol+"\nPos. GPS:"+this.long_lat[0]+","+this.long_lat[1]+"\nPortada:"+this.portada.getFullPath()+"\n";
            for(int i = 0;i<getSize();i++){
                s=s+(i+1)+". "+getAt(i).toString()+"\n";
            }
            return s;
    	}
        
    }
}
