package com.ellago;

//@author

import java.time.LocalDate;
import java.util.Scanner;

public class Persona { 
	
	//Se declaran los atributos
	
	private String nombre;
	private String fechanacimiento;
	
	public Persona (String nombre) { //Se crea un constructor para nombre
		this.nombre = nombre;
	}
		
	public Persona (String nombre,String fechanacimiento) { //Se crea el constructor para nombre y fecha de nacimiento
		this.nombre = nombre;
		this.fechanacimiento = fechanacimiento;
	}
	public String getnombre() { //se crea el getter de nombre
		return this.nombre;
	}
	public String getfechanacimiento() { //se crea el getter de fechanacimiento
		return this.fechanacimiento;
	}
	public void setnombre(String nombre){ //se crea el setter de nombre
		this.nombre = nombre;
	}
	public void setfecha (String fecha){ //se crea el getter de fechanacimiento 
		this.fechanacimiento=fecha;
	}
	public int getEdad() { //se introduce el valor edad y se le crea un getter
		int edad;
		if (getfechanacimiento()==null) { //se dice que si la edad es nula se reste 1
			edad=-1;
		}else { //en los demas casos se hara la siguiente operacion:
			edad=Integer.parseInt(String.valueOf(LocalDate.now()).substring(0,4))-Integer.parseInt(getfechanacimiento().substring(6,10));
			if(Integer.parseInt(getfechanacimiento().substring(3,5))>Integer.parseInt(String.valueOf(LocalDate.now()).substring(5,7)))edad-=1;
			if(Integer.parseInt(getfechanacimiento().substring(3,5))==Integer.parseInt(String.valueOf(LocalDate.now()).substring(5,7))) {
				if(Integer.parseInt(getfechanacimiento().substring(0,2))>Integer.parseInt(String.valueOf(LocalDate.now()).substring(8,10)))edad-=1;
			}
		}
			
		return edad;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		
		Scanner sc=new Scanner(System.in); //se introduce el escaner
		
		System.out.println("Introduzca su nombre: "); //Se pide por teclado tu nombre
		
		nombre = sc.next();
		
		Persona tu; //Se declara el nombre del objeto
		
		tu = new Persona (nombre); //se crea el objeto
		
		if (tu.getfechanacimiento()==null) {
			String nacimiento;
			System.out.println("Escriba su fecha de nacimiento (DD-MM-AAAA): ");
			nacimiento=sc.next();
			tu.setfecha(nacimiento);
		}
		sc.close();
		System.out.println("La persona es "+tu.getnombre());
		System.out.println("Su fecha de nacimiento es  "+tu.getfechanacimiento()+" y tiene "+tu.getEdad());
		
	}

}
