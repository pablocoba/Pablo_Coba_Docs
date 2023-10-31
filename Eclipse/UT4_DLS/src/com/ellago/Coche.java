package com.ellago;

//@author Daniel Leal Sanchez

public class Coche {

	//Declaramos los atributos
	
	private String marca; 
	private String modelo;
	
	//Primer Constructor
	
	public Coche() {
		this.marca= "-";
		this.modelo= "-";
	}
	
	//Segundo Constructor
	
	public Coche(String marca,String modelo) {
		this.marca=marca;
		this.modelo=modelo;
	}
	
	//Se introduce el metodo
	
	public void mostrar() {
		System.out.println(this.marca+" "+this.modelo);
	}

	
	public static void main(String[] args) {
		//Se declaran los objetos

		Coche Coche1,Coche2;
		
		//Se llama al constructor
		
		Coche1=new Coche();
		Coche2=new Coche("SEAT","IBIZA");
		
		//Usamos el metodo que he creado para comprobar que esta todo correcto
		
		System.out.println("El primer Coche es del tipo: ");
		
		Coche1.mostrar();
		
		System.out.println("El segundo Coche es del tipo: ");
		
		Coche2.mostrar();

		
	}

}
