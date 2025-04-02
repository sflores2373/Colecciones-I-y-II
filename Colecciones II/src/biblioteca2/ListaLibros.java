package biblioteca2;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Lista de libro de una biblioteca
 * @author (your name)
 * @version (a version number or a date)
 */

public class ListaLibros {

	HashMap<Integer, Libro> catalogo;
	/**
	 * 
	 * Constructor for objects of class ListaNodos
	 * 
	 */
	public ListaLibros(){
		catalogo = new HashMap<Integer, Libro>();
	}

	// Completar los metodos

	// Incluye un nuevo libro en la lista

	public void pon(Libro valor) {

		catalogo.put(valor.id, valor);

	}

	public boolean estaVacia() {
		return catalogo.size() == 0;
	}

	// Devuelve un libro que es eliminado de la lista o null si no exite

	public Libro quitar(int id) {

		return catalogo.remove(id);
	}

	// Devuelve el id del libro o -1 si no esta

	public int buscarId(String titulo) {

		int id = -1;
		for (Libro l : catalogo.values()) {
			if (l.titulo.equals(titulo)) {
				id = l.id;
				break;
			}
		}
		return id;
	}

	// Muestra los libros almacenados

	public void verCatalogo() {
		for (Libro l : catalogo.values()) {
			System.out.println(l);
		}
	}

}