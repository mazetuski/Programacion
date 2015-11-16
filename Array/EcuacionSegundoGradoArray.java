/**
* Define la clase EcuacionSegundoGrado que muestre las soluciones de una ecuación de
* segundo grado ax2
* + bx + c = 0. Se le preguntará al usuario si quiere repetir el
* programa. Utiliza métodos (deseaContinuar, leerCoeficientes, mostrarResultados…)
* @author Miguel &Aacute;ngel Zamora Blanco
* @version 1.0
*/

public class EcuacionSegundoGradoArray{
	public static void main(String[] args) {
		double[] variable = new double[3];
		do{
			variable[0]=leerNum("a: ");
			variable[1]=leerNum("b: ");
			variable[2]=leerNum("c: ");
			System.out.println("El resultado es: "+mostrarResultado1(variable)+
							   " y "+mostrarResultado2(variable));
		}while(deseaContinuar());
	}
	/**
	* Metodo que recibe un dato introducido por teclado.
	*/
	static double leerNum(String mensaje){
		return Teclado.leerEntero("Dame el valor de "+mensaje);
	}
	static double mostrarResultado1(double[] variable){
		return (-variable[1]+(Math.sqrt((variable[1]*variable[1])-(4*variable[0]*variable[2]))))/(2*variable[0]);
	}
	static double mostrarResultado2(double[] variable){
		return (-variable[1]-(Math.sqrt((variable[1]*variable[1])-(4*variable[0]*variable[2]))))/(2*variable[0]);
	}
	/**
	* Metodo que devuelve true si el caracter es s y sino devuelve false.
	*/
	public static boolean deseaContinuar(){
		char caracter;
		caracter=Teclado.leerCaracter("Desea continuar? s/n: ");
		if (caracter=='S' || caracter=='s')
			return true;
		return false;
	}
}
