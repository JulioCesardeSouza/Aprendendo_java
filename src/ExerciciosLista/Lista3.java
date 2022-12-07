package ExerciciosLista;

import java.util.*;

public class Lista3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		List<Double> notas = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite a nota  do aluno   " );
			double posicao = ler.nextDouble();
			notas.add(posicao);

		}
		double valorTotal = mostraSomaTotalDasNotas(notas);
		System.out.println("O valor Total das Notas "  + valorTotal);

	}

	public static double mostraSomaTotalDasNotas(List<Double> notas) {
		double acomulador = 0;
		for (Double nota : notas) {
			acomulador += nota;

		}
		return acomulador;
	}

}
