package com.ellago;

public class Etiquetas { 
	public static void main(String[] args) {
		
	for (int i = 1; i < 3; i++) {
					
		bloque_uno:{
			bloque_dos:{
				System.out.println("Iteracci�n: "+i);
				if (i==1) break bloque_uno;
				if (i==2) break bloque_dos;
			}
			System.out.println("Despu�s del bloque dos");
			
		}
		System.out.println("Despu�s del bloque uno");
	}
	System.out.println("Fin del bucle");
	}

}
