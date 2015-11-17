/**
* Crea una clase MenorDelVector que cree un vector con enteros aleatorios y muestre el 
* valor mínimo. Para ello, implementa los métodos pedirDimension(),
* inicializarVectorAleatoriamente(int[], min, max) y hallarMinimo(int[])
* @author Miguel &Aacute;ngel Zamora Blanco
* @version 1.0
*/

public class MenorDelVector{
	public static void main(String[] args) {
		int[] vector=new int[pedirDimension()];
		int min=0;
		vector=inicializarVectorAleatoriamente(vector);
		min=hallarMinimo(vector, min);
		System.out.println("El valor minimo es: "+min);

	}
	/**
	* Metodo que pide la dimension de un vector.
	* @return devuelve un entero pedido por consola
	*/
	static int pedirDimension(){
		return Teclado.leerEntero("Dame la dimension del vector: ");
	}
	/**
	* Metodo que inicializa un vector con valores aleatorios.
	* @param vector Vector que se inicializa con valores aleatorios.
	* @return el Vector.
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
	* Metodo que halla el minimo de un vector.
	* @param vector Vector del que se halla el minimo.
	* @param min Valor minimo.
	* @return El minimo.
	*/
	static int hallarMinimo(int[] vector, int min){
		min=vector[0];
		for(int i=0; i<vector.length; i++){
			if(vector[i]<min)
				min=vector[i];
		}
		return min;
	}
}