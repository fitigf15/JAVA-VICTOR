public class Anagrama{
	private String frase,aux;
	private char[] abecedari;
	private int[] poslletra,taulapos;
	private int numiguals;
	
	public void SetFrase(String entrada)	{frase=entrada;}
	public void Inicialitza(){
		aux=frase;
		abecedari= new char[26];
		poslletra= new int[26];
		for (int i=0; i<26; i++) {
			poslletra[i]=0;
			abecedari[i]=(char)('a'+i);
		}
		for(int j=0;j<aux.length();j++){
			for(int k=0;k<26;k++){
				if (aux.charAt(j)==abecedari[k]){
					poslletra[k]++;
				}
			}
		}
	}
	public int[] GetTaulaPos()	{return poslletra;}
	public boolean EsIgual(Anagrama a){
		taulapos= a.GetTaulaPos();
		numiguals=0;
		for(int l=0;l<26;l++){
			System.out.print("("+poslletra[l]+"="+taulapos[l]+")");
			if(poslletra[l]==taulapos[l]){
				numiguals++;
			}
		}
		if (numiguals==26){return true;}else{return false;}
	}
	public String GetFrase()	{return aux;}
				
				
}