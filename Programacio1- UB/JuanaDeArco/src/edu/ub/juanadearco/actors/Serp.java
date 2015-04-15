/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.juanadearco.actors;

import edu.ub.juanadearco.Actor;
import edu.ub.juanadearco.Colisio;
import edu.ub.juanadearco.Constants;
import edu.ub.juanadearco.Context;
import edu.ub.juanadearco.Util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
/**
 *
 * @author victor
 */
public class Serp extends AbstractActor{
    private Image image=Util.carregarImatge("objectes.png",700,0,40,42);;
    private String nom="serp";
    
    public Serp() {
        setEstat(Constants.ESTAT_ACTIU);
    
    }   
    public void actualitzar(Context context) {
        // no fem res, es estàtic
    }

    public Rectangle getLimits() {
        return new Rectangle(getX(), getY(), 40, 42);
    }

    public void tractarColisio(Colisio colisio) {
        Actor actor = colisio.getActor();
        if (actor instanceof Heroina) {
	        actor.setVida(0);
                setEstat(Constants.ESTAT_INACTIU);
        }
    }

    public void render(Graphics2D g) {
        g.drawImage(image, getX(), getY(), observer);
        g.setColor(Color.GREEN);
        Font f = new Font("Dialog", Font.BOLD, 10);
        g.setFont(f);
        g.drawString(nom, getX(), getY() - 3);
    }
           
}
