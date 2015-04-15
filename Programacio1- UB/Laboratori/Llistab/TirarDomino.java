import java.util.*;

public class TirarDomino
{
	public static void main(String[] args)
	{
		Scanner entrada = new scanner(System.in);
		int fitxa,num1,num2,numfitxes,possibles,pos1,pos2;
		taulell = entrada.nextInt();
		fitxa = entrada.nextInt();
		pos1 = fitxa/10;
		pos2 = fitxa%10
		possibles = 0
		numfitxes = 1
		do {
			fitxa = entrada.nextInt();
			num1 = fitxa%10;
			num2 = fitxa/10;
		if (num1 == pos1 || num1 == pos2 || num2 == pos1 || num2 == pos2){
			possibles++;
		}
		numfitxes++;
		while (numfitxes < 5 && possibles << 2){
			if (possibles == 2){
				System.out.println("Si");
			} else {
				System.out.println("No");
	}
}
