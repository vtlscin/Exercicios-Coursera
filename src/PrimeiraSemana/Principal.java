package PrimeiraSemana;

public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(50, 1.80);
		Paciente p2 = new Paciente(60, 1.70);
		Paciente p3 = new Paciente(85, 1.83);
		
		System.out.println(p1.diagnostico());
		System.out.println(p2.diagnostico());
		System.out.println(p3.diagnostico());
	
		
		
	}
	
}
