
public class Serie {
	public void generadorNumeros(SerieNumerica unaSerie, int n){
		for(int i=0; i<n; i++)
			System.out.println(unaSerie.siguienteNumero());
	}
	
	public static void main(String s[]){
		Serie impresora = new Serie();
		
		SerieAritmetica serie1 = new SerieAritmetica(0, 3);
		impresora.generadorNumeros(serie1, 20); //Se hace un casting implícito: SerieAritmetica ==> Serie
		
		SerieGeometrica serie2 = new SerieGeometrica(1, 3);
		impresora.generadorNumeros(serie2, 20); //Se hace un casting implícito: SerieAritmetica ==> Serie
		
	}
}