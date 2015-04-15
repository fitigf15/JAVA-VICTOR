package edu.ub.prog2.GomezFarrusVictor.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe que conte les dades del visor
 * @author Victor Gomez Farrus @UB
 */
public class DadesVisor implements Serializable{
    private BibliotecaImatges biblioteca;
    private ArrayList<AlbumImatges> albums;
    /**
     * Constructor
     * Inicialitza una biblioteca i una llista d'albums
     */
    public DadesVisor(){
        this.biblioteca=new BibliotecaImatges();
        this.albums=new ArrayList<AlbumImatges>();
    }
    /**
     * Retorna l'album actual 
     * @return AlbumImatges
     */
    public AlbumImatges getAlb(int index){
    	return this.albums.get(index);
    }
    /**
     * Retorna l'album actual 
     * @return AlbumImatges
     */
    public AlbumImatges getAlb(String title){
        AlbumImatges a=null;
        for(AlbumImatges item:this.albums){
            if(item.getTitle().equals(title)){
                a=item;
            }
        }
        return a;
    }
    /**
     * Serveix per afegir un album
     */
    public void addAlb(String titol, double[] posGPS){
        AlbumImatges alb = new AlbumImatges(titol,posGPS);
        this.albums.add(alb);
    }
    /**
     * Metode per obtenir la biblioteca
     * @return BibliotecaImatges
     */
    public BibliotecaImatges getBibl(){
        return this.biblioteca;
    }
    /**
     * Metode per obtenir la llista d'albums
     * @return ArrayList<AlbumImatges>
     */
    public ArrayList<AlbumImatges> getAlbs(){
        return this.albums;
    }
    /**
     * Retorna un string amb les dades de la biblioteca
     * @return stringBibl
     */
    public String[] getBiblString(){
        if(this.biblioteca.isEmpty()){
            String[] s={"..."};
            return s;
        }
        return this.biblioteca.toStringArray();
    }
    /**
     * Metode per obtenir un String amb tots els albums
     * @return albumsString
     */
    public String[] getAlbString(){
        if (this.albums.isEmpty()){
            String[] s={"..."};
            return s;
        }
        String[] s=new String[this.albums.size()];
        for (int i=0;i<this.albums.size();i++){
            s[i]=this.albums.get(i).getTitle();
        }
        return s;
    }
    /**
     * Metode per obtenir un string d'un album
     * @param idxAlb
     * @return albumString
     */
    public String getAlbString(int idxAlb){
        return this.albums.get(idxAlb).toString();
    }
    /**
     * Metode per obten ir un String de totes les dades
     * @return dadesString
     */
    @Override
    public String toString(){
        return "Dades:\n"+this.biblioteca.toString()+"\n"+getAlbString();
    }
    /**
     * Metode per afegir una imatge a la biblioteca
     * @param Imatge
     * @throws ExcepcioImatgeRepetida
     * @throws ExcepcioImatgeNoExisteix 
     */
    public void addImage(Imatge i)throws ExcepcioImatgeRepetida, ExcepcioImatgeNoExisteix{
        this.biblioteca.addImage(i);
    }
    /**
     * Metode per afegir una imatge a un album
     * @param Imatge
     * @param idxAlb
     * @throws ExcepcioImatgeNoExisteix
     * @throws ExcepcioImatgeRepetida 
     */
    public void addImage(Imatge i, int idxAlb) throws ExcepcioImatgeNoExisteix, ExcepcioImatgeRepetida{
        this.albums.get(idxAlb).addImage(i);
    }
    /**
     * Serveix per eliminar una imatge de la biblioteca
     * @param Imatge
     */
    public void removeImage(Imatge i){
        this.biblioteca.removeImage(i);
        for(AlbumImatges item:this.albums){
            if(item.contains(i)){
                item.removeImage(i);
            }
        }
    }
    /**
     * Serveix per eliminar una imatge de l'album
     * @param Imatge
     * @param idxAlb 
     */
    public void removeImage(Imatge i, int idxAlb){
        this.albums.get(idxAlb).removeImage(i);
    }
    /**
     * Serveix per eliminar una imatge de l'album
     * @param Imatge
     * @param idxAlb 
     */
    public void removeImage(Imatge i, String nomAlb){
        for(AlbumImatges item: this.albums){
            if(item.getTitle().equals(nomAlb)){
                item.removeImage(i);
            }
        }
    }
    /**
     * Serveix per eliminar una imatge de l'album
     * @param Imatge
     * @param idxAlb 
     */
    public void removeAlbum(int idxAlb){
        this.albums.remove(idxAlb);
    }
        /**
     * Serveix per obtenir una imatge de la biblioteca
     * @param index
     * @return Imatge
     */
    public Imatge getImage(int index){
        return (Imatge)this.biblioteca.getAt(index);
    }
    /**
     * Serveix per obtenir una imatge de l'album
     * @param idxAlb
     * @param idxImg
     * @return Imatge
     */
    public Imatge getImage(int idxAlb,int idxImg){
        return (Imatge)this.albums.get(idxAlb).getAt(idxImg);
    }
    /**
     * Serveix per obtenir una imatge de l'album
     * @param idxAlb
     * @param idxImg
     * @return Imatge
     */
    public Imatge getImage(String nomAlb,int idxImg){
        AlbumImatges a=null;
        for(AlbumImatges item: this.albums){
            if(item.getTitle().equals(nomAlb)){
                a=item;
            }
        }
        return (Imatge)a.getAt(idxImg);
    }
    /**
     * Serveix per saber si la biblioteca esta buida
     * @return emptyBibl
     */
    public boolean isEmpty(){
        return this.biblioteca.isEmpty();
    }
    /**
     * Serveix per saber si l'album esta buit
     * @param idxAlb
     * @return emptyAlbum
     */
    public boolean isEmpty(int idxAlb){
        return this.albums.get(idxAlb).isEmpty();
    }
    /**
     * Serveix per saber si l'album esta ple
     * @param idxAlb
     * @return fullAlbum
     */
    public boolean isFull(int idxAlb){
        return this.albums.get(idxAlb).isFull();
    }
    /**
     * Serveix per posar el titol a l'album
     * @param idxAlb
     * @param title 
     */
    public void setTitle(int idxAlb,String title){
        this.albums.get(idxAlb).setTitle(title);
    }
    /**
     * Serveix per posar la posicio GPS a l'album
     * @param idxAlb
     * @param longLat 
     */
    public void setLongLat(int idxAlb, double[] longLat){
        this.albums.get(idxAlb).setLongLat(longLat);
    }
    /**
     * Serveix per posar la una imatge de portada a l'album
     * @param idxAlb
     * @param imgPortada 
     */
    public void setPortada(int idxAlb, Imatge imgPortada){
        this.albums.get(idxAlb).setPortada(imgPortada);
    }
    /**
     * Serveix per canviar el tamany de l'album
     * @param idxAlb
     * @param tamany 
     */
    public void setTamany(int idxAlb, int tamany){
        this.albums.get(idxAlb).setMaxTamany(tamany);
    }
    /**
     * Serveix per saber si la llista d'albums esta buida
     * @return emptyAlbs
     */
    public boolean emptyAlbs() {
        return this.albums.isEmpty();
    }
    /**
     * Serveix per saber si el titol esta disponible
     * @param titol
     * @return containsTitleOfAlbum
     */
    public boolean contains(String titol){
        boolean contains=false;
        for(int i=0;i<this.albums.size();i++){
            if(this.albums.get(i).getTitle().equals(titol)){
                contains=true;
            }
        }
        return contains;
    }
}
