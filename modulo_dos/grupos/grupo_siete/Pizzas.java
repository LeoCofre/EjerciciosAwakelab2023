package cl.awakelabs;

import java.util.*;

public class Pizzas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		final int PRECIO_INGREDIENTE_BASE = 700;
		ArrayList<String> listaIngredientesAgregados = new ArrayList<String>();
		ArrayList<String> listaTipoPizza = new ArrayList<String>();
		listaTipoPizza.add("Pizza base");
		listaTipoPizza.add("Margarita");
		listaTipoPizza.add("Napolitana");
		listaTipoPizza.add("Peperoni");
		listaTipoPizza.add("Española");
		listaTipoPizza.add("Marinara");
		listaTipoPizza.add("Fugazza");
		listaTipoPizza.add("Hawaiana");
		listaTipoPizza.add("Fungi");

		ArrayList<Integer> listaPrecioPizza = new ArrayList<Integer>();
		listaPrecioPizza.add(4000);
		listaPrecioPizza.add(5500);
		listaPrecioPizza.add(6500);
		listaPrecioPizza.add(6200);
		listaPrecioPizza.add(6500);
		listaPrecioPizza.add(7500);
		listaPrecioPizza.add(6400);
		listaPrecioPizza.add(6000);
		listaPrecioPizza.add(6700);

		ArrayList<String> listaIngredientesProteina = new ArrayList<String>();
		listaIngredientesProteina.add("pollo");
		listaIngredientesProteina.add("peperoni");
		listaIngredientesProteina.add("tocino");
		listaIngredientesProteina.add("vacuno");
		listaIngredientesProteina.add("tofu");
		listaIngredientesProteina.add("salir");

		System.out.println("**BIENVENIDO A VULCANO PIZZA**");
		System.out.println("Tipo de pizza disponible... ");

		for (int i = 0; i < listaTipoPizza.size(); i++) {
			String indice = i + 1 + ". ";
			System.out.println(indice + listaTipoPizza.get(i));
		}

		System.out.println("Indique que pizza Desea");
		int tipoPizza = scanner.nextInt();
		scanner.nextLine();

		if (tipoPizza == 1) {
			int ingrediente = 0;
			do {
				System.out.println("Seleccione el ingrediente");
				for (int i = 0; i < listaIngredientesProteina.size(); i++) {
					String indice = i + 1 + ". ";
					System.out.println(indice + listaIngredientesProteina.get(i));
				}
				ingrediente = scanner.nextInt();
				scanner.nextLine();
				if (ingrediente != listaIngredientesProteina.size()) {
					listaIngredientesAgregados.add(listaIngredientesProteina.get(ingrediente - 1));

				}
			} while (ingrediente != listaIngredientesProteina.size());
		}

		System.out.println("Ingrese nombre y apellido");
		String nombre = scanner.nextLine();

		System.out.println("Ingrese su direccion");
		String direccion = scanner.nextLine();

		if (tipoPizza == 1) {
			int valorFinal = (PRECIO_INGREDIENTE_BASE * listaIngredientesAgregados.size()) + listaPrecioPizza.get(0);
			System.out.println("Bienvenido " + nombre + ", Seleccionaste la pizza " + listaTipoPizza.get(tipoPizza - 1)
					+ " $ " + valorFinal + " su pedido sera entregado a la direccion " + direccion);

		} else {
			System.out.println("Bienvenido " + nombre + ", Seleccionaste la pizza " + listaTipoPizza.get(tipoPizza - 1)
					+ " $ " + listaPrecioPizza.get(tipoPizza - 1) + " su pedido sera entregado a la direccion "
					+ direccion);
		}

		/*
		 * System.out.println("Seleccione ingrediente adicional (opcional):");
		 * System.out.println("1. Piña"); System.out.println("2. Champiñones");
		 * System.out.println("3. Aceituna"); System.out.println("4. Tocino");
		 * System.out.println("5. Tomate"); System.out.println("6. Carne");
		 * System.out.println("7. Pollo"); System.out.println("8. ");
		 */

		scanner.close();
	}

}
