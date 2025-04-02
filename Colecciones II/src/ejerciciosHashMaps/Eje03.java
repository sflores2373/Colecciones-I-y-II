package ejerciciosHashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Eje03 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> diccionario = new HashMap<String, String>();
		
		boolean puente = true;
		int validas = 0, erroneas = 0, contador = 0;
		
		diccionario.put("hello", "Hola");
		diccionario.put("cloud", "Nube");
		diccionario.put("computer", "Ordenador");
		diccionario.put("mouse", "Raton");
		diccionario.put("keyboard", "Teclado");
		diccionario.put("car", "Coche");
		diccionario.put("phone", "Movil");
		diccionario.put("charger", "Cargador");
		diccionario.put("chair", "Silla");
		diccionario.put("white board", "Pizarra");
		
		
		do {
				
			//Creamos un ArrayList para poder obtener un valor aleatorio
			ArrayList<String> claves = new ArrayList<String>(diccionario.keySet());
			
			//Generamos la palabra aleatoria
			String claveAleatorio = claves.get(rd.nextInt(claves.size()));
			
			//Obtenemos la palabra aleatoria
			String palabra = diccionario.get(claveAleatorio);
			System.out.println("La palabra en español es " + palabra);
			
			System.out.println("Cual es su traduccion? ");
			String traduccion = sc.nextLine();

			if(traduccion.equalsIgnoreCase(claveAleatorio)){
				System.out.println("CORRECTO");
				validas++;
			} else {
				System.out.println("INCORRECTO");
				erroneas++;
			}
			
			contador++;
			if (contador == 5) puente = false;
			
		} while (puente);
		
		System.out.println("------ FIN DEL JUEGO ------");
		System.out.println("Tus resultados son");
		System.out.println( validas + " palabras acertadas");
		System.out.println( erroneas + " palabras falladas");
		
	}

}