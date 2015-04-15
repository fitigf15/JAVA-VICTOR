package edu.ub.prog2.GomezFarrusVictor.controlador;

import edu.ub.prog2.GomezFarrusVictor.model.AlbumImatges;
import edu.ub.prog2.GomezFarrusVictor.model.BibliotecaImatges;
import edu.ub.prog2.GomezFarrusVictor.model.DadesVisor;
import edu.ub.prog2.GomezFarrusVictor.model.Imatge;
import edu.ub.prog2.utils.BasicCtrl;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 * Classe que respon a les accions de l'usuari relacionant la vista i el model
 * @author Victor Gomez Farrus @UB
 */
public class CtrlVisor extends BasicCtrl{
    private DadesVisor dadesVisor;
    /**
     * Constructor
     */
    public CtrlVisor(){
        this.dadesVisor=new DadesVisor();
    }
    /**
     * Retorna tots els albums
     * @return ArrayList<AlbumImatges>
     */
    public ArrayList<AlbumImatges> getAlbs(){
    	return this.dadesVisor.getAlbs();
    }
    /**
     * Retorna l'album actual 
     * @return AlbumImatges
     */
    public AlbumImatges getAlb(int index){
    	return this.dadesVisor.getAlbs().get(index);
    }
        /**
     * Serveix per afegir un album
     */
    public void addAlb(String titol, double[] posGPS){
        AlbumImatges alb = new AlbumImatges(titol,posGPS);
        this.dadesVisor.getAlbs().add(alb);
    }
   /**
    * Retorna la biblioteca actual
    * @return BibliotecaImatges
    */
    public BibliotecaImatges getBibl(){
    	return this.dadesVisor.getBibl();
    }
    /**
     * Serveix per afegir una imatge a la biblioteca
     * @param Imatge
     */
    public void addImgBibl(Imatge i){
        this.dadesVisor.getBibl().addImage(i);
    }
    public void addImgAlb(Imatge i, int idxAlb){
        this.dadesVisor.getAlbs().get(idxAlb).addImage(i);
    }
    /**
     * Serveix per eliminar una imatge de la biblioteca
     * @param Imatge
     */
    public void delImgBibl(Imatge i){
        this.dadesVisor.getBibl().removeImage(i);
    }
    /**
     * Serveix per eliminar una imatge de l'album
     * @param Imatge
     * @param idxAlb 
     */
    public void delImgAlb(Imatge i, int idxAlb){
        this.dadesVisor.getAlbs().get(idxAlb).removeImage(i);
    }
    /**
     * Serveix per eliminar una imatge de l'album
     * @param Imatge
     * @param idxAlb 
     */
    public void delAlb(int idxAlb){
        this.dadesVisor.getAlbs().remove(idxAlb);
    }
    /**
     * Retorna un string amb les dades de la biblioteca
     * @return stringBibl
     */
    public String getBiblString(){
        return this.dadesVisor.getBibl().toString();
    }
    /**
     * Retorna un string amb les dades dels albums
     * @return stringAlbums
     */
    public String getAlbsString(){
        return this.dadesVisor.albString();
    }
    public String getAlbString(int idxAlb){
        return this.dadesVisor.getAlbs().get(idxAlb).toString();
    }
    /**
     * Serveix per posar a null totes les dades
     */
    public void clearDades(){
        this.dadesVisor=null;
    }
    /**
     * Serveix per mostrar una imatge, passa excepcions a la classe principal
     * @param Imatge
     * @throws IOException
     * @throws Exception
     */
    public void showImg(Imatge i) throws IOException, Exception{
        i.show(true);
    }
    /**
     * Serveix per obtenir una imatge de la biblioteca
     * @param index
     * @return Imatge
     */
    public Imatge getImgBibl(int index){
        return (Imatge)this.dadesVisor.getBibl().getAt(index);
    }
    /**
     * Serveix per obtenir una imatge de l'album
     * @param idxAlb
     * @param idxImg
     * @return Imatge
     */
    public Imatge getImgAlb(int idxAlb,int idxImg){
        return (Imatge)this.dadesVisor.getAlbs().get(idxAlb).getAt(idxImg);
    }
    /**
     * Serveix per saber si la biblioteca esta buida
     * @return emptyBibl
     */
    public boolean emptyBibl(){
        return this.dadesVisor.getBibl().isEmpty();
    }
    /**
     * Serveix per saber si l'album esta buit
     * @param idxAlb
     * @return emptyAlbum
     */
    public boolean emptyAlb(int idxAlb){
        return this.dadesVisor.getAlbs().get(idxAlb).isEmpty();
    }
    /**
     * Serveix per saber si l'album esta ple
     * @param idxAlb
     * @return fullAlbum
     */
    public boolean fullAlb(int idxAlb){
        return this.dadesVisor.getAlbs().get(idxAlb).isFull();
    }
    /**
     * Serveix per posar el titol a l'album
     * @param idxAlb
     * @param title 
     */
    public void setTitleAlb(int idxAlb,String title){
        this.dadesVisor.getAlbs().get(idxAlb).setTitle(title);
    }
    /**
     * Serveix per posar la posicio GPS a l'album
     * @param idxAlb
     * @param longLat 
     */
    public void setLongLatAlb(int idxAlb, double[] longLat){
        this.dadesVisor.getAlbs().get(idxAlb).setLongLat(longLat);
    }
    /**
     * Serveix per posar la una imatge de portada a l'album
     * @param idxAlb
     * @param imgPortada 
     */
    public void setPortadaAlb(int idxAlb, Imatge imgPortada){
        this.dadesVisor.getAlbs().get(idxAlb).setPortada(imgPortada);
    }
    /**
     * Serveix per canviar el tamany de l'album
     * @param idxAlb
     * @param tamany 
     */
    public void setTamanyAlb(int idxAlb, int tamany){
        this.dadesVisor.getAlbs().get(idxAlb).setMaxTamany(tamany);
    }
    /**
     * Serveix per saber si la llista d'albums esta buida
     * @return emptyAlbs
     */
    public boolean emptyAlbs() {
        return this.dadesVisor.getAlbs().isEmpty();
    }
    /**
     * Serveix per saber si el titol esta disponible
     * @param titol
     * @return containsTitleOfAlbum
     */
    public boolean containsAlb(String titol){
        boolean contains=false;
        for(int i=0;i<this.dadesVisor.getAlbs().size();i++){
            if(this.dadesVisor.getAlbs().get(i).getTitle().equals(titol)){
                contains=true;
            }
        }
        return contains;
    }
    
