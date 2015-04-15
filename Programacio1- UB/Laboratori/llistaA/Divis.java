/*
*		Divis.java
*	Aquest programa ens diu si un nombre donat es divisible per 3, 7 i/o 11
*	By: Victor Gomez
*
*/
import java.util.*;
public class Divis
{
	public static void main (String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int nombre;
	System.out.println( "Escriviu un nombre per saber si es divisible per 3, 7 i/o 11");
	nombre = sc.nextInt();
	if (nombre % 3 == 0) {
		System.out.println( "El nombre és divisible per 3" );
	} else {
		System.out.println( "El nombre no és divisible per 3" );
	}
	if (nombre % 7 == 0) {
                System.out.println( "El nombre és divisible per 7" );
        } else {
                System.out.println( "El nombre no és divisible per 7" );
        }
	if (nombre % 11 == 0) {
                System.out.println( "El nombre és divisible per 11" );
        } else {
                System.out.println( "El nombre no és divisible per 11" );
        }


	}
}	
