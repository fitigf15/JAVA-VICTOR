/*
Dos nombres són amics si la suma dels divisors propis del primer és igual al segon i la suma dels divisors propis del segon és igual al primer. Feu un programa que calculi si dos nombres enters donats són nombres amics. (Amics.java)
Per exemple, 220 i 284 són amics ja que els divisors propis de 220 són 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 i 110, que sumen 284, i, els divisors propis de 284 són 1, 2, 4, 71 i 142, que sumen 220. 

*/

import java.util.Scanner;

public class Amics{
	public static void main(String[]args){
		int nombre1,tempn1, nombre2, tempn2,residu1,residu2, divpropis1=0,divpropis2=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduiu el primer nombre:");
		nombre1=sc.nextInt();
		tempn1=nombre1/2;
		System.out.println("Introduiu el segon nombre:");
		nombre2=sc.nextInt();
		tempn2=nombre2/2;
		for(int i=1;i<nombre1;i++){
			if((nombre1%i==0)&&(i!=nombre1)){
				//Per saber quin nombre es divisor propi
				//System.out.print("i="+i+" , ");
				divpropis1=divpropis1+i;
				//Per saber la suma de divisors propis
				//System.out.print("divpropis1="+divpropis1+" , ");
				//System.out.println();
			}
			if((nombre2%i==0)&&(i!=nombre2)){
				//Per saber quin nombre es divisor propi
				//System.out.print("i="+i+" , ");
				divpropis2=divpropis2+i;
				//Per saber la suma de divisors propis
				//System.out.print("divpropis2="+divpropis2+" , ");
				//System.out.println();
			}
		}
		if ((nombre1==divpropis2)&&(nombre2==divpropis1)){
			System.out.println("Son amics");
		} else {
			System.out.println("No son amics");
		}
		
	}
}	