    /**
     * Serveix per soobreescriure un arxiu de dades situades a una ubicacio, passa excepcions a la classe principal
     * @param ubicacio
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void saveDades(String ubicacio) throws FileNotFoundException, IOException{
        FileInputStream fis=null;           //Per saber si existeix el fitxer
        FileOutputStream fos= null; 
        ObjectOutputStream oos= null;
        fis= new FileInputStream(ubicacio);
        fos= new FileOutputStream(ubicacio);
        oos=new ObjectOutputStream(fos);
        oos.writeObject(this.dadesVisor);
        if(oos != null){
            oos.close();
            fos.close();
        }
        if (fis != null){
            fis.close();
        }
        
        
    }
    /**
     * Serveix per guardar un arxiu de dades situades a una ubicacio, passa les excepcions a la classe principal
     * @param ubicacio
     * @throws IOException
     */
    public void saveNewDades(String ubicacio) throws IOException{
        FileOutputStream fos= null; 
        ObjectOutputStream oos= null;
        fos= new FileOutputStream(ubicacio);
        oos=new ObjectOutputStream(fos);
        oos.writeObject(this.dadesVisor);
        if(oos != null){
            oos.close();
            fos.close();
        }
    }
    /**
     * Serveix per recuperar les dades situades a una ubicacio, passa les excepcions a la classe principal
     * @param ubicacio
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void retrDades(String ubicacio) throws FileNotFoundException, IOException,ClassNotFoundException{
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        fis=new FileInputStream(ubicacio);
        ois=new ObjectInputStream(fis);
        this.dadesVisor=(DadesVisor)ois.readObject();
        if(ois!=null){
                ois.close();
                fis.close();
        } 
        
    }

    
    
}
