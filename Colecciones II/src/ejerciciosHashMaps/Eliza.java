package ejerciciosHashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class Eliza {

	public static void main(String[] args) {
		
		System.out.println("-------- BIENVENIDO A ELIZA --------");
		System.out.println("Hazme un pregunta: ");
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> diccionario = new HashMap <String,String>();
		
		boolean puente = true;
		
		diccionario.put("hola", "Hola, ¿qué tal?”");
		diccionario.put("encantado", "Encantado de conocerte yo también");
		diccionario.put("hora", "Lo siento, no llevo reloj");
		diccionario.put("nombre", "Mi nombre es Eliza");
		
		do {
			
			String pregunta = sc.nextLine().toLowerCase();
			
			if (pregunta.equalsIgnoreCase("Adios")) {
				System.out.println("Adiós, espero volverte a ver pronto");
				puente = false;
				break;
			}
			
			String respuesta = diccionario.get(pregunta);
			
			if (respuesta != null) {
				System.out.println(respuesta);
			} else {
				System.out.println("Lo siento no te comprendo");
			}
			
		} while (puente);
	
	}

}
