package com.ellago;

public class SentenciaBREAK {
	public static void main(String[] args) {
		//Declaraci�n de variables
		int contador;
		
		//Procesamiento y salida de informaci�n
		
		for (contador=1;contador<=10;contador++) {
			if (contador==7)
				break;
			System.out.println("Valor "+contador);
		}
		System.out.println("Fin del programa");
	}
}
