
public class Ejercicio13 {
	//13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
		//cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
		//* * * *
		//*     *
	    //*     *
		//* * * *
	
	public static void exe() {
	String[][] cuadro = new String[4][4];
	
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			
		if (i==0 || i==3 || j==0 || j==3) {
			cuadro[i][j]="*";
		}
		else {
			cuadro[i][j]=" ";
		}
		
	}
	}
	
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
		System.out.print(cuadro[i][j]+" ");	
	}
	System.out.println("");
	}
}
}
