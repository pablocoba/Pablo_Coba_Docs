package ellago;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		/*8.Realiza el control de acceso a una caja fuerte. La combinación será un número de 
		    4 cifras. El programa nos pedirá la combinación para abrirla. Si no acertamos, 
		    se nos mostrará el mensaje “Lo siento, esa no es la combinación” y si acertamos 
		    se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. 
		    Tendremos cuatro oportunidades para abrir la caja fuerte.*/
		
		int combi=1234;
		Scanner teclado = new Scanner(System.in);
		
		int numint;
		
		for(numint = 3;numint>=0;numint--) {
			System.out.println("INTRODUCE LA CONTRASEÑA:\n");
			int intento = teclado.nextInt();
			
			if(intento==combi) {
				System.out.println("\nCONTRASEÑA CORRECTA");
				break;
			}
			else {
				System.out.println("\nCONTRASEÑA INCORRECTA, "+numint+" INTENTOS RESTANTES\n"); //lo de los intentos restantes sé que no hacía falta
				
			}
		}
		
		//los switches molan
		///////////////////////////////////////
		///////////////////////////////////////
		//todo esto es for fun
		
		System.out.println("\nDESEA CAMBIAR LA CONTRASEÑA?");
		System.out.println("INTRODUZCA 1 PARA SÍ");
		System.out.println("INTRODUZCA 0 PARA NO\n");
		int opcion = teclado.nextInt();
		
		switch(opcion) {
		case 1: 
			System.out.println("\nINTRODUZCA CONTRASEÑA DE 4 DÍGITOS:\n");
			int nuevapass = teclado.nextInt();
			
			combi=nuevapass;
			System.out.println("\nSU NUEVA CONTRASEÑA ES "+combi);
			for(numint = 3;numint>=0;numint--) {
				System.out.println("\nINTRODUCE LA CONTRASEÑA:\n");
				int intento2 = teclado.nextInt();
				
				if(intento2==combi) {
					System.out.println("\nCONTRASEÑA CORRECTA");
					break;
				}
				else {
					System.out.println("\nCONTRASEÑA INCORRECTA, "+numint+" INTENTOS RESTANTES\n");
					
				}
			}
			teclado.close();
			break;
			
			
			
		case 2:
			
			System.exit(1);
			teclado.close();
			break;
			
		}
		
	}

}
