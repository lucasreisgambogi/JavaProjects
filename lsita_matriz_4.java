package lista_matriz;

import java.util.*;

public class lsita_matriz_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int maxNumber = Integer.MIN_VALUE;
		int matriz[][] = new int[4][4];
		System.out.println("Digite os elementos da matriz: ");

		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				matriz[i][j] = leia.nextInt();

		System.out.println("Elements of the matrix are");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + "  ");
				if (matriz[i][j] > maxNumber) {
					maxNumber = matriz[i][j];
				}
				System.out.println();
			}
		}
		System.out.println("O maior numero é: " + maxNumber);
	}
}