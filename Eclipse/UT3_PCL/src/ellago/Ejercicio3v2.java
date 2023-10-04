package ellago;
/**
 * 
 * @author Pablo Coba Lodín
 */
import java.util.Scanner;
public class Ejercicio3v2 {

	public static void main(String[] args) {

		int lin=4;
		int esp=lin-1;
		int ast=1;
		int asttot;
		
		for(int i=1; i<=lin;i++) {
			for(int k = 0; k<esp;k++) {
				System.out.print(" ");
			}
			for(int j = 0; j<ast;j++) {
				System.out.print("*");
			}
			System.out.println();
			esp=esp-1;
			ast=ast+2;

			
		}
		asttot=ast;

		
	}

}
