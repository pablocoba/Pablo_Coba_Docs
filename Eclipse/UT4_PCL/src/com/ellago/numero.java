package com.ellago;
/**
 * 
 * @author Pablo Coba Lodín
 * 3.	Realiza una clase número que almacene un número entero y tenga las siguientes características:
 * Constructor por defecto que inicializa a 0 el número interno.
 * Constructor que inicializa el número interno.
 * Método aniade que permite sumarle un número al valor interno.
 * Método resta que resta un número al valor interno.
 * Método getValor. Devuelve el valor interno.
 * Método getDoble. Devuelve el doble del valor interno.
 * Método getTriple. Devuelve el triple del valor interno.
 * Método setNumero. Inicializa de nuevo el valor interno.
 */
import java.util.Scanner;
public class numero {
	
	public int n;
	public numero() {n = 0;}
	public int shown() {
		return n;
	}
	public int addn(int anadido) {
		return (n + anadido);
	}
	
	public int resn(int anadido) {
		return (n-anadido);
	}
	public int getValor() {
		return n;
	}
	public int getDoble() {
		return (2*n);
	}
	public int getTriple() {
		return (3*n);
	}
	public void setNumero() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce nuevo valor: ");
		n = teclado.nextInt();
		teclado.close();
	}
	public static void main(String[] args) {
		

	}

}
