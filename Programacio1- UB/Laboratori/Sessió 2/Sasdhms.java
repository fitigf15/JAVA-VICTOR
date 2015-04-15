/*
*	Sasdhms.java
*	Aquest programa converteix una quantitat donada de segons en setmanes, dies, hores, minuts i segons
*	By: Victor Gomez
*/

import java.util.*;
public class Sasdhms
{
	public static void main (String[] args)
	{
	int segonsentrada, segons, minuts, minutssobrants, hores, horessobrants, dies, diessobrants, setmanes;
	Scanner sc = new Scanner(System.in);
	System.out.println( "Introdueixi els segons" );
	segonsentrada = sc.nextInt();
	segons = segonsentrada % 60 ;
	minuts = segonsentrada / 60 ;
	minutssobrants = minuts % 60; 
	hores = minuts / 60 ;
	horessobrants = hores % 24;
	dies = hores / 24 ;
	diessobrants = dies % 7;
	setmanes = dies / 7 ;
	System.out.println( "Són " + setmanes + " setmanes, " + diessobrants + " dies, " + horessobrants + " hores, " + minutssobrants + " minuts, " + segons + " segons. " );
	}
} 
