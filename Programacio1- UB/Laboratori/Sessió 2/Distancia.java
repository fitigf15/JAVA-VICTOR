/*
*		Distancia.java
*	Aquest programa calcula la distància euclidea entre dos punts donats del pla (x0,y0) i (x1,y1)
*	By: Victor Gomez
*
*/
import java.util.*;
public class Distancia
{
	public static void main(String[] args)
	{
		int x0,y0,x1,y1,p0,p1,disteuclidea;
		Scanner sc = new Scanner(System.in);
		System.out.println( "Escriviu la x0 d'un punt (x0,y0) del pla" );
		x0 = sc.nextInt();
		System.out.println( "Escriviu la y0 d'un punt (x0,y0) del pla" );
		y0 = sc.nextInt();
		System.out.println( "Escriviu la x1 d'un punt (x1,y1) del pla" );
		x1 = sc.nextInt();
		System.out.println( "Escriviu la y1 d'un punt (x1,y1) del pla" );
		y1 = sc.nextInt();
		p0= (int)Math.pow((x1-x0),2);
		p1= (int)Math.pow((y1-y0),2);
		disteuclidea = (int)Math.sqrt(p1+p0);
		System.out.println( "La distancia euclidea entre aquests dos punts es: " + disteuclidea + ".");
	}
}
