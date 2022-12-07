package aula12map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

	public static void main(String[] args) {
		
		 Map<String, Integer> vehicles = new HashMap<>();
	        Integer somaTotal = 0;
	        
	        // adicionando veiculos (imagina Marca e quantidade) 
	        vehicles.put("BMW", 5);
	        vehicles.put("Mercedes", 3);
	        vehicles.put("Jeep", 4);
	        vehicles.put("GM", 10);
	 
	        System.out.println("Total de Marcas: " + vehicles.size());
	 
	        vehicles.put("GM", 11);
	        // iterando sobre todos os veiculos usando o metodo keySet() 
	        for (String key : vehicles.keySet())
	            System.out.println(key + " - " + vehicles.get(key));
	        System.out.println();
	 
	        String searchKey = "Audi";
	        
	        if (vehicles.containsKey(searchKey))
	            System.out.println("Found total " + vehicles.get(searchKey) + " " + searchKey + " cars!\n");
	        
	        for (String key : vehicles.keySet())
	        	  somaTotal += vehicles.get(key);        	      
	        
	        System.out.println("Soma total dos veiculos no patio - " + somaTotal);
	        System.out.println();
	 
	        // apaga todos os valores
	        vehicles.clear();
	 
	        // Equals to zero.
	        System.out.println("After clear operation, size: " + vehicles.size());
	        
	        vehicles.put("Nissan", null);
	        vehicles.put(null, 6);
	        
	        for (String key : vehicles.keySet())
	            System.out.println(key + " - " + vehicles.get(key));
	        System.out.println();
	    }


	}
	



