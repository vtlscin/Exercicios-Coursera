package QuintaSemana;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Relogio {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date data;
	private int dataFixa;

	public Relogio(String data, int dataFixa) throws ParseException {
		this.data = sdf.parse(data);
		this.dataFixa = dataFixa;
	}
	
	public Relogio(int dataFixa) {
		this.dataFixa = dataFixa;
	}
	
	public Long agora() {
		if (dataFixa == 0) {
			return data.getTime();
		}
		else {
			return System.currentTimeMillis();
		}
	}
}
