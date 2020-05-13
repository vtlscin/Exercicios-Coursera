package Enums;

public enum Calculadora {

	SOMAR("+") {
		@Override
		public double executarOperacao(double x, double y) {
			return x + y;
		}
	},
	SUBTRAIR("-") {
		@Override
		public double executarOperacao(double x, double y) {
			return x - y;
		}
	},
	MULTIPLICAR("*") {
		@Override
		public double executarOperacao(double x, double y) {
			return x * y;
		}
	},
	DIVIDIR("/") {
		@Override
		public double executarOperacao(double x, double y) {
			return x / y;
		}
	};
	
	private String operacao;
	
	Calculadora(String operacao) {
		this.operacao = operacao;
	}

	public String toString() {
		return operacao;
	}

	public void setOperacacao(String operacacao) {
		this.operacao = operacacao;
	}
	
	public abstract double executarOperacao(double x, double y);
	
}
