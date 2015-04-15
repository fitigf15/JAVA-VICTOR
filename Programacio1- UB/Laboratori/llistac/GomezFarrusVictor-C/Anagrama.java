public class Anagrama{

	//Definim variables privades
	private String frase,aux;		//frase sera cada frase introduida
						//aux es una variable auxiliar de frase
	private int[] poslletra,taulapos;	//poslletra es una taula de contadors de lletres(a...z)
						//taulapos tambe es una taula de contadors de lletres(a...z)
	private int l;				//l es enter que ens servira per fer una cerca
	private boolean angfound;		//angfound es un boolea que ens dira si dues frases son anagrames comparant el numero
						//de vegades que la frase conte cada lletra
	
	public void SetFrase(String entrada)	{frase=entrada;}	//frase sera el string que entrem dins el metode SetFrase
	public void Inicialitza(){					//metode per inicialitzar:
		aux=frase;
		poslletra= new int[26];
		for(int j=0;j<aux.length();j++){			//Recorregut
			for(int k=0;k<26;k++){
				if (aux.charAt(j)==(char)('a'+k)){
					poslletra[k]++;
				}
			}
		}
	}
	public int[] GetTaulaPos()	{return poslletra;}		//el metode GetTaulaPos ens retorna poslletra
	public boolean EsAnagrama(Anagrama a){				//el metode EsAnagrama ens retorna si la nostra frase i la frase que
									//comparem son anagrames
		taulapos= a.GetTaulaPos();
		l=0;
		angfound=true;
		while((angfound)&&(l<26)){					//Cerca per buscar si no son anagrames
			angfound=(poslletra[l]==taulapos[l]);
			//print orientatiu
			//System.out.println("("+poslletra[l]+"="+taulapos[l]+")->"+angfound);
			l++;
		}
		return angfound;
	}
	public String GetFrase()	{return aux;}			//el metode GetFrase ens retorna aux
				
				
}