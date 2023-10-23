package com.ellago;
/**
 * @author Pablo Coba Lodín
 * 1.	Realiza una clase finanzas que convierta dólares a euros y viceversa. 
 * 		Codifica los métodos dolaresToEuros y eurosToDolares. 
 * 		Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y dólares.
		La clase tiene que tener:
		 Un constructor finanzas() por defecto, el cual establecerá el cambio Dólar-Euro en 1.36.
		 Un constructor finanzas(double), el cual permitirá configurar el cambio dólar-euro.

             _.oood"""""""booo._
         _.o""      _____    * ""o._
       oP"  _.ooo""""   """"o|o*_* "Yo
     o8   oP                 | |"._* `8o
    d'  o8'_.--._            | |/  ,\* `b
   d'  d'.' __   ".          | |: (( `\
  8'  d'/,-"  `.   :         | |  ||\_/* `8
 8   8'|/      :   :    |)   _ |  || |`|   8
,8  8          :  :   /)| \ || |\_|| | |8  8.
8' ,8         /  :    " /_) |`:' | | | |8. `8
8  8'        /  /       _ _='  \ ' __   __  8
8  8        /  /        \|__ |  | |  | | 8| 8
8  8.      /  /         ||   |  | |-:' | 8| 8
8. `8    ,' ,'       __/ |__ |__| |  \ |__|,8
`8  8  ,' ,'      _ /     __ . . . . . .8LL8'
 8   8"   `------'/(    ,'  `.`. | | ,-|8  8
  8.(_________dd_/  \__/ '  0|`.`: |: (8 ,8
   Y.  Y.                    | :/| |,\|* .P
    Y.  "8.          .,o     | | |,|"*  ,P
     "8.  "Yo_               | |p|"* ,8"
       "Y_   `"ooo.__   __.oo|"* * _P"
         `'"oo_     """""    * _oo""'
              `"""boooooood"""'
 */
import java.util.Scanner;



public class finanzas { //creamos la clase pública finanzas 

	private double cambio;
	public finanzas() {cambio = 1.36;}
	public finanzas(double c) {cambio = c;}
	public double eurosToDol(double eur) {
		return eur*cambio;
	}
	public double dolToEur(double dol) {
		return dol/cambio;
	}

	public static void main(String[] args) {

		
		boolean encendido = true;
		Scanner teclado = new Scanner(System.in);
		
		
		while(encendido=true) {
			finanzas f1 = new finanzas();


			System.out.println("\nIntroduce un número para cambiar: ");
			double num = (double)teclado.nextInt();
			System.out.println("\nSeleccione si es un cambio euro-dol o dol-euro: ");
			System.out.println("\nPulse 0: euro-dolar.\nPulse 1: dol-euro\nPulse 2: salir");
			int a = teclado.nextInt();
			
			switch(a) {
			case 0:
				System.out.println(num +"€ = " + f1.eurosToDol(num)+"$");
				System.out.println("\n¿Deseas cambiar el cambio de la moneda?\nPulse 0: No.\nPulse 1: Sí\n");
				int b = teclado.nextInt();
				
				switch(b) {
				case 0:
					encendido = false;
					break;
					
				case 1:
					System.out.println("\nIntroduce el nuevo cambio: ");
					double cnuevo = (double)teclado.nextInt();
					finanzas f2 = new finanzas(cnuevo);
					
					System.out.println(num+"€ = "+f2.eurosToDol(num)+"$");
					
					break;
					
				}
				
				break;
			case 1:
				System.out.println(num +"$ = " + f1.dolToEur(num)+"€");
				System.out.println("\n¿Deseas cambiar el cambio de la moneda?\nPulse 0: No.\nPulse 1: Sí\n");
				int x = teclado.nextInt();
				switch(x) {
				case 0:
					encendido = false;
					
				case 1:
					System.out.println("\nIntroduce el nuevo cambio: ");
					double cnuevo = (double)teclado.nextInt();
					finanzas f2 = new finanzas(cnuevo);
					System.out.println(num+"$ = "+f2.dolToEur(num)+"€");
					break;
					
				}
				
				
				
				break;
			case 2:
				System.exit(0);
			}
		}
		}


	}


