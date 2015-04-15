
import java.util.Scanner;

public class ValorsEntaulats{
	public static void main(String[]args){
		TaulaValors taula1= new TaulaValors();
		int[] primo;
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introdueix el numero de valors de la taula");
		n=sc.nextInt();
		
		taula1.setNumValors(n);
		
		primo=taula1.getTaula();
		
		
		
		System.out.println(primo);
	}
}
		