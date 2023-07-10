import java.util.Scanner;

public class Ejercicio17 {

	public static void exe() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la dimensión del vector");
		int dim = sc.nextInt();
		int[] vector = new int[dim];
		
		for (int i = 0; i < dim; i++) {
			vector[i] = (int) (Math.random()*100000);
		}
		
		for (int i = 0; i < dim; i++) {
			System.out.print(vector[i]+ " ");
		}
		int unaCifra = 0;
		int dosCifras = 0;
		int tresCifras = 0;
		int cuatroCifras = 0;
		int cincoCifras = 0;
		
		for (int i = 0; i < vector.length; i++) {
			int valor = vector[i];
		if((Math.floor(valor/10000)<10) && ((Math.floor(valor/100)>=1))) {
			cincoCifras ++;
		}
		if((Math.floor(valor/1000)<10) && (Math.floor(valor/100)>=1)) {
			cuatroCifras ++;
		}
		if((Math.floor(valor/100)<10) && (Math.floor(valor/100)>=1)) {
			tresCifras ++;
		}
		if((Math.floor(valor/10)<10) && (Math.floor(valor/100)>=1)) {
			dosCifras ++;
		}
		if((Math.floor(valor/10)<1)) {
			unaCifra ++;
		}
		}
		System.out.println(cincoCifras);
		System.out.println(cuatroCifras);
		System.out.println(tresCifras);
		System.out.println(dosCifras);
		System.out.println(unaCifra);
		sc.close();
	}
}
