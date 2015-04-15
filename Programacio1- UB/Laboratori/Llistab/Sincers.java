/*

Un número es considera múltiple sincer d'un altre si a més a més de ser múltiple, la suma dels seus dígits és igual al mateix número.
 Per exemple, 24 és múltiple sincer de 6, ja que 24 és múltiple de 6 i 2+4=6. Els múltiples sincers del 3 són: 3, 12, 21, 30, 102,
 111, 120, 201, 210, 300, ... Feu un programa que donat un nombre i una seqüència de nombres acabada en zero compti el nombre de múltiples sincers que hi ha a la seqüència.
 (Sincers.java)



*/

import java.util.Scanner;

public class Sincers{
	public static void main(String[] args){
		
		int i=0, numdigit,digits=0,sumadigits=0, nombre,seq,sincers=0;
		String numsequencia="";		
		char digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriviu el nombre sobre el qual voleu trobar els sincers");
		nombre = sc.nextInt();
		
		if (nombre > 0){
			System.out.println("Escriviu la sequencia de nombres acabada en 0");
			seq = sc.nextInt();
			if (seq==0){
				System.out.println("El primer nombre no pot ser ni negatiu ni zero perque no te sentit llavors");
			}else{
				while (seq!=0){
					sumadigits=0;
					numsequencia= Integer.toString(seq);
					System.out.print("numsequencia="+numsequencia+" , ");
					digits = numsequencia.length();
					System.out.print("digits="+digits+" , ");
					for (i=0; i<digits; i++){
						System.out.print("i="+i+" , ");
						digit = numsequencia.charAt(i);
						System.out.print("digit="+digit+" , ");
						numdigit =(int)digit-48;
						System.out.print("numdigit="+numdigit+" ");
						sumadigits= sumadigits+numdigit;
						System.out.print("sumadigits="+sumadigits+" , ");
					}
					if((seq%nombre==0)&&(sumadigits==nombre)){
						sincers++;
						System.out.print("sincers="+sincers+" , ");
					}
					seq= sc.nextInt();
					System.out.println();
				}
			System.out.println("Hi ha "+sincers+" a la sequencia");
			}		
		} else{
			System.out.println("No pot ser un nombre negatiu o zero, no te sentit");
		}
	}
}
