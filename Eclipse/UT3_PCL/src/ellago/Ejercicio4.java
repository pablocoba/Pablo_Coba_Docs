package ellago;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4.	Se desea conocer el lucky number (número de la suerte) de cualquier persona. 
		El número de la suerte se consigue reduciendo la fecha de nacimiento a un 
		número de un solo dígito. Por ejemplo, la fecha de nacimiento de Emma es la 
		siguiente: 16-08-1973 → 16+8+1973 = 1997 → 1+9+9+7=26 → 2+6 =8. 
		El número de la suerte de Emma será el 8. 
		Realiza un programa que calcule el lucky number de cualquier persona.
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce tu día de nacimiento: ");
		int dia = teclado.nextInt();
		System.out.println("introduce tu mes de nacimiento numéricamente: ");
		int mes = teclado.nextInt();
		System.out.println("introduce tu año de nacimiento: ");
		int ano = teclado.nextInt();
		teclado.close(); //pedimos datos
		
		int suma1 = (dia+mes+ano); //sumamos todos
	
		
		int real4 = suma1%10;	//dividimos los dígitos en variables (las "real")
		int dig3 = suma1%100;
		int real3= dig3/10;
		int dig2 = suma1%1000;
		int real2= dig2/100;
		int dig1 = suma1%10000;
		int real1= dig1/1000;

		
		int suma2 = real1+real2+real3+real4; //sumamos los dígitos

		
		int final2=suma2%10; //sacamos los dígitos en variables de nuevo
		int final1=suma2/10;
		System.out.println("Tu lucky number es el "+(final2+final1)); //mostramos por pantalla la suma directamente
		
		
	}

}
