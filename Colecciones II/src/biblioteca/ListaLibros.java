package biblioteca;
import java.util.ArrayList;

/**
 * Lista de libro de una biblioteca
 * @author (your name)
 * @version (a version number or a date)
 */

public class ListaLibros {

	ArrayList<Libro> catalogo;
	/**
	 * 
	 * Constructor for objects of class ListaNodos
	 * 
	 */
	public ListaLibros(){
		catalogo = new ArrayList<Libro>();
	}

	// Completar los metodos

	// Incluye un nuevo libro en la lista

	public void pon(Libro valor) {

		catalogo.add(valor);
		
		catalogo.removeIf(l -> l.autor.equals(valor));

	}

	public boolean estaVacia() {
		return catalogo.size() == 0;
	}

	// Devuelve un libro que es eliminado de la lista o null si no exite

	public Libro quitar(int id) {

		Libro aborrar = null;

		for (Libro l : catalogo) {
			if (l.id == id) {
				aborrar = l;
				break;
			}
		}
		if (aborrar != null) {
			catalogo.remove(aborrar);
		}
		return aborrar;

	}

	// Devuelve el id del libro o -1 si no esta

	public int buscarId(String titulo) {

		int id = -1;
		
		for (Libro l : catalogo) {
			if (l.titulo.equals(titulo)) {
				id = l.id;
				break;
			}
		}
		return id;
	}

	// Muestra los libros almacenados

	public void verCatalogo() {
		for (Libro l : catalogo) {
			System.out.println(l);
		}
	}

}