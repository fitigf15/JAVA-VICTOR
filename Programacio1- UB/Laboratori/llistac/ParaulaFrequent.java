
import java.util.Scanner;


public class ParaulaFrequent{
	public static void main(String[]args){
		int n,maxim=0;
		String[] paraules;
		int[] contador; 
		String mesfrequent="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduiu un nombre natural n");
		
		n=sc.nextInt();
		
		paraules = new String[n];
		contador = new int[n];
		
		
		for(int i=0; i<n; i++){
			System.out.println("Introduiu la "+ (i+1)+ " paraula");
			contador[i]=0;
			paraules[i]=sc.next();
			
		}
		
		for(int j=0; j<n; j++){
			for(int k=0; k<n;k++){
				if (paraules[j].equals(paraules[k])){
					contador[j]++;
					//System.out.print(" Contador= "+contador[j]);
				}
			}
			//System.out.println();
			if (contador[j]>maxim){
				
				maxim=contador[j];
				mesfrequent=paraules[j];
				//System.out.println("Nou maxim: "+mesfrequent+", "+maxim+" cops.");
			}
		}
		
		System.out.println("La paraula mes frequent es "+mesfrequent+".");
	}
}