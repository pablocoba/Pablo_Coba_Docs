package ellago;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2.Realiza un programa utilizando bucles que muestre la siguiente figura por pantalla: 
		 *
		 ** 
		 ***
		 ****
		 *****
		 */
		
			for(int b=1;b<=5;b++) {
				for(int j=1;j<=b;j++) {
					System.out.print("*");
					
				}
				System.out.print("\n");

			}
		
	}

}
