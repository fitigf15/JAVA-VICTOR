package edu.ub.prog2.GomezFarrusVictor.controlador;
import edu.ub.prog2.GomezFarrusVictor.model.AlbumImatges;
import edu.ub.prog2.GomezFarrusVictor.model.BibliotecaImatges;
import edu.ub.prog2.GomezFarrusVictor.model.DadesVisor;
import edu.ub.prog2.GomezFarrusVictor.model.ExcepcioImatgeNoExisteix;
import edu.ub.prog2.GomezFarrusVictor.model.ExcepcioImatgeRepetida;
import edu.ub.prog2.GomezFarrusVictor.model.Imatge;
import edu.ub.prog2.GomezFarrusVictor.model.LlistaImatges;
import edu.ub.prog2.utils.BasicCtrl;
import edu.ub.prog2.utils.ImageFile;
import edu.ub.prog2.utils.VisorException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;

/**
 * Classe que respon a les accions de l'usuari relacionant la vista i el model
 * @author Victor Gomez Farrus @UB
 */
public class CtrlVisor extends BasicCtrl{
    private DadesVisor dadesVisor;
    private boolean pauseStatus;
    private boolean tipusReproduccio;
    private ImageFile[] llistaReproduint;
    private int idxReprod;
    private int playFrequency;
    private JDialog playDialog;
    /**
     * Constructor
     */
    public CtrlVisor(){
        this.dadesVisor=new DadesVisor();
        this.idxReprod=-1;
        this.llistaReproduint=null;
        this.playFrequency=-1;
        this.pauseStatus=true;
        this.playDialog=null;
        this.tipusReproduccio=true;
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
    	return this.dadesVisor.getAlb(index);
    }
    /**
     * Retorna l'album actual 
     * @return AlbumImatges
     */
    public AlbumImatges getAlb(String title){
    	return this.dadesVisor.getAlb(title);
    }
    /**
     * Serveix per afegir un album
     */
    public void addAlb(String titol, double[] posGPS){
        this.dadesVisor.addAlb(titol, posGPS);
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
    public void addImage(Imatge i)throws ExcepcioImatgeRepetida, ExcepcioImatgeNoExisteix{
        this.dadesVisor.addImage(i);
    }
    /**
     * Serveix per afegir una imatge a l'album
     * @param Imatge
     * @param idxAlb
     * @throws ExcepcioImatgeNoExisteix
     * @throws ExcepcioImatgeRepetida 
     */
    public void addImage(Imatge i, int idxAlb) throws ExcepcioImatgeNoExisteix, ExcepcioImatgeRepetida{
        this.dadesVisor.addImage(i, idxAlb);
    }
    /**
     * Serveix per eliminar una imatge de la biblioteca
     * @param Imatge
     */
    public void removeImage(Imatge i){
        this.dadesVisor.removeImage(i);
    }
    /**
     * Serveix per eliminar una imatge de l'album
     * @param Imatge
     * @param idxAlb 
     */
    public void removeImage(Imatge i, int idxAlb){
        this.dadesVisor.removeImage(i, idxAlb);
    }
    /**
     * Serveix per eliminar una imatge de l'album
     * @param Imatge
     * @param idxAlb 
     */
    public void removeImage(Imatge i, String  nomAlb){
        this.dadesVisor.removeImage(i, nomAlb);
    }
    /**
     * Serveix per eliminar una imatge de l'album
     * @param Imatge
     * @param idxAlb 
     */
    public void removeAlbum(int idxAlb){
        this.dadesVisor.removeAlbum(idxAlb);
    }
    /**
     * Retorna un string amb les dades de la biblioteca
     * @return stringBibl
     */
    public String[] getBiblString(){
        return this.dadesVisor.getBiblString();
    }
    /**
     * Retorna un string amb les dades dels albums
     * @return stringAlbums
     */
    public String[] getAlbsString(){
        return this.dadesVisor.getAlbString();
    }
    /**
     * Retorna un string amb les dades d'un album
     * @param idxAlb
     * @return stringAlbum
     */
    public String getAlbString(int idxAlb){
        return this.dadesVisor.getAlbString(idxAlb);
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
    /*
     * Retorna la ultima imatge de la biblioteca
     */
    public Imatge getLastImageBibl(){
        return this.dadesVisor.getImage(this.dadesVisor.getBibl().getSize()-1);
    }
    /**
     * Serveix per obtenir una imatge de la biblioteca
     * @param index
     * @return Imatge
     */
    public Imatge getImage(int index){
        return this.dadesVisor.getImage(index);
    }
    /**
     * Serveix per obtenir una imatge de l'album
     * @param idxAlb
     * @param idxImg
     * @return Imatge
     */
    public Imatge getImage(int idxAlb,int idxImg){
        return this.dadesVisor.getImage(idxAlb, idxImg);
    }
    /**
     * Serveix per obtenir una imatge de l'album
     * @param idxAlb
     * @param idxImg
     * @return Imatge
     */
    public Imatge getImage(String nomAlb,int idxImg){
        return this.dadesVisor.getImage(nomAlb, idxImg);
    }
    /**
     * Serveix per saber si la biblioteca esta buida
     * @return emptyBibl
     */
    public boolean isEmpty(){
        return this.dadesVisor.isEmpty();
    }
    /**
     * Serveix per saber si l'album esta buit
     * @param idxAlb
     * @return emptyAlbum
     */
    public boolean isEmpty(int idxAlb){
        return this.dadesVisor.isEmpty(idxAlb);
    }
    /**
     * Serveix per saber si l'album esta ple
     * @param idxAlb
     * @return fullAlbum
     */
    public boolean isFull(int idxAlb){
        return this.dadesVisor.isFull(idxAlb);
    }
    /**
     * Serveix per posar el titol a l'album
     * @param idxAlb
     * @param title 
     */
    public void setTitle(int idxAlb,String title){
        this.dadesVisor.setTitle(idxAlb, title);
    }
    /**
     * Serveix per posar la posicio GPS a l'album
     * @param idxAlb
     * @param longLat 
     */
    public void setLongLat(int idxAlb, double[] longLat){
        this.dadesVisor.setLongLat(idxAlb, longLat);
    }
    /**
     * Serveix per posar la una imatge de portada a l'album
     * @param idxAlb
     * @param imgPortada 
     */
    public void setPortada(int idxAlb, Imatge imgPortada){
        this.dadesVisor.setPortada(idxAlb, imgPortada);
    }
    /**
     * Serveix per canviar el tamany de l'album
     * @param idxAlb
     * @param tamany 
     */
    public void setTamany(int idxAlb, int tamany){
        this.dadesVisor.setTamany(idxAlb, tamany);
    }
    /**
     * Serveix per saber si la llista d'albums esta buida
     * @return emptyAlbs
     */
    public boolean emptyAlbs() {
        return this.dadesVisor.emptyAlbs();
    }
    /**
     * Serveix per saber si el titol esta disponible
     * @param titol
     * @return containsTitleOfAlbum
     */
    public boolean contains(String titol){
        return this.dadesVisor.contains(titol);
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
    /**
     * Serveix per escollir el tipus de reproduccio
     * @param tipus 
     */
    public void setTipusReproduccio(boolean tipus){
        this.tipusReproduccio=tipus;
    }
    /**
     * Serveix per canviar el tipus de reproduccio
    **/
    public void changeTipusReproduccio(){
        this.tipusReproduccio=!this.tipusReproduccio;
    }
    /**
     * Sobrecarrega del metode onTimer perque el visor reprodueixi imatges
     */
    @Override
    public void onTimer(){
        try {
            if(this.idxReprod==this.llistaReproduint.length){
                stopReprod();
            }
            if(this.pauseStatus==false){
                this.playDialog=this.llistaReproduint[this.idxReprod].show(false);
                this.idxReprod++;
            }
            
        } catch (IOException ex) {
            Logger.getLogger(CtrlVisor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CtrlVisor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Metode per reproduir una llista
     * @param list
     * @throws VisorException 
     */
    public void play(LlistaImatges list) throws VisorException{
        this.llistaReproduint=list.getArrayImgFile();
        this.playFrequency=5000;
        this.idxReprod=0;
        if(this.tipusReproduccio==false){
            Collections.shuffle(Arrays.asList(this.llistaReproduint));
        }
        setTimer(this.playFrequency);
        this.pauseStatus=false;
        startTimer();
        onTimer();
    }
    /**
     * Metode per parar de reproduir la llista
     * @throws VisorException 
     */
    public void stopReprod() throws VisorException{
        if(this.playDialog!=null){
            this.playDialog.dispose();
        }
        destroyTimer();
        this.idxReprod=-1;
        this.llistaReproduint=null;
        this.playFrequency=-1;
        this.pauseStatus=true;
        this.playDialog=null;
        this.tipusReproduccio=false;
    }
    /**
     * Metode per augmentar o disminuir la velocitat de reproduccio
     * @param tipus
     * @throws VisorException 
     */
    public void changeSpeed(boolean tipus) throws VisorException{
        //True-> inc
        //False-> decr
        if(tipus==true){
            if(this.playFrequency>=250){
                if(this.pauseStatus){
                    this.playFrequency=this.playFrequency-250;
                }else{
                    stopTimer();
                    this.playFrequency=this.playFrequency-250;
                    setTimer(this.playFrequency);
                    startTimer();
                }
                
            }else{
                if (!this.pauseStatus){
                    this.pauseStatus=true;
                    stopTimer();
                }
                
            }

        }else{
            if(this.pauseStatus){
                this.playFrequency=this.playFrequency+250;
            }else{
                stopTimer();
                this.playFrequency=this.playFrequency+250;
                setTimer(this.playFrequency);
                startTimer();
            }
        }
    }
    /**
     * Metode per pausar o reanudar la reproduccio
     * @throws VisorException 
     */
    public void changeReprodStatus() throws VisorException{
        if(this.pauseStatus){
            this.pauseStatus=false;
            setTimer(this.playFrequency);
            startTimer();
        }else{
            this.pauseStatus=true;
            stopTimer();
        }
    }
    /**
     * Metode per obtenir l'estat de reproduccio
     * @return EstatReproduccio
     */
    public String getReprodStatus(){
        if(this.pauseStatus){
            return "Estat: Pausa";
        }
        return "Estat: Reproduint";
    }
    /**
     * Metode per saber si existeix playDialog
     * @return 
     */
    public boolean getDialogStatus(){
        return this.playDialog!=null;
    }
    /**
     * Metode per obtenir la frequencia de reproduccio
     * @return playFrequency
     */
    public float getPlayFrequency(){
        return this.playFrequency;
    }
    
    
}
