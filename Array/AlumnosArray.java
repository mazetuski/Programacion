/**
* Define la clase Alumnos que obtenga aleatoriamente las notas de 30 alumnos. La nota
* será un número decimal comprendido entre 0 y 10, ambos inclusive. Utiliza métodos.
* Al finalizar el programa deberá mostrar:
* a. Total de notas
* b. Número de aprobados
* c. Número de suspensos
* d. Nota máxima
* e. Nota mínima
* f. Media
* @author Miguel &Aacute;ngel Zamora Blanco
* @version 1.0
*/

public class AlumnosArray{
	public static void main(String[] args) {
		double[] nota= new double[30];
		double notaMax=0, notaMin=10, suma=0;
		int contador=0,  contadorAprobados=0, contadorSuspensos=0;
		for(int i=0; i<nota.length; i++){
			nota[i]=notaAleatoria();
			suma+=nota[i];
			System.out.print((int)nota[i]+"\t");
			contador++;
			notaMax=notaMax(nota[i], notaMax);
			notaMin=notaMin(nota[i], notaMin);
			contadorAprobados=notaAprobada(nota[i], contadorAprobados);
			contadorSuspensos=notaSuspensa(nota[i], contadorSuspensos);
			
		}
		System.out.println("\nEl numero total de notas es: "+contador);
		System.out.println("\nEl numero total de aprobados es: "+contadorAprobados);
		System.out.println("\nEl numero total de suspensos es: "+contadorSuspensos);
		System.out.println("\nLa nota maxima es: : "+(int)notaMax);
		System.out.println("\nLa nota minima es: : "+(int)notaMin);
		System.out.println("\nLa media es: "+suma/contador);

	}
	/**
	* Metodo que devuelve un numero aleatorio
	* @return Numero aleatorio.
	*/
	static double notaAleatoria(){
		double nota=Math.random()*10+1;
		return nota;
	}
	/**
	* Metodo que devuelve la nota maxima.
	* @return La nota maxima.
	*/
	static double notaMax(double nota, double notaMax){
		if(nota>notaMax)
			notaMax=nota;
		return notaMax;
	}
	/**
	* Metodo que devuelve la nota minima
	* @return la nota minima.
	*/
	static double notaMin(double nota, double notaMin){
		if(nota<notaMin)
			notaMin=nota;
		return notaMin;
	}
	/**
	* Metodo que devuelve las notas aprobadas.
	*/
	static int notaAprobada(double nota, int contadorAprobados){
		if(nota>=5)
			contadorAprobados++;
		return contadorAprobados;
	}
	/**
	* Metodo que devuelve las notas suspensas.
	*/
	static int notaSuspensa(double nota, int contadorSuspensos){
		if(nota<5)
			contadorSuspensos++;
		return contadorSuspensos;
	}
}