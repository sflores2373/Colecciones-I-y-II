package ejerciciosHashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class Eje02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HashMap<String, String> datosUsuario = new HashMap<String, String>();

		int contador = 0;
		boolean puente = true;
		
		datosUsuario.put("usuario", "usuario");
		datosUsuario.put("sergio", "sergio");
		datosUsuario.put("mario", "mario");
		datosUsuario.put("mariogay", "mariogay");

		do {
			System.out.println("Introduce usuario: ");
			String user = sc.nextLine();
			System.out.println("Introduce contraseña: ");
			String password = sc.nextLine();

			String passwordInterna = datosUsuario.get(user);

			if (passwordInterna != null && passwordInterna.equals(password)) {
				System.out.println("Ha accedido al area restringida");
				break;
			} else {
				System.out.println("\n" + "Usuario o contraseña invalidos");
				contador++;
				if(contador >= 3) {
					System.out.println("Lo siento no tiene acceso a area restringida");
					puente = false;
				}
			}
		} while (puente);
	}

}
