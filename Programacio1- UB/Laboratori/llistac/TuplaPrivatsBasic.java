import java.util.Scanner;

public class TuplaPrivatsBasic{
	public static void main(String[]args){
		int a; float h;
		JugadorPrivats tupla = new JugadorPrivats();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Any?");
		a=sc.nextInt();
		System.out.println("Alçada?");
		h=sc.nextFloat();
		
		tupla.setAny(a);
		tupla.setAlçada(h);
		
		System.out.println("Any="	+tupla.getAny());
		System.out.println("Alçada="	+tupla.getAlçada());
	}
}
		