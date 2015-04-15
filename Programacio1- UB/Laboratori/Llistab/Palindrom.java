/*
Indiqueu si una paraula entrada per l'usuari és o no palíndrom (capicua) imprimint "és capicua" si ho és o "no és capicua" en cas contrari. 
*/

import java.util.*;

public class Palindrom{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String paraula = sc.next();
		int n = paraula.length();
		boolean palindrom = true;
		int i = 0;
		while(palindrom && (n-1>i) ){
			if (paraula.charAt(i) != paraula.charAt(n-1)){
				palindrom=false;
				System.out.println("No es capicua.");
			}
			n--;
			i++;
		}
		if (palindrom){
		System.out.println("Es capicua");
		}
	}
}

					
