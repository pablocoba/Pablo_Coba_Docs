package com.ellago;

import java.util.*;

public class Disco {
		//Atributos
		private String codigo = "LIBRE";
		private String autor;
		private String titulo;
		private String genero;
		private int duracion; // duraci�n total en minutos
		//M�todos getters y setters
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public int getDuracion() {
			return duracion;
		}
		public void setDuracion(int duracion) {
			this.duracion = duracion;
		}
		//Sobreescribir el m�todo toString() de la clase
		public String toString() {
			String cadena = "\n------------------------------------------";
			cadena += "\nC�digo: " + this.codigo;
			cadena += "\nAutor: " + this.autor;
			cadena += "\nT�tulo: " + this.titulo;
			cadena += "\nG�nero: " + this.genero;
			cadena += "\nDuraci�n: " + this.duracion;
			cadena += "\n------------------------------------------";
			return cadena;
		}
		//M�todo principal
		public static void main(String[] args) {
			Scanner dato=new Scanner(System.in);
			int N=3; //n�mero de discos
			//Crea el array de discos
		    Disco[] album = new Disco[N];

		    // Crea todos los discos que van en cada una de
		    // las celdas del array
		    for(int i = 0; i < N; i++) {
		      album[i] = new Disco();
		    }
		    
		    //variables locales
		    int opcion;
		    String codigoIntroducido;
		    String autorIntroducido;
		    String tituloIntroducido;
		    String generoIntroducido;
		    String duracionIntroducidaString;
		    int duracionIntroducida;
		    int primeraLibre;
		    int i;
		    
		    //Men�
		    do {
		      System.out.println("\n\nCOLECCI�N DE DISCOS");
		      System.out.println("===================");
		      System.out.println("1. Listado");
		      System.out.println("2. Nuevo disco");
		      System.out.println("3. Modificar");
		      System.out.println("4. Borrar");
		      System.out.println("5. Salir");
		      System.out.print("Introduzca una opci�n: ");
		      opcion = dato.nextInt();
		      
		      switch (opcion) {
			      case 1:
			        System.out.println("\nLISTADO");
			        System.out.println("=======");
			        for(i = 0; i < N; i++) {
			          if (!album[i].getCodigo().equals("LIBRE")) {
			            System.out.println(album[i]);//aqu� utiliza el m�todos sobreescrito toString
			          }
			        }
			        break;
			        
			      case 2:
			        System.out.println("\nNUEVO DISCO");
			        System.out.println("===========");
			        
			        // Busca la primera posici�n libre del array
			        primeraLibre = -1;
			        do {
			          primeraLibre++;
			        } while (!((album[primeraLibre].getCodigo()).equals("LIBRE")));
			        
			        System.out.println("Por favor, introduzca los datos del disco.");  
			        
			        System.out.print("C�digo: ");
			        codigoIntroducido = dato.next();
			        album[primeraLibre].setCodigo(codigoIntroducido);
			        
			        System.out.print("Autor: ");
			        autorIntroducido = dato.next();
			        album[primeraLibre].setAutor(autorIntroducido);
			        
			        System.out.print("T�tulo: ");
			        tituloIntroducido = dato.next();
			        album[primeraLibre].setTitulo(tituloIntroducido);
			        
			        System.out.print("G�nero: ");
			        generoIntroducido = dato.next();
			        album[primeraLibre].setGenero(generoIntroducido);
			        
			        System.out.print("Duraci�n: ");
			        duracionIntroducida = dato.nextInt();
			        album[primeraLibre].setDuracion(duracionIntroducida);
			        
			        break;
		        
		      case 3:
		        System.out.println("\nMODIFICAR");
		        System.out.println("===========");
		        
		        System.out.print("Por favor, introduzca el c�digo del disco cuyos datos desea cambiar: ");
		        codigoIntroducido = dato.next();
		  
		        i = -1;
		        do {
		          i++;
		        } while (!((album[i].getCodigo()).equals(codigoIntroducido)));
		        
		        System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
		  
		        System.out.println("C�digo: " + album[i].getCodigo());
		        System.out.print("Nuevo c�digo: ");
		        codigoIntroducido = dato.next();
		        if (!codigoIntroducido.equals("")) {
		          album[i].setCodigo(codigoIntroducido);
		        }
		        
		        System.out.println("Autor: " + album[i].getAutor());
		        System.out.print("Nuevo autor: ");
		        autorIntroducido = dato.next();
		        if (!autorIntroducido.equals("")) {
		          album[i].setAutor(autorIntroducido);
		        }
		        
		        System.out.println("T�tulo: " + album[i].getTitulo());
		        System.out.print("Nuevo t�tulo: ");
		        tituloIntroducido = dato.next();
		        if (!tituloIntroducido.equals("")) {
		          album[i].setTitulo(tituloIntroducido);
		        }
		        
		        System.out.println("G�nero: " + album[i].getGenero());
		        System.out.print("Nuevo g�nero: ");
		        generoIntroducido = dato.next();
		        if (!generoIntroducido.equals("")) {
		          album[i].setGenero(generoIntroducido);
		        }
		        
		        System.out.println("Duraci�n: " + album[i].getDuracion());
		        System.out.print("Duraci�n: ");
		        duracionIntroducidaString = dato.next();
		        if (!duracionIntroducidaString.equals("")) {
		          album[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
		        }
		        
		        break;
		        
		      case 4:
		        System.out.println("\nBORRAR");
		        System.out.println("======");
		        
		        System.out.print("Por favor, introduzca el c�digo del disco que desea borrar: ");
		        codigoIntroducido = dato.next();
		  
		        i = -1;
		        do {
		          i++;
		        } while (!((album[i].getCodigo()).equals(codigoIntroducido)));
		        album[i].setCodigo("LIBRE");
		        System.out.println("Album borrado.");
		        
		        break;
		        
		      default:
		      
		      } // switch
		    } while (opcion != 5);
		    dato.close();
	  }
			
}

