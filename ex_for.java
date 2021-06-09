package Ex_aula;

import java.util.Scanner;

public class ex_for {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, fat = 1;
		int cont = 1;

		System.out.println("Digite um nº");
		num = leia.nextInt();

		for (int i = 1; i <= num; i++) {
			fat = fat * i;
		}

		System.out.println("!" + num + " = " + fat);
		cont++;

	}

}
