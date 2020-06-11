package QuintaSemana;

public class Autoridade {

	private String nome;
	private String sobrenome;
	private FormatadorNome formatador;

	public Autoridade(String nome, String sobrenome, FormatadorNome formatador) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.formatador = formatador;
	}
	
	public String getTratamento(){
		return formatador.formatarNome(nome, sobrenome);
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public FormatadorNome getFormatador() {
		return formatador;
	}
	
}
