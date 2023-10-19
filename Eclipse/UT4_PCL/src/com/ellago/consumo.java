package com.ellago;

public class consumo {
	public double km;
	public double litros;
	public double vmed;
	public double pgas;
	
	public double getTiempo(double distancia) {
		
		double tiempo = distancia / vmed;
		return tiempo;
	}
	
	public double consumoMedio(double distancia) {
		//quitar esto
		return distancia;
	}
	
	
	public static void main(String[] args) {


	}

}
