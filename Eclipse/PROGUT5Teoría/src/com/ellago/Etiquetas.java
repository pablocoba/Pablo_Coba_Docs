package com.ellago;

public class Etiquetas { 
	public static void main(String[] args) {
		
	for (int i = 1; i < 3; i++) {
					
		bloque_uno:{
			bloque_dos:{
				System.out.println("Iteracción: "+i);
				if (i==1) break bloque_uno;
				if (i==2) break bloque_dos;
			}
			System.out.println("Después del bloque dos");
			
		}
		System.out.println("Después del bloque uno");
	}
	System.out.println("Fin del bucle");
	}

}
