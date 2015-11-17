/**
* Crea una clase DelReves que implemente el método mostrarDelReves(int []). Se le
* pasará como argumento un vector de enteros inicializado mediante llaves. Mostrará
* dicho vector del revés.
* @author Miguel &Aacute;ngel Zamora Blanco
* @version 1.0
*/

public class DelReves{
	public static void main(String[] args) {
		int[] vector= new int[pedirValor("el valor del vector: ")];
		for(int i=0; i<vector.length; i++)
			vector[i]=pedirValor("el valor "+(i+1)+" del vector: ");
		mostrarDelReves(vector);
		
	}
	/**
	* Metodo que pide por teclado un valor
	* @return el valor.
	*/
	static int pedirValor(String mensaje){
		return Teclado.leerEntero("Dame "+mensaje);
	}
	/**
	* Metodo que muestra un vector del reves.
	*/
	static void mostrarDelReves(int[] vector){
		System.out.print("\nVector al reves: ");
		for(int i=vector.length-1; i>=0; i--)
			System.out.print(vector[i]+"  ");
	}
}