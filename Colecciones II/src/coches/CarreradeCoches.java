/*
 *  Simulación sencilla de una carrera de coches
 */

package coches;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CarreradeCoches {
	
	public static void main(String[] args) {
			
		Random valor = new Random();  // Variable que me genera números aleatorios
		final int META = 500; // 500 kilómetros		
		ArrayList<Coche> parrilla = new ArrayList<Coche>(); // Parrilla de salida con 5 coches
	
		
		parrilla.add (new Coche ("Ferrari",300));
		parrilla.add (new Coche ("600",100));
		parrilla.add (new Coche ("BMW",220));
		parrilla.add (new Coche ("Seat",150));
		parrilla.add (new Coche ("La Cabra",10));
		
		// Test de pruebas para comprobar la detección de errores
	
		Coche c1 = parrilla.get(0);
		Coche c2 = parrilla.get(1);
		c1.acelera(10);
		c2.frena(20);
		c1.parar();
		c2.recorre();
	
		
		// Arranquen los motores
		for (int i=0; i< parrilla.size(); i++){
			parrilla.get(i).arrancar();
		}
		
		// Comienza la carrera
		
		do {
			for (Coche c : parrilla) {
				c.acelera(valor.nextInt(40));
				c.recorre();
				c.frena(valor.nextInt(10));
				System.out.println(c.infog());
			}
			System.out.println("----------------------------------------");
				
		} while ( ! alcanzarMeta ( parrilla, META) );

		// Ordena la tabla para mostrar la clasificación
	    ordenarClasificacion ( parrilla);
		
		// Muestra la clasificación
		for(int i=0; i< parrilla.size(); i++){
			System.out.println((i+1)+"º Clasificado "+ parrilla.get(i).info());
		}
		
	
	}

	// MÉTODO AUXILIAR
	// Devuelve verdadero si hay algun coche que haya recorrido la distancia indicada.
	
	static public boolean alcanzarMeta ( ArrayList<Coche> tcoches, int distancia){
		boolean fin = false;
		for (int t = 0; t < tcoches.size(); t++) {
		     if ( tcoches.get(t).getKilometros() >= distancia ){
		    	 fin = true; 
		    	 break;
		     }
		}
		return fin;
	}
	
	// Ordeno por el método de la burbuja, no es el mejor pero si el más
	// sencillo. Ordena de Mayor a  Menor
	static void ordenarClasificacion ( ArrayList<Coche> tcoches){
	    tcoches.sort((c1, c2) -> (c2.distanciaTotal) - (c1.distanciaTotal));	
	}
}
	

