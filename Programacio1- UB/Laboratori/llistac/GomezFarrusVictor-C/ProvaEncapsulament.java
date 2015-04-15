 
public class ProvaEncapsulament{
	private int   enter;
	private int[] TaulaEnter;
  
	public void setEnter(int n)	{enter=n;}


	public void inicialitza() {
		TaulaEnter=new int[enter];
		}
  
	public void setValor(int idx, int valor){
		TaulaEnter[idx] = valor;
	}

	public int[] getTaulaEnter()	{return TaulaEnter;}
}