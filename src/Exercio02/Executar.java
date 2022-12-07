package Exercio02;

import java.util.Scanner;

public class Executar {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o dados do condutor");
		System.out.println("");
		System.out.println("Digite o nome do condutor");
		String nome = ler.nextLine();
		System.out.println("");
		System.out.println("Digite sobre Nome do condutor");
		String sobreNome = ler.nextLine();
		System.out.println("");
		System.out.println("Digite a idade do condutor");
		int idade = ler.nextInt();
		System.out.println("");
		System.out.println("Digite o tipo de habilitação do condutor");
		String tipoHabilitacao = ler.next();
		System.out.println("");
		System.out.println("Você esta apto para dirigir?");
		boolean temHabilitacao = ler.nextBoolean();
		System.out.println("");
		System.out.println("Digite os dados do  endereço do condutor");
		System.out.println("");
		System.out.println("Digite o logradouro do condutor");
		String logradouro = ler.next();
		System.out.println("");
		System.out.println("Digite o numero do logradouro ");
		int numero = ler.nextInt();
		System.out.println("");
		System.out.println("Digite os dados do aluguel do veiculo");
		System.out.println("");

		Endereco endereco = new Endereco(logradouro, "", "", numero);
		Condutor condutor = new Condutor(nome, sobreNome, tipoHabilitacao, endereco, idade, temHabilitacao);
        String dataEntrada = "";
		int qtdDias = 0;
		Aluguel aluguel = new Aluguel();

		boolean validaCondutor = aluguel.condutorAptoParaAluguel(condutor);

		if (validaCondutor == true) {
			System.out.println("Digite a data do aluguel");
			dataEntrada = ler.next();
			System.out.println("");
			System.out.println("Digite quantidade de dias ");
			qtdDias = ler.nextInt();
			System.out.println("");
			
			System.out.println("Selecione as opcoes de veiculo:");
			System.out.println("1 - GM - Onix - valor R$ 200,00");
			System.out.println("2 - Fiat - Mobi - valor R$ 280,00");
			System.out.println("3 - VW - Virtus- valor R$ 200,00");

			int opcs = ler.nextInt();
			String nomeVeiculo = "";
			String marca = "";
			double valorAluguel = 0.0;
			switch (opcs) {
			case 1:
				marca = "GM";
				nomeVeiculo = "Onix";
				valorAluguel = 200.0;
				break;

			case 2:
				marca = "Fiat";
				nomeVeiculo = "Mobi";
				valorAluguel = 280.0;
				break;

			case 3:
				marca = "VW";
				nomeVeiculo = "Virtus";
				valorAluguel = 300.0;
				break;

			}

			aluguel.setCondutor(condutor);
			aluguel.setDataRetirada(dataEntrada);
			aluguel.setMarca(marca);
			aluguel.setModelo(nomeVeiculo);
			aluguel.setValorDiarioAluguel(valorAluguel);
		} else {
			System.out.println("Cliente nao esta apto para cadastro de Aluguel");
		}

		double valorTotalAluguel = aluguel.calculoValorAluguel(aluguel.getQtdDiasAluguel(),
				aluguel.getValorDiarioAluguel());

		// dados do condutor
		System.out.println("Nome do Condutor: "+ aluguel.getCondutor().getNome());
		System.out.println(" Digite o sobre nome do condutor"+ aluguel.getCondutor().getSobreNome());
		System.out.println(" Digite endereço do condutor"+ aluguel.getCondutor().getEndereco());
		System.out.println(" Digite a idade do condutor"+ aluguel.getCondutor().getIdade());
		System.out.println(" Digite o tipo de Habilitação do condutor"+ aluguel.getCondutor().getTipoHabilitacao());
		
		
		// dados do endereco
		System.out.println("Nome do Endereco: "+ aluguel.getCondutor().getEndereco().getLogradouro());
				

		if (validaCondutor == true) {
			System.out.println( );
			System.out.println("Dados do Aluguel");
			System.out.println("Data do Aluguel: "+ dataEntrada);
			System.out.println("Quantidade de dias "+ qtdDias);

			
			System.out.println("Digite o valor do aluguel");

		} else {
			System.out.println("");
		}

		ler.close();

	}

}
