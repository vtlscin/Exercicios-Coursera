package QuintaSemana;

public class Respeitoso implements FormatadorNome {

	public String sexo;
	
	public Respeitoso(String sexo) {
		if(sexo.equalsIgnoreCase("Masculino") || sexo.equalsIgnoreCase("Feminino")) {
			this.sexo = sexo;
		}
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if (sexo != null) {
			return sexo.equalsIgnoreCase("Masculino")? "Sr." + sobrenome : "Sra." + sobrenome; 			
		}
		else {
			return "";
		}
	}

	public String getSexo() {
		return sexo;
	}

}
