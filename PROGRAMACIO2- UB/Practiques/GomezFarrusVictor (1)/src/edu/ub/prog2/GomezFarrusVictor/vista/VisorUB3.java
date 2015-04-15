package edu.ub.prog2.GomezFarrusVictor.vista;

import edu.ub.prog2.GomezFarrusVictor.controlador.CtrlVisor;
import edu.ub.prog2.GomezFarrusVictor.model.ExcepcioImatgeNoExisteix;
import edu.ub.prog2.GomezFarrusVictor.model.ExcepcioImatgeRepetida;
import edu.ub.prog2.GomezFarrusVictor.model.Imatge;
import edu.ub.prog2.GomezFarrusVictor.model.LlistaImatges;
import edu.ub.prog2.utils.Menu;
import edu.ub.prog2.utils.VisorException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe principal que gestiona un menu principal i submenus
 * @author Victor Gomez Farrus @UB
 * @version 3.0
 */
public class VisorUB3{
    //Atributs de VisorUB3VisorUB3
    private CtrlVisor controlador;
    private Menu<VisorUB3.OpcionsMenuVisorUB3> menuPrinc;
    private Menu<VisorUB3.OpcionsGestioBiblio> menBiblio;
    private Menu<VisorUB3.OpcionsGestioAlbum> menAlbum;
    private Menu<VisorUB3.OpcionsGestioAlbums> menAlbums;
    private Menu<VisorUB3.OpcionsMenuReprod> menReprod;
    private Menu<VisorUB3.OpcionsModDataAlb> menModDataAlb;

    // Declarem les opcions per a referir-se a les opcions del menu.
    static private enum OpcionsMenuVisorUB3 {   MENU_VISORUB_GESTIO_BIBLIOTECA,
                                                MENU_VISORUB_GESTIO_ALBUMS,
                                                MENU_VISORUB_GUARDAR_DADES,
                                                MENU_VISORUB_RECUPERAR_DADES,
                                                MENU_VISORUB_SORTIR;
    }
   
    static private enum OpcionsGestioBiblio{    BIBLIO_AFEGIR_IMATGE,
                                                BIBLIO_MOSTRAR,
                                                BIBLIO_ELIMINAR_IMATGE,
                                                BIBLIO_VISUALITZAR_BIBLIOTECA,
                                                BIBLIO_VISUALITZAR_IMATGE,
                                                BIBLIO_MENU_ANTERIOR;
    }
    
    static private enum OpcionsGestioAlbum{     ALBUM_AFEGIR_IMATGE,
                                                ALBUM_MOSTRAR,
                                                ALBUM_ELIMINAR_IMATGE,
                                                ALBUM_VISUALITZAR_ALBUM,
                                                ALBUM_MODIFICAR_DADES,
                                                ALBUM_VISUALITZAR_IMATGE,
                                                ALBUM_MENU_ANTERIOR;
    }
    static private enum OpcionsGestioAlbums{    ALBUMS_AFEGIR_ALBUM,
                                                ALBUMS_MOSTRAR_ALBUMS,
                                                ALBUMS_ELIMINAR_ALBUM,
                                                ALBUMS_GESTIONAR_ALBUM,
                                                ALBUMS_MENU_ANTERIOR;
    }
    static private enum OpcionsMenuReprod{      REPROD_INCREMENTAR_VELOCITAT,
                                                REPROD_DECREMENTAR_VELOCITAT,
                                                REPROD_PAUSAR_ACTIVAR,
                                                REPROD_ATURAR;
    }
    static private enum OpcionsModDataAlb{      MOD_DATA_TITOL,
                                                MOD_DATA_PORTADA,
                                                MOD_DATA_GPS,
                                                MOD_DATA_TAMANY;
    }
    
    //Declarem descripcions personalitzades per a les opcions del menú de VisorUB
    
    static private String[] descMenuVisorUB={   "Gestio de la biblioteca",
                                                "Gestio dels albums",
                                                "Guardar dades",
                                                "Recuperar dades",
                                                "Sortir" };
    
