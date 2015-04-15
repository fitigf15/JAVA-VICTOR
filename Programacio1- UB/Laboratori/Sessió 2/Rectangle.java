/*
*		Rectangle.java
*	Dissenyeu un programa que, donat un rectangle de posició (x1, y1, x2, y2), indiqui si un punt (x, y), entrat per l'usuari, és dins o fora del rectangle.
*	By: Victor Gomez
*
*/
import java.util.*;
public class Rectangle
{
	public static void main( String [] args)
	{
		int x, x1, x2, y, y1, y2;
		Scanner sc = new Scanner(System.in);
		System.out.println ( "Introdueixi la posició x1 del rectangle" );
		x1 = sc.nextInt();
		System.out.println ( "Introdueixi la posició y1 del rectangle" );
		y1 = sc.nextInt();
		System.out.println ( "Introdueixi la posició x2 del rectangle" );
		x2 = sc.nextInt();
		System.out.println ( "Introdueixi la posició y2 del rectangle" );
		y2 = sc.nextInt();
		System.out.println ( "Introdueixi la posició x del punt, el qual volem saber si és dins o fora del rectangle" );
		x = sc.nextInt();
		System.out.println ( "Introdueixi la posició y del punt, el qual volem saber si és dins o fora del rectangle" );
		y = sc.nextInt();
		if ((( x >= x1) && (x <= x2) || (( x <= x1) && (x >= x2))) && (( y >= y1) && (y <= y2) || ( y <= y1) && (y >= y2)))
		{
                    System.out.println( "El punt es troba dins el rectangle");
		}
                else
		{
                    System.out.println( "El punt es troba fora del rectangle");
		}
	}
}
