import java.util.Scanner;

public class Anagrames{
	public static void main(String[]args){
		String frase;
		Anagrama a=new Anagrama();
		Anagrama b;
		TaulaAnagrames taula=new TaulaAnagrames();
		taula.SetMida(100);
		taula.Inicialitza();
		boolean stop=false;
		Scanner sc=new Scanner(System.in);
		//Introduim la primera frase i comprovem que no es fi
		System.out.println("Introdueix una frase");
		frase=sc.nextLine();
		if(frase.equals("fi")){
			stop=true;
		}else{
			//Si la frase no es fi llavors tractarem amb l'anagrama a i l'afegirem a la taula d'anagrames
			a.SetFrase(frase);
			a.Inicialitza();
			taula.SetAnagrama(0,a);
		}
		//Mentre el que introduim no sigui "fi" ni introduim mes de 100 frases seguirem fent el mateix
		//Es una cerca de "fi"
		while((taula.GetNumAnag()<100)&&(!stop)){
			System.out.println("Introdueix una frase");
			frase=sc.nextLine();
			if (frase.equals("fi")){
				stop=true;
			}else{
				a= new Anagrama();
				a.SetFrase(frase);
				a.Inicialitza();
				taula.SetAnagrama(taula.GetNumAnag(),a);
			}
		}
		//Ara tenim una taula amb x Anagrama, compararem a veure si son anagrames
		int i=0,j=0;
		//Es un recorregut per tots els Anagrama que tenim dins la taula
		while ((i<taula.GetNumAnag())){
			a=taula.GetAnagrama(i);
			//System.out.println();
			j=i+1;
			stop=false;
			//Es una cerca per trobar si a i b son o no anagrames
			while((j<taula.GetNumAnag())&&(!stop)){
				b=taula.GetAnagrama(j);
				//Print orientatiu
				//System.out.println("Compara ("+a.GetFrase()+") amb ("+b.GetFrase()+")");
				stop= ((a.EsAnagrama(b))&&(!(a.GetFrase().equals(b.GetFrase()))));
				if (stop){
					//print orientatiu
					//System.out.println("ANAGRAMA!!!");
					System.out.println(a.GetFrase()+" = "+b.GetFrase());
				}
				j++;
			}
			i++;
		}
		
		
	}
}