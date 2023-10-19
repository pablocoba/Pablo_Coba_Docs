package com.ellago;
/**
 * @author Pablo Coba Lodín
6.	Crea una clase con un método millasAMetros() que toma como parámetro de entrada un valor en millas marinas y las convierte a metros.
Una vez tengas este método escribe otro millasAKilometros() que realice la misma conversión, pero esta vez exprese el resultado en kilómetros.
Nota: 1 milla marina equivale a 1852 metros.

____________¶¶
___________¶¶¶¶
__________¶¶¶¶¶¶
_________¶¶¥¥¥¶¶¶
________¶¶¥¥¥¥¥¶¶¶__________________________________________¶¶¶¶¶¶¶¶
________¶¶¥¥¥¥¥¥¶¶¶_____________________________________¶¶¶¶¶¥¥¥¥¥¶¶
________¶¶¥¥¥¥¥¥ƒƒ¶¶________________________________¶¶¶¶¥¥¥¥¥¥¥¥¶¶¶¶
________¶¶¥¥¥¥ƒƒƒƒƒ¶¶___________________________¶¶¶¶ƒƒ¥¥¥¥¥¥¥¥¶¶¶¶
________¶¶¶ƒƒƒƒƒƒƒƒ§¶¶________________________¶¶ƒƒƒƒƒƒƒ¥¥¥¥¥¶¶¶¶
_________¶¶¶ƒƒƒƒƒƒ§§¶¶____________________¶¶¶¶ƒƒƒƒƒƒƒƒƒƒ¥¥¶¶¶¶
___________¶¶ƒƒƒƒƒ§§¶¶__________________¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒ¶¶¶¶
____________¶¶ƒƒ§§§§¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒ§§¶¶
_____________¶¶§§§§§§§ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ§§§§¶¶
______________¶¶§§§ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ§§§§§¶¶¶¶___________________¶¶¶¶¶¶
____________¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ§§§¶¶¶____________________¶¶¶ƒƒƒƒƒ¶¶
__________¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ¶¶¶¶¶¶ƒƒƒƒ§§§¶¶¶___________________¶¶ƒƒƒƒƒƒƒƒ¶¶
_________¶¶ƒƒ¶¶¶¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒ¶¶__¶¶¶¶ƒƒƒ§§§§§¶¶________________¶¶ƒƒƒƒƒƒƒƒƒƒ¶¶
________¶¶ƒƒ¶¶__¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒ¶¶¶¶¶¶¶¶ƒƒƒ§§§§§§¶¶___________¶¶¶¶ƒƒƒƒƒƒƒƒ§§§§§§¶¶
_______¶¶ƒƒƒ¶¶¶¶¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ¶¶¶¶¶¶ƒƒƒƒƒ§§§§§§¶¶________¶¶ƒƒƒƒƒƒƒƒ§§§§§§§§§§¶¶
_______¶¶ƒƒƒƒ¶¶¶¶ƒƒƒƒƒ¥¥¥ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ####§§§§§¶¶____¶¶¶¶ƒƒƒƒƒƒƒƒ§§§§§§§§§§§§¶¶
_______¶¶###ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ¥¥ƒƒƒƒƒƒ########§§§§¶¶¶¶¶¶ƒƒƒƒƒƒƒƒ§§§§§§§§§§§§§§§§¶¶
_______¶¶####ƒƒƒƒƒƒƒƒ¥¥¥¥¥¥¥¥¥¥¥ƒƒƒƒƒƒ########§§¶¶¶¶ƒƒ¶¶¶¶ƒƒƒƒ§§§§§§§§§§§§§§§§§§¶¶
____¶¶¶¶¶¶###ƒƒƒƒƒƒƒƒƒ¥¥¥#####¥ƒƒƒƒƒƒƒ########¶¶ƒƒ¶¶ƒƒƒƒƒƒ¶¶§§§§§§§§§§§§§§§§§§§§¶¶
__¶¶¶ƒƒ¶¶¶¶#ƒƒƒƒƒƒƒƒƒƒ¥¥####¥¥ƒƒƒƒƒƒƒƒƒƒ####§§¶¶ƒƒƒƒƒƒƒƒ¶¶¶¶§§§§§§§§§§§§§§§§¶¶¶¶
_¶¶ƒƒ¶ƒƒƒƒ¶¶ƒƒƒƒƒƒƒƒƒƒƒƒ¥¥¥¥ƒƒƒƒƒƒƒƒƒƒƒƒƒƒ§§¶¶ƒƒƒƒƒƒƒƒƒƒƒƒ¶¶§§§§§§§§§§§§¶¶¶¶
¶¶ƒƒƒƒƒƒ§§§§¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ¶¶ƒƒƒƒƒƒƒƒ§§§§¶¶§§§§§§§§§§¶¶¶¶
__¶¶ƒƒ§§§§§§¶¶¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ§§§§§¶¶¶§§§§§§§§¶¶
____¶¶§§§§§§§¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ§§§§§§¶__¶§§§§§§¶¶
______¶¶§§§§§§ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ§§§§§§¶¶____¶¶§§§§§§¶¶
________¶¶¶§ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ§§§§§§¶¶_______¶¶§§§§§§¶¶
_________¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ§§§§¶¶¶¶____¶¶¶¶§§§§§§§§§§¶¶
_________¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ§§¶¶§§¶¶¶¶¶¶ƒƒ§§§§§§§§¶¶¶¶
________¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ§§§§§§§¶¶ƒƒƒƒ§§§§§§¶¶¶¶
________¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ§§§§§§§§¶¶§§§§§§§¶¶¶¶
__¶¶¶¶¶¶¶¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ§§§§§§§§§¶¶§§§§§§¶¶
_¶¶ƒƒ¶¶ƒƒƒ¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ§§§§§§§§§¶¶¶¶§§§§§§¶¶
_¶¶ƒƒƒ¶¶ƒƒƒ¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ§§§§§§§§§§¶¶__¶¶¶###§§§¶¶
__¶¶§§§§§§§§¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ§§§§§§§§§§§§§¶¶¶¶¶#######§§§¶¶
___¶¶§§§§§§§§¶¶ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ§§§§§§§§§§§§§§§§§########¶¶¶¶¶¶
____¶¶§§§§§§§§¶¶§§§§ƒƒƒƒƒƒƒ§§§§§§§§§§§§§§§§§§§####¶¶¶¶¶¶
_____¶¶§§§§§§§¶¶§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§¶¶¶¶
_______¶¶¶¶¶¶¶§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§¶¶
______________¶¶¶¶¶¶¶¶¶¶§§§§§§§§§§§§§§§§§§§§¶¶
________________________¶¶¶¶¶¶§§§§§§§§§§¶¶¶¶
____________________________¶¶¶¶§§§§¶¶¶¶¶
____________________________¶¶§§§§§§§§¶¶
____________________________¶¶§§¶¶§§§¶¶
_____________________________¶¶§¶¶§§¶¶
______________________________¶¶¶¶¶¶

 */
import java.util.Scanner;

public class millasAMetros {
	
	//creamos un constructor 🙄
	public millasAMetros() {

	}
	public double millasAMetros(double millas){
		//nose qué explicar aquí, recogemos millas y lo multiplicamos por 
		//los metros que son una milla y lo devolvemos
		return millas*1852 ;
	}
	public double millasAKilometros(double millas){
		//igual pero dividiendo el multiplicador por 1000
		return millas*1.852 ;
	}
	
	public static void main(String[] args) {
		millasAMetros conversion = new millasAMetros();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame unas millitas!");
		double millas = teclado.nextDouble();
		
		System.out.println(millas+" millas son "+ conversion.millasAMetros(millas)+" metros ó " + conversion.millasAKilometros(millas) + " kilómetros");

	}
}

