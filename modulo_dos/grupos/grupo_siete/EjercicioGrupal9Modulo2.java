package cl.awakelab.modulo_dos.grupos.grupo_siete;

import java.util.Scanner;

public class EjercicioGrupal9Modulo2 {

	public static void main(String[] args) {
		
		// Claudio Torres
		// Miguel Vasquez
		// Leonardo Cofré
		// Sergio Lincopi
		
		String rutEmpresa, nombreEmpresa, direccionEmpresa, telefonoEmpresa, lugarCapacitacion, horaCapacitacion, diaCapacitacion, duracionCapacitacion;
		int asistentesCapacitacion = 0;
		
		Scanner sc = new Scanner(System.in);
		
//		sc.useDelimiter("\n");
		
		System.out.println("Ingrese datos de empresa");
		System.out.println("Ingrese rut");
		rutEmpresa = sc.next();
		while (rutEmpresa.isBlank() || rutEmpresa.isEmpty()) {
			System.out.println("Ingrese rut");
			rutEmpresa = sc.next();			
		}
		System.out.println("Ingrese nombre de empresa");
		nombreEmpresa = sc.next();
		while (nombreEmpresa.isBlank() || nombreEmpresa.isEmpty()) {
			System.out.println("Ingrese nombre de empresa");
			nombreEmpresa = sc.next();			
		}
		System.out.println("Ingrese dirección");
		direccionEmpresa = sc.next();
		while (direccionEmpresa.isBlank() || direccionEmpresa.isEmpty()) {
			System.out.println("Ingrese dirección de empresa");
			direccionEmpresa = sc.next();			
		}
		System.out.println("Ingrese número de teléfono");
		telefonoEmpresa = sc.next();
		while (telefonoEmpresa.isBlank() || telefonoEmpresa.isEmpty()) {
			System.out.println("Ingrese teléfono de empresa");
			telefonoEmpresa = sc.next();			
		}
		
		System.out.println("Ingrese lugar de capacitación");
		lugarCapacitacion = sc.next();
		while (lugarCapacitacion.isBlank() || lugarCapacitacion.isEmpty()) {
			System.out.println("Ingrese lugar de capacitación");
			lugarCapacitacion = sc.next();			
		}
		System.out.println("Ingrese hora de capacitación");
		horaCapacitacion = sc.next();
		while(horaCapacitacion.isBlank() || horaCapacitacion.isEmpty()) {
			System.out.println("Ingresa hora de capacitación");
		}
		System.out.println("Ingrese día de capacitación");
		diaCapacitacion = sc.next();
		while(diaCapacitacion.isBlank() || diaCapacitacion.isEmpty()) {
			System.out.println("Ingresa día de capacitación");
		}
		System.out.println("Ingrese duración de capacitación en horas");
		duracionCapacitacion = sc.next();
		while(duracionCapacitacion.isBlank() || duracionCapacitacion.isEmpty()) {
			System.out.println("Ingresa duración de capacitación en horas");
		}
		System.out.println("Ingrese la cantidad de asistentes a la capacitación");
		asistentesCapacitacion = Integer.parseInt(sc.next());
		while(asistentesCapacitacion == 0) {
			System.out.println("Ingresa cantidad de asistentes a la capacitación");
			asistentesCapacitacion = Integer.parseInt(sc.next());
		}
		
		int edad = 0;
		String aux = "";
		int contMenor25 = 0;
		int cont26a35 = 0;
		int contMayor35 = 0;
		
		for (int i = 0; i < asistentesCapacitacion; i++) {
			System.out.println("Ingrese nombre de asistente");
			aux = sc.next();
			System.out.println("Ingrese edad de asistente");
			edad = sc.nextInt();
			if (edad < 25) {
				contMenor25++;
			} else if (edad >= 26 && edad <=35) {
				cont26a35++;
			} else {
				contMayor35++;
			}
				
		}
		
		System.out.println("Rut de empresa: " + rutEmpresa);
		System.out.println("Nombre de empresa: " + nombreEmpresa);
		System.out.println("Dirección de empresa: " + direccionEmpresa);
		System.out.println("Teléfono de empresa: " + telefonoEmpresa);
		System.out.println("Lugar de capacitación: " + lugarCapacitacion);
		System.out.println("Hora de capacitacion: " + horaCapacitacion);
		System.out.println("Día de capacitación: " + diaCapacitacion);
		System.out.println("Duración de capacitación: " + duracionCapacitacion);
		System.out.println("Cantidad de asistentes a capacitación: " + asistentesCapacitacion);
		
		System.out.println("Cantidad de asistentes menores de 25 años: " + contMenor25);
		System.out.println("Cantidad de asistentes entre 26 años y 35 años: " + cont26a35);
		System.out.println("Cantidad de asistentes mayores de 35 años: " + contMayor35);

		sc.close();
		
	}

}
