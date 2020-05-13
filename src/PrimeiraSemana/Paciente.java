package PrimeiraSemana;

public class Paciente {

	private double Quilos;
	private double Altura;
	
	public Paciente(double quilos, double altura) {
		super();
		Quilos = quilos;
		Altura = altura;
	}
	
	public double getQuilos() {
		return Quilos;
	}

	public void setQuilos(double quilos) {
		Quilos = quilos;
	}

	public double getAltura() {
		return Altura;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}
	
	private double IMC()
	{
		return (Quilos / (Altura * Altura));
	}
	
	public String diagnostico()
	{
		double Imc = IMC();
		
		if (Imc < 16.0)
		{
			return "Baixo peso muito grave";
		}
		else if(Imc > 16 && Imc < 16.99)
		{
			return "Baixo peso grave";
		}
		else if(Imc > 17 && Imc < 18.49)
		{
			return "Baixo peso";
		}
		else if(Imc > 18.50 && Imc < 24.99)
		{
			return "Peso normal";
		}
		else if(Imc > 25.0 && Imc < 29.99)
		{
			return "Sobrepeso";
		}
		else if(Imc > 30.0 && Imc < 34.99)
		{
			return "Obesidade grau I"; 
		}
		else if(Imc > 35.0 && Imc < 39.99)
		{
			return "Obesidade grau II"; 
		}
		else 
		{
			return "Obesidade grau III(obesidade mórbida)";
		}
	}
}
