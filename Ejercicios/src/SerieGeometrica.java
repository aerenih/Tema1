
public class SerieGeometrica implements SerieNumerica{
	private int t0;
	private int t;
	private int n;
	
	public SerieGeometrica(int t0, int t){
		this(t0, t, 0);
	}
	
	public SerieGeometrica(int t0, int t, int n){
		this.t0 = t0;
		this.t = t;
		this.n = n;
	}
	
	public int siguienteNumero(){
		n++;
		return t0 * (int)Math.pow(t,n);
	}
	
	public int ultimoNumero(){
		return t0 * (int)Math.pow(t,n);
	}
}
