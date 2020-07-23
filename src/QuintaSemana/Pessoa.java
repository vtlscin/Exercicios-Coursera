package QuintaSemana;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataNascimento;
	private Relogio relogio;
	private Calendar atual;
	private Calendar nascimento;
	
	public Pessoa(String dataNascimento, Relogio relogio) throws ParseException {
		this.dataNascimento = sdf.parse(dataNascimento);
		this.relogio = relogio;
	}
	
	public int getIdade() {
		convertDateToCalendar();
		LocalDate dataNascimento = LocalDate.of(nascimento.get(Calendar.YEAR), nascimento.get(Calendar.MONTH) + 1, nascimento.get(Calendar.DAY_OF_MONTH));
		LocalDate dataHoje = LocalDate.of(atual.get(Calendar.YEAR), atual.get(Calendar.MONTH) + 1, atual.get(Calendar.DAY_OF_MONTH));
		
		Period periodo = Period.between(dataNascimento, dataHoje);
		return periodo.getYears();
	}
	
	private void convertDateToCalendar() {
		Date dataAtual = new Date(relogio.agora());
		atual = Calendar.getInstance();
		atual.setTime(dataAtual);
		
		nascimento = Calendar.getInstance();
		nascimento.setTime(dataNascimento);

	}
	
	public String getSigno(){
		convertDateToCalendar();
		int mes = nascimento.get(Calendar.MONTH) + 1;
		int dia = nascimento.get(Calendar.DAY_OF_MONTH);
		switch (mes) {
		case 1:
			return dia >= 21 ? "Aquário" : "Capricórnio";
		case 2:
			return dia >= 20 ? "Peixes" : "Aquário";
		case 3:
			return dia >= 21 ? "Peixes" : "Áries";
		case 4:
			return dia >= 21 ? "Touro" : "Áries";
		case 5:
			return dia >= 21 ? "Gêmeos" : "Touro";
		case 6:
			return dia >= 21 ? "Câncer" : "Gêmeos";
		case 7:
			return dia >= 22 ? "Leão" : "Câncer";
		case 8:
			return dia >= 23 ? "Virgem" : "Leão";
		case 9:
			return dia >= 23 ? "Libra" : "Virgem";
		case 10:
			return dia >= 23 ? "Escorpião" : "Libra";
		case 11:
			return dia >= 22 ? "Sagitário" : "Escorpião";
		default:
			return dia >= 22 ? "Capricórnio" : "Sagitário";
		}
		
	}
	
}
