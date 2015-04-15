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
 * @author vgomezfa10.alumnes
 */
public class Vida extends AbstractActor {
    
    private Image image=Util.carregarImatge("objectes.png",174, 12, 26, 24);;
    private String nom="vida";
    
    public Vida() {
        setEstat(Constants.ESTAT_ACTIU);
    
    }   
    public void actualitzar(Context context) {
        // no fem res, es estàtic
    }

    public Rectangle getLimits() {
        return new Rectangle(getX(), getY(), 26, 24);
    }

    public void tractarColisio(Colisio colisio) {
        Actor actor = colisio.getActor();
        if (actor instanceof Heroina) {
	        actor.setVida(100);
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

    
