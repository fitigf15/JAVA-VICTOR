package edu.ub.prog2.GomezFarrusVictor.vista;

import edu.ub.prog2.GomezFarrusVictor.controlador.CtrlVisor;
import edu.ub.prog2.GomezFarrusVictor.model.Imatge;
import edu.ub.prog2.utils.ImageList;
import edu.ub.prog2.utils.Menu;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * @author Victor Gomez Farrus @UB
 * @version 1.0
 */
public class VisorUB2 {
    //Atributs de VisorUB1
    private CtrlVisor controlador;
    private Menu<VisorUB2.OpcionsMenuVisorUB2> menuPrinc;
    private Menu<VisorUB2.OpcionsGestioAlbum> menAlbum;
    private Menu<VisorUB2.OpcionsGestioBiblio> menBiblio;
    // Declarem les opcions per a referir-se a les opcions del menú.
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
    /**
     * Constructor
     * Inicialitza un menú, li assigna descripcions i
     * Ens fa escollir entre:
     * -Mode taula: fet amb Arrays
     * -Mode llista: fet amb ArrayList de Java
     * Ambdós modes són compatibles.
     */
    public VisorUB2(Scanner sc){
        // Creem l'objecte per al menú. Li passem com a primer paràmetre el nom del menú
        this.menuPrinc=new Menu<VisorUB2.OpcionsMenuVisorUB2>("VISOR UB", VisorUB2.OpcionsMenuVisorUB2.values());
        // Assignem la descripció de les opcions
        this.menuPrinc.setDescripcions(descMenuVisorUB);
    }
    /**
     * Mètode principal.
     * Crea el menú principal i ens permet gestionar-lo.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creem un objecte per llegir des del teclat
        Scanner sc=new Scanner(System.in);

        // Creem un objecte principal
        VisorUB2 repro=new VisorUB2(sc);
        
        // Iniciem la gestió del menú principal de l'aplicació
        repro.gestioVisorUB(sc);

        
    }
    
    /**
     * Mètode de gestió del visor UB.
     * Ens permet escollir entre les opcions del menú.
     * Cada cop que escollim una opció, aquesta classe
     * crida el mètode corresponent per executar-la.
     * @param Scanner
     */
    private void gestioVisorUB(Scanner sc){
        
        
        VisorUB2.OpcionsMenuVisorUB2 opcio =null;
        
        do {
            // Mostrem les opcions del menú
            this.menuPrinc.mostrarMenu();
            // Demanem una opcio
            opcio=this.menuPrinc.getOpcio(sc);
            // Fem les accions necessàries
            switch(opcio){
                case MENU_VISORUB_GESTIO_BIBLIOTECA:
                    gestioMenuBiblio(sc);
                    break;
                case MENU_VISORUB_GESTIO_ALBUMS:
                    gestioMenuAlbum(sc);
                    break;
                case MENU_VISORUB_GUARDAR_DADES:
                    //Mostrar llista i eliminar per posicio no per imatge
                    saveList(sc);
                    break;
                case MENU_VISORUB_RECUPERAR_DADES:
                    retrList(sc);
                    break;
                case MENU_VISORUB_SORTIR:
                    clear();
                    break;
                default:opcio=null;
            }
        }while(opcio!=VisorUB2.OpcionsMenuVisorUB2.MENU_VISORUB_SORTIR);

        
    }
    private void gestioMenuBiblio(Scanner sc){
        VisorUB2.OpcionsGestioBiblio opcio=null;
        do{
            this.menBiblio.mostrarMenu();
            opcio= this.menBiblio.getOpcio(sc);
            switch(opcio){
                case BIBLIO_AFEGIR_IMATGE:
                    break;
                case BIBLIO_MOSTRAR:
                    break;
                case BIBLIO_ELIMINAR_IMATGE:
                    break;
                case BIBLIO_VISUALITZAR_IMATGE:
                    break;
                case BIBLIO_MENU_ANTERIOR:
                    break;
                default: opcio=null;
            }
            
        }while(opcio!=VisorUB2.OpcionsGestioBiblio.BIBLIO_MENU_ANTERIOR);
        
    }
    private void gestioMenuAlbum(Scanner sc){
        VisorUB2.OpcionsGestioAlbum opcio=null;
        do{
            this.menAlbum.mostrarMenu();
            opcio=this.menAlbum.getOpcio(sc);
            switch(opcio){
                case ALBUM_AFEGIR_IMATGE:
                    break;
                case ALBUM_MOSTRAR:
                    break;
                case ALBUM_ELIMINAR_IMATGE:
                    break;
                case ALBUM_MODIFICAR_DADES:
                    break;
                case ALBUM_VISUALITZAR_IMATGE:
                    break;
                case ALBUM_MENU_ANTERIOR:
                    break;
                default: opcio=null;
                   
            }
        }while(opcio!=VisorUB2.OpcionsGestioAlbum.ALBUM_MENU_ANTERIOR);
        
    }
    
