import java.util.Scanner;

public class Ejercicio11 {
	
	public static void exe() {
		Scanner sc = new Scanner(System.in);
		int resp;
		int num1;
		int num2;
		boolean valida = true;
		System.out.println("Ingrese un número entero:");
		num1 = sc.nextInt();
		System.out.println("Ingrese un número entero:");
		num2 = sc.nextInt();
		do {
		System.out.println("MENU");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Salir");
		System.out.println("Elija una opción: ");
		resp = sc.nextInt();
		switch (resp) {
		case 1:
			int suma = num1 + num2;
			System.out.println(suma);
			break;
		case 2:
			int resta = num1 + num2;
			System.out.println(resta);
			break;
		case 3:
			int multiplica = num1 * num2;
			System.out.println(multiplica);
			break;
		case 4:
			int division = num1 / num2;
			System.out.println(division);
			break;
		case 5:
			System.out.println("¿Está seguro que desea salir del programa (S/N)?");
			String res = sc.next();
			if (res.equals("N")) {
				valida = false;
			}
			if (res.equals("S")) {
				System.out.println("Gracias por utilizar este programa");
			}
			break;
		default:
			System.out.println("Ingrese una opción válida");
			valida = false;
			break;
		}
	
		}
		while (valida == false); 
		sc.close();
	}
}
