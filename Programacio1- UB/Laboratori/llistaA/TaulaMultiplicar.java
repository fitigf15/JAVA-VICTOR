/*
*		TaulaMultiplicar.java
*	Aquest programa llegeix un nombre entre 0 i 9 i fa la seva taula de multiplicar corresponent.
*	By: Victor Gomez
*
*/
import java.util.*;
public class TaulaMultiplicar
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriviu el nombre, que estigui entre 0 i 9, del qual voleu saber la taula de multiplicar");
		int N = sc.nextInt();
		int i = 0;
		if (N < 10)
		{
		System.out.println("La taula de multiplicar del " + N + " es: ");
			while ( i < 10 )
			{
			int R;
			i = i + 1;
			R = N * i;
			System.out.println(N + "*" + i + "=" + R); 
			}
		} else {
			System.out.println( "Aquest nombre no esta entre 0 i 9.");
		}
	}

}	
