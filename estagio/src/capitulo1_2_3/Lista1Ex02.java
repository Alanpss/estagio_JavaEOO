package capitulo1_2_3;

import java.util.Scanner;

public class Lista1Ex02 {

	public static void main(String[] args) {
		// Locadora
		Scanner sc = new Scanner(System.in);
		int quantVideos = 0;
		double valorLocacao = 0, faturamentoMes = 0, faturamentoAno = 0, faturamentoMultas = 0, videosTotais = 0;

		System.out.println("Informe a quantidade de videos:");
		quantVideos = sc.nextInt();
		System.out.println("Informe o valor de cada video:");
		valorLocacao = sc.nextInt();

		faturamentoMes = (quantVideos * 0.33) * (valorLocacao);
		faturamentoAno = faturamentoMes * 12;
		System.out.printf("O faturamento anual é de: R$%.2f %n", faturamentoAno);

		faturamentoMultas = (quantVideos * 0.1) * (valorLocacao * 1.1);
		System.out.printf("O faturamento com multas no mês é de: R$%.2f %n", faturamentoMultas);

		videosTotais = ((quantVideos - (quantVideos * 0.02)) + (quantVideos * 0.1));
		System.out.printf("A quantidade de filmes no fim do ano é de: %d %n", (int) videosTotais);

		sc.close();
	}

}
