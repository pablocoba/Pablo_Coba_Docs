package com.ellago;

/*Ahora vamos a generar n�meros enteros entre
50 y 60 ambos incluidos. Primero multiplicamos Math.random() por 11, con lo que
obtenemos n�meros decimales entre 0 y 10.9999� (sin llegar nunca hasta 11). Luego
desplazamos ese intervalo sumando 50 por lo que obtenemos n�meros decimales
entre 50 y 60.9999� Por �ltimo, quitamos los decimales haciendo casting y voil�, ya
tenemos n�meros enteros aleatorios entre 50 y 60 ambos incluidos.*/

public class Aleatorios5 {
	public static void main(String[] args) {
		System.out.println("20 n�meros aleatorios entre 50 y 60 (sin decimales):");
		for (int i = 1; i <= 20; i++) {
		System.out.print(((int)(Math.random()*11) + 50 ) + " ");
		}

}
}
