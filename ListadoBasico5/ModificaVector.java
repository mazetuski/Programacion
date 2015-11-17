/**
* Define la  clase ModificaVector. Realizará las siguientes opciones:
* a.Creará un vector con la dimensión indicada por el usuario. 
* b.Inicializará con valores consecutivos (1, 2, 3...).  
* c.Después se solicitará al usuario un elemento del array (entre 1 y longitud) y su nuevo valor para modificarlo. 
* d.Este  proceso  de  modificación  de  un  elemento  se  repetirá  tantas  veces  como 
* quiera el usuario (¿quiere modificar otro(s/n)?) 
* e.Al acabar, se visualizarán el array ya modificado.
* @author Miguel &Aacute;ngel Zamora Blanco
* @version 1.0
*/

public class ModificaVector{
	public static void main(String[] args) {
		int[] vector= new int[pedirDimension()];
		vector=asignacionConsecutiva(vector);
		System.out.println("El vector ya ha sido creado con valores consecutivos...");
		vector=modificarVector(vector);
		mostrarArray(vector);
	}
	/**
	* Metodo que pide un numero por teclado.
	* @return Devuelve la dimension de un vector.
	*/
	static int pedirDimension(){
		int dimension;
		do{
			dimension=Teclado.leerEntero("Dame la dimension del vector: ");
		}while(dimension<1);
		return dimension;
	}
	/**
	* Metodo que asigna valores consecutivos.
	* @param vector Vector al que se le asignan numeros consecutivos.
	* @return el vector con los numeros ya asignados.
	*/
	static int[] asignacionConsecutiva(int[] vector){
		for(int i=0;i<vector.length; i++)
			vector[i]=i+1;
		return vector;
	}
	/**
	* Metodo que cambia valores de un vector.
	* @param vector es el vector al que sele cambian valores.
	* @return El vector con los valores cambiados.
	*/
	static int[] modificarVector(int[] vector){
		int numero, posicion;
		do{
			posicion=Teclado.leerEntero("Dame un elemento del vector entre 1 y "+vector.length+": ");
			numero=Teclado.leerEntero("Dame un numero para poner en la posicion "+posicion+": ");
			posicion-=1;
			vector[posicion]=numero;
		}while(deseaModificar());
		return vector;
	}
	/**
	* Metodo que devuelve true en caso de escribir s o S y sino devuelve false.
	* @return True si es s o S en caso contrario False.
	*/
	static boolean deseaModificar(){
		char respuesta;
		respuesta=Teclado.leerCaracter("Desea modificar otra posicion? s/n:");
		if(respuesta=='s' || respuesta=='S')
			return true;
		return false;
	}
	/**
	* Metodo que muestra un array.
	* @param vector el array que se muestra
	*/
	static void mostrarArray(int[] vector){
		System.out.print("\nEl vector es: [ ");
		for(int i=0; i<vector.length; i++)
			System.out.print(vector[i]+" ");
		System.out.println("]");
	}
}