    static private String[] descGestioBiblio={      "Afegir imatge",
                                                    "Mostrar biblioteca",
                                                    "Eliminar imatge",
                                                    "Visualitzar biblioteca",
                                                    "Visualitzar imatge",
                                                    "Menu anterior"};
    
    static private String[] descGestioAlbum={       "Afegir imatge",
                                                    "Mostrar album",
                                                    "Eliminar imatge",
                                                    "Visualitzar album",
                                                    "Modificar dades",
                                                    "Visualitzar imatge",
                                                    "Menu anterior"};
    static private String[] descGestioAlbums={      "Afegir album",
                                                    "Mostrar albums",
                                                    "Eliminar album",
                                                    "Gestionar album",
                                                    "Menu anterior"};
    static private String[] descGestioRepro={       "Incrementar velocitat",
                                                    "Decrementar velocitat",
                                                    "Pausar/Activar",
                                                    "Aturar"};
    static private String[] descGestioModDataAlb={  "Titol de l'album",
                                                    "Portada de l'album",
                                                    "Posicio GPS",
                                                    "Tamany maxim de l'album"};
    /**
     * Constructor
     * Inicialitza el controlador
     */
    public VisorUB3(){
        // Creem l'objecte per al menu. Li passem com a primer parametre el nom del menu
    	this.controlador=new CtrlVisor();
    }
    /**
     * Metode principal.
     * Crea el menu principal i ens permet gestionar-lo.
     * @param args the command line arguments
     
    public static void main(String[] args) {
        // Creem un objecte per llegir des del teclat

        // Creem un objecte principal
        VisorUB3 repro=new VisorUB3();
        
        // Iniciem la gestio del menu principal de l'aplicacio
        repro.gestioVisorUB3();
    }
    **/
   
    
    /**
     * Metode de gestio del visor UB.
     * Inicialitza un scanner
     * Ens permet escollir entre les opcions del menu.
     * Cada cop que escollim una opcio, aquesta classe
     * crida el metode corresponent per executar-la.
     * @param Scanner
     */
    private void gestioVisorUB3(){
        this.menuPrinc=new Menu<VisorUB3.OpcionsMenuVisorUB3>("VISOR UB", VisorUB3.OpcionsMenuVisorUB3.values());
        // Assignem la descripcio de les opcions
        this.menuPrinc.setDescripcions(descMenuVisorUB);
        Scanner sc = new Scanner(System.in);
        VisorUB3.OpcionsMenuVisorUB3 opcio =null;
        
        do {
            // Mostrem les opcions del menu
            this.menuPrinc.mostrarMenu();
            // Demanem una opcio
            opcio=this.menuPrinc.getOpcio(sc);
            // Fem les accions necessaries
            switch(opcio){
                case MENU_VISORUB_GESTIO_BIBLIOTECA:
                    gestioMenuBiblio(sc);
                    break;
                case MENU_VISORUB_GESTIO_ALBUMS:
                    gestioMenuAlbums(sc);
                    break;
                case MENU_VISORUB_GUARDAR_DADES:
                    saveData(sc);
                    break;
                case MENU_VISORUB_RECUPERAR_DADES:
                    retrData(sc);
                    break;
                case MENU_VISORUB_SORTIR:
                    clear();
                    break;
                default:opcio=null;
            }
        }while(opcio!=VisorUB3.OpcionsMenuVisorUB3.MENU_VISORUB_SORTIR);
        
    }
    /**
     * Metode que crea un menu per gestionar la biblioteca d'imatges
     * @param Scanner
     */
    private void gestioMenuBiblio(Scanner sc){
    	this.menBiblio=new Menu<VisorUB3.OpcionsGestioBiblio>("BIBLIOTECA", VisorUB3.OpcionsGestioBiblio.values());
        // Assignem la descripció de les opcions
        this.menBiblio.setDescripcions(descGestioBiblio);
        VisorUB3.OpcionsGestioBiblio opcio=null;
        do{
            this.menBiblio.mostrarMenu();
            opcio= this.menBiblio.getOpcio(sc);
            switch(opcio){
                case BIBLIO_AFEGIR_IMATGE:
                    addImgBibl(sc);
                    break;
                case BIBLIO_MOSTRAR:
                    showBibl();
                    break;
                case BIBLIO_ELIMINAR_IMATGE:
                    removeImage(sc);
                    break;
                case BIBLIO_VISUALITZAR_BIBLIOTECA:
                    visualitzar(sc,this.controlador.getBibl());
                    break;
                case BIBLIO_VISUALITZAR_IMATGE:
                    showImage(sc);
                    break;
                case BIBLIO_MENU_ANTERIOR:
                    break;
                default: opcio=null;
            }
            
        }while(opcio!=VisorUB3.OpcionsGestioBiblio.BIBLIO_MENU_ANTERIOR);
        
    }
    /**
     * Metode que crea un menu per gestionar un album
     * @param Scanner
     */
    private void gestioMenuAlbum(Scanner sc, int idxAlb){
        if(idxAlb!=-1){
            this.menAlbum=new Menu<VisorUB3.OpcionsGestioAlbum>("Album", VisorUB3.OpcionsGestioAlbum.values());
            // Assignem la descripció de les opcions
            this.menAlbum.setDescripcions(descGestioAlbum);
            VisorUB3.OpcionsGestioAlbum opcio=null;
            do{

                this.menAlbum.mostrarMenu();
                opcio=this.menAlbum.getOpcio(sc);
                switch(opcio){
                    case ALBUM_AFEGIR_IMATGE:
                        addImgAlb(sc,idxAlb);
                        break;
                    case ALBUM_MOSTRAR:
                        showAlb(idxAlb);
                        break;
                    case ALBUM_ELIMINAR_IMATGE:
                        removeImage(sc,idxAlb);
                        break;
                    case ALBUM_VISUALITZAR_ALBUM:
                        visualitzar(sc,this.controlador.getAlb(idxAlb));
                        break;
                    case ALBUM_MODIFICAR_DADES:
                        modifyData(sc,idxAlb);
                        break;
                    case ALBUM_VISUALITZAR_IMATGE:
                        showImage(sc,idxAlb);
                        break;
                    case ALBUM_MENU_ANTERIOR:
                        break;
                    default: opcio=null;

                }
            }while(opcio!=VisorUB3.OpcionsGestioAlbum.ALBUM_MENU_ANTERIOR);
        }
    }
    /**
     * Metode que crea un menu per gestionar els albums
     * @param Scanner
     */
    private void gestioMenuAlbums(Scanner sc){
    	this.menAlbums=new Menu<VisorUB3.OpcionsGestioAlbums>("Albums", VisorUB3.OpcionsGestioAlbums.values());
        // Assignem la descripció de les opcions
        this.menAlbums.setDescripcions(descGestioAlbums);
        VisorUB3.OpcionsGestioAlbums opcio=null;
        do{
            this.menAlbums.mostrarMenu();
            opcio=this.menAlbums.getOpcio(sc);
            switch(opcio){
                case ALBUMS_AFEGIR_ALBUM:
                    addAlbum(sc);
                    break;
                case ALBUMS_MOSTRAR_ALBUMS:
                    showAlbums();
                    break;
                case ALBUMS_ELIMINAR_ALBUM:
                    removeAlbum(sc);
                    break;
                case ALBUMS_GESTIONAR_ALBUM:
                    gestioMenuAlbum(sc,chooseAlbum(sc));
                    break;
                case ALBUMS_MENU_ANTERIOR:
                    break;
                default: opcio=null;
                   
            }
        }while(opcio!=VisorUB3.OpcionsGestioAlbums.ALBUMS_MENU_ANTERIOR);
        
    }
    /**
     * Metode per crear una imatge
     * @param Scanner
     * @return Imatge
     */
    private Imatge createImg(Scanner sc){
        System.out.println("Digueu la ruta on es troba la imatge");
        return new Imatge(sc.nextLine());
    }
    /**
     * Metode per afegir una imatge a la biblioteca
     * @param Scanner
     */
    private void addImgBibl(Scanner sc){
        try {
            this.controlador.addImage(createImg(sc));
        } catch (ExcepcioImatgeRepetida ex) {
            System.err.println(ex);
        } catch (ExcepcioImatgeNoExisteix ex) {
            System.err.println(ex);
        }
    }
    /**
     * Metode per afegir una imatge a l'album actual
     * @param Scanner
     */
    private void addImgAlb(Scanner sc,int idxAlb){
    	if(this.controlador.isFull(idxAlb)){
    		System.out.println("L'album esta complet, canvia el seu tamany maxim!");
    	}else{
                showBibl();
                if(!this.controlador.isEmpty()){
                    try {
                        System.out.println("Quin index d'imatge vols afegir?");
                        this.controlador.addImage(this.controlador.getImage(sc.nextInt()-1), idxAlb);
                    } catch (ExcepcioImatgeNoExisteix ex) {
                        Logger.getLogger(VisorUB3.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ExcepcioImatgeRepetida ex) {
                        Logger.getLogger(VisorUB3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
    	}
        
    }
    /**
     * Serveix per mostrar els albums per titol
     */
    private void showAlbums(){
        if(this.controlador.emptyAlbs()){
            System.out.println("No hi ha albums");
        }else{
            System.out.println(this.controlador.getAlbsString());
        }
    }
    /**
     * Metode per mostrar per pantalla les dades de la biblioteca
     */
    private void showBibl(){
    	if (this.controlador.isEmpty()){
    		System.out.println("Biblioteca buida");
    	}else{
    		System.out.println(this.controlador.getBiblString());
    	}
        
    }
    /**
     * Metode per mostrar per pantalla les dades de l'album actual
     */
    private void showAlb(int idxAlb){
    	if (this.controlador.isEmpty(idxAlb)){
    		 System.out.println("Album buit");
    	}else {
    		System.out.println(this.controlador.getAlb(idxAlb).toString());
    	}
    	
    }
    /**
     * Metode per eliminar una imatge de la biblioteca
     * @param Scanner
     */
    private void removeImage(Scanner sc){
        showBibl();
        if(!this.controlador.isEmpty()){
            System.out.println("Quin index d'imatge vols eliminar?");
            this.controlador.removeImage(this.controlador.getImage(sc.nextInt()-1));
        }
    }
    /**
     * Metode per eliminar una imatge de l'album actual
     * @param Scanner
     */
    private void removeImage(Scanner sc,int idxAlb){
        
        if(this.controlador.isEmpty(idxAlb)){
            System.out.println("Album buit");
        }else{
            showAlb(idxAlb);
            System.out.println("Quin index d'imatge vols eliminar?");
            this.controlador.removeImage(this.controlador.getImage(idxAlb, sc.nextInt()-1), idxAlb);
        }
    }
    /**
     * Metode per visualitzar una llista d'imatges
     * @param Scanner
     * @param LlistaImatges 
     */
    private void visualitzar(Scanner sc,LlistaImatges list){
        int opc;
        System.out.println("Escull tipus de visualització:\n1.Sequencial\n2.Aleatoria");
        opc=sc.nextInt();
        if (opc==1||opc==2){
            try {
                this.controlador.setTipusReproduccio(opc==1);
                this.controlador.play(list);
            } catch (VisorException ex) {
                Logger.getLogger(VisorUB3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("No es una opcio correcta..");
        }
        menuReprod(sc);
    }
    /**
     * Metode que crea un menu per gestionar la reproduccio
     * @param Scanner 
     */
    private void menuReprod(Scanner sc){
        this.menReprod=new Menu<VisorUB3.OpcionsMenuReprod>("Albums", VisorUB3.OpcionsMenuReprod.values());
        // Assignem la descripció de les opcions
        this.menReprod.setDescripcions(descGestioRepro);
        VisorUB3.OpcionsMenuReprod opcio=null;
        do{
            try {
                this.menReprod.mostrarMenu();
                opcio=this.menReprod.getOpcio(sc);
                if(!this.controlador.getDialogStatus()){
                    System.out.println("S'ha acabat la reproduccio. L'opcio triada ha sigut ignorada.");
                }else{
                    switch(opcio){
                        case REPROD_INCREMENTAR_VELOCITAT:
                            this.controlador.changeSpeed(true);
                            System.out.println("Decrementem la velocitat de reproduccio en en 0,25 segons");
                            System.out.println("Es reprodueix una imatga cada "+(this.controlador.getPlayFrequency()/1000));
                            break;
                        case REPROD_DECREMENTAR_VELOCITAT:
                            this.controlador.changeSpeed(false);
                            System.out.println("Decrementem la velocitat de reproduccio en en 0,25 segons");
                            System.out.println("Es reprodueix una imatga cada "+(this.controlador.getPlayFrequency()/1000));
                            break;
                        case REPROD_PAUSAR_ACTIVAR:
                            this.controlador.changeReprodStatus();
                            System.out.println(this.controlador.getReprodStatus());
                            break;
                        case REPROD_ATURAR:
                            this.controlador.stopReprod();
                            System.out.println("Reproduccio aturada!");
                            break;
                        default:
                            opcio=null;
                            break;
                    }
                }
            } catch (VisorException ex) {
                Logger.getLogger(VisorUB3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }while(this.controlador.getDialogStatus());
    }
    /**
     * Metode per mostrar una imatge de la biblioteca
     * @param Scanner
     */
    private void showImage(Scanner sc){
    	
    	if (!this.controlador.isEmpty()){
                showBibl();
	        System.out.println("Escolliu l'index d'imatge que voleu");
	        int numImg=sc.nextInt()-1;
	        try {
	            this.controlador.showImg(this.controlador.getImage(numImg));
	        } catch (IOException ex) {
	        	System.err.println("Error de I/O \n"+ex);
	        } catch (Exception ex) {
	        	System.err.println("Error \n"+ex);
	        }
    	}
    }
    /**
     * Metode per mostrar una imatge de l'album
     * @param Scanner
     */
    private void showImage(Scanner sc,int idxAlb){
    	showAlb(idxAlb);
    	if (!this.controlador.isEmpty(idxAlb)){
	        System.out.println("Escolliu l'index de la imatge que voleu");
	        try {
	            this.controlador.showImg((Imatge)this.controlador.getAlb(idxAlb).getAt(sc.nextInt()-1));
	        } catch (IOException ex) {
	        	System.err.println("Error de I/O \n"+ex);
	        } catch (Exception ex) {
	        	System.err.println("Error \n"+ex);
	        }
    	}
    }  
    /**
     * Metode per modificar les dades de l'album actual
     * @param Scanner
     */
    private void modifyData(Scanner sc,int idxAlb){
    	this.menModDataAlb= new Menu<VisorUB3.OpcionsModDataAlb>("Albums", VisorUB3.OpcionsModDataAlb.values());
    	this.menModDataAlb.setDescripcions(descGestioModDataAlb);
        VisorUB3.OpcionsModDataAlb opcio=null;
        do{
            this.menModDataAlb.mostrarMenu();
            System.out.println("Quines dades voleu modificar?");
            opcio=this.menModDataAlb.getOpcio(sc);
            switch(opcio){
                case MOD_DATA_TITOL:
                    System.out.println("Digueu el titol de l'album:");
                    this.controlador.setTitle(idxAlb, sc.next());
                    break;
                case MOD_DATA_PORTADA:
                    if(this.controlador.isEmpty(idxAlb)){
                        System.out.println("L'album esta buit");
                    }else{
                        showAlb(idxAlb);
                        System.out.println("Index de l'imatge que voleu de portada:");
                        this.controlador.setPortada(idxAlb, this.controlador.getImage(idxAlb,sc.nextInt()-1));
                    }
                    break;
                case MOD_DATA_GPS:
                    double[] long_lat=new double[2];
                    System.out.println("Longitud GPS:");
                    long_lat[0]=sc.nextDouble();
                    System.out.println("Latitud GPS:");
                    long_lat[1]=sc.nextDouble();
                    this.controlador.setLongLat(idxAlb, long_lat);
                    break;
                case MOD_DATA_TAMANY:
                    System.out.println("Digues quin vols que sigui el maxim tamany:");
                    this.controlador.setTamany(idxAlb, sc.nextInt());
                    break;
                default:
                    opcio=null;
                    break;
            }
        }while(opcio==null);	
    }
    /**
     * Serveix per afegir un album a la llista d'albums
     * @param Scanner
     */
    private void addAlbum(Scanner sc){
        System.out.println("Nom de l'album:");
        String titol=sc.next();
        if(controlador.contains(titol)){
            System.out.println("Aquest titol d'album ja existeix");
        }else{
            double[] posGPS=new double[2];
            System.out.println("Longitud GPS:");
            posGPS[0]=sc.nextDouble();
            System.out.println("Latitud GPS:");
            posGPS[1]=sc.nextDouble();
            this.controlador.addAlb(titol,posGPS);
        }
    }
    
    /**
     * Serveix per eliminar un album
     * @param Scanner 
     */
    private void removeAlbum(Scanner sc){
        
        if(this.controlador.emptyAlbs()){
            System.out.println("No hi ha albums");
        }else{
            showAlbums();
            System.out.println("Escolliu l'index de l'album que voleu eliminar");
            this.controlador.removeAlbum(sc.nextInt()-1);
        }
    }
    /**
     * Serveix per escollir un album a partir de l'index
     * @param Scanner
     * @return idxAlbum
     */
    private int chooseAlbum(Scanner sc){
        
        if(this.controlador.emptyAlbs()){
            System.out.println("No hi ha albums");
            return -1;
        }else{
            showAlbums();
            System.out.println("Escolliu l'index de l'album que voleu");
            return sc.nextInt()-1;
        }
           
    }
    
    /**
     * Metode per guardar les dades introduint la ruta completa.
     * Crea o sobreescriu un arxiu que conte les dades de la llista.
     * exemple de input: "K:\Sample Pictures\Dades.dat"
     * @param Scanner
     */
    private void saveData(Scanner sc){
        String ubicacio;
        System.out.println("Ubicacio de la llista");
        ubicacio=sc.nextLine();
        try{
            this.controlador.saveDades(ubicacio);
            System.out.println("El fitxer situat a "+ubicacio+" se sobreescriura");
            System.out.println("Llista guardada!");
        }catch(FileNotFoundException ex){
            System.err.println("No s'ha trobat el fitxer, es creara un de nou");
                try {
                        this.controlador.saveNewDades(ubicacio);
                } catch (IOException ex1) {
                        System.err.println("Error de I/O \n"+ex1);
                }
                System.out.println("Llista guardada!");
        }catch (IOException ex) {
            System.err.println("Error de I/O \n"+ex);
        }

    }
    /**
     * Metode per recuperar dades introduint la ruta completa
     * exemple de input: "K:\Sample Pictures\Dades.dat"
     * @param Scanner
     */
    private void retrData(Scanner sc){
        
        String ubicacio;
        System.out.println("Ubicacio de la llista");
        ubicacio=sc.nextLine();
        try{
            this.controlador.retrDades(ubicacio);
            System.out.println("Llista recuperada!");
        }catch (FileNotFoundException ex) {
            System.err.println("Error, No s'ha trobat l'arxiu \n"+ex);
        }catch (ClassNotFoundException ex) {
            System.err.println("Error No s'ha trobat la classe \n"+ex);
        } catch (IOException ex) {
            System.err.println("Error de I/O \n"+ex);
        }
       
        
    }
    /**
     * Metode per fer un clear de les dades
     */
    private void clear(){
        this.controlador.clearDades();
    }
}