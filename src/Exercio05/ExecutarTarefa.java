package Exercio05;

import java.util.Scanner;

import Exercio04.Departamento;

public class ExecutarTarefa {

	public static void main(String[] args) {

		Igreja igreja = insereDadosIgreja();
		mostrarDadosIgreja(igreja);
		

	}

	public static Igreja insereDadosIgreja() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Inserir os dados do Cargo");
		System.out.println("");
		System.out.println("Digite o IdIgreja");
		int idIgreja = sc.nextInt();
		System.out.println("");
		System.out.println("Digite o nome cargo ");
		String nome = sc.next();
		System.out.println("");
		System.out.println("Inscrição");
		String inscricao = sc.next();

		Igreja igreja = new Igreja(idIgreja, nome, inscricao);
		Membresia membresia = new Membresia();
		System.out.println("Digite o nome do membro");
		membresia.setNome(sc.next());
		System.out.println("Digite o sobre Nome");
		membresia.setSobreNome(sc.next());
		System.out.println("Digite a Data de Nascimento");
		membresia.setDataNascimento(sc.next());
		System.out.println("Ja foi Batizado");
		membresia.setBatismoNasAguas(sc.nextBoolean());
		System.out.println("Digite o tempo  de ministerio");
		membresia.setAnosDeCrente(sc.nextInt());
		
		return igreja;
	
		
		
		
		
		
		
		
		
		
		


		

	}
	public static void mostrarDadosIgreja(Igreja igreja) {
		System.out.println("Mostrando dados da Igreja");
		System.out.println("");
		System.out.println("ID Igreja: " + igreja.getIdIgreja());
		System.out.println("NOME: " + igreja.getNome());
		System.out.println("INSCRICAO: " + igreja.getIncricao());
	}

}
