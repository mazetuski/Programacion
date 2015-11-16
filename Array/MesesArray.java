/**
* Meses del anio con Array.
* @author Miguel &Aacute;ngel Zamora Blanco
* @version 1.0
*/

public class MesesArray{
	public static void main(String[] args) {
		String[] meses= new String[12];
		meses[0]="Enero";
		meses[1]="Febrero";
		meses[2]="Marzo";
		meses[3]="Abril";
		meses[4]="Mayo";
		meses[5]="Junio";
		meses[6]="Julio";
		meses[7]="Agosto";
		meses[8]="Septiembre";
		meses[9]="Octubre";
		meses[10]="Noviembre";
		meses[11]="Diciembre";
		for(int i=0; i<meses.length; i++)
			System.out.println(meses[i]);
	}
}
