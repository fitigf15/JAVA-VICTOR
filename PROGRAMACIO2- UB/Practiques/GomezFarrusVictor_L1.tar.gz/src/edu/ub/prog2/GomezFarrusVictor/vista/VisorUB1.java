package edu.ub.prog2.GomezFarrusVictor.vista;

import edu.ub.prog2.GomezFarrusVictor.model.Imatge;
import edu.ub.prog2.GomezFarrusVictor.model.LlistaImatges;
import edu.ub.prog2.GomezFarrusVictor.model.TaulaImatges;
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
public class VisorUB1 {
    //Atributs de VisorUB1
    private Menu<OpcionsMenuVisorUB1> menu;
    private ImageList imageList;
    // Declarem les opcions per a referir-se a les opcions del menú.
    static private enum OpcionsMenuVisorUB1 {   MENU_VISORUB_AFEGIR_FITXER,
                                                MENU_VISORUB_MOSTRAR_LLISTA,
                                                MENU_VISORUB_ELIMINAR_IMATGE,
                                                MENU_VISORUB_GUARDAR_LLISTA,
                                                MENU_VISORUB_RECUPERAR_LLISTA,
                                                MENU_VISORUB_SORTIR};
    
    //Declarem descripcions personalitzades per a les opcions del menú de VisorUB
    
    private static String[] descMenuVisorUB={ "Afegir fitxer",
                                              "Mostrar llista",
                                              "Eliminar imatge",
                                              "Guardar llista",
                                              "Recuperar llista",
                                              "Sortir" };
    /**
     * Constructor
     * Inicialitza un menú, li assigna descripcions i
     * Ens fa escollir entre:
     * -Mode taula: fet amb Arrays
     * -Mode llista: fet amb ArrayList de Java
     * Ambdós modes són compatibles.
     */
    public VisorUB1(Scanner sc){
        // Creem l'objecte per al menú. Li passem com a primer paràmetre el nom del menú
        this.menu=new Menu<OpcionsMenuVisorUB1>("VISOR UB", OpcionsMenuVisorUB1.values());
        // Assignem la descripció de les opcions
        this.menu.setDescripcions(descMenuVisorUB);
        int opc = -1;
        do{
            System.out.println("Escull 1.taula o 2.llista");
            opc=sc.nextInt();
            if(opc==1){
                this.imageList=new TaulaImatges();
            }else if(opc==2){
                this.imageList=new LlistaImatges();
            }
        }while(opc==-1);
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
        VisorUB1 repro=new VisorUB1(sc);
        
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
        
        
        OpcionsMenuVisorUB1 opcio =null;
        
        do {
            // Mostrem les opcions del menú
            this.menu.mostrarMenu();
            // Demanem una opcio
            opcio=this.menu.getOpcio(sc);
            // Fem les accions necessàries
            switch(opcio){
                case MENU_VISORUB_AFEGIR_FITXER:
                    addImg(sc);
                    break;
                case MENU_VISORUB_MOSTRAR_LLISTA:
                    showList();
                    break;
                case MENU_VISORUB_ELIMINAR_IMATGE:
                    deleteImg(sc);
                    break;
                case MENU_VISORUB_GUARDAR_LLISTA:
                    saveList(sc);
                    break;
                case MENU_VISORUB_RECUPERAR_LLISTA:
                    retrList(sc);
                    break;
                case MENU_VISORUB_SORTIR:
                    clear();
                    break;
                default:opcio=null;
            }
        }while(opcio!=OpcionsMenuVisorUB1.MENU_VISORUB_SORTIR);

        
    }
    /**
     * Mètode per afegir una imatge a la llista introduint
     * la seva ruta completa.
     * exemple de input: "K:\Sample Pictures\Koala.jpg"
     * @param Scanner
     */
    private void addImg(Scanner sc){
        Imatge img=new Imatge(sc);
        imageList.addImage(img);
    }
    /**
     * Mètode per mostrar la nostra llista actual
     */
    private void showList(){
        System.out.println("Llista:");
        for(int i=0;i<this.imageList.getSize();i++){
            System.out.println(this.imageList.getAt(i).getFullPath());
        }
    }
    /**
     * Mètode per eliminar una imatge de la llista introduint
     * la seva ruta completa.
     * exemple de input: "K:\Sample Pictures\Koala.jpg"
     * @param Scanner 
     */
    private void deleteImg(Scanner sc){
        Imatge img=new Imatge(sc);
        this.imageList.removeImage(img);
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