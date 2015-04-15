import java.awt.Rectangle;


public class Intersequen{
	public static void main(String[] args){
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		/*
		X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X,X
		P,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,X
		X,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,X
		X,X,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,X,X,X,0,0,0,X
		X,X,X,X,X,X,X,X,X,X,X,X,X,0,0,0,0,0,X,0,X,0,0,0,X
		X,X,X,X,0,0,0,0,0,0,0,0,X,0,0,X,X,X,X,0,X,0,0,0,X
		X,X,X,X,X,0,0,0,0,0,0,0,X,0,0,X,0,0,0,0,X,0,0,0,X
		X,X,X,X,X,X,0,0,0,0,0,0,X,X,X,X,0,0,0,0,X,0,0,0,X
		X,X,X,X,X,X,X,0,0,0,0,0,0,0,0,0,0,0,0,0,X,0,0,0,X
		X,X,X,X,X,X,X,X,0,0,0,0,0,0,0,0,0,X,X,X,X,0,0,0,X
		X,X,X,X,X,X,X,X,X,0,0,0,0,0,0,0,0,X,X,X,X,0,0,0,X
		X,X,X,X,X,X,X,X,X,0,0,0,0,0,0,0,0,X,X,X,X,0,0,0,X
		X,X,X,X,X,X,X,X,X,0,0,X,0,0,0,0,0,X,X,X,X,0,0,0,X
		X,X,X,X,X,X,X,X,X,0,0,X,X,0,0,0,0,X,X,X,X,0,0,0,X
		X,X,X,X,X,X,X,X,X,0,0,X,X,X,0,0,0,0,0,0,0,0,0,0,X
		X,X,X,X,X,X,X,X,X,0,0,X,X,X,X,0,0,0,0,0,0,0,0,0,X
		X,X,X,X,X,X,X,X,X,X,P,X,X,X,X,X,X,X,X,X,X,X,X,X,X
		*/
		
		/*
		0. FER UN RECTANGLE 3* DE LA POSICIO INICIAL DE LA HEROINA
		1. AGAFAR TOTES LES PORTES DE LA HABITACIO
		2. CALCULAR LA SEVA POSICIO
		3. FER UN RECTANGLE 3* DE CADA PORTA
		4. AGAFAR L'ACTOR I CALCULAR ALEATORIAMENT UNA POSICIO
		5. FER UN RECTANGLE 1* DE LA POSICIO DE L'ACTOR
		6. COMPROVAR SI RECTANGLE ACTOR INTERSECA AMB RECTANGLE HEROINA
		7. COMPROVAR SI RECTANGLE ACTOR INTERSECA AMB CADA RECTANGLE PORTA
		8. SI NO INTERSECA AMB CAP DELS 2, LA POSICIO DE L'ACTOR ES CORRECTA
		9. SI INTERSECA AMB UN QUALSEVOL, REPETIR DES DEL PAS 4
		*/
		rect1.x=0;
		rect1.y=1;
		rect1.height=3*544/32;
		rect1.width=3*800/32;
		
		rect2.x=2;
		rect2.y=1;
		rect2.height=1*544/32;
		rect2.width=1*544/32;
		
		System.out.println(rect2.intersects(rect1));
	}
}