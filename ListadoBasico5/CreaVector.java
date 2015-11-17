/**
* Crea una clase CreaVector que solicite al usuario el tamaño de un nuevo vector y que 
* le pida los enteros necesarios para inicializarlo. Utiliza los métodos pedirDimension() y 
* pedirDatos(int[])
* @author Miguel &Aacute;ngel Zamora Blanco
* @version 1.0
*/

public class CreaVector{
	public static void main(String[] args) {
		int[] vector= new int[pedirValor("el valor del vector: ")];
		for(int i=0; i<vector.length; i++)
			vector[i]=pedirValor("el valor "+(i+1)+" del vector: ");
		mostrarResultado(vector);
	}
	/**
	* Metodo que pide por teclado un valor
	* @return el valor.
	*/
	static int pedirValor(String mensaje){
		return Teclado.leerEntero("Dame "+mensaje);
	}
	/**
	* Metodo que muestra un vector.
	* @param vector vector que se muestra
	*/
	static void mostrarResultado(int[] vector){
		System.out.print("El vector es: ");
		for(int i=0; i<vector.length; i++)
			System.out.print(vector[i]+" ");
	}
}