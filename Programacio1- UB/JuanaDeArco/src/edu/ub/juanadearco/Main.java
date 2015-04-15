
package edu.ub.juanadearco;

import edu.ub.juanadearco.actors.Heroina;
import edu.ub.juanadearco.actors.Menjar;
import edu.ub.juanadearco.actors.Serp;
import edu.ub.juanadearco.actors.Vida;
import java.awt.Rectangle;

/**
 * Demo.
 * 
 * @author danieldelrio@ub.edu
 */
public class Main{

    private Joc joc;
    private Castell castell;
    private Heroina heroina;

    private static final int MAX_MENJAR_PER_HABITACIO = 0;
    private static final int MAX_VIDA_PER_HABITACIO = 250;
    private static final int MAX_SERPS_PER_HABITACIO = 0;
    
    private Main() {
        castell = new Castell(1, 3);
        castell.addHabitacio(0, 0, crearHabitacio0Planta0());
        castell.addHabitacio(0, 1, crearHabitacio1Planta0());
        castell.addHabitacio(0, 2, crearHabitacio2Planta0());                            
        
        heroina = new Heroina();
        Habitacio h = castell.getHabitacio(0, 0);
        int[] p = h.getPosicioCela(10, 10);
        heroina.setPosicioInicial(p[0], p[1]);
        
        joc = new Joc(castell, heroina);                            
        distribuirMenjar();
        distribuirVida();
        distribuirSerps();
        
        JuanaDeArco jda = new JuanaDeArco(joc);      
    }
    
        
    private Habitacio crearHabitacio0Planta0() {
        Habitacio h = Util.carregarHabitacio("hab0plant0.txt");
        
        Porta porta = h.getPorta(0, 5);
        porta.setNumPlantaDesti(0);
        porta.setNumHabitacioDesti(1);
        porta.setPosicioHabitacioDesti(h.getPosicioCela(14, 20));

        porta = h.getPorta(0, 20);
        porta.setNumPlantaDesti(0);
        porta.setNumHabitacioDesti(2);
        porta.setPosicioHabitacioDesti(h.getPosicioCela(14, 5));
        
        porta = h.getPorta(16,10);
        porta.setNumPlantaDesti(0);
        porta.setNumHabitacioDesti(0);
        porta.setPosicioHabitacioDesti(h.getPosicioCela(14, 10));

        return h;
    }
    
    private Habitacio crearHabitacio1Planta0() {
        Habitacio h = Util.carregarHabitacio("hab1plant0.txt");

        Porta porta = h.getPorta(16, 20);
        porta.setNumPlantaDesti(0);
        porta.setNumHabitacioDesti(0);
        porta.setPosicioHabitacioDesti(h.getPosicioCela(1,5));
        
        porta =h.getPorta(8,24);
        porta.setNumPlantaDesti(0);
        porta.setNumHabitacioDesti(2);
        porta.setPosicioHabitacioDesti(h.getPosicioCela(8,1));
       
        return h;
    }

    private Habitacio crearHabitacio2Planta0() {
        Habitacio h = Util.carregarHabitacio("hab2plant0.txt");
        Porta porta = h.getPorta(8,0);
        porta.setNumPlantaDesti(0);
        porta.setNumHabitacioDesti(1);
        porta.setPosicioHabitacioDesti(h.getPosicioCela(8, 23));
        
        porta=h.getPorta(16,5);
        porta.setNumPlantaDesti(0);
        porta.setNumHabitacioDesti(0);
        porta.setPosicioHabitacioDesti(h.getPosicioCela(1,20));
        
        return h;
    }
    
    private void distribuirMenjar() {
        String[] menjars = {  "Pizza", "Pollastre", "Síndria" } ;
        // { calories,x,y,width,height } de cada imatge
        int[][] dades = {
            { 25, 540, 14, 30, 22 },
            { 50, 439, 14, 27, 23 },
            { 50, 97, 100, 30, 20 }
        };
        
        for (int i = 0; i < castell.getNumPlantes(); i++) {
            
            for (int j = 0; j < castell.getNumHabitacions(i); j++) {
                Habitacio h = castell.getHabitacio(i, j);
                int numMenjars = (int)(Math.random() * (MAX_MENJAR_PER_HABITACIO + 1));
                
                for (int k = 0; k < numMenjars; k++) {
                    int[] cela = obtenirCelaLliure(h);
                    int imenjar = (int)(Math.random() * menjars.length);
                    Menjar m = new Menjar(menjars[imenjar], 
                            dades[imenjar][0], dades[imenjar][1], dades[imenjar][2], 
                            dades[imenjar][3], dades[imenjar][4]);
                    
                    int[] posicio = h.getPosicioCela(cela[0], cela[1]);
                    m.setPosicioInicial(posicio[0], posicio[1]);
                    h.addActor(m);                     
                }
            }
            
        }
    }
    
