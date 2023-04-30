package cl.awakelab.modulo_dos.grupos.grupo_siete;

import java.util.Scanner;

public class EjercicioGrupal10 {

	public static void main(String[] args) {
		
		// Claudio Torres
		// Miguel Vasquez
		// Leonardo Cofré
		// Sergio Lincopi
		
		String dia = "";
		String hora = "";
		String lugar = "";
		String duracion = "", asistenteMayor = "", asistenteMenor = "", aux = "";
		int cantidadAsistentes = 0;
		int notaMayor = 0;
		int notaMenor = 7;
		int nota = 0;
		float promedio = 0; 

		Scanner sc = new Scanner(System.in);
		
		// sc.useDelimiter("\n");

		System.out.println("Ingrese datos de capacitación");
		System.out.println("Ingrese día de capacitación");
		dia = sc.next();
		System.out.println("Ingrese hora de capacitación");
		hora = sc.next();
		System.out.println("Ingrese lugar de capacitación");
		lugar = sc.next();
		System.out.println("Ingrese duración de capacitación en horas");
		duracion = sc.next();
		System.out.println("Ingrese cantidad de asistentes");
		aux = sc.next();
		cantidadAsistentes = Integer.parseInt(aux);
		
		String asistentes[] = new String[cantidadAsistentes];
		String notas[] = new String[cantidadAsistentes];
		
		for (int i = 0; i < cantidadAsistentes; i++) {
			
			System.out.println("Ingrese nombre de asistente");
			asistentes[i] = sc.next();
			System.out.println("Ingrese nota de asistente");
			nota = sc.nextInt();
			sc.nextLine();
			notas[i] = Integer.toString(nota);
			
			if (nota > notaMayor) {
				notaMayor = nota;
				asistenteMayor = asistentes[i];
			}
			if (nota < notaMenor) {
				notaMenor = nota;
				asistenteMenor = asistentes[i];
			}
			
			promedio = promedio + nota;
			
		}
		
		promedio = calculoPromedio(promedio, cantidadAsistentes);
		
		System.out.println("Día de capacitación: " + dia);
		System.out.println("Hora de capacitación: " + hora);
		System.out.println("Lugar de capacitación: " + lugar);
		System.out.println("Duración de capacitación: " + duracion + " horas");
		System.out.println("Cantidad de asistentes: " + cantidadAsistentes);
		System.out.println("Nota mayor y asistente que la obtuvo: " + notaMayor + " " + asistenteMayor);
		System.out.println("Nota menor y asistente que la obtuvo: " + notaMenor + " " + asistenteMenor);
		System.out.println("Promedio de asistentes: " + promedio);

		sc.close();
		
	}
	
	public static float calculoPromedio(float promedio, int cantidadAsistentes) {
		return promedio / cantidadAsistentes;
	}

}
