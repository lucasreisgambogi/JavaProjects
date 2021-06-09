package Ex_aula;
import java.util.*;
public class lista_vetores_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int[] vet = new int[6];
		for(int i = 0; i < vet.length; i++){
            System.out.println("Digite um número (até 6 vezes): ");
            vet[i] = leia.nextInt();
        }
		 for(int i = vet.length-1; i >= 0; i--){
	            System.out.println(vet[i]);
	        }
	}

}
