
import java.util.Scanner;

public class Mitjana{
	public static void main(String[] args){
		int n,sotamitjana=0;
		float[] sequencia;
		float mitjana=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriviu el nombre de notes que teniu");
		n=sc.nextInt();
		sequencia=new float[n];
		
		for (int i=0; i<sequencia.length;i++){
			System.out.println("Nota "+(i+1)+"?");
			sequencia[i]=sc.nextFloat();
			mitjana=mitjana+sequencia[i];
		}
		
		mitjana=mitjana/sequencia.length;
		
		for (int i=0; i<sequencia.length;i++){
			if (sequencia[i]<mitjana){
				sotamitjana++;
			}
		}
		System.out.println("Tenim "+sotamitjana+" elements sota la mitjana que es de "+mitjana);
	}
}
			