
public class Ejercicio19 {

	public static void exe(){
		
		int[][] matriz = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j]=(int) (Math.random()*100);
		}
		}
		
		System.out.println("Matriz A: ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz[i][j]+" ");
		}
			System.out.println("");
		}
		
		// 1,0 -> 0,1 1,1 ->1,1 1,2 -> 2,1
		int[][] matrizB = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
			matrizB[i][j]=(matriz[j][i])*-1;
			}
		}
		
		System.out.println("\nMatriz -AT: ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matrizB[i][j]+" ");
		}
			System.out.println("");
		}
		
		
		boolean simetria = true;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
			if (matriz[i][j]==matrizB[i][j]) {
				simetria = false;
			}
			}
		}
		if (simetria == true) {
			System.out.println("La matriz es asimétrica");
		}else {
			System.out.println("La matriz es asimétrica");
		}
		
		
		
	}
}
