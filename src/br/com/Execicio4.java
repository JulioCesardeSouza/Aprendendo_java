package br.com;

import java.util.Scanner;

public class Execicio4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("digite a idade:");
		int idade = ler.nextInt();

		System.out.println("você tem habilitação?");
		boolean habilitado = ler.nextBoolean();//true ou false
		
		if ((idade >= 18)&&(habilitado == true)) {
			System.out.println("liberado você é maior de idade");
		}else {
			System.out.println("nao liberado, você não é maior de idade");
		}

	}
	

}
