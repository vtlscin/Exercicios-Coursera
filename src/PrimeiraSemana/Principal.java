package PrimeiraSemana;

public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(50, 1.80);
		Paciente p2 = new Paciente(60, 1.70);
		Paciente p3 = new Paciente(85, 1.83);
		Paciente p4 = new Paciente(50, 1.75);
		Paciente p5 = new Paciente(50, 1.70);
		Paciente p6 = new Paciente(85, 1.60);
		Paciente p7 = new Paciente(95, 1.60);
		Paciente p8 = new Paciente(105, 1.60);
		
		System.out.println(p1.diagnostico());
		System.out.println(p4.diagnostico());
		System.out.println(p5.diagnostico());
		System.out.println(p2.diagnostico());
		System.out.println(p3.diagnostico());
		System.out.println(p6.diagnostico());
		System.out.println(p7.diagnostico());
		System.out.println(p8.diagnostico());
			
		
	}
	
}
