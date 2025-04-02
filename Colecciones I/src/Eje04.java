import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Eje04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> ar = new ArrayList<String>();
		
		//Relleno
		System.out.println("Introduce palabras para rellenar el array [10]");
		
		do {
			String palabra = sc.nextLine();
			ar.add(palabra);
		} while(ar.size() < 10);
		
		Collections.sort(ar);
		
		System.out.println(ar);
	}

}
