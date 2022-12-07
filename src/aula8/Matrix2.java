package aula8;

import java.util.Scanner;

public class Matrix2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		// FAÇA UM PROGRAMA PARA ARMAZENAR EM UMA MATRIX OS COMPROMISSO
		// DE UMA AGENDA PESSOAL.CADA DIA DO MÊS DEVE CONTER 24 HORAS ONDE
		// PARA CADA UMA DESSAS 24 HORAS PODEMOS ASSOCIAR UAM TAREFA ESPECIFICA
		// (COMPROMISSO AGENDADOS)
		// O PROGRAMA DEVE TER UM MENU ONDE O USUARIO INDICA O DIA DO MÊS QUE DESEJA
		// ALTERAR
		// E A HORA,ENTRANDO EM SEGUIDA COM O COMPROMISSO,OU ENTÃO O USUARIO PODE TAMBEM
		// CONSULTAR AGENDA
		// FORNECENDO O DIA E A HORA PARA OBTER COMPROMISSO ARMAZENADO

		String compromisso[][] = new String[31][24];

		boolean sair = false;
		int opcao;
		while (!sair) {

			System.out.println("Digite 1 para adicinar compromisso.");
			
			System.out.println("Digite 2 para verificar compromisso.");
			
			System.out.println("Digite 0 para sair.");

			opcao = ler.nextInt();

			boolean diaValido = false;
			int dia;
			while (!diaValido) {

			}
			if (opcao == 1) {// adiciona compromisso

				System.out.println("Entre com o dia do mes.");
				dia = ler.nextInt();
				if (dia > 0 && dia < 31) {
					diaValido = true;
				} else {
					System.out.println("Dia invalido digite novamente.");
				}

				boolean horaValida = false;
				int hora;
				while (!horaValida) {

				}
				if (opcao == 2) {// verifica compromisso

					System.out.println("Entre com a hora do compromisso.");
					hora = ler.nextInt();
					if (hora <= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("hora invalida digite novamente.");
					}
				
					System.out.println("Digite o compromisso.");
					compromisso[--dia][hora] = ler.next();
					
			} else if (opcao == 2) {// verifica compromisso
				
				
					} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("opcao invalida digite novamente.");
			}
		}
	}
}
}