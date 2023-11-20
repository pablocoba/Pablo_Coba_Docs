package com.ellago;

public class ArrayMulti2 {
	public static void main(String[] args) {
			
			int fila, columna;
			int[][] n = {{20, 4}, {67, 33}, {0,7}};
			
			for(fila = 0; fila < n.length; fila++) {
				System.out.print("Fila: " + fila);
				for(columna = 0; columna < n[0].length; columna++) {
					System.out.printf("%10d ", n[fila][columna]);
				}
				System.out.println();
			}
		}

}
