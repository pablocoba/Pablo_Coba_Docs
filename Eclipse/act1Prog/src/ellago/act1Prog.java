package ellago;

import java.util.Scanner;

public class act1Prog {

	public static void main(String[] args) {
		
		class Ejercicio1 {

			// TODO Auto-generated method stub
			/*1.- Dados los siguientes identificadores, indicar si son válidos o no. Justificar las respuestas.

				1. mi variable - no válido(espacios)
				2. num_de_cte - válido
				3. ____programa - válido
				4. $alguna - válido
				5. 3tema - no válido (empieza por un dígito)
				6. cierto? - no válido: simbolos especiales
				7. númerodeCliente - válido
				8. jose~ - no válido - símbolos especiales
				9. año - válido
				10. PI - válido
				11.int - no válido, palabra reservada
			*/
			
		}
		class Ejercicio2{
			/*
			2.- Indica los errores presentes en el siguiente código:

				1. / --> faltan asteriscos para hacerlo comentario
				2. operadoresaritmeticos.java
				3. Programa que muestra el uso de los operadores aritméticos
				4. / --> faltan asteriscos para hacerlo comentario
				5. public class operadoresaritmeticos {
				6. public static main(String[] args) --> falta el void entre static y main
				7. short x = 7; 
				8. int y = 5;
				9. float f1 = 13.5; --> falta la f de float en el valor.
				10. float f2 = 8f;
				11. System.out.println("El valor de x es ", x, " y el valor de y es ", y); --> No irían comas, sino "+", tal que así: ("El valor de x es " + x + " y el valor de y es " + y).
				12. System.out.println("El resultado de x + y es " + (x + y)); 
				13. System.out.println("El resultado de x - y es " + (x - y));
				14. System.out.printf("\n%s%s\n","División entera:","x / y = ",(x/y)); --> la línea corregida es "System.out.printf("\n%s %s\n" + "División entera: x / y = " + (x/y),x,y);" (sin comillas)
				15. System.out.println("Resto de la división entera: x % y = " + (x % y));
				16. System.out.printf("El valor de f1 es %f y el de f2 es %f\n",f1,f2);
				17. System.out.println("El resultado de f1 / f2 es " + (f1 / f2)) --> falta un ";" al final
				18. }
				*/

		}
		class Ejercicio3{
			
			/*
			 3.- Dado el siguiente programa, modifícalo para utilizar las variables que se indican. El tipo de dato elegido debe ser el de menos bits posibles que puedan representar el valor. Justifica tu elección.
				1. Si un empleado está casado o no.
				2. Valor máximo no modificable: 999999.
				3. Día de la semana
				4. Día del año.
				5. Sexo: con dos valores posibles 'V' o 'M'
				6. Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
				7. Almacenar el total de una factura
				8. Población mundial del planeta tierra.
				
				public class ejerciciovariables {
				
				public static void main(String[ ] args) {
				
				boolean casado = false; 
				constant int valormax = 999999;
				byte dia_semana;
				short dia_año;
				char male;
				char female;
				char sexo=(male==female)?'M':'F';
				long miliseg;
				float totalfactura;
				long poblaciónmundial;
				
				}
				
				
				}
			 */
		class Ejercicio4{
			
			/*
			 
			 4.- Realiza las siguientes modificaciones en el programa anterior:

				1. Añade comentarios, entre otros:
				
				• Nombre de clase, descripción y autor
				• Comentario para la clase main y para cada una de las llaves de cierre
				
				2. Utiliza el operador de asignación para inicializar las variables a los valores que se indican en los mensajes.
				3. Utiliza la secuencia de escape correspondiente para generar un tabulador al principio de cada línea salvo de la primera
				4. Mostrar el siguiente resultado:
				
				• Usando sólo la orden println:
				----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----
					El valor de la variable casado es true
					El valor de la variable MAXIMO es 999999
					El valor de la variable diasem es 1
					El valor de la variable diaanual es 300
					El valor de la variable miliseg es 1298332800000
					El valor de la variable totalfactura es 10350.678
					El valor de la variable poblacion es 6775235741
					El valor de la variable sexo es M
				
				• Usando sólo la orden printf:
				
				----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----
					El valor de la variable casado es true
					El valor de la variable MAXIMO es 999999
					El valor de la variable diasem es 1
					El valor de la variable diaanual es 300
					El valor de la variable miliseg es 1298332800000
					El valor de la variable totalfactura es 10350,677734
					El valor de la variable totalfactura en notación científica es 1.035068E+04
					El valor de la variable poblacion es 6775235741
					El valor de la variable sexo es M
			 
			 
			 	public class ejerciciovariables {
				
				public static void main(String[ ] args) {
				
				final int valormax = 999999;
				boolean casado = true; 
				byte dia_semana = 1;
				short dia_anual = 300;
				char male = 'M';
				char female = 'F';
				char sexo=(male==female)?'M':'F';
				long miliseg = 1298332800000l;
				float totalfactura = 10350.678f;
				float totalfactura2 = 10350.677734f;
				long poblacion = 6775235741l;
				
				System.out.println("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
				System.out.println("\tEl valor de la variable casado es " + casado);
				System.out.println("\tEl valor de la variable diasem es" + dia_semana);
				System.out.println("\tEl valor de la variable diaanual es" + dia_anual);
				System.out.println("\tEl valor de la variable miliseg es" + miliseg);
				System.out.println("\tEl valor de la variable totalfactura es" + totalfactura);
				System.out.println("\tEl valor de la variable poblacion es" + poblacion);  
				System.out.println("\tEl valor de la variable sexo es" + male);  
				
				System.out.printf("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
				System.out.printf("\n\t%s%s","El valor de la variable casado es ", casado);
				System.out.printf("\n\t%s%s","El valor de la variable diasem es", dia_semana);
				System.out.printf("\n\t%s%s","El valor de la variable diaanual es ", dia_anual);
				System.out.printf("\n\t%s%s","El valor de la variable miliseg es ", miliseg);
				System.out.printf("\n\t%s%f","El valor de la variable totalfactura es ", totalfactura2);
				System.out.printf("\n\t%s%e","El valor de la variable totalfactura en notación científica es ", totalfactura2);
				System.out.printf("\n\t%s%s","El valor de la variable poblacion es ", poblacion);  
				System.out.printf("\n\t%s%s","El valor de la variable sexo es ", male);  
			*/
		}
		class Ejercicio5{
			
			/*
			5.- Diseña un programa Java que pida dos números por teclado, determine si el primero es múltiplo del segundo y muestre el resultado.

				import java.util.Scanner;
				public class ejercicio6 {
	
				public static void main(String[] args) {
					
					int x,y;
					Scanner teclado =new Scanner(System.in);
					System.out.println("Introduce un número");
					x=teclado.nextInt();
					System.out.println("Introduce otro número");
					y=teclado.nextInt();
					
					teclado.close();
					String multiplo=(x%y==0||y%x==0)?" es múltiplo ":" no es múltiplo ";
					
					System.out.printf("El número %s%sde %s",x,multiplo,y);
					
					}
					
				}
			*/
		}	
		
		class Ejercicio6{
			/*
			6.- Diseña un programa Java que cree un tipo enumerado para los meses del año. El programa debe realizar las siguientes operaciones:
				
				• Crear una variable m del tipo enumerado y asignarle el mes de marzo. Mostrar por pantalla su valor.
			
				public class operadoresaritmeticos {
				
				
					
				public static void main(String[] args) {
					
					enum meses{
						Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre
					}
					
					meses m = meses.Marzo;
					System.out.printf("%s",m);
				}
				}
				*/
			}
			
		class Ejercicio7{
			/*
			//7.- Diseña un programa Java para resolver una ecuación de primer grado con una incógnita (x), suponiendo que los coeficientes de la ecuación (C1 y C2) se introducen desde teclado.
			
			//"C1x + C2 = 0" es la ecuación
	
		import java.util.Scanner;
		
		public class operadoresaritmeticos {
			
		public static void main(String[] args) {
			
			float num1;
			float num2;
			float result;
			Scanner teclado =new Scanner(System.in);
			System.out.println("Introduce un número");
			num1=teclado.nextInt();
			System.out.println("Introduce un número");
			num2=teclado.nextInt();
			
			teclado.close();
			
			System.out.printf("Se calculará la ecuación %sx + %s = 0",num1,num2);
			num2=-num2;
			System.out.printf("\n%sx = %s",num1,num2);
			System.out.printf("\nx = %s / %s",num2,num1);
			result=num1/num2;							//he decidido meter todos los cambios en variables en vez de hacerlos en el texto
														//para poder hacer cambios en el texto fácilmente y mantener el valor de las variables
			System.out.printf("\nx = %s",result);
			
		*/
		}
		class Ejercicio8{
			
			/*
			

				8.- Diseña un programa Java que calcule la suma, resta, multiplicación y división de dos números introducidos por teclado. Incorpora también las funciones que permitan realizar la potencia de un número y la raíz cuadrada del otro.

			Ejemplo de salida del programa para x=9, y=3:

			Introducir primer numero: 9
			Introducir segundo numero: 3
			x = 9.0 y = 3.0
			x + y = 12.0
			x - y = 6.0
			x * y = 27.0
			x / y = 3.0
			x ^ 2 = 81.0
			√ x = 3.0
				
				Scanner teclado= new Scanner(System.in);
		
				System.out.printf("Introduce 1 número ");
				float num1 = teclado.nextInt();
				System.out.printf("Introduce otro número ");
				float num2 = teclado.nextInt();
		
				System.out.printf("x = %s y = %s",num1,num2);
				System.out.printf("\nx + y = %s", (num1+num2));
				System.out.printf("\nx - y = %s", (num1-num2));
				System.out.printf("\nx * y = %s", (num1*num2));
				System.out.printf("\nx / y = %s", (num1/num2));
				System.out.printf("\nIntroduce 1 exponente ");
				float exp = teclado.nextInt();
				float potencia= (float) (Math.pow(num1,exp));
				teclado.close();
				System.out.printf("\nx ^ 2 = %s", potencia);
				float raiz=(float)Math.sqrt(num1);
				System.out.printf("\n√ x = %s", (raiz));
				
				
			
			
			*/
			
		}
	 		class Ejercicio9{
	 			
	 			/*9.- Diseña un programa Java que solicite un número de 5 dígitos del teclado, separe el número en sus dígitos individuales y los muestre por pantalla. Por ejemplo, si el número es 53123 que muestre:

	 			5 3 1 2 3
	 		
	 		Scanner teclado = new Scanner(System.in);
	 		
	 		System.out.println("Introduce un número de 5 cifras");
	 		int numero = teclado.nextInt();
	 		
	 		String cinco= String.valueOf(numero);
	 		
	 		teclado.close();
	 		int b=0;
	 		//método 1
	 		for(int a=0; a<cinco.length();a++) {
	 			
	 			System.out.print(cinco.charAt(a) + " ");
	 		}
	 		//método 2
	 		System.out.print(cinco.charAt(b) + " ");
	 		b++;
	 		System.out.print(cinco.charAt(b) + " ");
	 		b++;
	 		System.out.print(cinco.charAt(b) + " ");
	 		b++;
	 		System.out.print(cinco.charAt(b) + " ");
	 		b++;
	 		System.out.print(cinco.charAt(b) + " ");
	 		b++;
	 		//método 3
	 		int nuevo,nuevo1,nuevo2,nuevo3;
	 		nuevo=numero%10000;
	 		nuevo=nuevo/1000;
	 		nuevo1=numero%1000;
	 		nuevo1=nuevo1/100;
	 		nuevo2=numero%100;
	 		nuevo2=nuevo2/10;
	 		nuevo3=numero%10;
	 		System.out.print((numero/10000) + " " + nuevo + " " + nuevo1  + " " + nuevo2 + " "  + nuevo3);
	 		*/
	 		
	 		
	 		
	 			
	 			
	 			
	 			
	 			
	 			
		}
		
	 		class Ejercicio10{
	 			
	 		}
	 		
		}
		}
		

	}


