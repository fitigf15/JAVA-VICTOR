import java.util.Scanner;

public class Anagrames{
	public static void main(String[]args){
		String frase,anagrama1,anagrama2;
		Anagrama a=new Anagrama();
		Anagrama b;
		TaulaAnagrames taula=new TaulaAnagrames();
		taula.SetMida(100);
		taula.Inicialitza();
		boolean stop=false;
		int x=0;
		int[] iguals=new int[100];
		Scanner sc=new Scanner(System.in);
		//Introduim el primer anagrama i comprovem que no es fi
		System.out.println("Introdueix una frase");
		frase=sc.nextLine();
		if(frase.equals("fi")){
			stop=true;
		}else{
			a.SetFrase(frase);
			a.Inicialitza();
			taula.SetAnagrama(x,a);
			x++;
		}
		//Mentre l'anagrama que introduim no sigui fi ni introduim mes de 100 anagrames seguirem agafant anagrames
		while((x<100)&&(!stop)){
			System.out.println("Introdueix una frase");
			frase=sc.nextLine();
			if (frase.equals("fi")){
				stop=true;
			}else{
				a= new Anagrama();
				a.SetFrase(frase);
				a.Inicialitza();
				taula.SetAnagrama(x,a);
				x++;
			}
		}
		//Ara tenim una taula amb x anagrames, compararem a veure si ho son
		int i=0,j=0;
		stop=false;
		while ((i<x)&&(!stop)){
			a=taula.GetAnagrama(i);
			System.out.println();
			j=0;
			while((j<x)&&(!stop)){
				b=taula.GetAnagrama(j);
				System.out.println("Compara ("+a.GetFrase()+") amb ("+b.GetFrase()+")");
				if (a.EsIgual(b)){
					System.out.println("IGUALS!!");
					iguals[i]++;
					if (iguals[i]==2){
						stop=(iguals[i]==2);
						System.out.println("ANAGRAMA!!!");
						System.out.println(a.GetFrase()+" i "+b.GetFrase()+" son anagrames");
					}
				}
				j++;
			}
			i++;
		}
		
		
	}
}