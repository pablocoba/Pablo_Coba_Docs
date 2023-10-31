package com.ellago;

//@author Daniel Leal Sanchez

import java.util.Scanner;

public class MillasAMetros {

	private double millas; //Declaramos el atributo a tener en cuenta
	
	public MillasAMetros (double millas) { //creamos un constructor
		this.millas=millas;
	}
	
	public double millasametros() { //Creamos el metodo de conversion de millas a metros
		return millas*1852;
	}
	public double millasakilometros() { //creamos el metodo de conversion de millas a kilometros
		return millas*1.852;
	}
	
	public static void main(String[] args) { 

		double conversion; //Declaramos el dato a intoducir por teclado
		MillasAMetros Calculo; //Declaramos el objeto a crear
		
		Scanner sc=new Scanner(System.in); //Introducimos el escaner
		System.out.println("Introduce las millas a las que le quieres aplicar la conversion: "); //Pedimos el numero a asignar por consola
		conversion = sc.nextDouble();
		sc.close(); //se cierra el escaner
		
		Calculo = new MillasAMetros (conversion); //se llama al constructor 
		
		
		//Imprime los resultados
		
				System.out.println(conversion+" millas son "+Calculo.millasametros()+" metros"); 
				
				
				System.out.println(conversion+" millas son "+Calculo.millasakilometros()+" kilometros");
	}

}
