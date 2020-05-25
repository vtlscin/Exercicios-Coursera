package SegundaSemana;

import java.util.HashMap;
import java.util.Set;

public class Pizza {

		
	private static HashMap<String, Integer> ingredientes = new HashMap<>();
	
	private HashMap<String, Integer> ingredientesPizza = new HashMap<>();
	
	public void adicionaIngrediente(String ingrediente){
		
		contabilizaIngrediente(ingrediente);
	}
	
	public double getPreco(){
		if(ingredientesPizza.values().size() > 0 && ingredientesPizza.values().size() <= 2){
			return 15.0;
		}else if(ingredientesPizza.values().size() >= 3 && ingredientesPizza.values().size() < 5){
			return 20.0;
		}else{
			return 23.0;
		}
	}
	
	public void contabilizaIngrediente(String ingrediente){
		
		int qtdIngrediente = 1;
		
		if(ingredientesPizza.containsKey(ingrediente)){
			qtdIngrediente = ingredientesPizza.get(ingrediente);
			ingredientesPizza.put(ingrediente, ++qtdIngrediente);
		}else{
			ingredientesPizza.put(ingrediente, qtdIngrediente);
		}
		
		ingredientesPizza.get(ingrediente);
		
	}
	
	public void qtdIngredientes(){
		if (ingredientes.keySet().isEmpty()){
			System.out.println("Nao tem ingredientes na pizza!!");
		}else{
			Set<String> chaves = ingredientes.keySet();
			for (String chave : chaves){
				System.out.println("ingrediente: " + chave + ", quantidade: " + ingredientes.get(chave));
			}
		}
		
	}
	
	public static void zeraIngredientes(){
		ingredientes = new HashMap<>();
	}

	public HashMap<String, Integer> getIngredientes() {
		return ingredientes;
	}

	public static void setIngredientes(HashMap<String, Integer> ingredientes) {
		Pizza.ingredientes = ingredientes;
	}
	
	public HashMap<String, Integer> getIngredientesPizza() {
		return ingredientesPizza;
	}

	public void setIngredientesPizza(HashMap<String, Integer> ingredientesPizza) {
		this.ingredientesPizza = ingredientesPizza;
	}
}
