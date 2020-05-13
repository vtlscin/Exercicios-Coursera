package SegundaSemana;

import java.util.HashMap;

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
		
		int qtdIngrediente = 0;
		
		if(ingredientes.containsKey(ingrediente)){
			qtdIngrediente = ingredientes.get(ingrediente);
			ingredientes.put(ingrediente, qtdIngrediente++);
		}else{
			ingredientes.put(ingrediente, qtdIngrediente);
		}
		
	}
	
	public static HashMap<String, Integer> getIngredientes() {
		return ingredientes;
	}

	public static void setIngredientes(HashMap<String, Integer> ingredientes) {
		Pizza.ingredientes = ingredientes;
	}
	
}
