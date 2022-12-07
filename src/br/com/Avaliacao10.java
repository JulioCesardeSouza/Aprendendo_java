package br.com;

import java.util.Scanner;

public class Avaliacao10 {

	public static void main(String[] args) {

		// Faça um Programa que receba cadastros de clientes(codigo,nome, sobrenome, ),
		// um valor de uma compra e escolha em até quantas prestações deve fazer e
		// mostre o valor das prestações, exemplo o total deu 500,00 se o cliente
		// solicitar
		// fazer em 4 vezes o valor da prestação deve ser 125,00, se for em 5 vezes
		// 105,00
		// (mais acrescimo de 5% do total da compra) se o funcionario quiser fazer em 6
		// vezes deve informar que a opção esta invalida, somente em até 5 vezes a
		// compra deve
		// ser parcelada.No final pegar um cliente do array e mostrar o nome, sobrenome
		// e o valor da parcela da compra realizada.

		Scanner ler = new Scanner(System.in);

		boolean rodando = true;
		while (rodando) {

			System.out.println("[1] Cadastrar Cliente ");
			System.out.println("[2] Compras");

			System.out.println("[4] Sair");
			System.out.print(" Digite a opção: ");
			String opcao = ler.nextLine();

			switch (opcao) {
			case "1": {
				System.out.println(" ====  Cadastro de Cliente ==== ");
				System.out.print(" Digite o nome ");
				String nome = ler.nextLine();
				System.out.print(" Digite o Sobre nome ");
				String sobreNome = ler.nextLine();
				System.out.print(" Digite o codigo ");
				int codigo = ler.nextInt();
				
				System.out.println("Nome :"+ nome);
				System.out.println("Sobre Nome :"+ sobreNome);
				System.out.println("Codigo :"+ codigo);
				

			}
				break;

			case "2": {
				System.out.println("  ==== Compras ====");

				System.out.println("Digite o nome do produto");
				String produto = ler.nextLine();

				System.out.println("Entre com valor do produto:R$");
				double valor = ler.nextDouble();
				
				

				System.out.println(" ==== Digite a forma de pagamento ====");
				
			
					System.out.println("Forma de pagamento");
					double pagamentoAv = ler.nextDouble();
					System.out.println("Pagamento"+ pagamentoAv);
					double parcelamento = ler.nextDouble();
					
				
				
				
				produto += (valor/parcelamento);
				
				
				if(pagamentoAv == valor) {
				System.out.println(" O cliente terá 5% de desconto");
				
				}else if(valor < parcelamento ) {
					System.out.println(" O Cliente terá 5% de acrecimo");
					
				}else {
					
				}
				
				
				System.out.println("Produto:"+ produto);
				System.out.println("valor:"+ valor);
				

			}
				break;

			case "4": {
				rodando = false;

			}
				break;

			}

			{

			}
		}
	}
}
