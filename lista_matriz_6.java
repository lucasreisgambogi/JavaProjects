package lista_matriz;

import java.util.*;

public class lista_matriz_6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int matriz1[][] = new int[5][5];
		int matriz2[][] = new int[5][5];
		int matriz3[][] = new int[5][5];

		System.out.println("Digite os elementos da primeira matriz(5x5): ");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matriz1[i][j] = leia.nextInt();
			}
		}
		System.out.println("Digite os elementos da segunda matriz (5x5):");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matriz2[i][j] = leia.nextInt();
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matriz1[i][j] + "  ");
				if (matriz1[i][j] > matriz2[i][j]) {
					matriz3[i][j] = matriz1[i][j];
				} else {
					matriz1[i][j] = matriz2[i][j];
				}
			}
		}
		System.out.println("Os elementos da matriz sao (5x5): ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz3[i][j] + "  ");
			}
			System.out.println();
		}
	}

}