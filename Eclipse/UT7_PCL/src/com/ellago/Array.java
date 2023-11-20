package com.ellago;
import java.util.Scanner;
public class Array {

	public static int[] crearArrayInt(int longitud) {
		
		int[] arrayInt = new int[longitud];
		
		for(int i=0;i<arrayInt.length;i++) {
			arrayInt[i]= (int) (Math.random()*10);
		}
		
		
		return arrayInt;
		
	}
	
	public static void mostrarArrayInt() {
		
	}
	
	public static String[] crearArrayString(int longitud) {
		
		String[] arrayString = new String[longitud];
		
		for(int i = 0; i<longitud; i++) {
			
			arrayString[i]="Dato " + (int)(Math.random()*10);
			
		}
		
		return arrayString;
		
	}
	
	public static void main(String[] args) {
		/*
		System.out.println("¿Cuántos números quieres generar?");
		Scanner key = new Scanner(System.in);
		int longitud = key.nextInt();
		System.out.println();
		int[] arrayInt = crearArrayInt(longitud);
		
		for(int i = 0; i<longitud; i++) {
			System.out.println(arrayInt[i]);
		}
		*/
		
		System.out.println("¿Cuántos datos quieres generar?");
		Scanner key = new Scanner(System.in);
		int longitud = key.nextInt();
		System.out.println();
		String[] arrayString = crearArrayString(longitud);
		
		for(int i = 0; i<longitud; i++) {
			System.out.println(arrayString[i]);
		}
		
	}

}
