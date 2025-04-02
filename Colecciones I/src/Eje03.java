import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Eje03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		//Relleno
		System.out.println("Introduce valores para rellenar el array [10]");
		
		do {
			int valor = sc.nextInt();
			ar.add(valor);
		} while( ar.size() < 10);
		
		for (int valor : ar) {
			System.out.print(" "+ valor);
		}
		
		System.out.println();
		System.out.println("Ahora vamos a ordenar los numeros que has introducido ");
		
		Collections.sort(ar);
		System.out.println(ar);
	}

}
