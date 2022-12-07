 package aula6;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] idade = new int[9];
		int tamanho = 2;
		double soma = 0;
		idade[0] = 23 ;
		idade[1] = 22 ;
		idade[2] = 18 ;
		idade[3] = 34 ;
		idade[4] = 23 ;
		idade[5] = 21 ;
		idade[6] = 25 ;
		idade[7] = 39 ;
		idade[8] = 40 ;
		
		double[] notas = new double[4];
		String[] nomes = new String[tamanho];
		int[] idades = new int[tamanho];
		double[] mediaNotas = new double[tamanho];
		
		int coluna = 2;
		int linha = 2;
		                            //quantas colunas e quantas linhas
		double[][] matriz = new double[coluna][linha];  // [0][0], [1][0]..
		
		int somaIdade = 0;
		
		System.out.println("Cadastro de Alunos");
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Digite o nome do Aluno: ");
			nomes[i] = ler.next();
			
			System.out.println("Digite a idade do Aluno: ");
			idades[i] = ler.nextInt();
			
			for(int x = 0; x < 1; x++) {
				for (int j = 0;  j < matriz.length; j++) {
					System.out.println("Insira o valor da nota ["+ x +"] ["+ j +"]");
				    matriz[x][j] = ler.nextDouble();					    
				    soma += matriz[x][j];
				}
				//                    0.0 = 0 + 5.8
				// variavel += soma  soma = soma + variavel
				
				mediaNotas[i] = soma / matriz.length;
				
				soma = 0;
			}
		}
		
		System.out.println("Imprimindo os Alunos:");
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Aluno: "+nomes[i]);
			System.out.println("Idade: "+idades[i]);
			System.out.printf("Media: %.2f \n", mediaNotas[i]);
		}
		
		

	}

}