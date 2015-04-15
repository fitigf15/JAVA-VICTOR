public class Peo{
	private char color;
	private int x,y;
	private String posit,colour;
	
	
	public void SetPeo(String entrada){
		color=entrada.charAt(0);
		if (color=='w'){
			color='b';
		}else if(color=='b'){
			color='w';
		}
		x=entrada.charAt(1)-'A';
		y=entrada.charAt(2)-'1';
		posit=entrada.substring(1,3);
	}
	public int GetX()	{return x;}
	public int GetY()	{return y;}
	public String GetPosit() {return posit;}
	public char GetColor()	{return color;}
	public String GetColour(){
		if(color=='w'){
			colour="black";
		}
		if(color=='b'){
			colour="white";
		}
		return colour;
	}
}