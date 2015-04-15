
import java.util.Scanner;

public class Prova{
	public static void main(String[] args){
	int n;
	int[] taulafinal;
	ProvaEncapsulament taulaprova;
    
	Scanner sc= new Scanner(System.in);
	n=sc.nextInt();
	
	taulaprova = new ProvaEncapsulament();
	taulaprova.setEnter(n);
	taulaprova.inicialitza();
	taulaprova.setValor(0, 24);
	taulafinal = taulaprova.getTaulaEnter();
	System.out.println(taulafinal[0]);
	}
} 
