package br.com;

import java.util.Scanner;

public class Avaliacao4 {

	public static void main(String[] args) {

		//Escrever um Programa que leia o nome de um vendedor,
		//o seu sal�rio fixo e o total de vendas efetuadas por ele no
		//m�s (em dinheiro). Sabendo que este vendedor ganha 15% 
		//de comiss�o sobre suas vendas efetuadas, informar o seu
		//nome, o sal�rio fixo e sal�rio no final do m�s
		
		Scanner ler = new Scanner(System.in);
		
		String nome;
		double salarioFixo, comissao,vendasTotal;
		
		System.out.println("Digite o nome");
		nome = ler.next();
		System.out.println("Digite o salario fixo");
		salarioFixo = ler.nextDouble();
		System.out.print("Digite o total de vendas no mes em dinheiro");
		vendasTotal= ler.nextDouble();
		
		comissao = vendasTotal* 0.15;
		
		System.out.println( "nome" + nome);
		System.out.println("salario fixo R$"+ salarioFixo);
		System.out.println("comissao R$"+ comissao);
		System.out.println("salario completo dele R$"+(salarioFixo+comissao));
	}
	

}
