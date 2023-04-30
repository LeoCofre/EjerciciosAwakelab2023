package cl.awakelab.modulo_dos.individual;

import java.util.Scanner;

public class IndividualDiecisiete {
	
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        String textoEntrada = ""; 

	        while (textoEntrada=="") {
	            System.out.println("Ingrese un texto: ");
	            textoEntrada = scanner.nextLine().trim();
	        }

	        int cantidadVocales = 0;
	        int cantidadConsonante = 0;

	        for (int i = 0; i < textoEntrada.length(); i++) {
	            char ch = Character.toLowerCase(textoEntrada.charAt(i));
	            if (ch >= 'a' && ch <= 'z' || ch == 'ñ') {
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    cantidadVocales++;
	                } else {
	                    cantidadConsonante++;
	                }
	                System.out.println(ch);
	            }
	        }
	        scanner.close();

	        System.out.println("\nCantidad de vocales: " + cantidadVocales);
	        System.out.println("Cantidad de consonantes: " + cantidadConsonante);
	    }
	}

