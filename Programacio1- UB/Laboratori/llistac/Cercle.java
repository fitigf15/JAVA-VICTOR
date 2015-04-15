
public class Cercle{

	private  double r,x,y,xmaxl,xmaxr,ymaxd,ymaxu;

	public void SetXYR(double abscissa,double ordenada,double radi){
		r=radi;
		x=abscissa;
		y=ordenada;
		xmaxl=x-r;
		xmaxr=x+r;
		ymaxu=y+r;
		ymaxd=y-r;
	}
	
	public double GetR()	{return r;}
	public double GetX()	{return x;}
	public double GetY()	{return y;}
	public double GetXmaxl()	{return xmaxl;}
	public double GetYmaxd()	{return ymaxd;}
	public double GetXmaxr()	{return xmaxr;}
	public double GetYmaxu()	{return ymaxu;}
	
	public boolean esDominant(Cercle c){
		c.SetXYR(c.GetX(),c.GetY(),c.GetR());
		if((r>=c.GetR())&&(xmaxl<=c.GetXmaxl())&&(ymaxd<=c.GetYmaxd())&&(xmaxr>=c.GetXmaxr())&&(ymaxu>=c.GetYmaxu())){
				return true;
		}else{
			return false;
		}
	}
}
	