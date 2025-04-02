import java.util.ArrayList;

public class Eje01 {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Sergio");
		lista.add("Mario");
		lista.add("Camilo");
		lista.add("Diego");
		lista.add("Maria");
		lista.add("Eda");
		
		for(String i : lista) {
			System.out.println(i);
		}

	}

}