    private Imatge createImg(Scanner sc){
        System.out.println("Digueu la ruta on es troba la imatge");
        String filepath=sc.nextLine();
        return new Imatge(filepath);
    }
    /**
     * Mètode per afegir una imatge a la llista introduint
     * la seva ruta completa.
     * exemple de input: "K:\Sample Pictures\Koala.jpg"
     * @param Scanner
     */
    private void addImg(Scanner sc){
        imageList.addImage(createImg(sc));
    }
    /**
     * Mètode per mostrar la nostra llista actual
     */
    private void showList(){
        System.out.println("Llista:");
        for(int i=0;i<this.imageList.getSize();i++){
            System.out.println("["+i+"].-"+this.imageList.getAt(i).getFullPath());
        }
    }
    /**
     * Mètode per eliminar una imatge de la llista introduint
     * la seva ruta completa.
     * exemple de input: "K:\Sample Pictures\Koala.jpg"
     * @param Scanner 
     */
    private void deleteImg(Scanner sc){
        showList();
        System.out.println("En quina posicio de la llista es troba la imatge?");
        int posicio=sc.nextInt();
        this.imageList.removeImage(this.imageList.getAt(posicio));
    }
    /**
     * Mètode per guardar una llista introduint la ruta completa.
     * Crea o sobreescriu un arxiu que conté les dades de la llista.
     * exemple de input: "K:\Sample Pictures\Dades.dat"
     * @param Scanner
     */
    private void saveList(Scanner sc){
        String ubicacio;
        System.out.println("Ubicacio de la llista");
        ubicacio=sc.nextLine();
        FileInputStream fis=null;           //Per saber si existeix el fitxer
        FileOutputStream fos= null; 
        ObjectOutputStream oos= null;
        try{
            fis= new FileInputStream(ubicacio);
            System.out.println("El fitxer situat a "+ubicacio+" se sobreescriurà");
            fos= new FileOutputStream(ubicacio);
            oos=new ObjectOutputStream(fos);
            oos.writeObject(this.imageList);
            
        }catch(FileNotFoundException ex){
            System.err.println("No s'ha trobat el fitxer, es crearà un de nou");
            try {
                File fitxer= new File(ubicacio);
                fos=new FileOutputStream(fitxer);
                oos=new ObjectOutputStream(fos);
                oos.writeObject(this.imageList);
            } catch (IOException ex1) {
                System.err.println("Error de I/O \n"+ex1);
            }
        }catch (IOException ex) {
            System.err.println("Error de I/O \n"+ex);
        }finally{
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException ex) {
                    System.err.println("Error de I/O \n"+ex);
                }
            }
            if(oos!=null){
                try {
                    oos.close();
                    fos.close();
                    System.out.println("Llista guardada!");
                } catch (IOException ex) {
                    System.err.println("Error de I/O \n"+ex);
                }
            }

         }  

    }
    /**
     * Mètode per recuperar una llista introduint la ruta completa
     * exemple de input: "K:\Sample Pictures\Dades.dat"
     * @param Scanner
     */
    private void retrList(Scanner sc){
        
        String ubicacio;
        System.out.println("Ubicacio de la llista");
        ubicacio=sc.nextLine();
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try{
            
            fis=new FileInputStream(ubicacio);
            ois=new ObjectInputStream(fis);
            clear();
            this.imageList = (ImageList)ois.readObject();
            
            

        }catch (FileNotFoundException ex) {
            System.err.println("Error, No s'ha trobat l'arxiu \n"+ex);
        }catch (ClassNotFoundException ex) {
            System.err.println("Error No s'ha trobat la classe \n"+ex);
        } catch (IOException ex) {
            System.err.println("Error de I/O \n"+ex);
        }finally{
            if(ois!=null){
                try {
                    ois.close();
                    fis.close();
                    System.out.println("Llista recuperada!");
                } catch (IOException ex) {
                    System.err.println("Error de I/O \n"+ex);
                }
            } 
            
        }
       
        
    }
    /**
     * Mètode per posar a null una llista
     */
    private void clear(){
        imageList=null;
    }
}