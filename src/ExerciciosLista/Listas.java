package ExerciciosLista;

import java.util.*;

public class Listas {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		List<Integer> listaInteira = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o numero Inteiro da posicao " + (i + 1));
			int valor = ler.nextInt();
			listaInteira.add(valor);

		}
		int valorTotal = mostraSomaTotalDaLista(listaInteira);
		System.out.println("O valor Total da Lista "+ valorTotal);
	}

	public static int mostraSomaTotalDaLista(List<Integer> lista) {
		int acomulador = 0;
		for (Integer integer : lista) {
			acomulador  += integer;

		}

		return acomulador;

	}
}
