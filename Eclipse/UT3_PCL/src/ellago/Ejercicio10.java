package ellago;
/**
 * 
 * @author Pablo Coba Lodín
 * //10.Escribe un programa que calcule el factorial de un número entero leído por teclado.
 */
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int n = teclado.nextInt();
		teclado.close(); //cerrar teclado
		
        double factorial = 1;	
		
		for(int i = 1; i<=n;i++) {
			factorial = factorial * i;	 //factorial x i que va subiendo y se va multiplicando por sí mismo		
		}
		  System.out.printf("%d! = %0.f %n", n, factorial);
		
	}

}
