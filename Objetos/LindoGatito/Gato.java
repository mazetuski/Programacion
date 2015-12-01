package Objetos;

public class Gato {
	String nombre;
	String raza;
	int peso;
	boolean dormido;

	public Gato(String nombre, String raza, int peso) {
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
	}

	void comer() {
		if (!isDormido()) {
			System.out.println("Comiendo...");
			setPeso(getPeso() + 1);
			System.out.println("Su peso actual es: " + getPeso());
			if (getPeso() >= 6)
				morir();
		} else
			System.out.println(this.nombre + " esta dormido...");
	}

	void dormir() {
		if (!isDormido()) {
			setDormido(true);
			System.out.println("Durmiendo... zZz..");
		} else
			System.out.println("Ya esta dormido...");
	}

	void despertar() {
		if (isDormido()) {
			setDormido(false);
			System.out.println("Miau!..");
		} else
			System.out.println("No esta dormido...");
	}

	void jugar() {
		if (!isDormido()) {
			System.out.println("Jugando...");
			setPeso(getPeso() - 1);
			System.out.println("El peso actual es: " + getPeso());
			if (getPeso() < 1)
				morir();
		} else
			System.out.println(this.nombre+" esta dormido...");
	}

	void morir() {
		System.out.println(this.nombre + " murio...");
		System.exit(0);
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public boolean isDormido() {
		return dormido;
	}

	public void setDormido(boolean dormido) {
		this.dormido = dormido;
	}

}
