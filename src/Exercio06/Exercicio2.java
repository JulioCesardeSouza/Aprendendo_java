package Exercio06;

import java.util.*;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		List<String> listaDeNomes = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Insira o nome na lista");
			String nome = ler.next();
			listaDeNomes.add(nome);
		}
		System.out.println("Qual o nome deseja buscar na lista");
		String busca = ler.next();
		buscaNomeNaLista(busca,listaDeNomes);

	}

	public static void buscaNomeNaLista(String busca, List<String> lista) {

		boolean encontrado = false;
		for (String nome : lista) {
			if (nome.equalsIgnoreCase(busca)) {
				System.out.println("Nome: " + busca + " contem na lista");
				encontrado = true;
			}

		}
		if (encontrado == false) {
			System.out.println("Nome: " + busca + " nao contem na lista");

		}
	}

}
