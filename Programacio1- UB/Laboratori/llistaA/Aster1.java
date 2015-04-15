/*
*			Aster1.java
*	Aquest programa llegeix un nombre n, comprova si n <= 65 i, en el cas que ho sigui, escriu n asteriscs en una linia
*	By: Victor gomez
*
*/
import java.util.*;

public class Aster1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, i;
		i = 0;
		System.out.println("Escriviu un nombre n que compleixi n <= 65");
		n = sc.nextInt();
		String aster = new String("*");
		System.out.println("S'imprimiran "+ n + " asteriscs.");
		if ( n <= 65)
		{
			while ( n > i)
			{
				i = i+1;
				System.out.print(aster);
			}
		}
		 else 
		{
			System.out.println("El nombre no compleix les condicions demanades anteriorment.");
		
		}
		System.out.println();
	}

}
		
