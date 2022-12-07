package Exercio06;

import java.util.*;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		List<Double> nQuebrado = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o valor na lista ");
			double valor = ler.nextDouble();
			nQuebrado.add(valor);

		}
		double valorTotal = somaTotalDaLista(nQuebrado);
		System.out.println("A soma do valor total é " + valorTotal);

	}

	public static double somaTotalDaLista(List<Double> lista) {
		double valorTotal = 0;
		for (double valor : lista) {
			valorTotal += valor;
		}
		return valorTotal;

	}

}
