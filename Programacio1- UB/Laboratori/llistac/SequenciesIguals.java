/*FET PER: VICTOR GOMEZ FARRUS */


import java.util.Scanner;

public class SequenciesIguals{
	public static void main(String[]args){
		// Inicialitzem i definim variables
		Scanner sc=new Scanner(System.in);				//Scanner
		System.out.println("Escriu el nombre de enters que entraras");
		int n=sc.nextInt(),numero;					//n es el nombre d'enters que contindra cada sequencia
										//numero es cada numero que volguem afegir a cada llista
		Sequencia seq1,seq2;						//seq1 i seq2 son les sequencies que compararem
		
		seq1=new Sequencia();						//Inicialitzem nova sequencia
		seq1.SetLlarg(n);						//la 1a sequencia tindra n nombres
										//Escanegem cada nombre i el col.loquem a la sequencia
		for(int i=0;i<n;i++){
			System.out.println("Escriviu el "+(i+1)+" nombre de la primera sequencia:");
			numero=sc.nextInt();
			seq1.AppendNum(numero,i);
		}

		seq2=new Sequencia();						//Inicialitzem nova sequencia
		seq2.SetLlarg(n);						//la 2a sequencia tindra n nombres
										//Escanegem cada nombre i el col.loquem a la sequencia
		for(int j=0;j<n;j++){
			System.out.println("Escriviu el "+(j+1)+" nombre de la segona sequencia:");
			numero=sc.nextInt();
			seq2.AppendNum(numero,j);
		}
										//Imprimirem el resultat en funcio de si son iguals o diferents
		if(seq1.EsIgual(seq2)){
			System.out.println("Son iguals");
		}else{
			System.out.println("Son diferents");
		}
	}
	
}
		
		
		
			
		
		