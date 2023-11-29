package com.ellago;

/**
 * @author Pablo Coba Lodin
 */


public class Frecursivas {

	public static int factorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		else {

			return num*(factorial(num-1));
			
		}
		
	}
	
	public static int fibonacci(int num){

		if(num == 1) {
			return 0;
		}
		if(num == 2) {
			return 1;
		}
		else {
			if(num>1) {
				return fibonacci(num-1)+fibonacci(num-2);
			}
			return 0;
		}
		
	}
	
	public static int potencia (int base, int exponente) {
		//base 5, exponente 2
		if(exponente == 0) {
			return 1;
		}
		if(exponente == 1) {
			return base;
		}
		else {
			return base * potencia(base, exponente-1);
		}

		
	}
	
}
