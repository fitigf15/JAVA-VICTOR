import java.util.Scanner;

public class IntervalDominant{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduiu un nombre n");
		int n=sc.nextInt(),k=0,j=0;
		int[] numconte=new int[n];
		float i0,i1;
		Interval[] taulainterv=new Interval[n]; 
		Interval actual, compara, resultat;
		boolean conte=true,stop=false;
		resultat=new Interval();
		resultat.SetInterval(0,0);
		
		for (int i=0;i<n;i++){
			System.out.println("Introduiu el interval");
			actual=new Interval();
			i0=sc.nextFloat();
			i1=sc.nextFloat();
			actual.SetInterval(i0,i1);
			taulainterv[i]=actual;
		}
		j=0;
		while((j<n)&&(!stop)){
			actual=taulainterv[j];
			k=0;
			conte=true;
			while((k<n)&&(conte)&&(!stop)){
				compara=taulainterv[k];
				//System.out.println("Compara["+actual.GetInterval0()+","+actual.GetInterval1()+"] amb ["+compara.GetInterval0()+","+compara.GetInterval1()+"] = "+actual.Conte(compara));
				conte=actual.Conte(compara);
				if(conte){
					numconte[j]++;
					if (numconte[j]==n){
						resultat.SetInterval(actual.GetInterval0(),actual.GetInterval1());
						stop=true;
						
					}
				}
				k++;
			}
			j++;
		}
		if(stop){
			System.out.println("Si ["+resultat.GetInterval0()+","+resultat.GetInterval1()+"]");
		}else{
			System.out.println("No");
		}
	}
}
		
		
					
				
				