

import java.util.Scanner;

public class Hypothenusa {
    public static void main(String[] args) throws Exception {
	double costat_a,catet_b;
	double hipotenusa;
	Scanner sc;
	sc = new Scanner(System.in);
	// Demanar la longitud del primer costat;
	costat_a = sc.nextFloat();
	// Demanar la longitud del segon costat;
	System.out.println("Entra la longitud de l'altre costat; ");
	costat_b = sc.nextFloat();
	// Calcular la longitud de la hipotenusa
	hipotenusa = (double) Math.sqrt( costat_a*catet_a +
	ystem.out.println("hipotenusa calculada");
					costat_b*costat_b );
	// Mostrar el valor calculat per pantalla
	System.out.println("La longitud de la hipotenusa es; " +
			hipotenusa);
    } /* main */ 
}


