package aula4;

import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		String[] mes = {"Jan", "Fev","Mar","Abr","Mai","Jun","Jul", 
		    "Ago","Set","Out","nov","Dez"};
		
		int [] tot = { 31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i = 0; i < mes.length;i++) {
			System.out.println("O mes de " + mes [i] + " tem  " + tot [i]+" dias ao todo");
			
		}
		
		}
}
	
	

