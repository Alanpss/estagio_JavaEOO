package capitulo1_2_3;

import java.util.Scanner;

public class Lista1Ex09 {

	public static void main(String[] args) {
		// 9 hotel
		Scanner sc = new Scanner(System.in);
		int contDistancia = 0, contKm = 0, quantPraia = 0, contPraia = 0;
		double maiorDist = 0, distMedia = 0;
		String praiaDistante = "", nomePraia = "", condicao = "zzz";

		do {
			quantPraia++;
			// entrada de dados
			System.out.println("Informe o nome da praia");
			nomePraia = sc.next().toLowerCase();

			if (nomePraia.equals(condicao)) {
				break;
			}

			System.out.println("Informe a dist�ncia da praia para o Hotel em km");
			double distancia = sc.nextInt();

			System.out.printf("A praia %s fica a %.1f KMs do hotel %n", nomePraia, distancia);
			System.out.println();

			// calculo quant de praias >10 e < que 15 km
			if (distancia > 10 && distancia < 15) {
				contDistancia++;
			}

			// calculo dist�ncia m�dia
			contKm += distancia;
			distMedia = contKm / quantPraia;

			// praia mais distante
			if (maiorDist < distancia) {
				maiorDist = distancia;
				praiaDistante = nomePraia;
			}
			contPraia++;
		} while (!nomePraia.equals(condicao));

		if (contPraia != 0) {
			System.out.printf("A praia mais distante eh: %s", praiaDistante);
			System.out.println();
			System.out.printf("Ha %d praia(s) a mais de 10 e menos de 15 km do Hotel", contDistancia);
			System.out.println();
			System.out.printf("A distancia media das praias é de: %.2f km%n", distMedia);
		}
		sc.close();
	}

	
}
