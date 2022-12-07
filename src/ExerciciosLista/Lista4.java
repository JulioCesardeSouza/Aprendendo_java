package ExerciciosLista;

import java.util.*;

public class Lista4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		List<String> animal = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			System.out.println("Digite o nome do animal na posicao " + (i + 1));
			String nome = ler.next();
			animal.add(nome);

		}
		System.out.println("Inserir o nome do animal para busca");
		String busca = ler.next();
		buscarNomeDosAnimais(animal, busca);

	}

	public static void buscarNomeDosAnimais(List<String> animal, String busca) {
		boolean encontrado = false;
		for (String nome : animal) {
			if (nome.equalsIgnoreCase(busca)) {
				encontrado = true;
				System.out.println("Nome" + busca + " Animal encontrado na Lista");

			}

		}
		if (encontrado == false) {
			System.out.println("Nome " + busca + "  Animal em extincao nao encontrado na Lista");
		}

	}

}
