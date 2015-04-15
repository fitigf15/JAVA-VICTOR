
import java.util.Scanner;

public class Estadistiques{
	public static void main(String[] args){
		int natural;
		double espr=0,vari=0;
    		double[] sequencia;
    
    		Scanner sc = new Scanner(System.in);
    
		System.out.println("Escriviu un nombre natural:");
    		natural=sc.nextInt();
    
    		sequencia=new double[natural];
    
    		for (int idx=0;idx<sequencia.length;idx++){
      			System.out.println("Valor "+idx+"?");
      			sequencia[idx]=sc.nextDouble();
      			espr=espr+sequencia[idx];
      			vari=vari+Math.pow(sequencia[idx],2);
   	 	}
    		espr=espr/sequencia.length;
    		vari= vari-Math.pow(espr,2);
    		System.out.println("E[x]="+espr);
    		System.out.println("Var[x]="+vari);
  	}
}
