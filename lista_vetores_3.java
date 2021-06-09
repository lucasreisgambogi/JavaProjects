package Ex_aula;

import java.util.*;

public class lista_vetores_3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float num[] = new float[11];
		int i = 0;

		for (i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i) + " numéro do conjunto A:  ");
			num[i] = leia.nextFloat();
		}
		for (int j = 0; j < 10; j++) {
			System.out.println(Math.pow(num[j],2));
		}
		
	}

}
