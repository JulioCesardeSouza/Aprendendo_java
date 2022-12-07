package br.com;

import java.util.Scanner;

public class Execicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String marca, modelo, cor;

		System.out.printf("digite marca\n ");
		marca = ler.nextLine();

		System.out.printf("digite o modelo\n");
		modelo = ler.nextLine();

		System.out.printf("digite a cor\n ");
		cor = ler.nextLine();
		System.out.println();

		// Carro=Marca+Modelo+Cor;

		if (marca.equals("ford") && modelo.equals("fiesta") && cor.equals("preto")) {
			System.out.printf("atende os criterios marca: %s modelo: %s cor: %s", marca, modelo, cor);
		} else {
			System.out.printf("não atende os criterios marca: %s modelo: %s cor: %s", marca, modelo, cor);
		}

	}

}
