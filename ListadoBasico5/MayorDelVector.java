/**
* Crea una clase MayorDelVector que cree un vector con enteros aleatorios y muestre el 
* valor máximo. Para ello, implementa los métodos pedirDimension(),
* inicializarVectorAleatoriamente(int[], i, max) y hallarMaximo(int[]). 
* @author Miguel &Aacute;ngel Zamora Blanco
* @version 1.0
*/

public class MayorDelVector{
	public static void main(String[] args) {
		int[] vector=new int[pedirDimension()];
		int max=0;
		vector=inicializarVectorAleatoriamente(vector);
		max=hallarMaximo(vector, max);
		System.out.println("El valor máximo es: "+max);

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
	/**
	* Metodo que halla el maximo de un vector.
	* @param vector Vector del que se halla el maximo.
	* @param max Valor maximo.
	* @return El maximo.
	*/
	static int hallarMaximo(int[] vector, int max){
		max=vector[0];
		for(int i=0; i<vector.length; i++){
			if(vector[i]>max)
				max=vector[i];
		}
		return max;
	}
}