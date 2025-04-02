package ejerciciosArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

public class Eje04 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		ArrayList<Integer> lista = new ArrayList <Integer>();
		
		for (int i = 0; i < 20; i++) {
			int valor = rd.nextInt(0, 101);
			lista.add(valor);
		}
		//Mostrar el contenido
		System.out.println("Mostrar contenido: ");
		System.out.println(lista);

		//Mostrar contenido ordenado
		lista.sort((x, y) -> (x - y));
		System.out.println("\n" + 	"Mostrar contenido ordenado: ");
		System.out.println("\n" +lista);
		
		//Desordenar contenido
		Collections.shuffle(lista);
		System.out.println("\n" + "Contenido desordenado: ");
		System.out.println("\n" +lista);
		
		//Ordenar de nuevo con arbol binario
		System.out.println("\n" + "Contenido ordenado: ");
		TreeSet<Integer> ts = new TreeSet<Integer>(lista);
		System.out.println("\n" + lista);
		
	}

}
