package ellago;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número");
		int a=teclado.nextInt();
		System.out.println("Introduce otro número");
		int b=teclado.nextInt();
		System.out.println("Introduce otro número");
		int c=teclado.nextInt();
		
		if(a>b&a>c) {
			if(b>c) {
				System.out.println(a + " es mayor que " + b + ", que es mayor que " + c);
			}
			else {
				System.out.println(a + " es mayor que " + c + ", que es mayor que " + b);
			}	
		}
		else if(b>a&b>c) {
			if(a>c) {
				System.out.println(b + " es mayor que " + a + ", que es mayor que " + c);
			}
			else {
				System.out.println(b + " es mayor que " + c + ", que es mayor que " + a);
			}
		}
		else if(c>a&c>b){
			if(b>a) {
				System.out.println(c + " es mayor que " + b + ", que es mayor que " + a);
			}
			else {
				System.out.println(c + " es mayor que " + a + ", que es mayor que " + b);
			}
				
		}
		
		
	}
}


