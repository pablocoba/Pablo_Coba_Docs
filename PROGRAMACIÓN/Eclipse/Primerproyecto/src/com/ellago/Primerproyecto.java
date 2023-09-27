
package com.ellago;

import java.util.Scanner;

public class Primerproyecto {
	final double PI =3.1415926536;
	int x;
	
	int obtenerX(int x) {
		int valorantiguo = this.x;
		return valorantiguo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("buenas!!!!");
		int x = 5;
		int y = 6;

		System.out.println(x + y);

		// declarar variables
		byte mes = 12;
		int contador = 0;
		final double pi = 3.1415926535897932384626433832795;
		float interes = 4.25e2F;
		char letra = 'Z';
		boolean encontrado = true;
		// imprimir valores
		System.out.println(mes); // imprimirá 12
		System.out.println(contador); // imprimirá 0
		System.out.println(pi); // imprimirá 3.141592653589793
		System.out.println(interes); // imprimirá 425.0
		System.out.println(letra); // imprimirá Z
		System.out.println(encontrado); // imprimirá true
		
		
		
		
		int x=5;
		int y=3;
		
		System.out.printf("El valor de x es %d y el valor de y es %d\n", x,y);
		x += y;
		System.out.println("Suma combinada: x+=y" + " .......... x vale " + x);
		x=5;
		x-=y;
		System.out.println("Resta combinada: x-=y" + " .......... x vale " + x);
		x=5;
		x*=y;
		System.out.println("Producto combinado: x*=y" + " .......... x vale " + x);
		x=5;
		x/=y;
		System.out.println("Cociente combinado: x/=y" + " .......... x vale " + x);
		x=5;
		x%=y;
		System.out.println("Resto combinado: x%=y" + "......... x vale " + x);
		
		Scanner teclado =new Scanner(System.in);
		int x, y;
		String cadena;
		boolean resultado;
		System.out.print("Introducir primer número:");
		x=teclado.nextInt();
		System.out.print("Introducir segundo número:");
		y=teclado.nextInt();
		
		cadena=(x==y)?"iguales":"distintos";
		System.out.printf("Los números %d y %d son %s\n",x,y,cadena);
		resultado=(x!=y);
		System.out.println("x != y // es " + resultado);
		resultado=(x<y);
		System.out.println("x<y // es " + resultado);
		resultado=(x>y);
		System.out.println("x>y // es " + resultado);
		resultado=(x <=y);
		System.out.println("x<=y // es " + resultado);
		resultado=(x>=y);
		System.out.println("x >=y // es " + resultado);
		*/
		
		System.out.println("OPERADORES LÓGICOS");
		
		System.out.println("\nNegación:\n! false es: " + (!false));
		System.out.println("! true es : " + (!true));
		
		System.out.println("\nOperador AND (&):\nfalse & false es: " + (false & false));
		System.out.println("false & true es : " + (false & true));
		System.out.println("true & false es : " + (true & false));
		System.out.println("true & true es : " + (true & true));
		
		System.out.println("\nOperador OR Exclusivo (^):\nfalse ^ false es: " + (false^false));
		System.out.println("false ^ true es: " + (false^true));
		System.out.println("true ^ false es: " + (true^false));
		System.out.println("true ^ true es: " + (true^true));
		
		System.out.println("\nOperador OR (|):\n false | false es: " + (false | false));
		System.out.println("false | true es : " + (false|true));
		System.out.println("true | false es : " + (true|false));
		System.out.println("true | true es : " + (true |true));
		
		System.out.println("\nOperador &&:\nfalse && false es: " + (false && false));
		System.out.println("false && true es: " + (false &&true));
		System.out.println("true && false es: " + (true&&false));
		System.out.println("true && true es: " + (true&&true));
		
		System.out.println("\nOperador ||:\nfalse ||false es: " + (false||false));
		System.out.println("false || true es: " +(false||true));
		System.out.println("true ||false es: " + (true||false));
		System.out.println("true || true es: " + (true||true));
	}

}
