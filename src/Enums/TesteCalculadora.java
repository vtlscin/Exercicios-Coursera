package Enums;

public class TesteCalculadora {
	
	
	public static void main(String[] args) {

		realizaOperacao(2, 2);
		
	}
	
	public static void realizaOperacao(double x, double y)
	{
		for(Calculadora cal : Calculadora.values())
		{
			System.out.println(x + " " + cal.toString() + " " + y + " " + " = "+ String.format("%.2f", cal.executarOperacao(x, y)).replace(",", "."));
		}
		
	}

}
