/*
* 
*		Edat.java
*	Aquest programa demana l'edat introduida a dia 31 de desembre i calcula l'any de naixement
*	i quan duplicarem la nostra edat.
*	By: Victor Gomez
*
*/

import java.util.*;
public class Edat
{
	public static void main(String [] args)
	{
		int edatintroduida, anynaixement, edatduplicada, anyedatduplicada;
		Scanner sc = new Scanner(System.in);
		System.out.println( "Escriviu la vostra edat a dia 31 de desembre de 2012");
		edatintroduida = sc.nextInt();
		anynaixement = (2012 - edatintroduida);
		edatduplicada = (2*edatintroduida);
		anyedatduplicada = (2012 + edatintroduida);
		System.out.println( "La vostra edat es duplicarà l'any " + anyedatduplicada + ", i tindreu " + edatduplicada + " anys.");
	}	
}
