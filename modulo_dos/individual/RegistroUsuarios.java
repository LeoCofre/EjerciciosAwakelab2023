package cl.awakelab.modulo_dos.individual;

import java.util.Scanner;

public class RegistroUsuarios {
	public static void main(String[] args) {
		
		// Variables
		String nombre, fechaNacimiento, run;

		Scanner teclado = new Scanner(System.in);

		// Pedir datos básicos del usuario
		System.out.println("Ingrese el nombre del usuario: ");
		nombre = teclado.nextLine();
		System.out.println("Ingrese la fecha de nacimiento (DD/MM/AAAA) del usuario: ");
		fechaNacimiento = teclado.nextLine();
		System.out.print("Ingrese el RUN del usuario: ");
		run = teclado.nextLine();

		// Pedir tipo de usuario
		System.out.println("Ingrese el tipo de usuario: ");
		System.out.println("1. Cliente");
		System.out.println("2. Profesional");
		System.out.println("3. Administrativo");
		int tipoUsuario = teclado.nextInt();

		// Pedir datos específicos según el tipo de usuario
		switch (tipoUsuario) {
		case 1: // Cliente
			System.out.println("Ingrese la dirección del cliente: ");
			String direccion = teclado.nextLine();
			System.out.println("Ingrese el teléfono del cliente: ");
			String telefono = teclado.nextLine();
			System.out.println("Ingrese la cantidad de empleados de la empresa: ");
			int cantidadEmpleados = teclado.nextInt();

			// Mostrar datos ingresados
			System.out.println("Nombre: " + nombre);
			System.out.println("Fecha de nacimiento: " + fechaNacimiento);
			System.out.println("RUN: " + run);
			System.out.println("Dirección: " + direccion);
			System.out.println("Teléfono: " + telefono);
			System.out.println("Cantidad de empleados: " + cantidadEmpleados);
			break;

		case 2: // Profesional
			System.out.println("Ingrese los años de experiencia del profesional: ");
			int anosExperiencia = teclado.nextInt();
			System.out.println("Ingrese el departamento del profesional: ");
			String departamento = teclado.nextLine();

			// Mostrar datos ingresados
			System.out.println("Nombre: " + nombre);
			System.out.println("Fecha de nacimiento: " + fechaNacimiento);
			System.out.println("RUN: " + run);
			System.out.println("Años de experiencia: " + anosExperiencia);
			System.out.println("Departamento: " + departamento);
			break;

		case 3: // Administrativo
			System.out.println("Ingrese la función del administrativo: ");
			String funcion = teclado.nextLine();
			System.out.println("Ingrese el nombre de su superior: ");
			String nombreSuperior = teclado.nextLine();

			// Mostrar datos ingresados
			System.out.println("Nombre: " + nombre);
			System.out.println("Fecha de nacimiento: " + fechaNacimiento);
			System.out.println("RUN: " + run);
			System.out.println("Función: " + funcion);
			System.out.println("Nombre de superior: " + nombreSuperior);
			break;

		default:
			System.out.println("Tipo de usuario no válido");
			break;
		}

		teclado.close();
	}
	
}
