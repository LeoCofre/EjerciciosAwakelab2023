package cl.awakelab.modulo_dos.individual;

import java.util.Scanner;

public class IndividualDiesciseis {

	public static void main(String[] args) {

		String contrasena = "contrasena123";
		int intentosRestantes = 3;

		Scanner scanner = new Scanner(System.in);

		while (intentosRestantes > 0) {
			System.out.print("Introduce la contraseña: ");
			String entradaUsuario = scanner.nextLine();

			if (entradaUsuario.equals(contrasena)) {
				System.out.println("La clave ingresada es correcta");
				break;
			} else {
				intentosRestantes--;
				System.out.println("Contraseña incorrecta, te quedan " + intentosRestantes + " intentos.");
			}
		}

		if (intentosRestantes == 0) {
			System.out.println("Agotaste los intentos permitidos. El programa se cerrará.");
			scanner.close();
		}

	}
}
