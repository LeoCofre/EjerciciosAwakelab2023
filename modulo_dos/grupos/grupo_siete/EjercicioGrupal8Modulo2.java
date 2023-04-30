package cl.awakelab.modulo_dos.grupos.grupo_siete;

import java.util.Scanner;

public class EjercicioGrupal8Modulo2 {

	public static void main(String[] args) {
		
		// ______Grupo 7_______
		// Claudio Torres
		// Miguel Vasquez
		// Leonardo Cofré
		// Sergio Lincopi

		String nombre,fechaDeNacimiento,run,experiencia,departamento,funcion,nombreSuperior,direccion,telefono,cantidadDeEmpleados;
		int tipoUsuario;
		Scanner teclado = new Scanner(System.in);
		
		nombre = fechaDeNacimiento = run = experiencia = departamento = funcion = nombreSuperior = direccion = telefono = cantidadDeEmpleados = "";
		tipoUsuario = 0;
		
		System.out.println("Ingrese el nombre del usuario: ");
		nombre = teclado.next();
		System.out.println("Ingrese la fecha de nacimiento (DD/MM/AAAA) del usuario: ");
		fechaDeNacimiento = teclado.next();
		System.out.println("Ingrese el RUN del usuario: ");
		run = teclado.next();
		
		System.out.println("Ingrese tipo de usuario: ");
		
		System.out.println("1. Cliente");
		System.out.println("2. Profesional");
		System.out.println("3. Administrativo");
		tipoUsuario = teclado.nextInt();
		
		switch(tipoUsuario) {
			case 1:
				System.out.println("Ingrese la dirección del cliente: ");
				direccion = teclado.next();
				System.out.println("Ingrese el teléfono del cliente: ");
				telefono = teclado.next();
				System.out.println("Ingrese la cantidad de empleados de la empresa: ");
				cantidadDeEmpleados = teclado.next();
				break;
			case 2:
				System.out.println("Ingrese los años de experiencia del cliente: ");
				experiencia = teclado.next();
				System.out.println("Ingrese el departamento del cliente: ");
				departamento = teclado.next();
				break;
			case 3:
				System.out.println("Ingrese la función del cliente: ");
				funcion = teclado.next();
				System.out.println("Ingrese el nombre del superior del cliente: ");
				nombreSuperior = teclado.next();
				break;
		}
		
		System.out.println("Nombre de cliente: " + nombre);
		System.out.println("Fecha de nacimiento de cliente: " + fechaDeNacimiento);
		System.out.println("Run de cliente: "+ run);
		
		switch(tipoUsuario) {
			case 1:
				System.out.println("Dirección de cliente: " + direccion);
				System.out.println("Teléfono de cliente: " + telefono);
				System.out.println("Cantidad de empleados de cliente: " + cantidadDeEmpleados);
				break;
			case 2:
				System.out.println("Años de experiencia de cliente: " + experiencia);
				System.out.println("Departamento de cliente: " + departamento);
				break;
			case 3:
				System.out.println("Función de cliente: " + funcion);
				System.out.println("Nombre de superior del cliente: " + nombreSuperior);
				break;
		}
		
		teclado.close();
		
	}

}
