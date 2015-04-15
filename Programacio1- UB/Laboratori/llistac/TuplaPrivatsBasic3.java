import java.util.Scanner;

public class TuplaPrivatsBasic3 {
	public static void main(String[]args){
		int a; float h;
		JugadorPrivats3 tupla = new JugadorPrivats3();
		JugadorPrivats3 tupla2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Any?");
		a=sc.nextInt();
		System.out.println("Alçada?");
		h=sc.nextFloat();
		
		tupla.setAny(a);
		tupla.setAlçada(h);
		
		tupla2 = tupla.copia();
		System.out.println(tupla2(a));
	}
}