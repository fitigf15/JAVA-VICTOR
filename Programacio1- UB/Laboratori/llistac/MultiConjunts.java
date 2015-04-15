/*
 (MultiConjunts.java) Feu un programa que, donats un nombre natural n i dues
sequ encies de com a maxim n nombres enters acabades en 0, indiqui si les dues contenen
els mateixos numeros i amb les mateixes frequencies.
Entrada:
10
5 1 2 5 7 1 8 12 0
7 12 12 5 1 8 2 0
Sortida:
No
*/

import java.util.Scanner;

public class MultiConjunts{
	public static void main(String[] args){
		
		//Inicialitzacio de variables
		
		int n,x=0,y=0,a,b,cont1=0,cont2=0;
		int[] sequencia1,sequencia2,temp,llista1,llista2;
		boolean zero=false,conte=true;
		
		Scanner sc = new Scanner(System.in);
		
		//Escanegem el primer numero natural
		
		System.out.println("Introduiu un numero natural:");
		n=sc.nextInt();
		
		//En funcio del nombre escanejat, creem les 2 llistes
		
		sequencia1= new int[n];
		sequencia2= new int[n];
		
		//Escanegem el primer numero per la primera llista, x=0
		
		System.out.println("Nombre"+ x+" de la sequencia 1?");
		sequencia1[x]=sc.nextInt();
		
		//Si es zero la condicio booleana "zero" sera veritat
		
		if (sequencia1[x]==0){
			zero=true;
		}
		
		//Augmentem x i fem una cerca, escanejant fins trobar un zero o fins que omplim la llista
		x++;
		while ((!zero)&&(x<n)){
			System.out.println("Nombre "+x+" de la sequencia 1?");
			sequencia1[x]=sc.nextInt();
			if (sequencia1[x]==0){
				zero=true;
			}
			x++;
		}
		
		//Un cop hem acabat, posarem el valor inicial a x i a zero i farem el mateix pero amb la segona llista
		zero=false;
		x=0;
		System.out.println("Nombre "+ x+" de la sequencia 2?");
		sequencia2[x]=sc.nextInt();
		
		if (sequencia2[x]==0){
			zero=true;
		}
		x++;
		while ((!zero)&&(x<n)){
			System.out.println("Nombre "+x+" de la sequencia 2?");
			sequencia2[x]=sc.nextInt();
			if (sequencia2[x]==0){
				zero=true;
			}
			x++;
		}
		
		//Contem el numero de zeros que te cada llista
		
		for (int i=0;i<n;i++){
			if (sequencia1[i]==0){
				cont1++;
			}
			if (sequencia2[i]==0){
				cont2++;
			}
		}
		
		//Si la primera llista te mes zeros que la segona, canviarem la segona per la primera
		if (cont1>cont2){
			//System.out.println("Canvi");
			temp=sequencia2;
			sequencia2=sequencia1;
			sequencia1=temp;
		}
		
		//Posem a x el seu valor inicial
		x=0;
		
		//Farem una cerca comparant els numeros de la llista 1 amb els de la llista 2 fins que trobem un zero o un numero
		//de la llista 1 que no es trobi dins la llista 2
		while((conte)&&(x<n)&&(sequencia1[x]!=0)){
			a= sequencia1[x];
			y=0;
			conte=false;
			while((!conte)&&(y<n)&&(sequencia2[y]!=0)){
				b= sequencia2[y];
				conte= (a==b);
				//System.out.print(a+"=="+b+"->"+conte+",");
				y++;
			}
			//System.out.println(" LLAVORS "+conte);
			x++;
		}
		cont1=0;
		cont2=0;
		for (int i=0;i<n;i++){
			a=sequencia1[i];
			for (int j=0;j<n;j++){
				b=sequencia1[j];
				if ((a==b)&&(a!=0)){
					
					cont1++;
				}
			}
			a=sequencia2[i];
			for (int j=0;j<n;j++){
				b=sequencia2[j];
				if ((a==b)&&(a!=0)){
					sequencia2.delete(i);
					cont2++;
				}
			}
		}
		System.out.println("Sequencia1:");
		for (int i=0;i<n;i++){
			System.out.print(sequencia1[i]+" ");
		}
		System.out.println();
		System.out.println("Sequencia2:");
		for (int i=0;i<n;i++){
			System.out.print(sequencia2[i]+" ");
		}
		System.out.println();
		System.out.println(cont1+","+cont2);
	}
}
					
					