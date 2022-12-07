package br.com;

import java.util.Scanner;

public class Avaliacao5 {

	public static void main(String[] args) {

		// Escrever um Programa que leia 10 alunos nome e matricula do
		// aluno e as notas das 4 provas que ele obteve no semestre.
		// No final informar matricula,o nome do aluno da media (PASSOU, REPROVADO)
		// mais alta e matricula,o nome do aluno da media (PASSOU, REPROVADO)
		// mais baixa da lista cadastrada.Calculo da média (aritmética)
		// e informar se ele passou(media >=7),
		// ficou de recuperação(media >=4 ou < 7) ou reprovou (media < 4),

		Scanner ler = new Scanner(System.in);

		int tamanho;
		
		String nome, matricula;
		double nota1, nota2, nota3, nota4, media;

		do {

			System.out.print("entre com a quantidade de alunos:");
			tamanho = ler.nextInt();
			if (tamanho < 1 || tamanho > 10) {

				System.out.println("quantidade invalido! digite um valor entre 1 e 10");
			}
		} while (tamanho < 1 || tamanho > 10);

		for (int i = 0; i < tamanho; i++) {
			System.out.println("Digite o nome do aluno :");
			nome = ler.next();
			
			System.out.println("Digite o numero da matricula");
			matricula=ler.next();

			System.out.println("Entre com a primeira nota");
			nota1 = ler.nextDouble();

			System.out.println("Entre com a segunda nota");
			nota2 = ler.nextDouble();

			System.out.println("Entre com a terceira nota");
			nota3 = ler.nextDouble();

			System.out.println("Entre com a quarta nota");
			nota4 = ler.nextDouble();

			media = (nota1 + nota2 + nota3 + nota4) / 4;
			

			System.out.printf("O calculo da notas: %.2f \n", (nota1 + nota2 + nota3 + nota4) / media);

			System.out.println("Matricula  "+ matricula  );
			System.out.println("Nome  " + nome  );
			System.out.println("Media  "+ media );
			
			if (media >= 7) {
				System.out.println("Aluno aprovado com exelecia");
			} else if (media > 4 && media < 7) {
				System.out.println("Aluno de recuração:");

			} else {
				System.out.println("Aluno reprovado");
				
				

			}

		}

	}

}
