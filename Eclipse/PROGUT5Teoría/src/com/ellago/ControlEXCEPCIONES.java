package com.ellago;

import java.io.*;

public class ControlEXCEPCIONES{
 public static void main(String[] args){
	 int numero=-1;
	 int intentos=0;
	 String linea;

	 BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

 do{
	 try{
		 System.out.print("Introduzca un n�mero entre 0 y 100: ");
		 linea = teclado.readLine();
		 numero = Integer.parseInt(linea);

	 }catch(IOException e){
		 	System.out.println("Error al leer del teclado.");

	 }catch(NumberFormatException e){
		 	System.out.println("Debe introducir un n�mero entre 0 y 100.");

	 }finally{
		 	intentos++;
	 }
 }while (numero < 0 || numero > 100);

 System.out.println("El n�mero introducido es: " + numero);
 System.out.println("N�mero de intentos: " + intentos);

 }
}