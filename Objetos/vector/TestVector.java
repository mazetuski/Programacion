package vector;

import utiles.*;

public class TestVector {
	public static void main(String[] args) {
		int dimension = Teclado.leerEntero("Dame la dimension del vector: ");
		int min = Teclado.leerEntero("Dame el minimo del vector: ");
		int max = Teclado.leerEntero("Dame el máximo del vector: ");
		Vector vector= iniciarVector(dimension, min, max);
		mostrarResultados(vector);
		Vector vector2=iniciarVector(dimension, min, max);
		Vector suma= vector.suma(vector2);
		System.out.println("\nLa suma de los dos vectores es:");
		suma.mostrarVector();
		
	}
	static Vector iniciarVector(int dimension, int min, int max){
		Vector vector = new Vector(dimension, min, max);
		vector.iniciarAleatoriamente();
		vector.mostrarVector();
		return vector;
	}
	static void mostrarResultados(Vector vector){
		System.out.println("\nEl máximo es: " + vector.calcularMaximo());
		System.out.println("El mínimo es: " + vector.calcularMinimo());
		System.out.println("La media es: "+ vector.calcularMedia());
	}
}
