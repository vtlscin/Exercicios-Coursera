package SegundaSemana;

public class CarrinhoDeCompras {

	
	public void calculaValor(Pizza pizza){
		if (pizza.getIngredientes().isEmpty()){
			System.out.println("Pizza nao contem ingredientes");
		}
		else{
			valorTotal(pizza);
		}
	}
	
	
	public double valorTotal(Pizza pizza){
		
		return 0;
	}
	
}
