package com.ellago;

import java.io.*;

public class SentenciaRETURN {

	 private static BufferedReader stdin = new BufferedReader( new
	InputStreamReader(System.in));

	 public static int suma(int numero1, int numero2)
	 {
		 int resultado;
		 resultado = numero1 + numero2;
		 return resultado; //Mediante return devolvemos el resultado de la suma
	 }

	 public static void main(String[] args) throws IOException {
	 //Declaraci�n de variables
		 String input; //Esta variable recibir� la entrada de teclado
		 int primer_numero, segundo_numero; //Estas variables almacenar�n los operandos

	 // Solicitamos que el usuario introduzca dos n�meros por consola
		 System.out.print ("Introduce el primer operando:");
		 input = stdin.readLine(); //Leemos la entrada como cadena de caracteres
		 primer_numero = Integer.parseInt(input); //Transformamos a entero lo introducido
		 System.out.print ("Introduce el segundo operando: ");
		 input = stdin.readLine(); //Leemos la entrada como cadena de caracteres
		 segundo_numero = Integer.parseInt(input); //Transformamos a entero lo introducido

	 //Imprimimos los n�meros introducidos
		 System.out.println ("Los operandos son: " + primer_numero + " y " + segundo_numero);
		 System.out.println ("obteniendo su suma... ");

	 //Invocamos al m�todo que realiza la suma, pas�ndole los par�metros adecuados
		 System.out.println ("La suma de ambos operandos es: " +
		suma(primer_numero,segundo_numero));


	 }
	} 
