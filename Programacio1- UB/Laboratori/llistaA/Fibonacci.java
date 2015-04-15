/*
*	Fibonacci
*
*	1.0
*
*	6-10-12
*
*/

/*
*	Fibonacci
*
*	@version	1.0 6-10-2012
* 	@author		Victor Gomez
*
*	Aquest programa llegira un nombre enter n i ens calculara els primers n nombres de la serie de Fibonacci
*/

// Incloem la llibreria java.util.*
import java.util.*;
// Declarem la classe
public class Fibonacci
{
	public static void main(String[] args)
	{
	// Importem un escaner
	Scanner sc = new Scanner(System.in);
	// Imprimim
	System.out.println("Escriviu un nombre enter n i calcularem els primers n nombres de la serie de Fibonacci.  ");
	// Definim les variables i posem els valors d'aquestes
	int nombre, sequencia, x, fibonacci1, fibonacci2;
	nombre = sc.nextInt();
	x = 0;
	fibonacci1 = 0;
	fibonacci2 = 1;
	sequencia = 0;
	// Declarem unes condicions a seguir
	if (nombre == 0) {
		// Imprimim
		System.out.println("Els primers " + nombre + " nombres de la serie de fibonacci son:" );
		System.out.print(fibonacci1 + " ");
	// Si no es compleix la primera condicio pero si aquesta segona
	} else if (nombre == 1)	{
		// Imprimim
		System.out.println("Els primers " + nombre + " nombres de la serie de fibonacci son:");
		System.out.print(fibonacci1 + " " + fibonacci2);
	// Si no es compleix ni la primera ni la segona condicio pero si aquesta tercera
	} else if (nombre > 1) {
		// Imprimim
		System.out.println("Els primers " + nombre + " nombres de la serie de fibonacci son:");
		System.out.print(fibonacci1+ " " + fibonacci2 + " ");
		// Mentre es compleixin aquestes condicions s'anira repetint aixo
		while(x < nombre-2)
			{
			// Les variables tindran aquests nous valors
			x = x +1;
			sequencia = fibonacci1 + fibonacci2;
                       	fibonacci1 = fibonacci2;
                       	fibonacci2 = sequencia;
			// Imprimim
			System.out.print(sequencia + " ");
			}	
	// Si no es compleix cap de les condicions anteriors	
	} else
		{
		// Imprimim
		System.out.print("No te sentit posar un numero negatiu. La serie de fibonacci es exclusivament de nombres naturals, es a dir positius");
		}
	// Imprimim una linia en blanc per poder donar pas per la seguent linia de la terminal
	System.out.println();
	}
}
