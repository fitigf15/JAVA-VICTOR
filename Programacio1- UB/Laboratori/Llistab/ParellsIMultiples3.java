/*
*
*				ParellsIMultiples3.java
*	Aquest programa anira llegint numeros positius fins a llegir -1 i ens dira si hi ha mes numeros parells o mes multiples de 3
*	By: Victor Gomez
*
*/
import java.util.Scanner;
public class ParellsIMultiples3{
	public static void main(String[]args){
		int numero;
		int parells=0;
		int mult3=0;
		boolean parar = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriviu un numero positiu. Si escriviu -1, el programa parara.");
		numero = sc.nextInt();
		if (numero == -1){
			parar=true;
		}
		if (numero%2==0){
			parells++;
		}
		if (numero%3==0){
			mult3++;
		}
		while ((numero >= -1)&&(!parar)){
			System.out.println("Escriviu un numero positiu. Si escriviu -1, el programa parara.");
			numero=sc.nextInt();
			if (numero%2==0){
				parells++;
			}
			if (numero%3==0){
				mult3++;
			}
			if (numero==-1){
				parar=true;
			}
		}
		if (parells==mult3){
			System.out.println("Hi ha el mateix nombre de parells que de multiples de 3");
		}
		if (parells<mult3){
			System.out.println("Hi ha mes multiples de 3 que parells");
		}
		if (parells>mult3){
			System.out.println("Hi ha mes parells que multiples de 3");
		}
	}
}
		
