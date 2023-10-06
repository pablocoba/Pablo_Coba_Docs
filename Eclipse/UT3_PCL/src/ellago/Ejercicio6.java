package ellago;
/**
 * 
 * @author Pablo Coba Lodín
 * 6.	Realiza un programa que muestre por pantalla los 50 primeros números pares.
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		int i = 2;
		System.out.println("estos son los números pares del 1 al 50:");

		do {
			System.out.print(i+", ");
			i=i+2; //simplemente desde el dos voy imprimiendo de 2 en 2.
		}while(i<=50);
	}
	
	

}
