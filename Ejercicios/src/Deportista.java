
public class Deportista extends Object{

	private int peso;
	private String nombre;
	private Fecha nacimiento;
	
	public Deportista(int p, String n, Fecha f){
		peso = p;
		nombre = n;
		nacimiento = f;
	}
	
	public String toString(){
		return "Peso: "+peso+". Nombre: "+nombre+". Fecha de nacimiento: "+nacimiento;
		//return this.toString();
	}
}
