package com.ellago;

//author Daniel Leal Sanchez

public class Satelite {
	
	//Se declaran los atrubutos 
	
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	
	//se crean los constructores
	
	Satelite (double m,double p,double d){
	 meridiano = m;
	 paralelo = p;
	 distancia_tierra = d;
	}
	Satelite (){
	 meridiano = paralelo = distancia_tierra =0 ;
	}
	
	//se hace un setter de los tres atributos
	public void setPosicion(double m,double p,double d){
	 meridiano = m;
	 paralelo = p;
	 distancia_tierra = d;
	}
	
	public void printPosicion(){
	System.out.println("El satélite se encuentra en el paralelo " + paralelo+ " Meridiano " +meridiano+ " a una distancia de la tierra de " +distancia_tierra+ " Kilómetros");
	}
	
	//varia la altura del satelite
	public void variaAltura(double desplazamiento) {
		this.distancia_tierra+=desplazamiento;
	}
	
	//metodo para saber si el satelite esta en la tierra o no
	public boolean enOrbita() {
		//he hecho que devuelva falso si la distancia es menor o igual que 0
		if (this.distancia_tierra<=0)return false;else return true;
	}
	
	public void variaPosicion(double variap,double variam) {
		this.paralelo=variap;
		this.meridiano=variam;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaramos los objetos
				Satelite satelite1,satelite2;
				
				//creamos los objetos y muestro su posicion
				satelite1 = new Satelite();
				satelite2 = new Satelite(1000,1000,1000);
				satelite1.printPosicion();
				satelite2.printPosicion();
				
				//probamos los metodos que hemos creado
				System.out.println("Restando 6 a la altura de sat1");
				satelite1.variaAltura(-6);
				satelite1.printPosicion();
				System.out.println("Sumando 6 a la altura de sat1");
				satelite1.variaAltura(6);
				satelite1.printPosicion();
				
				System.out.println("Sumando 40 a la altura de sat2");
				satelite2.variaAltura(40);
				satelite2.printPosicion();
				
				//comprobamos si estan en orbita
				System.out.println("El primer satelite en orbita es "+satelite1.enOrbita());
				System.out.println("El segundo satelite en orbita es "+satelite2.enOrbita());
				
				//cambiamos la posicion del satelite 1
				satelite1.variaPosicion(373, 467);
				satelite1.printPosicion();
	}

}
