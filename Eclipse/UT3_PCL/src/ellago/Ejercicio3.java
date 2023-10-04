package ellago;
/**
 * 
 * @author Pablo Coba Lodín
 */
import java.util.Scanner;
public class Ejercicio3 {
/*3.	Realiza un programa utilizando bucles que muestre la siguiente figura por pantalla:
 		   *
 		  ***
 		 *****
 		*******
 		 *****
 		  ***
 		   *
o una pirámide introduciendo la altura y el carácter con el que se muestre.
*/
	public static void main(String[] args) {
		//HE HECHO EL DEL ROMBO
		int esp2 = 3;
		int esp3= 3;
		
		for(int lin=1;lin<=7;lin=lin+2) {
	
			
			for(int esp = esp2;esp>0;esp--) {
				
				System.out.print(" ");
			}
			for(int ast=1; ast<=lin; ast++) {
		
				System.out.print("*");

			}
			esp2--;

			System.out.println();
			
			
		}
		for(int lin=1;lin<=7;lin=lin+2) {
			
			for(int esp = esp3;esp<4;esp++) {
				
				System.out.print(" ");
			}
			
			for(int ast=5; ast>=lin; ast--) {
				
				System.out.print("*");

			}

			esp3--;

			System.out.println();
		
		}
	
			
		}

	}

