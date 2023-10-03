package ellago;

public class Ejercicio7 {

	public static void main(String[] args) {

		/*7.Realiza un programa que muestre por pantalla los números del 1 al 100 sin 
		 * mostrar aquellos números múltiplos de 5.*/
		System.out.println("Números del 1 al 100 sin multiplos de 5");
		for(int i=1;i<=100;i++) {
			if(i%5!=0) {
				System.out.print(i+", ");
			}
			
		}
	}

}
