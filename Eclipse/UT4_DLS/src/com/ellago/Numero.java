package com.ellago;

public class Numero {
	//Se crea el atributo
		private int numero;
		
		//Se crean los constructores
		public Numero() {
			this.numero=0;
		}
		
		public Numero(int numero) {
			this.numero=numero;
			
		}
		
		//Se crean los metodos 
		public void aniade(int num) {
			this.numero+=num;
		}
		
		public void resta(int num) {
			this.numero-=num;
		}
		
		public int getValor() {
			return this.numero;
		}
		
		public int getDoble() {
			return this.numero*2;
		}
		
		public int getTriple() {
			return this.numero*3;
		}
		
		public void setNumero(int num) {
			this.numero=num;
		}
		
		
		//probar la clase realizada
	public static void main(String[] args) {

		//Se declaran los objetos
				Numero obj1,obj2;
				
				//llamamos al constructor
				obj1=new Numero();
				obj2=new Numero(10);
				
				//sumamos y resto 2 a los atributos de cada objeto
				System.out.println("El objn1 tiene el valor de "+obj1.getValor()+ " y el objn2 tiene el valor "+obj2.getValor());
				obj1.aniade(2);
				obj2.aniade(2);
				System.out.println("El objn1 tiene el valor de "+obj1.getValor()+ " y el objn2 tiene el valor "+obj2.getValor());
				obj1.resta(2);
				obj2.resta(2);
				System.out.println("El objn1 tiene el valor de "+obj1.getValor()+ " y el objn2 tiene el valor "+obj2.getValor());
				
				//probamos los métodos de cada objeto
				
				System.out.println("El objn1 tiene el valor de "+obj1.getValor()+ " y el objn2 tiene el valor "+obj2.getValor());
				System.out.println("El doble del objeto objn1 es "+obj1.getDoble()+" y el de objn2 es "+obj2.getDoble());
				System.out.println("El triple del objeto objn1 es "+obj1.getTriple()+" y el de objn2 es "+obj2.getTriple());
				
				//modificamos los atributos de cada objeto
				obj1.setNumero(15);
				obj2.setNumero(12);
				System.out.println("El objn1 tiene el valor de "+obj1.getValor()+ "y el objn2 tiene el valor "+obj2.getValor());
				
				//
				
				

		
	}

}
