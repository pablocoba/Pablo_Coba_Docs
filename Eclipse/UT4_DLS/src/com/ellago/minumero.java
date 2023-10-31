package com.ellago;

public class minumero { //creamos la clase mi numero
	
	
	
		private double num; //metemos el valor numero a nuestra clase
		
			public  minumero  (double num) { //creamos un constructor para numero
				this.num = num ; //declaramos el valor de numero
			}
			
			public double doble() { //hacemos el metodo doble que hara que nuestro numero sea sumado por si mismo
				return num + num ;
			}
			
			public double triple() { //hacemos el metodo triple que hara que el resultado de el doble sea sumado otra vez por num para que nos de el triple
				return doble() + num;
			}
			
			public double cuadruple() { //hacemos el metodo cuadruple que hara que el resultado de el triple sea sumado por num para que nos de el cuadruple
				return triple() + num;
			}
			
			public void setnum(double num) { //ponemos un setter para que el numero se declare por el propio numero determinado num
				this.num = num;
				
				}
			public double getnum() { //ponemos un setter para que nos de el resultado de los metodos
				return this.num;
				
				}
			
			
			public static void main(String[] args) {
				
				
				minumero obj1,obj2,obj3; //declaramos la cantidad de objetos que queremos que tenga la clase
				
				 //llamamos al constructor para que declare el valor de cada objeto
				
				obj1 = new minumero (5);
				obj2 = new minumero (10);
				obj3 = new minumero (20);
				
				//le decimos a la consola que imprima por pantalla el resultado de cada metodo
				
				System.out.println("Los resultados del objeto 1 (5)");
				System.out.println("El doble del primer numero es: " + obj1.doble());
				System.out.println("El triple del primer numero es: " + obj1.triple());
				System.out.println("El cuadruple del primer numero es: " + obj1.cuadruple());
				
				System.out.println("Los resultados del objeto 2 (10)");
				System.out.println("El doble del segundo numero es: " + obj2.doble());
				System.out.println("El triple del segundo numero es: " + obj2.triple());
				System.out.println("El cuadruple del segundo numero es: " + obj2.cuadruple());
				
				System.out.println("Los resultados del objeto 3 (20)");
				System.out.println("El doble del  tercer numero es: " + obj3.doble());
				System.out.println("El triple del tercer numero es: " + obj3.triple());
				System.out.println("El cuadruple del tercer numero es: " + obj3.cuadruple());
	}

}
