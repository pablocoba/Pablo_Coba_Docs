package com.ellago;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] arrayInt = Array.crearArrayInt(10);
		int[] arrayInt2 = Array.crearArrayInt(10);
		String[] arrayString = Array.crearArrayString(10);
		
		/*Array.mostrarArrayInt(Array.crearArrayInt(5));
		Array.mostrarArrayString(Array.crearArrayString(5));*/
		
		/*Array.mostrarArrayInt(arrayInt);
		System.out.println(Array.buscarArrayInt(arrayInt,8));
		
		/*Array.mostrarArrayString(arrayString);
		System.out.println(Array.buscarArrayString(arrayString,"Dato6"));*/
		
		/*Array.mostrarArrayInt(arrayInt);
		System.out.println(Array.localizaPosInt(arrayInt, 5));
		
		Array.mostrarArrayString(arrayString);
		System.out.println(Array.localizaPosString(arrayString, "Dato2"));*/
		
		/*Array.mostrarArrayInt(arrayInt);
		System.out.println(Array.vecesIntArray(arrayInt,2));
		
		Array.mostrarArrayString(arrayString);
		System.out.println(Array.vecesStringArray(arrayString,"Dato1"));*/
		
		/*for (int i = 0; i < arrayString.length; i++) {
			
			System.out.println(Array.unirArraysInt(arrayInt, arrayInt2)[i]);
			
		}*/
		
		/*
		Array.mostrarArrayInt(arrayInt);
		System.out.println(Array.sustituirIntArray(arrayInt, 2, 2000));
		Array.mostrarArrayInt(arrayInt);
		
		Array.mostrarArrayString(arrayString);
		System.out.println(Array.sustituirStringArray(arrayString, "Dato5", "Caraculo"));
		Array.mostrarArrayString(arrayString);*/
		
		Array.mostrarArrayString(arrayString);
		Array.ordenarIntString(arrayString);
		//FALTA PONER QUE SE COMPARE EL ÚLTIMO DÍGITO DE LOS STRINGS

	}

}
