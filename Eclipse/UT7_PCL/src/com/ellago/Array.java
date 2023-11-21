package com.ellago;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Pablo Coba Lodín
 */

public class Array {



	/**
	 * Crea un array con numeros enteros aleatorios del 1 al 10
	 * @param longitud longitud del array
	 * @return Array de numeros aleatorios
	 */
	
	public static int[] crearArrayInt(int longitud) {
		
		int[] arrayInt = new int[longitud];
		
		for(int i=0;i<arrayInt.length;i++) {
			arrayInt[i]= (int) (Math.random()*10);
		}
			
		return arrayInt;
		
	}
	
	
	/**
	 * Crea un array con datos aleatorios del 1 al 10
	 * @param longitud longitud del array
	 * @return Array de datos aleatorios
	 */
	
	public static String[] crearArrayString(int longitud) {
		
		String[] arrayString = new String[longitud];

		for(int i = 0; i<longitud; i++) {
			
			arrayString[i]="Dato" + (int)(Math.random()*10);
			
		}
		
		return arrayString;
		
	}
	
	/**
	 * Muestra el array de numeros enteros
	 * @param arrayInt Array de enteros
	 * @return Syso del array
	 */
	
	public static void mostrarArrayInt(int[] arrayInt) {
		
		for(int i = 0; i<arrayInt.length;i++) {
			System.out.print(arrayInt[i]+" ");

		}
		System.out.println();

		
	}
	
	/**
	 * Muestra el array de datos
	 * @param arrayString Array de datos
	 * @return Syso del array
	 */
	
	public static void mostrarArrayString(String[] arrayString) {
		
		for(int i = 0; i<arrayString.length;i++) {
			System.out.print(arrayString[i]+" ");}

		System.out.println();
	}
	
	/**
	 * Busca un número en un array de enteros
	 * @param arrayInt array en el que buscar
	 * @param num número que checkear
	 * @return true o false dependiendo de si lo encuentra o no
	 */
	
	public static boolean buscarArrayInt(int[] arrayInt, int num) {
		
		for(int i = 0; i<arrayInt.length;i++) {
			
			if(arrayInt[i]==num) {
				return true;
			}
			
		}
		return false;

	}
	
	/**
	 * Busca un dato en un array de Strings
	 * @param arrayString array en el que buscar
	 * @param dato dato que checkear
	 * @return true o false dependiendo de si lo encuentra o no
	 */
	
	public static boolean buscarArrayString(String[] arrayString, String dato) {
		
		for(int i = 0; i<arrayString.length;i++) {
			
			if(arrayString[i].equals(dato)) {
				return true;
			}
			
		}
		
		return false;

	}
	
	/**
	 * Busca la posicicion dato en un array de ints, y si no devuelve -1
	 * @param arrayInt array en el que buscar
	 * @param num numero que checkear
	 * @return true o false dependiendo de si lo encuentra o no
	 */
	
	public static int localizaPosInt(int[] arrayInt, int num) {
		
		for (int i = 0; i < arrayInt.length; i++) {
			
			if(arrayInt[i]==num) {;
				
				return i;
			}
		}
		return -1;
		
	}
	
	/**
	 * Busca la posicicion dato en un array de Strings, y si no devuelve -1
	 * @param arrayString array en el que buscar
	 * @param dato dato que checkear
	 * @return el numero de la posicion en el array
	 */
	
	public static int localizaPosString(String[] arrayString, String dato) {
		
		for (int i = 0; i < arrayString.length; i++) {
			
			if(arrayString[i].equals(dato)) {;
				
				return i;
			}
		}
		return -1;
		
	}
	
	/**
	 * Devuelve el numero de veces que se repite el numero.
	 * @param arrayInt array en el que buscar
	 * @param num dato que checkear
	 * @return numero de veces que se repite.
	 */
	
	public static int vecesIntArray(int[] arrayInt, int num) {
		
		int contador = 0;
		
		for (int i = 0; i < arrayInt.length; i++) {
			
			if(arrayInt[i]==num) {;
				
				contador++;
			}
			
		}
		
		return contador;
		
	}
	
