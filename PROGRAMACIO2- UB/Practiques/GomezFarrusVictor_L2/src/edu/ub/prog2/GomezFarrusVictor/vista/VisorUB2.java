package edu.ub.prog2.GomezFarrusVictor.vista;

import edu.ub.prog2.GomezFarrusVictor.controlador.CtrlVisor;
import edu.ub.prog2.GomezFarrusVictor.model.Imatge;
import edu.ub.prog2.utils.Menu;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Classe principal que gestiona un menu principal i submenus
 * @author Victor Gomez Farrus @UB
 * @version 2.0
 */
public class VisorUB2 {
    //Atributs de VisorUB2
    private CtrlVisor controlador;
    private Menu<VisorUB2.OpcionsMenuVisorUB2> menuPrinc;
    private Menu<VisorUB2.OpcionsGestioBiblio> menBiblio;
    private Menu<VisorUB2.OpcionsGestioAlbum> menAlbum;
    private Menu<VisorUB2.OpcionsGestioAlbums> menAlbums;

    // Declarem les opcions per a referir-se a les opcions del menu.
    static private enum OpcionsMenuVisorUB2 {   MENU_VISORUB_GESTIO_BIBLIOTECA,
                                                MENU_VISORUB_GESTIO_ALBUMS,
                                                MENU_VISORUB_GUARDAR_DADES,
                                                MENU_VISORUB_RECUPERAR_DADES,
                                                MENU_VISORUB_SORTIR;
    }
   
    static private enum OpcionsGestioBiblio{    BIBLIO_AFEGIR_IMATGE,
                                                BIBLIO_MOSTRAR,
                                                BIBLIO_ELIMINAR_IMATGE,
                                                BIBLIO_VISUALITZAR_IMATGE,
                                                BIBLIO_MENU_ANTERIOR;
    }
    
    static private enum OpcionsGestioAlbum{     ALBUM_AFEGIR_IMATGE,
                                                ALBUM_MOSTRAR,
                                                ALBUM_ELIMINAR_IMATGE,
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
    
    //Declarem descripcions personalitzades per a les opcions del menú de VisorUB
    
    static private String[] descMenuVisorUB={ "Gestio de la biblioteca",
                                              "Gestio dels albums",
                                              "Guardar dades",
                                              "Recuperar dades",
                                              "Sortir" };
    
    static private String[] descGestioBiblio={  "Afegir imatge",
                                                "Mostrar biblioteca",
                                                "Eliminar imatge",
                                                "Visualitzar imatge",
                                                "Menu anterior"};
    
