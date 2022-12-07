package ExerciciosLista;

import java.util.*;

public class Lista2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		List<String> nomes = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o nome na posicao" + (i + 1));
			String valor = ler.next();
			nomes.add(valor);

		}
		System.out.println("Insire o nome para buscar na lista");
		String busca = ler.next();
		buscaNomeNaLista(nomes,busca);
	}

	public static void buscaNomeNaLista(List<String> nomes, String busca) {
		boolean encontrado = false;
		for (String nome : nomes) {
			if (nome.equalsIgnoreCase(busca)) {
				encontrado = true;
				System.out.println("Nome " + busca + " encontrado na Lista");
			}

		}
		if(encontrado==false) {
			System.out.println("Nome " + busca + " nao encontrado na Lista");
			
		}
	}

}
