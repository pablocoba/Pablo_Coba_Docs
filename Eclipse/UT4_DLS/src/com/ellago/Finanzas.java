package com.ellago;

//@author Daniel Leal Sanchez

public class Finanzas {


		private double Cambio; //Se declara el atributo 
		
		
		public Finanzas() { //Se crea el constructor 
			
			this.Cambio=1.36; //Se le asigna el valor al atributo
		}
		
		public Finanzas( double cambio) { //Se crea el segundo constructor
		
		this.Cambio=cambio;
		}
		
		public double getCambio(){ //Se crea el getter del cambio
			return this.Cambio;
		}
			
		public void setCambio(double cambio) { //se crea el setter del cambio
			this.Cambio=cambio;
		}
		
		
		public double DolartoEuros (double Dolar) { //Se aplica el metodo en este caso double y se le dice que para esta conversion se divida
			return Dolar / this.Cambio;
			}
		
		public double EurostoDolares (double Euros) { //Se aplica el metodo double y se le dice que para este caso se multiplique 
			return Euros * this.Cambio; 
				
		}
				
		public static void main(String[] args) {
		// TODO Auto-generated method stub

			Finanzas Cambio1,Cambio2; //Se declaran los objetos
			
			//Se llama al constructor para realizar los objetos
			
			Cambio1 = new Finanzas(); 
			Cambio2 = new Finanzas(1.68);
			
			//Se muestran los resultados por pantalla
			
		System.out.println(50 + " dolares al cambio de 1.36 "+Cambio1.EurostoDolares(50) +" Euros" );
		System.out.println(50 + " dolares al cambio de 1.68 "+Cambio2.EurostoDolares(50) +" Euros" );

		System.out.println(45 + " Euros al cambio de 1.36 "+Cambio1.DolartoEuros(45) +" dolares" );
		System.out.println(45 + " Euros al cambio de 1.68 "+Cambio2.DolartoEuros(45) +" dolares" );
		}
}

