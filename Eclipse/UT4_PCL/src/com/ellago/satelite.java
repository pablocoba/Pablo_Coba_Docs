package com.ellago;

public class satelite {
	/**
	 * 
	 * @author Pablo Coba Lodín
	 * Método void variaAltura(double desplazamiento): Este método acepta un parámetro que será positivo o negativo dependiendo de si el satélite tiene que alejarse o acercarse a La Tierra.
	 * Método boolean enOrbita(): Este método devolverá false si el satélite está en tierra, y true en caso contrario.
	 * Método void variaPosicion(double variap, double variam): Este método permite modificar los atributos de posición (meridiano y paralelo) mediante los parámetros variap y variam. Estos parámetros serán valores positivos o negativos relativos que harán al satélite modificar su posición.

	 */
		 private double meridiano;
		 private double paralelo;
		 private double distancia_tierra;
		 satelite (double m,double p,double d){
		  meridiano=m;
		  paralelo=p;
		  distancia_tierra=d;
		 }
		 satelite (){
		  meridiano=paralelo=distancia_tierra=0;
		 }
		 public void setPosicion(double m,double p,double d){
		  meridiano=m;
		  paralelo=p;
		  distancia_tierra=d;
		 }
		 public void printPosicion(){
		  System.out.println("El satélite se encuentra en el paralelo" + paralelo+ "Meridiano" +meridiano+ "a una distancia de la tierra de" +distancia_tierra+ "Kilómetros");
		 }
		 public void variaAltura(double despl) {
			 
		 }
		 public boolean enOrbita(satelite dist) {
			 if(dist.distancia_tierra<=0) {  
				 return false;
			 }
			 else{
				 return true;
			 }
		 }
		 public void variaPosicion(double variap, double variam) {
			 variap=paralelo;
			 variam=meridiano;
		 }

	public static void main(String[] args) {


	}

}
