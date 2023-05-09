package cl.awakelab.modulo_dos.individual;

public class Trabajador {

	// Atributos
	String nombres;
	String apellidos;
	String run;
	int teléfono;
	int edad;

	// Constructor vacío
	public Trabajador() {
		this.nombres = "";
		this.apellidos = "";
		this.run = "";
		this.teléfono = 0;
		this.edad = 0;
	}

	// Constructor con parámetros
	public Trabajador(String nombres, String apellidos, String runConGuion, int teléfono, int edad) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.run = runConGuion;
		this.teléfono = teléfono;
		this.edad = edad;
	}

	// Método nombreCompleto
	public String nombreCompleto() {

		return nombres + " " + apellidos;

	}

	// Método descomponerRun
	public int descomponerRun() {
		if (this.run.isBlank()) {
			return -1;
		}
		int posicion = this.run.indexOf('-');
		String runTmp = this.run.substring(0, posicion);
		return Integer.valueOf(runTmp);
	}
	
	// ToString
		@Override
		public String toString() {
			return "Trabajador [nombres=" + nombres + ", apellidos=" + apellidos + ", runConGuion=" + run + ", teléfono="
					+ teléfono + ", edad=" + edad + "]";
		}

}
