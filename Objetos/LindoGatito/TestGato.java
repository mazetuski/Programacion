package Objetos;

public class TestGato {
	public static void main(String[] args) {
		int respuesta;
		Gato gato = new Gato(
				Teclado.leerCadena("Que nombre desea para el gato?"),
				Teclado.leerCadena("Que raza?"), 3);
		System.out.println("Su gato se llama " + gato.nombre + " su raza es "
				+ gato.raza + " y su peso actual es " + gato.peso);
		do {
			respuesta = Teclado.leerEntero("Que desea hacer con " + gato.nombre
					+ "?: " + "\n(1)Comer\n(2)Jugar\n(3)Dormir\n(4)Despertar");
			menu(respuesta, gato);
		} while (deseaContinuar("Desea elegir otra opcion? s/n"));
	}

	static void menu(int respuesta, Gato gato) {
		switch (respuesta) {
		case 1:
			gato.comer();
			break;
		case 2:
			gato.jugar();
			break;
		case 3:
			gato.dormir();
			break;
		case 4:
			gato.despertar();
			break;
		}
	}

	private static boolean deseaContinuar(String string) {
		char respuesta;
		respuesta = Teclado.leerCaracter(string);
		if (respuesta == 'S' || respuesta == 's')
			return true;
		return false;
	}
}
