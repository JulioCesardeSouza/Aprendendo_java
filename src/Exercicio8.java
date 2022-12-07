import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		double media = 0;
		
		System.out.println("Digite a quantidade alunos:");
		int alunos = ler.nextInt();
		
		System.out.println("Digite o nome do aluno:");
		String nome = ler.next();
		
		System.out.println("Digite a matricula: ");
		int matricula = ler.nextInt();
		
		System.out.println("Ente com a primeira nota:");
		double nota1 = ler.nextDouble();
		
		System.out.println("Ente com a segunda nota:");
		double nota2 = ler.nextDouble();
		
		System.out.println("Ente com a terceira nota:");
		double nota3 = ler.nextDouble();
		
		System.out.println("Ente com a quarta nota:");
		double nota4 = ler.nextDouble();
		
		media = nota1+nota2+nota3+nota4/4;
		
		
		
			
		}
		

	}


