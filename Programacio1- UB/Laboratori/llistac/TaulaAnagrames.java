public class TaulaAnagrames{
	private Anagrama[] taula;
	private int mida;
	
	public void SetMida(int n)	{mida=n;}
	public void Inicialitza()	{taula=new Anagrama[mida];}
  
	public void SetAnagrama(int posicio, Anagrama a)	{taula[posicio] = a;}

	public Anagrama GetAnagrama(int posicio)	{return taula[posicio];}
}
  