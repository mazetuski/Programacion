/**
* Crea una clase MediaDelVector que cree un vector con enteros aleatorios y 
* muestre la media del vector. Para ello, implementa los métodos pedirDimension(),
* inicializarVectorAleatoriamente(int[], min, max) y hallarMedia(int[]).
* @author Miguel &Aacute;ngel Zamora Blanco
* @version 1.0
*/

public class MediaDelVector{
	public static void main(String[] args) {
		int[] vector=new int[pedirDimension()];
		double media=0;
		vector=inicializarVectorAleatoriamente(vector);
		media=hallarMedia(vector);
		System.out.println("La media es: "+media);

	}
	/**
	* Metodo que pide la dimension de un vector.
	* @return devuelve un entero pedido por consola
	*/
	static int pedirDimension(){
		return Teclado.leerEntero("Dame la dimension del vector: ");
	}
	/**
	* Metodo que asigna numeros aleatorios.
	* @param vector Vector al que se le asignan los numeros
	* @return El vector.
	*/
	static int[] inicializarVectorAleatoriamente(int[] vector){
		double aleatorio;
		for(int i=0; i<vector.length; i++){
			aleatorio=Math.random()*(1-10)+10;
			vector[i]=(int)aleatorio;
		}
		return vector;
	}
	static double hallarMedia(int[] vector){
		double suma=0;
		for(int i=0; i<vector.length; i++)
			suma+=vector[i];
		return suma/vector.length;
	}
}