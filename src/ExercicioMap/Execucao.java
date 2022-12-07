package ExercicioMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Map<String, List<Veiculo2>> mapVeiculo = new HashMap<>();

		List<Veiculo2> listVeiculo = new ArrayList<>();

		System.out.println("Insira o nome da Categoria ");
		String categoria = ler.next();
		System.out.println("Insira a quantidade de veiculos");
		int qtdVeiculos = ler.nextInt();

		for (int i = 0; i < qtdVeiculos; i++) {
			System.out.println("Digite a marca do veiculo ");
			String marca = ler.next();
			System.out.println("Digite o modelo do veiculo");
			String modelo = ler.next();
			System.out.println("Digite a cor do veiculo ");
			String cor = ler.next();
			Veiculo2 veiculo = new Veiculo2(i + 1, marca, modelo, cor);
			listVeiculo.add(veiculo);

		}

		mapVeiculo.put(categoria, listVeiculo);
		ler.close();
		System.out.println();

		for (Map.Entry<String, List<Veiculo2>> entry : mapVeiculo.entrySet()) {
			String k = entry.getKey();
			List<Veiculo2> list = entry.getValue();


			for (Veiculo2 v : list) {
				System.out.println("Id Veiculo: " + v.getId());
				System.out.println("Marca: " + v.getMarca());
				System.out.println("Modelo: " + v.getModelo());
				System.out.println("Cor: " + v.getCor());
			}

		}

	}

}
