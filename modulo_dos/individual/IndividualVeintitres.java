package cl.awakelab.modulo_dos.individual;

import java.util.Scanner;

public class IndividualVeintitres {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese un texto");
		String textoEntrada = scanner.nextLine();
		minusculaAMayuscula(textoEntrada);
		scanner.close();
	}

	private static String minusculaAMayuscula(String texto) {
		String resultado = "";
		for (int i = 0; i < texto.length(); i++) {

			char tmp = texto.charAt(i);
			if (Character.isLowerCase(tmp)) {
				tmp = Character.toUpperCase(tmp);
				System.out.println(tmp);
				resultado = resultado + tmp;

			} else if (Character.isUpperCase(tmp)) {
				tmp = Character.toLowerCase(tmp);
				System.out.println(tmp);
				resultado = resultado + tmp;

			} else if (!Character.isWhitespace(tmp)) {
				resultado = resultado + tmp;
				System.out.println(tmp);

			} else {
				System.out.println(tmp);
			}

		}

		return resultado;

	}

}
