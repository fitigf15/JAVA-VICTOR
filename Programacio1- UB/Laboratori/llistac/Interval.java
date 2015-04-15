

public class Interval{
	private float interval0,interval1,aux;
	
	public void SetInterval(float i0,float i1){
		if(i0>i1){
			//System.out.println("canvi");
			aux=i0;
			i0=i1;
			i1=aux;
		}
		interval0=i0;
		interval1=i1;
	}
	public float GetInterval0()	{return interval0;}
	public float GetInterval1()	{return interval1;}
	public float GetNorma()		{return interval1-interval0;}
	public boolean Conte(Interval b){
		if ((interval1-interval0>=b.GetNorma())&&(interval0<=b.GetInterval0())&&(interval1>=b.GetInterval1())){
			return true;
		}else{
			return false;
		}
	}
}