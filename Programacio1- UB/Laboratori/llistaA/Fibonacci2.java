/*
*
*		Fibonacci.java
*	Aquest programa llegira un nombre enter n i ens calculara els primers n nombres de la serie de Fibonacci
*	By: Victor Gomez
*
*/
import java.util.*;

public class Fibonacci2
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Escriviu un nombre enter n i calcularem els primers n nombres de la serie de Fibonacci: ");
	int nombre, sequencia, x, fibonacci1, fibonacci2;
	nombre = sc.nextInt();
	x = 0;
	System.out.println("Escriviu el primer nombre de la serie de fibonacci: ");
	fibonacci1 = sc.nextInt();
	System.out.println("Escriviu el segon nombre de la serie de fibonacci: ");
	fibonacci2 = sc.nextInt();
	sequencia = 0;
	if (nombre > 0)
		{
		System.out.println("La serie de fibonacci de " + nombre + " nombres es:");
		System.out.print(fibonacci1 + " " + fibonacci2 + " ");
		while(x < nombre)
			{
			x = x +1;
			sequencia = fibonacci1 + fibonacci2;
			fibonacci1 = fibonacci2;
			fibonacci2 = sequencia;
			System.out.print(sequencia+ " "); 
			}
		}
	else
		{
		System.out.print("No te sentit posar un numero negatiu o zero");
		}
	System.out.println();
	}
}
