package aula4;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int valor;

		 do {
			System.out.println("Digite seu nome ");
			String nome = ler.next();
			System.out.println("Seu nome: " + nome);

			System.out.println("Digite 1 para entra no While ou outro valor para sair");
			valor = ler.nextInt();

		}while (valor == 1);
		 
		System.out.println("Saiu do While");

	}

}
