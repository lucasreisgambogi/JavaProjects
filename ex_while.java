package Ex_aula;

import java.util.*;

public class ex_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num = 0;
		long fatorial = 1;
		int i = 1;
		System.out.println("Digite um n�: ");
		num = leia.nextInt();
		while (i <= num) {
			fatorial = fatorial * i;
			i++;
		}
		System.out.println("O fatorial de " + num + " �: " + fatorial);
	}

}
