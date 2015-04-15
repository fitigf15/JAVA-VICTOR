/*
	Programa O per: mostra el resultat de diferents operacions
*/
public class newfile{
	public static void main(String[]args){
		int a,b,x,c;
		float z;

		a = 5/3+2;
		b = 2*5/3;
		c = 2/3*5;
		System.out.println("a="+a +" b="+b+" c=" +c);

		z = (float)10e3 ;
		x = 1000*(1/3 + 1/3 + 1/3 - 1);
		System.out.println("z="+z+" x="+x);

		b = b+1/b;
		x = 1/x;
		a = x;
		z = 1/a;
		System.out.println("b= "+b+" x= "+x+" a="+a+" z="+z);

		a = 32%b;
		b = 235%10;
		c = 235/10;
		System.out.println("a= "+a+ " b= "+b+ " c=" +c);
	}
}
