
import java.util.Scanner;

public class Conjunts{
	public static void main(String[] args){
		int n,x=0,y=0,a,b,cont1=0,cont2=0;
		int[] sequencia1,sequencia2,temp;
		boolean zero=false,conte=true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduiu un nombre natural n");
		n=sc.nextInt();
		
		sequencia1= new int[n];
		sequencia2= new int[n];
		
		System.out.println("Nombre"+ x+" de la sequencia 1?");
		sequencia1[x]=sc.nextInt();
		
		if (sequencia1[x]==0){
			zero=true;
		}
		x++;
		while ((!zero)&&(x<n)){
			System.out.println("Nombre "+x+" de la sequencia 1?");
			sequencia1[x]=sc.nextInt();
			if (sequencia1[x]==0){
				zero=true;
			}
			x++;
		}
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
		/*
		System.out.println("Sequencia 1:");
		for (int i=0; i<n;i++){
			System.out.print(sequencia1[i]+ " ");
		}
		System.out.println();
		System.out.println("Sequencia 2:");
		for (int i=0; i<n;i++){
			System.out.print(sequencia2[i]+ " ");
		}
		System.out.println();
		*/

		for (int i=0;i<n;i++){
			if (sequencia1[i]==0){
				cont1++;
			}
			if (sequencia2[i]==0){
				cont2++;
			}
		}
		/*
		System.out.println("Zeros1 vs Zeros2");
		System.out.println(cont1+" vs "+cont2);
		*/
		if (cont1>cont2){
			//System.out.println("Canvi");
			temp=sequencia2;
			sequencia2=sequencia1;
			sequencia1=temp;
			/*
			System.out.println("Sequencia 1:");
			for (int i=0; i<n;i++){
				System.out.print(sequencia1[i]+ " ");
			}
			System.out.println();
			System.out.println("Sequencia 2:");
			for (int i=0; i<n;i++){
				System.out.print(sequencia2[i]+ " ");
			}
			System.out.println();
			*/
		}
		
		
		x=0;
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
		if (conte){
			System.out.println("Si");
		}else{
			System.out.println("No");
		}
	}
}
		