package SegundaSemana;

import java.util.HashMap;
import java.util.Set;

public class Pizza {

		
	private static HashMap<String, Integer> ingredientes = new HashMap<>();
	
	public void adicionaIngrediente(String ingrediente){
		
		contabilizaIngrediente(ingrediente);
	}
	
	public double getPreco(){
		if(ingredientes.values().size() > 0 && ingredientes.values().size() < 2){
			return 15.0;
		}else if(ingredientes.values().size() > 3 && ingredientes.values().size() < 5){
			return 20.0;
		}else{
			return 23.0;
		}
	}
	
	public static void contabilizaIngrediente(String ingrediente){
		
		int qtdIngrediente = 1;
		
		if(ingredientes.containsKey(ingrediente)){
			qtdIngrediente = ingredientes.get(ingrediente);
			ingredientes.put(ingrediente, ++qtdIngrediente);
		}else{
			ingredientes.put(ingrediente, qtdIngrediente);
		}
		
		ingredientes.get(ingrediente);
		
	}
	
	public HashMap<String, Integer> getIngredientes() {
		return ingredientes;
	}

	public static void setIngredientes(HashMap<String, Integer> ingredientes) {
		Pizza.ingredientes = ingredientes;
	}
	
	public void qtdIngredientes(){
		Set<String> chaves = ingredientes.keySet();
		for (String chave : chaves){
			System.out.println("ingrediente: " + chave + ", quantidade: " + ingredientes.get(chave));
		}
	}
}
