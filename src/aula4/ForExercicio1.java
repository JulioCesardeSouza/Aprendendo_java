package aula4;

import java.util.Scanner;

public class ForExercicio1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int alunos = ler.nextInt();
		
		for(int i =0; i <= alunos;i++) {
		System.out.println("Digite a quantidade de alunos:");
		 
			
		}
		
		 
		int matricula=ler.nextInt();
		
		System.out.println("Entre  com o numero de notas");
		int notas = ler.nextInt();
		
		int qtd =ler.nextInt();
       String nomes=ler.next();
		double soma = 0;
		double media;
		double nota;
		
       for(int i =0;i < qtd;i++) {
    	   System.out.println("Entre com o nome"+ (i+1));
    	   nomes= ler.next();
       }
		for(int i =0; i<qtd;i++) {
			System.out.println("Entre com a matricula"+ (i+1));
			matricula= ler.nextInt();
			
			
		}
       
		for (int i = 0; i < notas; i++) {
			System.out.println("Entre com a nota" + (i + 1));
			nota = ler.nextDouble();

			soma += nota;

		}
		media = soma / notas;

		{
			
			

			if (media >= 7) {
				System.out.println("O aluno passou:");

			} else if (media >= 4 && media < 7) {
				System.out.println("O aluno esta de recuperação:");

				if (media < 4)
					System.out.println("O aluno foi reprovado :");
				
				
				System.out.println("nomes"+nomes);
				System.out.println("matricula"+ matricula);
				System.out.println("soma"+ soma);
				System.out.println("nota"+ notas);
				System.out.println("media"+ media);
			    
				
				
			
				System.out.println("soma"+ soma);
			    

			}

		}
	}
}
