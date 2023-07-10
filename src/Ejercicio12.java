import java.util.Scanner;

public class Ejercicio12 {

	/*12. Realizar un programa que simule el funcionamiento de un dispositivo
	RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las 
	cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 
	5 caracteres de largo, el primer carácter tiene que ser X y el último tiene
	que ser una O. Las secuencias leídas que respeten el formato se consideran 
	correctas, la secuencia especial “&&&&&” marca el final de los envíos 
	(llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato
	se considera incorrecta. Al finalizar el proceso, se imprime un informe 
	indicando la cantidad de lecturas correctas e incorrectas recibidas. Para 
	resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
	funciones de Java Substring(), Length(), equals().*/
	
	public static void exe() {
	       Scanner scanner = new Scanner(System.in);

	        int lecturasCorrectas = 0;
	        int lecturasIncorrectas = 0;

	        while (true) {
	            System.out.print("Ingrese una cadena (FDE para finalizar): ");
	            String cadena = scanner.nextLine();

	            if (cadena.equals("&&&&&")) {
	                break;
	            }

	            if (esCadenaValida(cadena)) {
	                lecturasCorrectas++;
	            } else {
	                lecturasIncorrectas++;
	            }
	        }

	        System.out.println("Informe:");
	        System.out.println("Lecturas correctas: " + lecturasCorrectas);
	        System.out.println("Lecturas incorrectas: " + (lecturasIncorrectas - 1));
	        scanner.close();
	    }

	    private static boolean esCadenaValida(String cadena) {
	        if (cadena.length() != 5) {
	            return false;
	        }

	        char primerCaracter = cadena.charAt(0);
	        char ultimoCaracter = cadena.charAt(4);

	        if (primerCaracter != 'X' || ultimoCaracter != 'O') {
	            return false;
	        }

	        return true;
	    }
	
}
