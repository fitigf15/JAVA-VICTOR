import java.util.Scanner;

public class EncriptarComentat{
        public static void main(String[]args){
                //Definim i inicialitzem algunes variables
                String paraula = "";
                String frase = "";
                String frasecodif="";
                boolean acaba=false;
                int n,lenfrase=0,codif,noucodif=0;
                char caracter,noucaracter;
                //char [] abecedari= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
                //char [] ABECEDARI= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
                Scanner sc = new Scanner(System.in);
                //System.out.println(abecedari);
                //System.out.println(ABECEDARI);        
                System.out.println("Escriviu una frase que vulgueu codificar fins que trobem una paraula que acabi amb -fi-. Si no escriviu cap paraula, el programa no acabara mai i llavors haureu de picar ctrl+c per cancelar l'ordre.");
                //Escanegem la primera paraula
                paraula=sc.next();
                //Comprovarem si acaba en "fi"
                if ((!paraula.endsWith("fi")) && !acaba){
                        //Per comprovar-ho fariem aquest println de sota
                        //System.out.println(paraula+" = "+acaba);
                        frase = frase+paraula+" ";
                }
                while((!paraula.endsWith("fi")) && !acaba){
                        paraula=sc.next();
                        acaba = paraula.endsWith("fi");
                        //Per comprovar-ho fariem aquest println de sota
                        //System.out.println(paraula+" = "+acaba);
                        frase = frase + paraula+ " ";
                }
                //El println de sota seria la frase acabada amb fi
                //System.out.println(frase);
                //Agafem el valor de la llargaria de la frase
                lenfrase=frase.length();
		System.out.println("Escriviu un n amb el que volgueu codificar la frase. n ha de valdre entre 1 i 9, ambdos inclosos.");
               	//Escanegem la codificacio n
                n = sc.nextInt();
		//Si n esta entre 1 i 9, ambdos inclosos
		if ((n<=9)&&(n>=1)){
                	//Per cada caracter de la frase
                	for(int i=0; i<frase.length();i++){
                        	//Direm el seu numero ASCII corresponent
                        	codif = (int)frase.charAt(i);
                        	//Si el caracter esta entre a..z, A..Z o es un dels caracters comuns(espai, coma, apostrof, punt...)
                        	if (((65<=codif)&&(codif<=90)) || ((97<=codif)&&(codif<=122)) || (codif == 32)||(codif==10)||(codif==33)||(codif==39)||(codif==45)||(codif==63)){
                                	//Si es dones el cas en que codificant amb n, ens dones un numero mes gran al corresponent de z, hauriem de tornar al principi
                               		 if (((codif<=90)&&(codif>=90-n+1))||((codif<=122)&&(codif>=122-n+1))){
                                	        noucodif = codif-26+ n; // sera la seva nova codificiacio
                                	//Si es dones el cas en que tenim un caracter comu(espai, coma, punt, apostrof...)
                                	}else if((codif==32)||(codif==10)||(codif==33)||(codif==39)||(codif==45)||(codif==63)){
                                	        noucodif = codif; // mantindra la seva codificacio
                                	//Si no es dones cap altre cas(es a dir, mentre poguem codificar amb n sense que ens doni un numero corresponent a a..z o A..Z)
                                	}else{
                                	        noucodif = codif + n; // sera la seva nova codificacio
                                	}
                        	}	
                        	//El nou caracter codificat seria
                        	noucaracter = (char)noucodif;
                       		//Aquesta serie de prints ens indicarien tots els canvis de codificacio pas a pas 
                        	//System.out.print(frase.charAt(i)+"=");
                        	//System.out.print(codif+"->");
                        	//System.out.print(noucodif+"=");
                        	//System.out.print(noucaracter);
                        	//Farem una nova frase codificada amb els nous caracters codificats
                        	frasecodif = frasecodif + noucaracter;
                        	//System.out.println();
                	}
			//Imprimirem la nova frase codificada
			System.out.println("La vostra frase codificada amb n="+n+" es: "+ frasecodif);
		//Si n no esta entre 1 i 9, ambdos inclosos
		}else{
                        System.out.println("Aquest programa ha estat dissenyat exclusivament per treballar amb n entre 1 i 9");
                }
                /*
                while (i != frase.length()){
                        caracter = frase.charAt(i);
                        codif = Character.getNumericValue(caracter) + n;
                        caractercodif = 
                        System.out.print(caracter);
                        i++;
                }
                */
        }
}

