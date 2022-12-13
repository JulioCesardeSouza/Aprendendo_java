package estudo.aula11.collections;

import java.util.*;

public class TestCollectionArrayList1 {

	public static void main(String args[]) {

		List<String> nomes = new ArrayList<>();
		List<Estudante> listaDeEstudantes = new ArrayList<>();
		List<Disciplina> listaDeDisciplinas = new ArrayList<>();
		String periodo = Periodo.NOITE.toString();

		nomes.add("Julio");
		nomes.add("Huelton");

		listaDeEstudantes.add(new Estudante(1, "Julio", 20));
		listaDeEstudantes.add(new Estudante(2, "Huelton", 18));
		listaDeEstudantes.add(new Estudante(2, "Carlos", 32));

		listaDeDisciplinas.add(new Disciplina(1, "Java", "Estudo de Java", periodo));
		listaDeDisciplinas.add(new Disciplina(2, "Algoritmo", "Estudo de Algoritmo", periodo));

		buscaPorNomes(nomes, listaDeEstudantes, listaDeDisciplinas);
		buscaPorNome("Huelton", listaDeEstudantes);

	}

	public static void buscaPorNomes(List<String> nomes, List<Estudante> estudantes, List<Disciplina> disciplinas) {

		for (String nome : nomes) {
			for (Estudante estudante : estudantes) {
				if (estudante.getNome().equals(nome)) {
					estudante.addDisciplinas(disciplinas);
				}
			}
		}

	}

	public static void buscaPorNome(String nome, List<Estudante> estudantes) {
		
		for(int i = 0;i<estudantes.size();i++) {
			   if (estudantes.get(i).getNome().equals(nome)) {
					System.out.println("Encontrado o aluno: " + nome + " na lista de Estudantes");
				}
		 }

		for(Estudante estudante:estudantes) {
			    if (estudante.getNome().equals(nome)) {
					  System.out.println("Encontrado o aluno: " + nome + " na lista de Estudantes");
				}

		  }		
    	
	}

}