package br.com;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("entre com a primeira nota:");
		double nota1 = ler.nextDouble();
		System.out.println("entre com a segunda nota:");
		double nota2 = ler.nextDouble();
		System.out.println("entre com a terceira nota:");
		double nota3 = ler.nextDouble();
		System.out.println("entre com a quarta nota:");
		double nota4 = ler.nextDouble();
		System.out.println("frequ�ncia:");
		double frequ�ncia = ler.nextDouble();

		double m�dia = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.printf("O calculo da notas: %.2f \n" , (nota1 + nota2 + nota3 + nota4 / frequ�ncia));
		System.out.println(m�dia);

		// media=nota1+nota2+nota3+nota4;

		if (frequ�ncia > 0.7 && m�dia > 7.0) {
			System.out.println("O aluno esta aprovado");

		} else {
			System.out.println("O aluno esta reprovado");
		}

	}

}
