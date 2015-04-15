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
     * Metode per obtenir un String amb tots els albums
     * @return albumString
     */
    public String albString(){
        String s="Albums:\n";
        for (int i=0;i<this.albums.size();i++){
            s=s+"-"+(i+1)+"."+this.albums.get(i).getTitle()+"\n";
        }
        return s;
    }
    /**
     * Metode per obten ir un String de totes les dades
     * @return dadesString
     */
    @Override
    public String toString(){
        return "Dades:\n"+this.biblioteca.toString()+"\n"+albString();
    }
}
