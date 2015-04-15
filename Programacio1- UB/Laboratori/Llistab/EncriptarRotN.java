/*
*	Autor: Victor Gomez Farrus
*	Grup de practiques: B
*	
*
*					EncriptarRotN,java
*	Aquest programa reemplaça la lletra per la lletra que esta n posicions mes endavant a l'alfabet. n valdra 1 ≤ n ≤ 9. Llegira paraula a paraula una frase acabada amb "fi"
*	i imprimira el resultat codificat desplaçant la paraula n caracters.
*/

import java.util.Scanner;

public class EncriptarRotN{
	public static void main(String[]args){
		String paraula = ""; //Tindra el valor de cada paraula que escanegem fins que la paraula acabi en "fi"
		String frase = ""; //Sera un string amb totes els paraules que hagim escanejat fins tenir una paraula que acabi en "fi"
		String frasecodif=""; //Sera la frase codificada
		//boolean acaba=false; //Ens indicara quan acabar d'escanejar paraules
		int n,lenfrase=0,codif,noucodif=0; 	// n es la codificacio
							// lenfrase es el nombre de caracters de la frase acabada en fi
							// codif es el valor de cada caracter ascii de la frase
							// noucodif es codif afegint n, que ens donara el nou valor del caracter ascii
							// i es la posicio de cada caracter a la frase
		char noucaracter; //noucaracter es el caracter ascii corresponent a la nova codificacio noucodif


		Scanner sc = new Scanner(System.in);
		System.out.println("Escriviu una frase que vulgueu codificar que acabi amb la paraula fi. Si no escriviu fi al final, el programa no acabara mai i llavors haureu de picar ctrl+c per cancelar l'ordre.");
		//Escanejarem la primera paraula
		paraula=sc.next();
		//Si la paraula acaba en "fi" el programa no te cap sentit perque no es codifica res
		if (paraula.equals("fi")) {
			System.out.println("No heu escrit res mes que fi...");
			
		}else{
			//El print de sota es per comprovar si la paraula acaba o no en "fi"
			//System.out.println(paraula+" = "+acaba);
				
			while(!paraula.equals("fi")){
				//El print de sota es per comprovar si la paraula acaba o no en "fi"
				//System.out.println(paraula+" = "+acaba);
				frase = frase + paraula+ " ";
				paraula=sc.next();
			}
			//El print de sota es per comprovar que la frase acaba en fi
			//System.out.println(frase);
			lenfrase=frase.length();
			System.out.println("Escriviu un n amb el que volgueu codificar la frase. n ha de valdre entre 1 i 9, ambdos inclosos.");
                	n = sc.nextInt();
			if ((n<=9)&&(n>=1)){ //posem entre 1 i 9, pero podria ser qualsevol nombre positiu
				for(int i=0; i<frase.length();i++){
                	                codif = (int)frase.charAt(i);
					if (((65<=codif)&&(codif<=90)) || ((97<=codif)&&(codif<=122))){
						if (((codif<=90)&&(codif>=90-n+1))||((codif<=122)&&(codif>=122-n+1))){
							noucodif = codif-26+ n;
						}else{
							noucodif = codif + n;
						}
	
					}else if((codif==32)||(codif==10)||(codif==33)||(codif==39)||(codif==44)||(codif==45||(codif==46)||(codif==63))){
	                               		noucodif = codif;
					}
					noucaracter = (char)noucodif;
	                        	//Els prints de sota son per veure pas a pas la codificacio de caracters
	                        	//System.out.print(frase.charAt(i)+"=");
	                        	//System.out.print(codif+"=");
	                        	//System.out.print(noucodif+"=");
	                        	//System.out.print(noucaracter);
	                        	frasecodif = frasecodif + noucaracter;
	                        	//System.out.println();	
				}
				System.out.println("La frase codificada amb n="+n+" es: "+frasecodif); // imprimim la nova frase codificada
			/* Aixo podria servir per encriptar amb n negativa
			}else if (n<0){
				for(int i=0; i<frase.length();i++){
	                                codif = (int)frase.charAt(i);
					if (((65<=codif)&&(codif<=90)) || ((97<=codif)&&(codif<=122))){
						if (((codif>=65)&&(codif<=65-n-1))||((codif>=97)&&(codif<=97-n-1))){
							noucodif = codif+26+n;
						}else{
							noucodif = codif+n;
						}
	
					}else if((codif==32)||(codif==10)||(codif==33)||(codif==39)||(codif==44)||(codif==45||(codif==46)||(codif==63))){
							noucodif = codif;
					}
					noucaracter = (char)noucodif;
	                       		//Els prints de sota son per veure pas a pas la codificacio
	                        	//System.out.print(frase.charAt(i)+"=");
					//System.out.print(codif+"=");
	                        	//System.out.print(noucodif+"=");
	                        	//System.out.print(noucaracter);
	                        	frasecodif = frasecodif + noucaracter;
	                        	//System.out.println();
				}
				System.out.println("La frase codificada amb n="+n+" es: "+frasecodif);
			*/
			}else{
				System.out.println("No has posat una n d'acord amb el que s'ha demanat.");
			}
		}
	}		
}	
	
