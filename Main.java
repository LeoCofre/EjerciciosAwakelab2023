package cl.awakelab.modulo_dos.individual;

public class Main {

	public static void main(String[] args) {

		Trabajador trabajadorUno = new Trabajador("Juanito Alfonso", "Perez Perez", "1234-5", 12345, 33);
		imprimirTrabajador(trabajadorUno);

		Trabajador trabajadorDos = new Trabajador("Alfonso Juanito", "Perez Perezozo", "12345678-9", 4321, 34);
		imprimirTrabajador(trabajadorDos);
		
		Trabajador trabajadorVacio = new Trabajador();
		imprimirTrabajador(trabajadorVacio);	
	}

	public static void imprimirTrabajador(Trabajador trabajador) {
		System.out.println(trabajador.toString());
		System.out.println(trabajador.nombreCompleto());
		System.out.println(trabajador.descomponerRun());

	}

}
