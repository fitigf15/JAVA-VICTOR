

/*
*	DivEntera.java
*	Aquest programa llegeix dos nombres enters i escriu el resultat de realitzar la divisio entera del primer entre el segon.
*	Per exemple, si escrivim 38 i 7, rebrem com a resposta 38=5*7+3
*
*/

import java.util.*;
public class DivEntera
{
	public static void main( String[] args)
		{
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println( "Escriviu el primer nombre" );
		a = sc.nextInt();
		System.out.println( "Escriviu el segon nombre" );
		b = sc.nextInt();
		int r , q;
		q = a/b;
		r= a%b;
		System.out.println(a+"="+q+"*"+b+"+"+r);
		}
}