    static private String[] descGestioAlbum={   "Afegir imatge",
                                                "Mostrar album",
                                                "Eliminar imatge",
                                                "Modificar dades",
                                                "Visualitzar imatge",
                                                "Menu anterior"};
    static private String[] descGestioAlbums={  "Afegir album",
                                                "Mostrar albums",
                                                "Eliminar album",
                                                "Gestionar album",
                                                "Menu anterior"};
    /**
     * Constructor
     * Inicialitza el controlador
     */
    public VisorUB2(){
        // Creem l'objecte per al menu. Li passem com a primer parametre el nom del menu
    	this.controlador=new CtrlVisor();
    }
    /**
     * Metode principal.
     * Crea el menu principal i ens permet gestionar-lo.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creem un objecte per llegir des del teclat

        // Creem un objecte principal
        VisorUB2 repro=new VisorUB2();
        
        // Iniciem la gestio del menu principal de l'aplicacio
        repro.gestioVisorUB();
    }
   
    
    /**
     * Metode de gestio del visor UB.
     * Inicialitza un scanner
     * Ens permet escollir entre les opcions del menu.
     * Cada cop que escollim una opcio, aquesta classe
     * crida el metode corresponent per executar-la.
     * @param Scanner
     */
    private void gestioVisorUB(){
        this.menuPrinc=new Menu<VisorUB2.OpcionsMenuVisorUB2>("VISOR UB", VisorUB2.OpcionsMenuVisorUB2.values());
        // Assignem la descripcio de les opcions
        this.menuPrinc.setDescripcions(descMenuVisorUB);
        Scanner sc = new Scanner(System.in);
        VisorUB2.OpcionsMenuVisorUB2 opcio =null;
        
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
        }while(opcio!=VisorUB2.OpcionsMenuVisorUB2.MENU_VISORUB_SORTIR);

        
    }
    /**
     * Metode que crea un menu per gestionar la biblioteca d'imatges
     * @param Scanner
     */
    private void gestioMenuBiblio(Scanner sc){
    	this.menBiblio=new Menu<VisorUB2.OpcionsGestioBiblio>("BIBLIOTECA", VisorUB2.OpcionsGestioBiblio.values());
        // Assignem la descripció de les opcions
        this.menBiblio.setDescripcions(descGestioBiblio);
        VisorUB2.OpcionsGestioBiblio opcio=null;
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
                    delImgBibl(sc);
                    break;
                case BIBLIO_VISUALITZAR_IMATGE:
                    showImgBibl(sc);
                    break;
                case BIBLIO_MENU_ANTERIOR:
                    break;
                default: opcio=null;
            }
            
        }while(opcio!=VisorUB2.OpcionsGestioBiblio.BIBLIO_MENU_ANTERIOR);
        
    }
    /**
     * Metode que crea un menu per gestionar un album
     * @param Scanner
     */
    private void gestioMenuAlbum(Scanner sc, int idxAlb){
        if(idxAlb!=-1){
            this.menAlbum=new Menu<VisorUB2.OpcionsGestioAlbum>("Album", VisorUB2.OpcionsGestioAlbum.values());
            // Assignem la descripció de les opcions
            this.menAlbum.setDescripcions(descGestioAlbum);
            VisorUB2.OpcionsGestioAlbum opcio=null;
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
                        delImgAlb(sc,idxAlb);
                        break;
                    case ALBUM_MODIFICAR_DADES:
                        modDatAlb(sc,idxAlb);
                        break;
                    case ALBUM_VISUALITZAR_IMATGE:
                        showImgAlb(sc,idxAlb);
                        break;
                    case ALBUM_MENU_ANTERIOR:
                        break;
                    default: opcio=null;

                }
            }while(opcio!=VisorUB2.OpcionsGestioAlbum.ALBUM_MENU_ANTERIOR);
        }
    }
    /**
     * Metode que crea un menu per gestionar els albums
     * @param Scanner
     */
    private void gestioMenuAlbums(Scanner sc){
    	this.menAlbums=new Menu<VisorUB2.OpcionsGestioAlbums>("Albums", VisorUB2.OpcionsGestioAlbums.values());
        // Assignem la descripció de les opcions
        this.menAlbums.setDescripcions(descGestioAlbums);
        VisorUB2.OpcionsGestioAlbums opcio=null;
        do{
            this.menAlbums.mostrarMenu();
            opcio=this.menAlbums.getOpcio(sc);
            switch(opcio){
                case ALBUMS_AFEGIR_ALBUM:
                    addAlb(sc);
                    break;
                case ALBUMS_MOSTRAR_ALBUMS:
                    showAlbs();
                    break;
                case ALBUMS_ELIMINAR_ALBUM:
                    delAlb(sc);
                    break;
                case ALBUMS_GESTIONAR_ALBUM:
                    gestioMenuAlbum(sc,chooseAlb(sc));
                    break;
                case ALBUMS_MENU_ANTERIOR:
                    break;
                default: opcio=null;
                   
            }
        }while(opcio!=VisorUB2.OpcionsGestioAlbums.ALBUMS_MENU_ANTERIOR);
        
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
        this.controlador.addImgBibl(createImg(sc));
    }
    /**
     * Metode per afegir una imatge a l'album actual
     * @param Scanner
     */
    private void addImgAlb(Scanner sc,int idxAlb){
    	if(this.controlador.fullAlb(idxAlb)){
    		System.out.println("L'album esta complet, canvia el seu tamany maxim!");
    	}else{
                showBibl();
                if(!this.controlador.emptyBibl()){
                    System.out.println("Quin index d'imatge vols afegir?");
                    this.controlador.addImgAlb(this.controlador.getImgBibl(sc.nextInt()-1), idxAlb);
                }
    	}
        
    }
    /**
     * Metode per mostrar per pantalla les dades de la biblioteca
     */
    private void showBibl(){
    	if (this.controlador.emptyBibl()){
    		System.out.println("Biblioteca buida");
    	}else{
    		System.out.println(this.controlador.getBiblString());
    	}
        
    }
    /**
     * Metode per mostrar per pantalla les dades de l'album actual
     */
    private void showAlb(int idxAlb){
    	if (this.controlador.emptyAlb(idxAlb)){
    		 System.out.println("Album buit");
    	}else {
    		System.out.println(this.controlador.getAlb(idxAlb).toString());
    	}
    	
    }
    /**
     * Metode per eliminar una imatge de la biblioteca
     * @param Scanner
     */
    private void delImgBibl(Scanner sc){
        showBibl();
        if(!this.controlador.emptyBibl()){
            System.out.println("Quin index d'imatge vols eliminar?");
            this.controlador.delImgBibl(this.controlador.getImgBibl(sc.nextInt()-1));
        }
    }
    /**
     * Metode per eliminar una imatge de l'album actual
     * @param Scanner
     */
    private void delImgAlb(Scanner sc,int idxAlb){
        
        if(this.controlador.emptyAlb(idxAlb)){
            System.out.println("Album buit");
        }else{
            showAlb(idxAlb);
            System.out.println("Quin index d'imatge vols eliminar?");
            this.controlador.delImgAlb(this.controlador.getImgAlb(idxAlb, sc.nextInt()-1), idxAlb);
        }
    }
    /**
     * Metode per mostrar una imatge de la biblioteca
     * @param Scanner
     */
    private void showImgBibl(Scanner sc){
    	
    	if (!this.controlador.emptyBibl()){
                showBibl();
	        System.out.println("Escolliu l'index d'imatge que voleu");
	        int numImg=sc.nextInt()-1;
	        try {
	            this.controlador.showImg(this.controlador.getImgBibl(numImg));
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
    private void showImgAlb(Scanner sc,int idxAlb){
    	showAlb(idxAlb);
    	if (!this.controlador.emptyAlb(idxAlb)){
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
    private void modDatAlb(Scanner sc,int idxAlb){
        int opc = 0;
    	System.out.println("Quines dades voleu modificar?");
    	System.out.println("1. Titol de l'album");
    	System.out.println("2. Portada de l'album");
    	System.out.println("3. Posicio GPS");
    	System.out.println("4. Tamany maxim de l'album");
    	opc= sc.nextInt();
    	if(opc==1){
    		System.out.println("Digueu el titol de l'album:");
    		this.controlador.setTitleAlb(idxAlb, sc.next());
    	}
    	if(opc==2){
    		if(this.controlador.emptyAlb(idxAlb)){
    			System.out.println("L'album esta buit");
    		}else{
	    		showAlb(idxAlb);
	    		System.out.println("Index de l'imatge que voleu de portada:");
                        this.controlador.setPortadaAlb(idxAlb, this.controlador.getImgAlb(idxAlb,sc.nextInt()-1));
    		}
    	}
    	if(opc==3){
    		double[] long_lat=new double[2];
    		System.out.println("Longitud GPS:");
    		long_lat[0]=sc.nextDouble();
    		System.out.println("Latitud GPS:");
    		long_lat[1]=sc.nextDouble();
                this.controlador.setLongLatAlb(idxAlb, long_lat);
    	}
    	if(opc==4){
    		System.out.println("Digues quin vols que sigui el maxim tamany:");
                this.controlador.setTamanyAlb(idxAlb, sc.nextInt());
    	}
        	
    }
    /**
     * Serveix per afegir un album a la llista d'albums
     * @param Scanner
     */
    private void addAlb(Scanner sc){
        System.out.println("Nom de l'album:");
        String titol=sc.next();
        if(controlador.containsAlb(titol)){
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
     * Serveix per mostrar els albums per titol
     */
    private void showAlbs(){
        if(this.controlador.emptyAlbs()){
            System.out.println("No hi ha albums");
        }else{
            System.out.println(this.controlador.getAlbsString());
        }
    }
    /**
     * Serveix per eliminar un album
     * @param Scanner 
     */
    private void delAlb(Scanner sc){
        
        if(this.controlador.emptyAlbs()){
            System.out.println("No hi ha albums");
        }else{
            showAlbs();
            System.out.println("Escolliu l'index de l'album que voleu eliminar");
            this.controlador.delAlb(sc.nextInt()-1);
        }
    }
    /**
     * Serveix per escollir un index d'album
     * @param Scanner
     * @return idxAlbum
     */
    private int chooseAlb(Scanner sc){
        
        if(this.controlador.emptyAlbs()){
            System.out.println("No hi ha albums");
            return -1;
        }else{
            showAlbs();
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