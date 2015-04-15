/*
Feu un programa que escrigui la descomposició en factors primers d'un nombre llegit per teclat.
*/


import java.util.*;
public class Primers{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriviu un nombre i el descompondrem en factors: ");
		int n = sc.nextInt();
		int div = 2;
		while (n!=1){
			if(n%div==0){
				n=n/div;
				System.out.print(div+" ");
			} else {
				div++;
			}
		}
		System.out.println();
	}
}
