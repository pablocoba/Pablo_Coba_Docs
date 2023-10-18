package com.ellago;
/**
 * 
 * @author Pablo Coba Lodín
 * 2.Realiza una clase minumero que proporcione el doble, triple y cuádruple de un número 
 * proporcionado en su constructor (realiza un método para doble, otro para triple y otro para cuádruple). 
 * Haz que la clase tenga un método main y comprueba los distintos métodos.
 */
import java.util.Scanner;
public class minumero {
	
	public int num;
	minumero(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número");
		num = teclado.nextInt();
		this.num = num;
	}
	public int doble(){
		return num*2;
	}
	public int triple(){
		return num*3;
	}
	public int cuadruple(){
		return num*4;
	}
	
	public static void main(String[] args) {
		minumero entero = new minumero();
		Scanner key = new Scanner(System.in);
		System.out.println("Elige una opción:\n0- duplicar\n1- triplicar\n2- cuadruplicar\n3- salir");
		int n = key.nextInt();
		switch(n) {
		case 0:
			System.out.println(entero.num +"*2 = "+entero.doble());
			break;
		case 1:
			System.out.println(entero.num +"*3 = "+entero.triple());
			break;
		case 2:
			System.out.println(entero.num +"*4 = "+entero.cuadruple());
			break;
		case 3: 
			System.exit(0);
			
		}
	}

}
