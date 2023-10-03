package ellago;

public class Ejercicio3 {

	public static void main(String[] args) {

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
}
