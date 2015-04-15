/*
Feu un programa que, donat un nombre real x i un nombre real positiu ε, amb ε < 1.e-3 (tolerància), calculi el valor de ex emprant la sèrie
ex = 1 + x/1! + x2/2! + x3/3! + ... + xn/n! + ...
i s'aturi en trobar un valor n tal que |xn/n!| < ε.
Optimitzeu el nombre de càlculs utilitzats. Compareu el vostre resultat amb el que dóna el mètode incorporat. 
*/

import java.util.*;
import java.lang.Math;
public class CalculExpo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriviu un nombre real x: );
		double x = sc.nextDouble();
		double expx = 1;
		double terme = 1;
		int i = 1;
		double eps = 1.e-3;
		while(terme > eps){
			terme = terme*x/i;
			expx=expx+terme;
			i++;
		}
		System.out.println(expx);
		System.out.println(Math.exp(x));
	}
}

