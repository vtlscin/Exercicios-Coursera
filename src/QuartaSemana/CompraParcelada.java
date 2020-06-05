package QuartaSemana;

public class CompraParcelada extends Compra {

	private int qtdParcelas;
	
	private double jurosMensal;
	
	public CompraParcelada(double compra,int qtdParcelas, double jurosMensal) {
		super(compra);
		this.qtdParcelas = qtdParcelas;
		this.jurosMensal = jurosMensal;
	}

	public double getJurosMensal() {
		return jurosMensal;
	}

	public void setJurosMensal(double jurosMensal) {
		this.jurosMensal = jurosMensal;
	}

	public int getQtdParcelas() {
		return qtdParcelas;
	}

	public void setQtdParcelas(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}

	@Override
	public double total() {
		return compra * Math.pow((1 + jurosMensal), qtdParcelas);
	}
}
