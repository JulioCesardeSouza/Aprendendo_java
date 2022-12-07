package aula12map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHash2 {

	public static void main(String[] args) {
		
		
		  //Criando um map de Veiculos   
	    Map<Integer,Veiculo> mapVeiculo = new HashMap<Integer,Veiculo>();    
	    //Creating Veiculo   
	    Veiculo v1 = new Veiculo(1,Marca.BMW,"X5","Preta");    
	    Veiculo v2 = new Veiculo(2,Marca.GM,"Camaro","Amarelo");    
	    Veiculo v3 = new Veiculo(3,Marca.TOYOTA,"Hilux","Cinza Escuro");    
	    //Adicionando Veiculos no MAP   
	    mapVeiculo.put(1,v1);  
	    mapVeiculo.put(2,v2);  
	    mapVeiculo.put(3,v3);  
	    
	    System.out.println();
	      
	    //Percorrendo o MAP  
	    for(Map.Entry<Integer, Veiculo> entry : mapVeiculo.entrySet()){
	    	
	    	Integer k= entry.getKey();	    	
	        Veiculo v = entry.getValue();  
	        System.out.println(k+" Detalhes dos Veiculo: - "+v.getId());  
	        System.out.println("Marca: "+v.getMarca().getMarcaPorExtenso()); 
	        System.out.println("Modelo: "+v.getModelo());
	        System.out.println("Cor: "+v.getCor());
	        System.out.println();
	    }    
	} 

	}



