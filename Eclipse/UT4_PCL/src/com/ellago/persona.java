package com.ellago;

import java.time.LocalDate;

import java.util.Date;
public class persona {
	private String nombre;
	private String fechaN;
	public int diaReal = 20;
	public int mesReal = 10;
	public int anoReal = 2023;
	
	public static LocalDate fecha_actual = LocalDate.now();
	//declaramos la fecha actual para luego
	
	public persona(String nombre) {
		this.nombre = nombre;
	}
	public persona(String nombre, String fechaN) {
		this.nombre = nombre;
		this.fechaN = fechaN;
	}


	public String getNombre() {
		return nombre;
	}
	public String getFechaN() {
		return fechaN;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setFechaN(String fechaN) { //debe ser introducida en formato dd/mm/aaaa
		this.fechaN = fechaN;
	}
	public int edad(int ano, int mes, int dia) { //pedimos el dia mes y año de nacimiento, que se calculan en el main
		if(ano == 0 ||mes == 0||dia == 0) {
			return -1;
		}
		else {
			int edadano = fecha_actual.getYear() - ano;
			
			if(mes>=fecha_actual.getMonthValue()) { //si el mes es menor a la fecha actual, no tendrá 

				if(dia<=fecha_actual.getDayOfMonth()) {
					return edadano;
				}
				else {
					return edadano-1;
				}
			}
			else {
				return edadano;
			}
		}
		
	}
	
/*	public int edad(String fechaN) {
		
		return;

	}*/
	public static void main(String[] args) {

		persona pablo = new persona("Pablo", "20102007");

		//esto es para dividir la fecha en enteros de mes, dia y año
		int c = Integer.valueOf(pablo.fechaN);
		int ano = c%10000;
		int mes = (c%1000000)/10000;
		int dia = c/1000000;
		
		System.out.println(fecha_actual);
		System.out.println(pablo.edad(ano,mes,dia));

		
	}

}
