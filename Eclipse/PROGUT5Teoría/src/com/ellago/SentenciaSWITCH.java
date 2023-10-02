package com.ellago;

public class SentenciaSWITCH {
	 /*Vamos a realizar el c�lculo de la nota de un examen
	 * de tipo test. Para ello, tendremos en cuenta el n�mero
	 * total de preguntas, los aciertos y los errores. Dos errores
	 * anulan una respuesta correcta.
	 *
	 * La nota que vamos a obtener ser� un n�mero entero.
	 *
	 * Finalmente, se muestra por pantalla la nota obtenida, as�
	 * como su calificaci�n no num�rica.
	 *
	 * La obtenci�n de la calificaci�n no num�rica se ha realizado
	 * utilizando la estructura condicional m�ltiple o switch.
	 *
	 */
	 public static void main(String[] args) {
	 // Declaraci�n e inicializaci�n de variables
		 int num_aciertos = 17;
		 int num_errores = 3;
		 int num_preguntas = 20;
		 int nota = 0;
		 String calificacion="";
	 //Procesamiento de datos
		 nota = ((num_aciertos - (num_errores/2))*10)/num_preguntas;
		 
	 switch (nota) {
		 case 5: calificacion="SUFICIENTE";
		 		break;
		 case 6: calificacion="BIEN";
		 		break;
		 case 7: calificacion="NOTABLE";
		 		break;
		 case 8: calificacion="NOTABLE";
		 		break;
		 case 9: calificacion="SOBRESALIENTE";
		 		break;
		 case 10: calificacion="SOBRESALIENTE";
		 		break;
		 default: calificacion="INSUFICIENTE";
	 }
	 //Salida de informaci�n
	 System.out.println ("La nota obtenida es: " + nota);
	 System.out.println ("y la calificaci�n obtenida es: " + calificacion);
	 }
	}