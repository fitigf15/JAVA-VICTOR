/*
*		Maxim.java
* 	Aquest programa calcularà el màxim de tres nombres reals usant com a màxim dues instruccions if.
*	Fet per: Victor Gomez
*/
import java.util.*;
public class Maxim
{
	public static void main( String[] args)
	{
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println( "Escriviu un nombre real" );
		a = sc.nextDouble();
		System.out.println( "Escriviu un segon nombre real" );
		b = sc.nextDouble();
		System.out.println( "Escriviu un tercer nombre real" );
		c = sc.nextDouble();
		if (( a>b) && (a>c))
		{
			System.out.println( "El nombre a=" + a + " és el màxim dels 3 nombres reals que heu escrit" );
		}
		else if (( b>a) && (b>c))
		{
			System.out.println( "El nombre b=" + b + " és el màxim dels 3 nombres reals que heu escrit" );
		}
		else 
		{
			System.out.println( "El nombre c=" + c + " és el màxim dels 3 nombres reals que heu escrit" );
		}
	}
}
