import java.util.Calendar;
import java.util.GregorianCalendar;


public class Fecha {

	public static final String ENERO = "ENERO";
	
	private int dia;
	private int mes;
	private int ano;
	  
	public Fecha(int d, int m, int a){
		dia = d;
		mes = m;
		ano = a;
	}
	
	public Fecha(){
		this(new GregorianCalendar().get(Calendar.DAY_OF_MONTH),  new GregorianCalendar().get(Calendar.MONTH), new GregorianCalendar().get(Calendar.YEAR));
	}
	
	public boolean equals(Fecha other){
		boolean esIgual = false;
		if(other!=null && dia==other.dia && mes==other.mes && ano==other.ano)
			esIgual =  true;
		return esIgual;
	}
}
