package com.ellago;

/**
*
* Ejemplos de utilizaci�n de diferentes estructuras
* condicionales simples, completas y anidamiento de �stas.
*/
public class SentenciaIF {
/*Vamos a realizar el c�lculo de la nota de un examen
* de tipo test. Para ello, tendremos en cuenta el n�mero
* total de pregunta, los aciertos y los errores. Dos errores
* anulan una respuesta correcta.
*
* Finalmente, se muestra por pantalla la nota obtenida, as�
* como su calificaci�n no num�rica.
*
* La obtenci�n de la calificaci�n no num�rica se ha realizado
* combinando varias estructuras condicionales, mostrando expresiones
* l�gicas compuestas, as� como anidamiento.
*
*/
public static void main(String[] args) {
	// Declaraci�n e inicializaci�n de variables
	int num_aciertos = 12;
	int num_errores = 3;
	int num_preguntas = 20;
	float nota = 0;
	String calificacion="";

	//Procesamiento de datos
	nota = ((num_aciertos - (num_errores/2))*10)/num_preguntas;
	
	if (nota < 5)
	{
		calificacion="INSUFICIENTE";
	}
	else
	{
	/* Cada expresi�n l�gica de estos if est� compuesta por dos
	* expresiones l�gicas combinadas a trav�s del operador Y o AND
	* que se representa con el s�mbolo &&. De tal manera, que para
	* que la expresi�n l�gica se cumpla (sea verdadera) la variable
	* nota debe satisfacer ambas condiciones simult�neamente
	*/
	if (nota >= 5 && nota <6)
		calificacion="SUFICIENTE";
	if (nota >= 6 && nota <7)
		calificacion="BIEN";
	if (nota >= 7 && nota <9)
		calificacion="NOTABLE";
	if (nota >= 9 && nota <=10)
		calificacion="SOBRESALIENTE";
	}

//Salida de informaci�n
System.out.println ("La nota obtenida es: " + nota);
System.out.println ("y la calificaci�n obtenida es: " + calificacion);
}

}