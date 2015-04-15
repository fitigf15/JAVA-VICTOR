/*FET PER: VICTOR GOMEZ FARRUS*/

import java.util.Arrays;						//Aquesta llibreria ens permetra utilitzar Arrays.sort.
									//es un metode que ordena numericament un Array

public class Sequencia{
	private int[] taula,taula2;					//taula contindra la sequencia de numeros
									//taula2 contindra una sequencia de numeros importada
	private int numelements=0;					//numelements es el nombre de elements que te la taula
	private boolean iguals=true;					//iguals ens dira si les taules de elements son iguals
	
	public void SetLlarg(int n){					//aquest metode agafa un parametre enter n i en base de aquest
									//parametre ens crea una taula de n posicions
		taula=new int[n];
		numelements=n;
	}
	public void AppendNum(int numero,int posicio){			//aquest metode afegeix un numero a una determinada 
									//posicio de la taula
		taula[posicio]=numero;
	}
	public int[] GetTaula()		{return taula;}			//aquest metode ens retorna la taula que hem creat
	public boolean EsIgual(Sequencia a){				//aquest metode ens retorna true si les taules de dues sequencies son iguals
									//procediment del metode:
		taula2=a.GetTaula();					//agafem la taula de la segona sequencia
		Arrays.sort(taula);					//ordenarem les taules numericament
		Arrays.sort(taula2);
		for (int i=0;((i<numelements)&&(iguals));i++){		//farem una cerca de elements no iguals, ja si les taules contenen
									//els mateixos numeros, ordenats o desordenats, un cop ordenats
									//a les posicions d'ambdues hem de trobar els mateixos numeros.
			iguals=(taula[i]==taula2[i]);
			System.out.println(iguals);
		}
		if(iguals){return true;}else{return false;}		//retornarem true o false en funcio del que hem obtingut
		
	}
}

			