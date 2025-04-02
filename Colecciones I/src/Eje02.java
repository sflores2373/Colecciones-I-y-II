import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Eje02 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int tamaño = rd.nextInt(10, 21);
		
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		// Relleno
		for (int i = 0; i < tamaño; i++) {
			int num = rd.nextInt(0 , 101);
			ar.add(num);
		}
		
		//2º Forma de recorrer
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int suma = 0;
		for (int valor : ar) {
			
			if(valor > max) {
				max = valor;
			} else if (valor < min){
				min = valor;
			}
			suma += valor;
		}
		
		//Libreria para comparar numeros
		System.out.println(Collections.max(ar));
		System.out.println(Collections.min(ar));
		
		
		System.out.println("Valor maximo " + max);
		System.out.println("Valor minimo " + min);
		System.out.println("Suma de los valores " + suma);
		System.out.println("Media de los valores " + (float) suma / ar.size() );
		
		for (int valor : ar) {
			System.out.print(" "+ valor);
		}
	}

}
