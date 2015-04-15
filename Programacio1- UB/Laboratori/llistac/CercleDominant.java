import java.util.Scanner;

public class CercleDominant{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduiu un nombre natural n");
		int n=sc.nextInt(),dominant=0;
		Cercle[] sequencia=new Cercle[n];
		int[] contcercle=new int[n];
		double abs=0,ord=0,rad=0;
		Cercle a,b;
		
		for (int h=0;h<n;h++){
			System.out.println("Introduiu Radi-Abscissa-Ordenada");
			abs=sc.nextDouble();
			ord=sc.nextDouble();
			rad=sc.nextDouble();
			a= new Cercle();
			a.SetXYR(abs,ord,rad);
			sequencia[h]=a;
		}
		
		for (int i=0;i<n;i++){
			a=sequencia[i];
			for(int j=0;j<n;j++){
				b=sequencia[j];
				if(a.esDominant(b)){
					contcercle[i]++;
				}
			}
		}
		for (int k=0;k<n;k++){
			if (contcercle[k]==n){
				a=sequencia[k];
				System.out.println("Si! "+a.GetX()+" "+a.GetY()+" "+a.GetR());
			}
		}
	}
}
		
		