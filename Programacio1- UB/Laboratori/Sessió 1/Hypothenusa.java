

import java.util.Scanner;

public class Hypothenusa {
    public static void main(String[] args) throws Exception {
	float catet_a,catet_b;
	float hipotenusa;
	Scanner sc;

	sc = new Scanner(System.in);
	// Demanar la longitud del primer catet;
	System.out.println("Entra la longitud d'un catet; ");
	catet_a = sc.nextFloat();

	// Demanar la longitud del segon catet;
	System.out.println("Entra la longitud de l'altre catet; ");
	catet_b = sc.nextFloat();

	// Calcular la longitud de la hipotenusa
	hipotenusa = (float) Math.sqrt( catet_a*catet_a +
					catet_b*catet_b );
	
	// Mostrar el valor calculat per pantalla
	System.out.println("La longitud de la hipotenusa es; " +
			hipotenusa);
		
    } /* main */ 
}


