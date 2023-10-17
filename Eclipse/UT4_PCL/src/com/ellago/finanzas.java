package com.ellago;
/**
 * @author Pablo Coba Lodín
 * 1.	Realiza una clase finanzas que convierta dólares a euros y viceversa. 
 * 		Codifica los métodos dolaresToEuros y eurosToDolares. 
 * 		Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y dólares.
		La clase tiene que tener:
		 Un constructor finanzas() por defecto, el cual establecerá el cambio Dólar-Euro en 1.36.
		 Un constructor finanzas(double), el cual permitirá configurar el cambio dólar-euro.

 */
import java.util.Scanner;



public class finanzas { //creamos la clase pública finanzas 

	private double dolar; //le asignamos atributos euro y dolar
	private double euro;
	private double cambiodolar; //estas variables serán para almacenar los cambios de divisa
	private double cambioeuro;
	
	public finanzas(double dolar, double euro) {//le hacemos un constructor que pida dolares y euros
		cambiodolar = this.cambiodolar;
		cambioeuro = this.cambioeuro;
		this.dolar = dolar;						//los referenciamos con los atributos de la clase
		this.euro = euro;
		
		cambioeuro = euro/1.054394;	//aquí hacemos el cambio de divisa
		cambiodolar = dolar*1.054394;
	}
	
	
	
	public double getCambioEur() { //método get para cambio de euro a dolar
		return cambioeuro;
	}
	public double getCambioDolar() { //método get para cambio de dolar a euro
		return cambiodolar;
	}
	
	
	public double getDolar() { //método para comprobar los dólares que tenemos
		return dolar;
	}
	
	public double getEur() { //método para comprobar los dólares que tenemos
		return euro;
	}
	
	
	public static void main(String[] args) {
		
		double a= 0; double b=0;
		Scanner teclado = new Scanner(System.in); //pedimos los euros y dolares por teclado
		System.out.println("0.-cambio dol-eur\n1.-cambio eur-dol");
		int sel = teclado.nextInt();
		switch(sel) {
		case 0: System.out.println("dolars porfa\n");
		a = (double)teclado.nextInt();
		finanzas f1 = new finanzas(a,b); //inicializamos una nueva finanza
		System.out.println("\n"+f1.getDolar()+" dólares serán "+f1.getCambioDolar()+" euros");
		break;
		
		case 1:System.out.println("euros porfa\n");
		b = (double)teclado.nextInt();
		finanzas f2 = new finanzas(a,b); //inicializamos una nueva finanza
		System.out.println("\n"+f2.getEur()+" euros serán "+f2.getCambioEur()+" dólares");
		break;
		}
		
		

		
		
		
		

		

	}

}
