package ellago;
/**
 * 
 * @author Pablo Coba Lodín
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5.Realiza un programa que muestre por pantalla las tablas de multiplicar 
	        del 1 al 10 con el siguiente formato: 
			Tabla del 1 
			*********** 
			1 x 1 = 1 
			2 x 1 = 2 
			2 x 2 = 4 
			2 x 3 = 6 
			2 x 4 = 8 
			2 x 5 = 10
			2 x 6 = 12 
			2 x 7 = 14 
			2 x 8 = 16 
			2 x 9 = 18 
			2 x 10 = 20 
			.......
			*/
		int multiplicador = 1;
		
		for(int i=1;i<=10;i++) {
			
			System.out.println("Tabla del "+i+"\n***********");
			
			for(int j=1;j<=10;j++) {
				
				System.out.println(multiplicador+" x "+j+" = "+(j*multiplicador));	

			}
			System.out.println();
			multiplicador++;
			
		}
		
	}

}
