/*
*		Nombres.java
*	Aquest programa llegeix un nombre N i imprimeix per pantalla tots els nombres des de 1 fins a N
*	By: Victor Gomez
*
*/
import java.util.*;
public class Nombres
{
	public static void main(String [] args)
	{
                Scanner sc = new Scanner(System.in);
        	System.out.println( "Escriviu un nombre N");
                int N = sc.nextInt();
		int i = 1;
		System.out.println("Els numeros que van de 1 fins a " + N + " son:");
                while (i < N)
		{
			System.out.println(i);
                        i = i +1;
                }
        }
}
                

