package com.ellago;

public class BucleFOR {
	 /* En este ejemplo se utiliza la estructura repetitiva for
	 * para representar en pantalla la tabla de multiplicar del siete
	 */
	 public static void main(String[] args) {
	 // Declaraci�n e inicializaci�n de variables
	 int numero = 7;
	 int contador;
	 int resultado=0;

	 //Salida de informaci�n
	 System.out.println ("Tabla de multiplicar del " + numero);
	 System.out.println (".............................. ");
	//Utilizamos ahora el bucle for
	 for (contador=1; contador<=10;contador++)
	 /* La cabecera del bucle incorpora la inicializaci�n de la variable
	 * de control, la condici�n de multiplicaci�n hasta el 10 y el
	 * incremento de dicha variable de uno en uno en cada iteraci�n del
	 * bucle.
	 * En este caso contador++ incrementar� en una unidad el valor de
	 * dicha variable.
	 */

	 {
	 resultado = contador * numero;
	 System.out.println(numero + " x " + contador + " = " + resultado);
	 /* A trav�s del operador + aplicado a cadenas de caracteres,
	 * concatenamos los valores de las variables con las cadenas de
	 * caracteres que necesitamos para representar correctamente la
	 * salida de cada multiplicaci�n.
	 */
	 }
	 
	 }

	} 
