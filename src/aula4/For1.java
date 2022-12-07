package aula4;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas do aluno: ");
		int qtd = ler.nextInt();
		double notaAluno;
		double media = 0;
		
	
		for (int i = 1; i <= qtd; i++) {
			System.out.println("Entre com a nota - " + i);
			notaAluno = ler.nextDouble();
			media += notaAluno;  // media = media + notaAluno;
			
		}
		
		System.out.printf("Media das notas: %.2f",(media/qtd));

	}

	}


