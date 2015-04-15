/*
*		Multiples13.java
*	Aquest programa escriu una llista dels multiples de 13 que hi ha entre 78 i 273, ambdos inclosos.
*	By: Victor Gomez
*
*/
import java.util.*;
public class Multiples13
{
	public static void main(String [] args)
	{
		int a = (78 / 13);
		System.out.println("Els multiples de 13 que hi ha entre 78 i 273 son:");
		while ((a * 13 >= 78) && (a * 13 <= 273))
		{
			int b = 13 * a ;
			System.out.println(a + " * 13 = " + b);
			a = (a + 1);
		}
	}
}
