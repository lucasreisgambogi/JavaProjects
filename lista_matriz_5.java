package lista_matriz;

import java.util.*;

public class lista_matriz_5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num;

		int matriz[][] = new int[5][5];

		System.out.println("Digite o numero que vc quer encontrar");
		num = leia.nextInt();

		System.out.println("Digite os elementos da matriz");

		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 5; j++)
				matriz[i][j] = leia.nextInt();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matriz[i][j] + "  ");
				if (matriz[i][j] == num) {
					System.out.println("Find! position: (" + i + "," + j + ")");
				}
			}
		}
	}
}
