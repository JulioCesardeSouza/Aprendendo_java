package br.com;

import java.util.Scanner;

public class Avaliacao6 {

	public static void main(String[] args) {
		// Escrever um Programa que vc informa o valor a ser gasto dentro de
		// um supermercado, depois que leia valores dos produtos, o programa
		// deve ir decrementando o valor saldo até não ter mais a possibilidade
		// de compra, isso pode ser saindo do programa ou até não ter mais dinheiro
		// suficiente para compra - mostrar o valor total e troco(resto do dinheiro),
		// usar o While e outros operadores que achar necessario.

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a quantidade de produtos: ");
		int produtos = ler.nextInt();

		String nome;
		double precos, valorTotal, troco;
		int saldo;
		int qtd = ler.nextInt();

		System.out.println("Digite o saldo: ");
		saldo = ler.nextInt();

		System.out.println("Digite o nome do produto :");
		nome = ler.next();

		System.out.println("Digite o preço do produto:");
		precos = ler.nextDouble();

		troco = (saldo - precos);

		System.out.println("Saldo :" + saldo);
		System.out.println("nome:" + nome);
		System.out.println("preço:" + precos);

		System.out.println(" Troco:" + troco);

	}

}
