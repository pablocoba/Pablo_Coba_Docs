package com.ellago;

public class SentenciaCONTINUE {
	public static void main(String[] args) {
		int contador;
		
		System.out.println("Imprimiendo los n�meros pares del 1 hasta el 10...");
		//Procesamiento y salida de informaci�n
		
		for (contador=1;contador<=10;contador++)
		{
			if (contador % 2 != 0) continue;
			System.out.print(contador+ " ");
		}
		System.out.println("\nFin del programa");
	}

}
