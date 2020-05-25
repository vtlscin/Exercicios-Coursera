package SegundaSemana;

public class CarrinhoDeCompras {

	
	public String calculaValor(Pizza...pizzas){
		double valorTotal = 0.0;
		for (Pizza pizza : pizzas){
			if (!pizza.getIngredientesPizza().isEmpty()){
				valorTotal += pizza.getPreco();
			}
		}
		
		return (valorTotal == 0) ? "Pizza nao contem ingredientes" : String.valueOf(valorTotal); 
	}
	
}
