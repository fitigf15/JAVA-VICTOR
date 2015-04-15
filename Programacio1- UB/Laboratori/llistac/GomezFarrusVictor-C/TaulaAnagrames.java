public class TaulaAnagrames{
	private Anagrama[] taula;							//Es la taula d'anagrames
	private int mida,numanagrames=0;						//mida es la mida de la taula
											//numanagrames es el numero de Anagrama que tenim
	
	public void SetMida(int n)	{mida=n;}					//El metode SetMida ens permetra establir la mida en
											//funcio de un nombre enter
	public void Inicialitza()	{taula=new Anagrama[mida];}			//Es el metode per inicialitzar la taula
  
	public void SetAnagrama(int posicio, Anagrama a){				//Es el metode SetAnagrama serveix per posar un 												//anagrama en una posicio dela taula. Va en funcio del
											//Anagrama a i del enter posicio
		taula[posicio] = a;
		numanagrames++;
	}
	public int GetNumAnag()		{return numanagrames;}				//El metode GetNumAnag ens retornara el numero de												//anagrames
	public Anagrama GetAnagrama(int posicio)	{return taula[posicio];}	//El metode GetAnagrama ens retornara l'anagrama que 
											//tinguem en una posicio determinada. Va en funcio del
											//enter posicio
}
  