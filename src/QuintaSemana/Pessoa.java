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
	
}
