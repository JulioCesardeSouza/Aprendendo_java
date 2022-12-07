package aula4;

import java.util.Scanner;

public class Execicio2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idade;
		String nome;
		String opc = "S";
		double somaIdade = 0;
		int contador = 0;
		int guardaIdade = 0;
		String guardaNomeAluno = "";

		while (opc.equals("S") || opc.equals("s")) {
			System.out.println("Digite o nome do aluno");
			nome = ler.next();
			System.out.println("Digite a idade do aluno");
			idade = ler.nextInt();

			if (idade > guardaIdade) {
				guardaIdade = idade;
				guardaNomeAluno = nome;

			}

			somaIdade += idade;
			contador++;

			System.out.println("Digite o caracter para entra novamente: ");
			opc = ler.next();

		}
		System.out.println("aluno com o nome:" + guardaNomeAluno + "tem a maior  idade" + guardaIdade);

		System.out.println("Soma das idades inseridads " + somaIdade);
		System.out.printf("Media das idades inseridas %.2f ", (somaIdade / contador));

	}

}
