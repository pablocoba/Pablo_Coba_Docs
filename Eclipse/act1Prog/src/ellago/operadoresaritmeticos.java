package ellago;

import java.util.Scanner;

public class operadoresaritmeticos {
	
public static void main(String[] args) {
	//10.- Diseña un programa Java para leer las longitudes de los lados de un triangulo (L1, L2, L3) y calcular el área del mismo de acuerdo con la siguiente fórmula: 
	//area=√sp(sp-l1)(sp-l2)(sp-l3)
	//sp=(l1+l1+l3)/2
	
	Scanner teclado = new Scanner(System.in); //introducimos lados
	System.out.printf("Introduce 1 número: ");
	float l1 = teclado.nextFloat();
	System.out.printf("Introduce otro número: ");
	float l2 = teclado.nextFloat();
	System.out.printf("Introduce otro número: ");
	float l3 = teclado.nextFloat();
		
	float sp=(l1+l2+l3)/2; //creamos variable con la formula de sp

	float area=(float)Math.sqrt(sp*(sp-l1)*(sp-l2)*(sp-l3));//creamos variable con la fórmula completa del area
	System.out.println("sp = "+ sp);
	System.out.println("area = " + area); 
	
}
}
