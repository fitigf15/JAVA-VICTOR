/*
*
*			Intersequen.java:
* 	Donats dos intervals [x0, x1] i [x2, x3] es vol guardar en una variable booleana si tenen intersecció o no.
* 	Després, segons el valor d'aquesta variable es vol imprimir per pantalla el missatge "Intersequen" o el missatge "No intersequen". (Intersequen.java) 
*	Suposem que x0<=x1 , x2<=x3
*/


import java.util.*;
public class Intersequen
{
	public static void main( String[] args)
	{
		boolean intersequen;
		int x0, x1, x2, x3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriviu la primera variable x0" );
		x0 = sc.nextInt();
		System.out.println("Escriviu la segona variable x1, que ha de ser més gran o igual que x0" );
		x1 = sc.nextInt();
		System.out.println("Escriviu la tercera variable x2" );
		x2 = sc.nextInt();
		System.out.println("Escriviu la quarta variable x3, que ha de ser més gran o igual que x2" );
		x3 = sc.nextInt();
		if ((x1 >= x2) && (x3>=x0)) 
		{
			intersequen = true;
			System.out.println("Intersequen" );
		}
		else 
		{
			intersequen = false;
			System.out.println("No intersequen" );
		}
	}	
}	
