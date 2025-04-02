package ejerciciosArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Eje03 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int tamaño = rd.nextInt(10, 21);
		ArrayList<Integer> lista = new ArrayList <Integer>();
		
		for (int i = 0; i < tamaño; i++) {
			int valor = rd.nextInt(0, 101);
			lista.add(valor);
		}
		//Mostrar el contenido
		System.out.println(lista);
		
		//Calcular la suma
		System.out.println("Ejercicio b)");
		int suma = 0;
		
		for (int i = 0; i < lista.size(); i++) {
			suma += i;
		}
		
		System.out.println("Suma = "+ suma);
		
		//Borrar aquellos números que serán pares y volver a mostrar el contenido
		System.out.println("Ejercicio c)");
		lista.removeIf(x -> (x % 2 == 0));
	
		System.out.println(lista);
		
		//Remplazar los números divisibles por 3 con el valor 0 y volver a mostrar el contenido
		
		System.out.println("Ejercicio d)");
		for (int i = 0; i < lista.size(); i++){
			int valor = lista.get(i);
			if(valor % 3 == 0) {
				lista.set(i, 0);
			}
		}
		
		System.out.println(lista);
		
		//Si aparece un valor divisible entre cinco, insertar en la posición anterior el valor 555 
		//y volver a mostrar el contenido.

		System.out.println("Ejercicio e)");
		for (int i = 0; i < lista.size(); i++){
			int valor = lista.get(i);
			if(valor % 5 == 0 && valor != 0) {
				lista.add(i, 555);
				i++; //Saltar el valor divisible entre 5
			}
		}
		System.out.println(lista);

		
		/*
		for (int i : lista) {
			System.out.println(i + "-");
		}
		*/
	}

}
