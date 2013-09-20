package es.upm.dit.aled.lab1;

/**
 * Clase que representa la actividad de hacer yoga.
 * @author jmdela
 *
 */
public class Yoga extends Actividad {

	/**
	 * Constructor de la clase que inicia el estado del objeto.
	 * @param minutos Tiempo que se ha realizado el yoga, en minutos.
	 * @throws ParametroErroneoException Si el tiempo es menor que 0
	 */
	public Yoga(int minutos) throws ParametroErroneoException {
		super(minutos);
	}
}