	/**
	 * Devuelve el numero de veces que se repite el dato.
	 * @param arrayString array en el que buscar
	 * @param dato dato que checkear
	 * @return número de veces que se repite.
	 */
	
	public static int vecesStringArray(String[] arrayString, String dato) {
		
		int contador = 0;
		
		for (int i = 0; i < arrayString.length; i++) {
			
			if(arrayString[i].equals(dato)) {;
				
				contador++;
			}
			
		}
		
		return contador;
		
	}

	/**
	 * Devuelve la suma de dos arrays
	 * @param arrayInt1 sumando 1
	 * @param arrayInt2 sumando 2
	 * @return el nuevo Array
	 */
	
	public static int[] unirArraysInt(int[] arrayInt1, int[] arrayInt2) {
		
		int[] newArray = new int[arrayInt1.length];
		
		for (int i = 0; i < arrayInt2.length; i++) {
			newArray[i] = arrayInt1[i]+arrayInt2[i];
		}
		
		return newArray;
		
	}
	
	/**
	 * Cambia los valores de la posicion de un array que coincidan con el numero introducido
	 * y lo sustituye por el otro numero introducido
	 * @param arrayInt array del que se desea cambiar
	 * @param numBuscado numero que se desea cambiar
	 * @param numSustituto numero que quedara
	 * @return contador de las veces que se cambio
	 */
	
	public static int sustituirIntArray(int[] arrayInt, int numBuscado, int numSustituto) {
		
		int contador=0;
		
		for (int i = 0; i < arrayInt.length; i++) {
			if(numBuscado==arrayInt[i]) {
				arrayInt[i]=numSustituto;
				contador++;
			}

		}
		
		if(contador>0) {
			return contador;
		}
		return -1;
		
	}
	
	/**
	 * Cambia los valores de la posicion de un array que coincidan con el dato introducido
	 * y lo sustituye por el otro dato introducido
	 * @param arrayString array del que se desea cambiar
	 * @param buscado numero que se desea cambiar
	 * @param sustituto numero que quedara
	 * @return contador de las veces que se cambio
	 */
	
	public static int sustituirStringArray(String[] arrayString, String buscado, String sustituto) {
		
		int contador=0;
		
		for (int i = 0; i < arrayString.length; i++) {
			if(arrayString[i].equals(buscado)) {
				arrayString[i]=sustituto;
				contador++;
			}

		}
		if(contador>0) {
			return contador;
		}
		return -1;
		
	}
	
	public static void ordenarIntArray(int[] arrayInt) {
		int temporal = 0;

		//primer bucle para recorrer todo el array
		for(int i = 0; i<arrayInt.length;i++) {
				//segundo bucle para recorrer el array menos el número de vueltas
				//del primero menos 1
			for(int j=0;j<arrayInt.length-i-1;j++) {
				
				if(arrayInt[j+1] < arrayInt[j]) {
					//asignamos a la temporal el siguiente valor
					temporal = arrayInt[j+1];
					//al siguiente valor le asignamos el actual, que es mayor
					arrayInt[j+1]=arrayInt[j];
					//al actual valor le asignamos el temporal, que es el siguiente valor
					arrayInt[j]=temporal;
					//así se intercambian
				}
			
			}			
			
		}
		
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.print(arrayInt[i]+" ");
		}
	}
	
	public static void ordenarIntString(String[] arrayString) {
		String temporal = "";
		for(int i = 0; i<arrayString.length;i++) {
				
			for(int j=0;j<arrayString.length-i-1;j++) {
				//FALTA PONER QUE SE COMPARE EL ÚLTIMO DÍGITO DE LOS STRINGS
				if(arrayString[j+1].compareTo(arrayString[j])==-1 ) {
					temporal = arrayString[j+1];
					arrayString[j+1]=arrayString[j];
					arrayString[j]=temporal;
				}
			
			}			
			
		}
		
		for (int i = 0; i < arrayString.length; i++) {
			System.out.print(arrayString[i]+" ");
		}
	}
	
}

