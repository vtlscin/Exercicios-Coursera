package SegundaSemana;

public class CarrinhoDeCompras {

	// Como as pizzas compartilham todos os ingredientes e e quantidades de cada um
	// posso calcular o valor total a partir de apenas uma pizza.
	public void calculaValor(Pizza...pizza){
		if (pizza[0].getIngredientes().isEmpty()){
			System.out.println("Pizza nao contem ingredientes");
		}
		else{
			valorTotal(pizza[0]);
		}
	}
	
	
	public void valorTotal(Pizza pizza){
		
		System.out.println(pizza.getPreco());
	}
	
}
