package com.ellago;

public class BucleWHILE {
	 public static void main(String[] args) {
	 // Declaraci�n e inicializaci�n de variables
	 int numero = 7;
	 int contador;
	 int resultado=0;

	 //Salida de informaci�n
	 System.out.println ("Tabla de multiplicar del " + numero);
	 System.out.println (".............................. ");

	 //Utilizamos ahora el bucle while
	 contador = 1; //inicializamos la variable contadora
	 while (contador <= 10) //Establecemos la condici�n del bucle
	 {
	 resultado = contador * numero;
	 System.out.println(numero + " x " + contador + " = " + resultado);
	 //Modificamos el valor de la variable contadora, para hacer que el
	 //bucle pueda seguir iterando hasta llegar a finalizar
	 contador++;
	 }
	 }
	} 
