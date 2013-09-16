import java.util.Random;

public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Dado un array de 100 enteros...
		int []a1 = new int[100];
		
		int a5[] = {12, 13, 14};
		//...rellenarlo con el cuadrado de cada posición
		for(int i=0; i<100; i++)
			a1[i] = i*i;
		
		//Dado un array de enteros...
		int a2[] = new int[100];
		for(int i=0;i<100; i++){
			Random r = new Random();
			a2[i] = r.nextInt(100);
			if(a2[1]>1000)
				return;
		}
		
		//...encontrar el valor mínimo almacenado
		int min = 100;
		for(int i=0; i<100; i++)
			if(a2[i]<min)
				min = a2[i];
		
		//...encontrar la posición del (último) valor mínimo
		int pos = 0;
		for(int i=0; i<100; i++)
			if(a2[i]==min)
				pos = i;
		
		//...calcular la suma de sus valores
		int suma = 0;
		for(int i=0; i<100; i++)
			suma += a2[i];
		
		//...invertir sus términos generando un nuevo array
		int a3[] = new int[100];
		for(int i=0; i<100; i++)
			a3[i] = a2[99-i];

		//...invertir sus términos reordenando los términos
		int aux = 0;
		for(int i=0; i<a2.length/2; i++){	//Sólo hasta la mitad, porque si no le volvemos a dar la vuelta!!
			aux = a2[i];
			a2[i] = a2[99-i];
			a2[99-i] = aux;
		}
		
		//...calcular el valor medio de los valores almacenados
		float media = ((float)suma)/a2.length;		//Hay que hacer la conversión, porque si no es división entera!!
		
		//...calcular el factorial de cada uno
		int fact=0;
		for(int i=0; i<a1.length; i++, fact=1){	//Hay que iniciar fact cada vez, porque si no vale 0!!
			for(int j=a1[i]; j>0; j--){
				fact *= j;
			}
			a1[i] = fact;						//A partir de a1[5] ya no caben y se desborda
		}
		
		//Dado un String devolver las veces que aparece cada vocal
		int vocales[] = new int[5];
		char letras[] = "Mi string".toLowerCase().toCharArray();
		for(int i=0; i<letras.length; i++){
			switch(letras[i]){
				case 'a': 	
				case 'A':
							vocales[0] += 1;
							break;
				case 'e': 	vocales[1] += 1;
							break;
				case 'i': 	vocales[2] += 1;
							break;
				case 'o': 	vocales[3] += 1;
							break;
				case 'u': 	vocales[4] += 1;
							break;
			}
		}
	}

}
