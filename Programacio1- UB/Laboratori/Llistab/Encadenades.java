/*

Es diu que dues paraules són encadenades si les dues darreres lletres de la primera són iguals a les dues primeres de la segona.
 Per exemple: "SAVI" i "VINAGRE" són paraules encadenades. Feu un programa que llegeixi una frase, acabada amb la paraula sentinella fi,
 i imprimeixi per pantalla la primera paraula que no és encadenada amb l'anterior. (Encadenades.java)
Per exemple, donada la frase "SAVI VINAGRE REMENAR ESTUDIAR ARMARI fi" el programa hauria d'imprimir la paraula "ESTUDIAR". 

*/

import java.util.Scanner;

public class Encadenades{
	public static void main(String[]args){
		boolean iguals=true;
		String frase="";
		String paraula1="";
		String paraula2="";
		String princ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdueix una frase acabada en fi i direm la primera paraula no encadenada. Si escriviu una frase de menys de 2 paraules no podrem comparar-les. Si no escriviu fi al final, el programa no acabara");
		paraula1=sc.next();
		paraula2=sc.next();
		frase = frase + paraula1;
		if ((paraula1.equals("fi"))||(paraula2.equals("fi"))){
			System.out.println("Si escriviu fi al principi el programa no te sentit, heu d'escriure com a minim 2 paraules abans de fi");
		}else{
			princ= paraula2.substring(0,2);
			//System.out.println(princ);
			iguals = paraula1.endsWith(princ);
			//System.out.println(iguals);
			while(!paraula2.equals("fi")&&(iguals)){
				paraula1 = paraula2;
				frase=frase+paraula1;
				paraula2=sc.next();
				princ = paraula2.substring(0,2);
				iguals = paraula1.endsWith(princ);
				//System.out.println(iguals);
			}
			System.out.println(frase);
			if (!iguals){
				
				System.out.println("La paraula que no es encadenada amb l'anterior es: "+paraula2);
			}
		}
			
		
	}
}
			
