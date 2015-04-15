 
import java.util.Scanner;
 
public class Peons{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		TaulerEscacs taula=new TaulerEscacs();
		Peo fitxa1,threaten1,threaten2;
		Boolean parar=false;
		String peo1,peo2;
		int numthreat=0;
		System.out.println("Introdueix els peons");
		peo1=sc.next();
		if (!peo1.equals("fi")){
			fitxa1=new Peo();
			fitxa1.SetPeo(peo1);
			taula.PosaPeo(fitxa1);
		}else{
			parar=true;
		}
		
			
		while(!parar){
			peo1=sc.next();
			parar=(peo1.equals("fi"));
			if(!parar){
				fitxa1=new Peo();
				fitxa1.SetPeo(peo1);
				taula.PosaPeo(fitxa1);
				/*if(taula.EsPerillos()){
					numthreat=taula.GetNumThreaten();
					threaten1=taula.GetThreaten(numthreat-1);
					System.out.println(fitxa1.GetColour()+" at "+fitxa1.GetPosit()+" threatens "+threaten1.GetColour()+" at "+threaten1.GetPosit());
					if (numthreat==2){
						threaten2=taula.GetThreaten(numthreat-1);
						System.out.println(fitxa1.GetColour()+" at "+fitxa1.GetPosit()+" threatens "+threaten2.GetColour()+" at "+threaten2.GetPosit());
					}
				}*/
			}
		}

				
				
				
		
		
		/*for (int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				System.out.println(peons[i][j]+" "+i+" "+j);
			}
		}*/
		
		
	}
}