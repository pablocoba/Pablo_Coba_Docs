package com.ellago;

/*�Y si en lugar de generar n�meros enteros entre 0 y 9 queremos generar n�meros
entre 1 y 10? Como habr�s podido adivinar, simplemente habr�a que sumar 1 al
n�mero generado, de esta forma se �desplazan un paso� los valores generados al
azar, de tal forma que el m�nimo valor que se produce ser�a el 0 + 1 = 1 y el m�ximo
ser�a 9 + 1 = 10.*/

public class Aleatorios4 {
	public static void main(String[] args) {
		System.out.println("20 n�meros aleatorios entre 1 y 10 (sin decimales):");
		for (int i = 1; i <= 20; i++) {
		System.out.print( (int)(Math.random()*10 + 1) + " ");
		}
		System.out.println();
		}

}
