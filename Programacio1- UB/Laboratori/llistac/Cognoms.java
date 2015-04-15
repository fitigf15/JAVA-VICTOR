import java.util.Scanner;

class Persona{
	public String nom;
	public String cognom1;
	public String cognom2;
	public String dni;
}

public class Cognoms{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Introdueix el nombre de persones que tens");
		int n= sc.nextInt();
		int[][] contcognom= new int[n][4];
		boolean comu=false;
		String[][] persones = new String[n][4];
		Persona person = new Persona();
		
		System.out.println("Introdueix les persones i els seus dni");
		person.nom=sc.next();
		person.cognom1=sc.next();
		person.cognom2=sc.next();
		person.dni=sc.next();
		
		persones[0][0]=person.nom;
		persones[0][1]=person.cognom1;
		persones[0][2]=person.cognom2;
		persones[0][3]=person.dni;
		
		for(int i=1; i<n; i++){
			System.out.println("Persona "+i+":");
			for(int j=0; j<4;j++){
				if(j==0){
					person.nom=sc.next();
					persones[i][0]=person.nom;
				}else if(j==1){
					person.cognom1=sc.next();
					persones[i][1]=person.cognom1;
				}else if(j==2){
					person.cognom2=sc.next();
					persones[i][2]=person.cognom2;
				}else{
					person.dni=sc.next();
					persones[i][3]=person.dni;
				}
			}
		}
		/*for(int i=0; i<n; i++){
			System.out.print("[ ");
			for(int j=0; j<4;j++){
				System.out.print(persones[i][j]+" ");
			}
			System.out.println(" ]");
		}*/
		int i=0,k=0,j=1,l=1,cont=0;
		String cog1="",cog2="";
		while((i<n)&&(!comu)){
			j=1;
			while((j<3)&&(!comu)){
				k=0;
				while((k<n)&&(!comu)){
					l=1;
					while ((l<3)&&(!comu)){
						System.out.println("i="+i+", j="+j+", k="+k+", l="+l);
						System.out.println("Comparo ("+persones[i][j]+") amb ("+persones[k][l]+")");
						cog1=persones[i][j];
						cog2=persones[k][l];
						if (cog1.equals(cog2)){
							contcognom[i][j]++;
							System.out.println("contador "+contcognom[i][j]);
							comu= (contcognom[i][j]==2);
							if (comu){
								System.out.println("¡¡¡¡¡¡COMU!!!!!!");
								for (int p=0; p<4;p++){
									System.out.print(persones[i][p]+" ");
								}
								System.out.println();
								for (int q=0; q<4;q++){
									System.out.print(persones[k][q]+" ");
								}
								System.out.println();
							}
						}
						l++;
					}
					k++;
				}
				j++;
			}
			i++;
		}
		/*for(int i=0; i<n; i++){
			for(int j=2; j<4; j++){
				for(int k=0; k<n; k++){
					for(int l=2; l<4; l++){*/
	}
}
					
					