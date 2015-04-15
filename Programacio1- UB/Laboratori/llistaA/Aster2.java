/*		
*
*
*		Aster2.java
*       Aquest programa es una modificacio del programa Aster1.java.
*	Aquest programa fa que n sigui el nombre de linies d'asteriscs
*	que s'han d'escriure i escrigui una sortida del tipus:
*	*
*	***
*	*****
*	*******
*	*********
*	etc...
*       By: Victor gomez
*
*/
import java.util.*;

public class Aster2
{
        public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);
                int linies, i;
                i = 0;
                System.out.println("Escriviu un nombre n que compleixi n <= 65");
                linies = sc.nextInt();
                String aster = new String("*");
                System.out.println("S'imprimiran "+ linies + " linies d'asteriscs.");
                if ( linies <= 65)
                {
			while ( linies > i )
                        {
                                System.out.println(aster);
				i = i+1;
				aster = aster + "*" + "*";
				
                        }
                }
                 else
                {
                        System.out.println("El nombre no compleix les condicions demanades anteriorment.");

                }
                System.out.println();
        }

}

