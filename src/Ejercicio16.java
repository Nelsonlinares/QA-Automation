import java.util.Scanner;


public class Ejercicio16 {

	public static void exe() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese la dimensi�n del vector");
	int dim = sc.nextInt();
	int[] vector = new int[dim];
	
	for (int i = 0; i < dim; i++) {
		vector[i] = (int) (Math.random()*100);
	}
	
	for (int i = 0; i < dim; i++) {
		System.out.print(vector[i]+ " ");
	}
	
	System.out.println("\nIngrese un n�mero a buscar en el vector");
	int num = sc.nextInt();
	boolean valida = true;
	for (int i = 0; i < dim; i++) {
		
		if (num == vector[i]) {
			System.out.println("El n�mero ingresado se encuentra en la posici�n " + i);
			valida = false;
		}
	}
	if (valida == true) {
		System.out.println("El n�mero ingresado no se encuentra en el vector");
	}
	}
}
