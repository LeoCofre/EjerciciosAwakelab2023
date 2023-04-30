package cl.awakelab.modulo_dos.individual;

import java.util.Scanner;

public class IndividualDiecinueve {

    public static void main(String[] args) {
    	
        String texto = leerTexto();
        char abecedario[] = new char[26];  

        for (int i = 0; i < 26; i++) {
            abecedario[i] = (char) ('a' + i);
            int contador = 0;
            for (int j = 0; j < texto.length(); j++) {
                if (abecedario[i] == texto.charAt(j)) {
                    contador++;
                }
            }
            System.out.println(abecedario[i] + " " + contador);
        }
    }

    public static String leerTexto() {
        Scanner scanner = new Scanner(System.in);
        String textoIngresado = "";

        do {
            System.out.println("Ingrese texto");
            textoIngresado = scanner.nextLine().toLowerCase();

            if (textoIngresado.isBlank()) {
                System.out.println("Ingrese texto nuevamente");
            }
        } while (textoIngresado.isBlank());
        
        scanner.close();
        
        return textoIngresado;
    }
    
}
