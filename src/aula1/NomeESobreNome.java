package aula1;

import java.util.Scanner;

public class NomeESobreNome {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite seu nome");
		String nome = ler.nextLine();
		System.out.println("digite seu sobrenome");
		String sobreNome = ler.nextLine();
		System.out.println("didite o apelido");
		String apelido = ler.nextLine();
		System.out.println(nome +" "+ (sobreNome + apelido) );
		System.out.printf("ola %s %s ", nome , sobreNome,apelido );

	 
	}

}
