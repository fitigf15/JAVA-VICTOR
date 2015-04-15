/* 

    Escriviu un programa que llegeixi una frase acabada amb la paraula fi i imprimeixi per pantalla el nombre de paraules que conté. 
*/

import java.util.Scanner;

public class ComptaParaules{
	public static void main(String[] args){
		int nombre=0;
		String paraula="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriviu una frase amb la paraula fi i imprimirem per pantalla el nombre de paraules que conte: ");
		paraula = sc.next();
		if (paraula.endsWith("fi")){
			nombre++;
		}else{
			while (!paraula.endsWith("fi")){
				paraula=sc.next();
				nombre++;
			}
			if (paraula.endsWith("fi")){
				nombre++;
			}
		}
		System.out.println("La frase te "+nombre + " paraules.");
	}
}
		
	
