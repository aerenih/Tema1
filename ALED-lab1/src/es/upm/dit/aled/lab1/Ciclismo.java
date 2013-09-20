package es.upm.dit.aled.lab1;

/**
 * Clase que representa una actividad de ciclismo.
 * @author jmdela
 *
 */
public class Ciclismo extends Actividad {

	/**
	 * Constante que marca el ritmo de pedaleo bajo
	 */
	public static final int RITMO_BAJO = 4;
	/**
	 * Constante que marca el ritmo de pedaleo medio
	 */
	public static final int RITMO_MEDIO = 10;
	/**
	 * Constante que marca el ritmo de pedaleo alto
	 */
	public static final int RITMO_ALTO = 16;

	/**
	 * Atributo que almacena el ritmo de pedaleo de esta actividad.
	 */
	private int ritmo;
	
	/**
	 * Constructor de  la clase que inicia el estado de la actividad.
	 * @param ritmo El ritmo al que se ha realizado la actividad.
	 * @param duracion El tiempo, en minutos, que ha durado la actividad.
	 * @throws ParametroErroneoException Cuando el ritmo no está entre los valores esperados o 
	 * la duración es mejor que 0 minutos.
	 */
	public Ciclismo(int ritmo, int duracion) throws ParametroErroneoException {
		super(duracion);
		
		if(ritmo==Ciclismo.RITMO_BAJO || ritmo==Ciclismo.RITMO_MEDIO || ritmo==Ciclismo.RITMO_ALTO)
			this.ritmo = ritmo;
		else
			throw new ParametroErroneoException("El ritmo debe estar entre los valores esperados");
	}

	/**
	 * Devuelve un entero que indica el ritmo de pedaleo (ver las constantes definidas en la clase Ciclismo)
	 * @return El ritmo al que se ha pedaleado.
	 */
	public int getRitmo() {
		return ritmo;
	}
	
	/**
	 * Permite modificar el ritmo de pedaleo de esta actividad.
	 * @param ritmo El nuevo ritmo a fijar.
	 * @throws ParametroErroneoException 
	 */
	public void setRitmo(int ritmo) throws ParametroErroneoException {
		if(ritmo==Ciclismo.RITMO_BAJO || ritmo==Ciclismo.RITMO_MEDIO || ritmo==Ciclismo.RITMO_ALTO)
			this.ritmo = ritmo;
		else
			throw new ParametroErroneoException("El ritmo debe estar entre los valores esperados");
	}
}