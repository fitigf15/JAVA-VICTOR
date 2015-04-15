 
import java.util.Scanner;

public class EncriptarRotNfinal{
        public static void main( String [] args){
		System.out.println("Escriu una frase que comenci amb un numero seguit d'una paraula i anirem codificant fins que escriguis 0");
                Scanner sc = new Scanner(System.in);
                int n=sc.nextInt();

                while (n!=0){
                        String par = sc.next();
                        String par_enc= "";
                        for (int i=0; i<par.length(); i++){
                                char lletra = par.charAt(i);
                                int pos= lletra-'a';
                                char lletra_enc = (char)('a'+(n+pos)%26);
                                par_enc = par_enc + lletra_enc;
                        }
                System.out.print(par_enc+" ");
                n=sc.nextInt();
                }
		System.out.println();
        }
}
