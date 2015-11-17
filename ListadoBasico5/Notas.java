/**
* Define la clase Notas que almacene en un array 
* 15 notas.  Las notas se inicializarán de 
* forma aleatoria con enteros entre 0 y 10. Se visualizarán las notas resultantes.
* @author Miguel &Aacute;ngel Zamora Blanco
* @version 1.0
*/

public class Notas{
	public static void main(String[] args) {
		int[] notas=new int[15];
		notas=notasAleatorias(notas);
		mostrarResultado(notas);
	}
	/**
	* Metodo que asigna numeros aleatorios.
	* @param vector Vector al que se le asignan los numeros
	* @return El vector.
	*/
	static int[] notasAleatorias(int[] vector){
		double aleatorio;
		for(int i=0; i<vector.length; i++){
			aleatorio=Math.random()*(1-10)+10;
			vector[i]=(int)aleatorio;
		}
		return vector;
	}
	static void mostrarResultado(int[] vector){
		System.out.print("\nEl vector es [ ");
		for(int i=0; i<vector.length; i++)
			System.out.print(vector[i]+" ");
		System.out.println("]");
	}
}