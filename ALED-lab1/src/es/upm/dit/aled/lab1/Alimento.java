package es.upm.dit.aled.lab1;

/**
 * Clase que modela un Alimento, caracterizado por su cantidad de calorias.
 * @author jmdela
 *
 */
public class Alimento {

	private int calorias;
	/**
	 * Constructor de la clase que inicia el estado del objeto.
	 * @param cal Las calorías que aporta.
	 * @throws ParametroErroneoException Si la cantidad de calorias es menor que cero.
	 */
	public Alimento(int cal) throws ParametroErroneoException{
		if(cal<0)
			throw new ParametroErroneoException("La cantidad de calorias no puede ser menor que cero.");
		
		this.calorias=cal;
	}

	/**
	 * Devuelve las calorías aportadas por este alimento.
	 * @return Las calorías. 
	 */
	public int getCalorias() {
		return calorias;
	}

	/**
	 * Fija la cantidad de calorias que contiene este alimento.
	 * @param cal Las calorias.
	 */
	public void setCalorias(int cal) throws ParametroErroneoException{
		if(cal<0)
			throw new ParametroErroneoException("La cantidad de calorias no puede ser menor que cero.");
		calorias = cal;
	}
	
	
}
