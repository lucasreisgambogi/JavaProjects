package aai;

import java.util.*;

public class aai_lucas_reis_e_gambogi {
	public static class opcao9 {
		public String sair;
	}

	public static void main(String[] args) {
		opcao9 Sair = new opcao9();
		Scanner leia = new Scanner(System.in);

		int op = 0;

		do {
			System.out.println("1-Posicao final em um movimento retilineo uniforme: ");
			System.out.println("2-Posicao final em um movimento retilineo uniformemente variado: ");
			System.out.println("3-Velocidade final em um movimento retilineo uniformemente variado: ");
			System.out.println("4-Velocidade em um movimento angular: ");
			System.out.println("5-Velocidade angular: ");
			System.out.println("6-Posicao final em um movimento retilineo uniforme: ");
			System.out.println("7-Altura maxima em um lancamento obliquo: ");
			System.out.println("8-Alcande em um lancamento obliquo: ");
			System.out.println("9-Sair do programa.");
			System.out.println("Digite uma opcao: ");
			op = leia.nextInt();
			if (op == 1) {
				opcao1();
			} else if (op == 2) {
				opcao2();
			} else if (op == 3) {
				opcao3();
			} else if (op == 4) {
				opcao4();
			} else if (op == 5) {
				opcao5();
			} else if (op == 6) {
				opcao6();
			} else if (op == 7) {
				opcao7();
			} else if (op == 8) {
				opcao8();
			} else {
				opcao9 (Sair);
				break;
			}

		} while (op < 9 || op != 0);

	}

	public static void opcao1() {
		Scanner leia = new Scanner(System.in);
		double posicaoFinal, posicaoInc = 0, velocidade = 0, tempo = 0;

		System.out.println("1");
		System.out.println("Digite a posicao inicial (em metros): ");
		posicaoInc = leia.nextDouble();
		System.out.println("Digite a velocidade(em metros/s): ");
		velocidade = leia.nextDouble();
		System.out.println("Digite o intervalo de tempo (em segundos) : ");
		tempo = leia.nextDouble();
		posicaoFinal = posicaoInc + velocidade * tempo;
		System.out.println("Posical final: " + posicaoFinal + " metros.");

	}

	public static void opcao2() {
		Scanner leia = new Scanner(System.in);
		double posicaoFinal, posicaoInc = 0, tempo = 0, velocidadeInc = 0, aceleracao = 0;

		System.out.println("2");
		System.out.println("Digite a posicao inicial (em metros): ");
		posicaoInc = leia.nextDouble();
		System.out.println("Digite a velocidade inicial (em metros/s): ");
		velocidadeInc = leia.nextDouble();
		System.out.println("Digite a aceleracao (m/s^2): ");
		aceleracao = leia.nextDouble();
		System.out.println("Digite o intervalo de tempo (em segundos) : ");
		tempo = leia.nextDouble();
		posicaoFinal = posicaoInc + velocidadeInc * tempo + (aceleracao * Math.pow(tempo, 2) / 2);
		System.out.println("Posicao final em um MRUV : " + posicaoFinal);

	}

	public static void opcao3() {
		Scanner leia = new Scanner(System.in);
		double tempo = 0, velocidadeInc = 0, aceleracao = 0, velocidadeFinal = 0;
		System.out.println("3");
		System.out.println("Digite a velocidade inicial (em metros/s): ");
		velocidadeInc = leia.nextDouble();
		System.out.println("Digite a aceleracao( metros/s^2): ");
		aceleracao = leia.nextDouble();
		System.out.println("Digite o intervalo de tempo (em segundos) : ");
		tempo = leia.nextDouble();
		velocidadeFinal = velocidadeInc + aceleracao * tempo;
		System.out.println("Velocidade final: " + velocidadeFinal);
	}

	public static void opcao4() {
		Scanner leia = new Scanner(System.in);
		double velocidade = 0, velAngular = 0, raioCurv = 0;
		System.out.println("4");
		System.out.println("Digite a velocidade angular( rad/s): ");
		velAngular = leia.nextDouble();
		System.out.println("Digite o raio de curvatura da trajetoria (em metros) : ");
		raioCurv = leia.nextDouble();
		velocidade = velAngular * raioCurv;
		System.out.println("Velocidade em movimento angular: " + velocidade);

	}

	public static void opcao5() {
		Scanner leia = new Scanner(System.in);
		double velAngular = 0, freq = 0;
		System.out.println("5");
		System.out.println("Digite a frequencia (Hz): ");
		freq = leia.nextDouble();
		velAngular = 2 * 3.14 * freq;
		System.out.println("Velocidade angular: " + velAngular);
	}

	public static void opcao6() {
		Scanner leia = new Scanner(System.in);
		double velocidade = 0, raioCurv = 0, aceleracaoCentri = 0;
		System.out.println("6");
		System.out.println("Digite a velocidade (em metros/s): ");
		velocidade = leia.nextDouble();
		System.out.println("Digite o raio de curvatura da trajetoria (em metros) : ");
		raioCurv = leia.nextDouble();
		aceleracaoCentri = Math.pow(velocidade, 2) / raioCurv;
		System.out.println("Aceleracao Centripeta em movimento angular: " + aceleracaoCentri);
	}

	public static void opcao7() {
		Scanner leia = new Scanner(System.in);
		double velocidadeInc = 0, anguloLanc = 0, aceleracaoGravidade = 0, alturaMax = 0;
		System.out.println("7");
		System.out.println("Digite a velocidade inicial (em metros/s): ");
		velocidadeInc = leia.nextDouble();
		System.out.println("Digite angulo da direção do lançamento: ");
		anguloLanc = leia.nextDouble();
		System.out.println("Digite a aceleração da gravidade (metros/s^2) : ");
		aceleracaoGravidade = leia.nextDouble();
		alturaMax = Math.pow(velocidadeInc, 2) * Math.pow(Math.sin(anguloLanc), 2) / 2 * aceleracaoGravidade;
		System.out.println("Altura maxima lancamento obliquo: " + alturaMax);
	}

	public static void opcao8() {
		Scanner leia = new Scanner(System.in);
		double velocidadeInc = 0, anguloLanc = 0, aceleracaoGravidade = 0, alcance = 0;
		System.out.println("8");
		System.out.println("Digite a velocidade inicial (em metros/s): ");
		velocidadeInc = leia.nextDouble();
		System.out.println("Digite angulo da direção do lançamento: ");
		anguloLanc = leia.nextDouble();
		System.out.println("Digite a aceleração da gravidade (metros/s^2) : ");
		aceleracaoGravidade = leia.nextDouble();
		alcance = Math.pow(velocidadeInc, 2) * Math.pow(Math.sin(anguloLanc), 2) / aceleracaoGravidade;
		System.out.println("Alcance em um lancamento obliquo: " + alcance);
	}

	public static boolean opcao9(opcao9 Sair) {
		System.out.println("Programa finalizado.");
		return true;
	}
}
