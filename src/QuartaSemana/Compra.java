package QuartaSemana;

public class Compra {

	protected double compra;

	public Compra(double compra) {
		this.compra = compra;
	}

	public double getCompra() {
		return compra;
	}

	public void setCompra(double compra) {
		this.compra = compra;
	}
	
	public double total(){
		return compra;
	}
}
