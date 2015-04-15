/*
*
*		TaulaQuadratsCubs.java
*	Aquest programa llegira un nombre >= 1 , comprovara la seva validesa i escriura 3 columnes:
*	La primera una amb els nombres de l'1 al n, la segona amb els seus quadrats i la tercera amb els seus cubs.
*
*	By: Victor Gomez
*
*/
import java.util.*;

public class TaulaQuadratsCubs
{
	public static void main( String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int nombre;
		System.out.println("Escriviu un nombre n >= 1");
		nombre = sc.nextInt();
		if (nombre >= 1)
		{
			int nombrepartida, nombrepartidae2, nombrepartidae3;
			nombrepartida = 0;
			while (nombrepartida < nombre)
			{
				nombrepartida = (int)(nombrepartida)+1 ;
				nombrepartidae2 =(int)Math.pow((nombrepartida),2);
				nombrepartidae3 = (int)Math.pow((nombrepartida),3);
				System.out.println("\t" + nombrepartida + "\t" + nombrepartidae2 + "\t" + nombrepartidae3);
			}
		}
		else
		{
			System.out.println("El nombre que heu introduit no compleix les condicions demanades anteriorment");
		}
	}
}
