package com.ellago;

public class Main {

	public static void main(String[] args) {
		//5 horas a la semana
		//2 lunes, 1 jueves, 2 viernes
		//Asignaturas Sistemas = new Asignaturas("Sistemas Informáticos", 176, 3);
		//Sistemas.calcularPorcentajes();

		//Sistemas.showData();
		Horario horario = new Horario();
		//horario.showHorario();
		horario.festivos();
		
		//horario.showHorasTotales();
		
		///*bbdd*/6, 
		///*prog*/10, 
		///*ingl*/2, 
		///*entorn*/0, 
		///*marcas*/7, 
		///*sistemas*/3, 
		///*fol*/6);

		horario.setHorasFaltas(
				/*bbdd*/6, 
				/*prog*/10, 
				/*ingl*/2, 
				/*entorn*/0, 
				/*marcas*/7, 
				/*sistemas*/3, 
				/*fol*/6);
		
		Horario.calcularPorcentajesTodo();
		Horario.bases.showData();
		Horario.programacion.showData();
		Horario.ingles.showData();
		Horario.entornos.showData();
		Horario.marcas.showData();
		Horario.sistemas.showData();
		Horario.fol.showData();
		horario.calcularHorasTotales();
		horario.showFaltasTot();
	}

}
