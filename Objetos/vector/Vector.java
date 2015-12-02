package vector;

public class Vector {
	private int[] vector;
	private int min, max;

	Vector(int tamanio, int min, int max) {
		this.vector=new int[tamanio];
		this.max=max;
		this.min=min;
	}
	
	public Vector(int[] suma) {
		this.vector=suma;
	}

	void iniciarAleatoriamente(){
		for(int i=0; i<vector.length;i++)
			vector[i]=(int)(Math.random()*(min-max)+max);
	}
	
	void mostrarVector(){
		for (int i = 0; i < vector.length; i++)
			System.out.print(" "+ vector[i]);
	}
	
	int calcularMaximo(){
		int valorMax=this.min;
		for (int i = 0; i < vector.length; i++) 
			if(vector[i]>valorMax)
				valorMax=vector[i];
		return valorMax;
	}
	
	int calcularMinimo(){
		int valorMin=this.max;
		for (int i = 0; i < vector.length; i++) 
			if(vector[i]<valorMin)
				valorMin=vector[i];
		return valorMin;
	}
	
	int calcularMedia(){
		int suma=0;
		for (int i = 0; i < vector.length; i++) 
			suma+=vector[i];
		return suma/vector.length;
	}
	 Vector suma(Vector vector2){
		int[] suma=new int[vector.length];
		for (int i = 0; i < vector.length; i++) 
			suma[i]=vector[i]+vector2.vector[i];
		return new Vector (suma);
	}
}
