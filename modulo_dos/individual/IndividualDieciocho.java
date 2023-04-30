package cl.awakelab.modulo_dos.individual;

import java.util.Scanner;

public class IndividualDieciocho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int contador = 0; 
		String nombreAlumno;
		float nota;
		float sumaNotas = 0;
		float promedio;
		float notaMaxima = 0;
		float notaMinima = 7;
		String nombreNotaMaxima = "";
		String nombreNotaMinima = "";

		do {
			System.out.println("Ingrese el nombre del alumno o SALIR para terminar: ");
			nombreAlumno = sc.nextLine();
			if (!nombreAlumno.toLowerCase().equals("salir")) {
				System.out.println("Ingrese la nota de " + nombreAlumno + ": ");
				System.out.println("La nota debe ser entre 1.0 y 7.0");
				nota = sc.nextFloat();
				sc.nextLine();

				if (nota < 1 || nota > 7) {
					System.out.println("Nota ingresada fuera de rango. Ingrese alumno nuevamente.");
				} else {
					contador++;
					sumaNotas += nota;

					if (nota > notaMaxima) {
						notaMaxima = nota;
						nombreNotaMaxima = nombreAlumno;
					}

					if (nota < notaMinima) {
						notaMinima = nota;
						nombreNotaMinima = nombreAlumno;
					}
				}
			}
		} while (!nombreAlumno.equals("salir") || contador <= 1);

		if (contador > 1) {
			promedio = sumaNotas / contador;
			System.out.println("El promedio del curso es: " + promedio);
			System.out.println("El alumno con la mayor nota es: " + nombreNotaMaxima + " con una nota de " + notaMaxima);
			System.out.println("El alumno con la menor nota es: " + nombreNotaMinima + " con una nota de " + notaMinima);

		}
		sc.close();
	}
}