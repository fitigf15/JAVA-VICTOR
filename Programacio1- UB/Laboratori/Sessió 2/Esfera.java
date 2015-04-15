/*
*		Esfera.java
*	Aquest programa calcula l'area i el volum d'una esfera assegurant-se que el radi no es negatiu
*	By: Victor Gomez
*
*/
import java.util.*;
public class Esfera
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int radi, area, volum;
	System.out.println( "Escriviu el radi de l'esfera");
	radi = sc.nextInt();
	if ( radi < 0 ){
		System.out.println( "El radi és negatiu." );
	} else { 
		area = (int)Math.PI*((int)Math.pow((radi),2));
		volum = (4*(int)Math.PI*(int)(Math.pow((radi),3)))/3;
		System.out.println( "L'area de l'esfera es: " + area + "." );
		System.out.println( "El volum de l'esfera es: " + volum + ".");
	}
	}
}
