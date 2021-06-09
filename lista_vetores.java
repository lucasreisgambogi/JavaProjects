package Ex_aula;

import java.util.*;

public class lista_vetores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a[] = new int[6], soma;
		a[0] = 1;
		a[1] = 0;
		a[2] = 5;
		a[3] = -2;
		a[4] = 100;
		a[5] = 7;

		soma = a[0] + a[1] + a[5];
		System.out.println("A soma dos valores na posicao [0] + [1] + [5] = " + soma);
		System.out.println("\n a[0]" + a[0]);
		System.out.println("\n a[1]" + a[1]);
		System.out.println("\n a[2]" + a[2]);
		System.out.println("\n a[3]" + a[3]);
		System.out.println("\n a[4]" + a[4]);
		System.out.println("\n a[5]" + a[5]);

	}

}
