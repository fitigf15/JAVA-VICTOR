/*
Volem fer unes petites estadístiques sobre un club esportiu, del qual tenim per a cadascun dels atletes dues dades, el sexe i la marca que pot saltar l'atleta amb perxa. El sexe serà una cadena amb valor home o dona. La marca de perxa serà un nombre (enter positiu) de centímetres que pot saltar l'atleta amb perxa. La introducció de dades finalitzarà quan l'usuari introdueixi una cadena diferent de home o dona. El programa escriurà: el nombre total d'atletes, el nombre d'homes, quants salten més de 2 metres i la mitjana d'aquests salts (en metres), el nombre de dones, la mitjana de salt (en metres) de totes i la millor marca femenina. (Atletes.java) 

               Atletes.java
        By: Victor Gomez Farrus
        Grup de practiques: B

*/

import java.util.Scanner;

public class Atletes{
	public static void main(String[] args){
		String cadena;
		int mperxah, mperxahtot=0,mperxad,mperxadtot=0,tempd=0,atletes=0,homes=0,dones=0,saltenh=0;
		float mitjanasaltsh=0, mitjanasaltsd=0;
		boolean stop=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduiu el sexe:");
		cadena=sc.next();
		if(cadena.equals("home")){
			atletes++;
			//print orientatiu
			//System.out.print("atletes="+atletes+" , ");
			homes++;
			//print orientatiu
			//System.out.print("homes="+homes+" , ");
			//System.out.println();
			System.out.println("Introduiu la marca de perxa en centimetres:");
			mperxah=sc.nextInt();
			if(mperxah>=0){
				mperxahtot= mperxahtot+mperxah;
				//print orientatiu
				//System.out.print("mperxahtot="+mperxahtot+" , ");
				if (mperxah>200){
					saltenh++;
					//print orientatiu
					//System.out.print("saltenh="+saltenh+" , ");
				}
			}else{
				while(mperxah<0){
                			System.out.println("No pots introduir un valor negatiu, introdueix un valor positiu si us plau.");
                                        mperxah=sc.nextInt();
                                        if(mperxah>=0){
                                        	mperxahtot=mperxahtot+mperxah;
						//print orientatiu
						//System.out.print("mperxahtot="+mperxahtot+" , ");
						if (mperxah>200){
							saltenh++;
							//print orientatiu
							//System.out.print("saltenh="+saltenh+" , ");
						}
                                        }
                                }
			}
			//System.out.println();
		}else if(cadena.equals("dona")){
			atletes++;
			//print orientatiu
			//System.out.print("atletes="+atletes+" , ");
			dones++;
			//print orientatiu
			//System.out.print("dones="+dones+" , ");
			//System.out.println();
			System.out.println("Introduiu la marca de perxa en centimetres:");
			mperxad=sc.nextInt();
			if(mperxad>=0){
				mperxadtot=mperxadtot+mperxad;
				//print orientatiu
				//System.out.print("mperxadtot="+mperxadtot+" , ");
				if(mperxad>tempd){
					tempd=mperxad;
					//print orientatiu
					//System.out.print("tempd="+tempd+" , ");
				}
			}else{
				while(mperxad<0){
					System.out.println("No pots introduir un valor negatiu, introdueix un valor positiu si us plau.");
					mperxad=sc.nextInt();
                               		if(mperxad>=0){
                                       		mperxadtot=mperxadtot+mperxad;
						//print orientatiu
						//System.out.print("mperxadtot="+mperxadtot+" , ");
                                       		if(mperxad>tempd){
                                               		tempd=mperxad;
							//print orientatiu
							//System.out.print("tempd="+tempd+" , ");
                                       		}
					}
				}					
			}
			//System.out.println();
		}else{
			stop=true;
		}
		
		while(((cadena.equals("home"))||(cadena.equals("dona")))&&(!stop)){
			System.out.println("Introduiu el sexe:");
			cadena=sc.next();
			if(cadena.equals("home")){
                               	atletes++;
				//print orientatiu
				//System.out.print("atletes="+atletes+" , ");
                               	homes++;
				//print orientatiu
				//System.out.print("homes="+homes+" , ");
				//System.out.println();
                               	System.out.println("Introduiu la marca de perxa en centimetres:");
                               	mperxah=sc.nextInt();
                               	if(mperxah>=0){
                               	        mperxahtot= mperxahtot+mperxah;
					//print orientatiu
					//System.out.print("mperxahtot="+mperxahtot+" , ");
					if (mperxah>200){
						saltenh++;
						//print orientatiu
						//System.out.print("saltenh="+saltenh+" , ");
					}
                               	}else{  
                               	        while(mperxah<0){
                               	                System.out.println("No pots introduir un valor negatiu, introdueix un valor positiu si us plau.");
                               	                mperxah=sc.nextInt();
                               	                if(mperxah>=0){
                               	                        mperxahtot=mperxahtot+mperxah;
							//print orientatiu
							//System.out.print("mperxahtot="+mperxahtot+" , ");
							if (mperxah>200){
								saltenh++;
								//print orientatiu
								//System.out.print("saltenh="+saltenh+" , ");
                                                       	}
                                	        }
                            		}
                                } 
				//System.out.println();      
                        }else if(cadena.equals("dona")){
                               	atletes++;
				//print orientatiu
				//System.out.print("atletes="+atletes+" , ");
                               	dones++;
				//print orientatiu
				//System.out.print("dones="+dones+" , ");
				//System.out.println();
                               	System.out.println("Introduiu la marca de perxa en centimetres:");
                               	mperxad=sc.nextInt();
                               	if(mperxad>=0){
                               	        mperxadtot=mperxadtot+mperxad;
					//print orientatiu
					//System.out.print("mperxadtot="+mperxadtot+" , ");
                               	        if(mperxad>tempd){
                               	                tempd=mperxad;
						//print orientatiu
						//System.out.print("tempd="+tempd+" , ");
                               	        }
                               	}else{  
                               	        while(mperxad<0){
                               	                System.out.println("No pots introduir un valor negatiu, introdueix un valor positiu si us plau.");
                               	                mperxad=sc.nextInt();
                               	                if(mperxad>=0){
                               	                        mperxadtot=mperxadtot+mperxad;
							//print orientatiu
							//System.out.print("mperxadtot="+mperxadtot+" , ");
                               	                        if(mperxad>tempd){
                               	                                tempd=mperxad;	
								//print orientatiu
								//System.out.print("tempd="+tempd+" , ");
                               	                        }
                               	                }
                               	        }
                               	}
				//System.out.println();	
			}else{
				stop=true;
			}
		}
		System.out.println();
		System.out.println();
		if (mperxahtot!=0){
			mitjanasaltsh= (((float)mperxahtot/(float)homes)/100);
		}
		if (mperxadtot !=0){
			mitjanasaltsd= (((float)mperxadtot/(float)dones)/100);
		}
		System.out.println("Hi ha "+atletes+" atletes. Tenim "+dones+" dones i "+homes+" homes. ");
		System.out.println("La mitjana dels homes es de: "+mitjanasaltsh+" metres. La de les dones es de: "+mitjanasaltsd+" metres.");
		System.out.println("Han saltat mes de 2 metres "+saltenh+" homes.");
		System.out.println("La millor marca femenina es: "+tempd+"centimetres(" +((float)tempd)/100+ " metres)");
		System.out.println();
		System.out.println();
	}
}
				
				
				
				
			
		
