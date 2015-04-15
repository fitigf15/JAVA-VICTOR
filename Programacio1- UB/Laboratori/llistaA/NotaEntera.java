/*
*
*		NotaEntera.java
*	Aquest programa, donada una nota acadèmica de 0 a 10 entera, entrada per l'usuari, indica el seu equivalent en
*	text. En el cas de Notable, indicara si és Alt o Baix; en el cas d'Insuficient, dira la nota numèrica.  
*	By: Victor Gomez
*/
import java.util.*;

public class NotaEntera
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int nota;
	System.out.println("Introduiu la vostra nota academica de 0 a 10 entera:");
	nota = sc.nextInt();
	if (0<=nota && nota<=10)
		{
		if (5<=nota && nota<6)
			{
				System.out.println("Heu aprovat pero per poc no suspeneu, suficient");
		} else if (6<=nota && nota<7)
			{
				System.out.println("Heu aprovat, pero podrieu millorar, be");
		} else if (7<=nota && nota<9)
			{
				System.out.print("Esta ben fet, notable. ");
			if (7<=nota && nota<8)
				{
					System.out.print("baix.");
			} else if (8<=nota && nota<9)
				{
					System.out.print("alt.");
				}	
			System.out.println();
		} else if ( 9<=nota && nota<10 )
			{
				System.out.println("Ho heu fet excel·ent! Felicitats!");
		} else if ( nota==10 )
			{
				System.out.println("Enhorabona, ho heu fet perfecte! Matricula d'honor.");
		} else
			{
				System.out.println("Heu tret un insuficient, un "+nota+" sobre 10.");
			}
	} else
		{
			System.out.println("Si us plau, escriviu una nota que estigui entre 0 i 10");
		}
	}
}
