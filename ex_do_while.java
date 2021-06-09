package Ex_aula;
import java.util.Scanner;
public class ex_do_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num = 0;
		long fatorial = 1;
		int i = 1;
		do {
			System.out.println("Digite um nº: ");
			num = leia.nextInt();
			 
				fatorial = fatorial * i;
				i++;
			
			System.out.println("O fatorial de " + num + " é: " + fatorial);
		} while ( i <= num);
	}

}
