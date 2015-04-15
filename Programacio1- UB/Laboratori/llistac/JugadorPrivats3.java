public class JugadorPrivats3 {
	private int any;
	private float alçada;
	
	public void setAny(int n)	{any=n;}
	public void setAlçada(float f)	{alçada=f;}
	public JugadorPrivats3 copia() {
		JugadorPrivats3 aux;
		aux = new JugadorPrivats3();
		aux.any = this.any;
		aux.alçada= this.alçada;
		return aux;
	}
}