    private void distribuirVida() {       
        for (int i = 0; i < castell.getNumPlantes(); i++) {
            
            for (int j = 0; j < castell.getNumHabitacions(i); j++) {
                Habitacio h = castell.getHabitacio(i, j);
                int numVides = (int)(Math.random() * (MAX_VIDA_PER_HABITACIO + 1));
                
                for (int k = 0; k < numVides; k++) {
                    int[] cela = obtenirCelaLliure(h);
                    Vida v = new Vida();
                    
                    int[] posicio = h.getPosicioCela(cela[0], cela[1]);
                    v.setPosicioInicial(posicio[0], posicio[1]);
                    h.addActor(v);                     
                }
            }
            
        }
    }
     
    private void distribuirSerps() {
        
        for (int i = 0; i < castell.getNumPlantes(); i++) {
            
            for (int j = 0; j < castell.getNumHabitacions(i); j++) {
                Habitacio h = castell.getHabitacio(i, j);
                int numSerps = (int)(Math.random() * (MAX_SERPS_PER_HABITACIO + 1));            
                
                for (int k = 0; k < numSerps; k++) {
                    int[] cela = obtenirCelaLliure(h);
                    Serp s = new Serp();
                    int[] posicio = h.getPosicioCela(cela[0], cela[1]);
                    
                    boolean stopcelaparet=false;
                    boolean stopinicial=false;
                
                    while((!stopcelaparet)||(!stopinicial)){
                        cela = obtenirCelaLliure(h);
                        posicio = h.getPosicioCela(cela[0], cela[1]);
                        
                        stopcelaparet=(((cela[0]>=4)&&(cela[0]<=12))||((cela[1]>=4)&&(cela[1]<=22)));
                        stopinicial=((cela[0]!=10)&&(cela[1]!=10));
                        
                         
                    }
                   
                    s.setPosicioInicial(posicio[0], posicio[1]);
                    h.addActor(s);  
                    
                                      
                }
            }
            
        }
    }
   
    private int[] obtenirCelaLliure(Habitacio h) {
        int fila = 0;
        int col = 0;
        int cela[] = null;
        boolean trobada = false;
        boolean terra = false;
        
        while (!trobada) {            
            terra = false;
            while (!terra) {
                fila = (int)(Math.random() * Constants.NUM_CELES_VERTICALS);
                col = (int)(Math.random() * Constants.NUM_CELES_HORIZONTALS);
                terra = h.getValor(fila, col) == Constants.SIMBOL_TERRA;
            }
            
            // comprovar que cap actor està dins la cela
            Actor[] actors = h.getActorsAsArray();
            Porta[] portes = h.getPortesAsArray();
            

 
            int i = 0;
            boolean lliure=true;
            
            while (i < actors.length && (lliure)) {
                cela = h.getCela(actors[i].getPosicioInicial()[0], 
                        actors[i].getPosicioInicial()[1]);
                
                Rectangle limitactor=new Rectangle(cela[0],cela[1],32,32);
                System.out.println("Actor=["+limitactor.x+","+limitactor.y+"]");
                boolean portastop = false;
                for(int l=0; l<portes.length;l++){

                    Rectangle limitporta=new Rectangle(portes[l].getFila(),portes[l].getColumna(),128,128);
                    System.out.println("Porta=["+limitporta.x+","+limitporta.y+"]");
                    portastop=portastop || limitporta.intersects(limitactor);
                    System.out.println(" Intersequen="+limitporta.intersects(limitactor)+" ,");
                }
                //System.out.println("Fila="+fila+", Columna="+col);
                lliure = ((fila != cela[0] || col != cela[1]) && portastop);
                i++;
            }
            //System.out.println("lol");
            trobada = lliure;
            
        }
        //System.out.println("FINALFila="+fila+", FINALColumna="+col);
        return new int[] { fila, col };
       
    }
    

    /**
     * Principal.
     * 
     * @param args
     */
    public static void main(String[] args) {
        new Main();
    }
    
}
