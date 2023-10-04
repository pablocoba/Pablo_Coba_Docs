package ellago;
/**
 * 
 * @author Pablo Coba Lodín
 */
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
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int x = teclado.nextInt();
		
			System.out.print("\n");
			for(int b=1;b<=x;b++) {
				for(int j=1;j<=b;j++) {
					System.out.print("*");
					
				}
				System.out.print("\n");

			}
		
	}

}
