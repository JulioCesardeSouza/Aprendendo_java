package aula4;

import java.util.Scanner;

public class Execicio1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		boolean infoValida = false;
		String nome , sexo ,estadoCivil;
		int idade;
        double salario ;
		do {
			System.out.println("Entre com o nome:");
			nome = ler.next();
			if (nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa ter pelo menos 3 caracteres:");

			}
		} while (!infoValida);

		infoValida = false;
		do {
			System.out.println("Entre com a idade :");
			idade = ler.nextInt();
			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("A idade precisa ser entre 0 e 150 :");

			}
		} while (!infoValida);
		
		do {
			System.out.println("Entre com o salario:");
			salario = ler.nextDouble();
			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Salario precisa ser maior que 0:");

			}
		} while (!infoValida);
		
		do {
			System.out.println("Entre com o sexo:");
			sexo = ler.next();
			if (sexo.equalsIgnoreCase("f")|| (sexo.equalsIgnoreCase("m"))) {
				infoValida = true;
			} else {
				System.out.println("Sexo precisa ser f ou m ");

			}
		} while (!infoValida);
		
		do {
			System.out.println("Entre com o estado civil:");
			estadoCivil = ler.next();
			if (estadoCivil.equalsIgnoreCase("c")|| (estadoCivil.equalsIgnoreCase("s")|| (estadoCivil.equalsIgnoreCase("v")||(estadoCivil.equalsIgnoreCase("d"))))) {
				
				infoValida = true;
			} else {
				System.out.println("Estado civil precisa se 'c', 's','v',ou d ");

			}
		} while (!infoValida);
		
		System.out.println("As seguintes informações foram coletadas:");

		System.out.println("nome:" + nome);
		System.out.println("idade:" + idade);
		System.out.println("salario:" + salario);
		System.out.println("sexo:" + sexo);
        System.out.println("estado Civil:" + estadoCivil);

	}

}
