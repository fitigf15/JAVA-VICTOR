import java.util.Scanner;

public class ComptaLletres{
	public static void main(String[] args){
		int[] contabecedari;
		int maxim=0;
		char[] abecedari;
		char lletrafrequent=' ';
		String paraula="",frase="";
		
		abecedari=new char[26];
		contabecedari=new int[26];
		
		for(int i=0; i<26;i++){
			abecedari[i]=(char)((int)'a'+i);
			System.out.print(abecedari[i]+" ");
		}
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introdueix una frase");
		paraula=sc.next();
		
		while (!paraula.equals("fi")){
			frase= frase+paraula;
			paraula=sc.next();
		}
		
		System.out.println("Lletres de la frase: "frase);
		
		for(int i=0;i<frase.length();i++){
			for(int j=0;j<26;j++){
				if (frase.charAt(i)==(abecedari[j])){
					contabecedari[j]++;
					if (contabecedari[j]>maxim){
						maxim=contabecedari[j];
						lletrafrequent=abecedari[j];
					}
				}
			}
		}
					
		System.out.println("La lletra mes frequent es: "+lletrafrequent+", "+maxim+" cops.");	
	}
}
		
		