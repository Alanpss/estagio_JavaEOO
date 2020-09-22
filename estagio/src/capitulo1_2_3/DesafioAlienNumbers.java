package capitulo1_2_3;

import java.util.Scanner;

public class DesafioAlienNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valorDecimal = 0;
		String numeroNovo = "";

		System.out.println("Informe a quantidade de de casos");
		int quantCasos = sc.nextInt();

		for (int i = 1; i <= quantCasos; i++) {

			System.out.println("Informe o número alienígena:");
			String numeroAlienigena = sc.next();

			System.out.println("Informe sua linguagem de origem:");
			String linguagemOrigem = sc.next();
			int baseLinguagemOrigem = linguagemOrigem.length();// valor base

			System.out.println("Informe a linguagem alvo:");
			String linguagemAlvo = sc.next();
			int baseLinguagemAlvo = linguagemAlvo.length();// valor base

			// Trasnformar numero alienigena em decimal
			for (int i2 = numeroAlienigena.length() - 1; i2 >= 0; i2--) {
				// calculo potencia
				int valorExpoente = numeroAlienigena.length() - (i2 + 1);
				int valorPotencia = (int) Math.pow(baseLinguagemOrigem, valorExpoente);

				// calculo valor em decimal
				int valorCaractere = linguagemOrigem.indexOf(numeroAlienigena.charAt(i2));

				valorDecimal += valorCaractere * valorPotencia;
			}

			// conversão decimal p/ linguagem alvo
			while (valorDecimal > 0) {
				// calculo resto e divisao valorDecimal
				int resto = valorDecimal % baseLinguagemAlvo;
				valorDecimal = valorDecimal / baseLinguagemAlvo;

				// valor na linguagem nova (início, parada)
				//numeroNovo = linguagemAlvo.substring(resto, resto + 1).concat(numeroNovo);
				numeroNovo = linguagemAlvo.charAt(resto) + (numeroNovo);//o de cima tmb funciona
			}

			System.out.printf("Case #%d: %s", i, numeroNovo);
			numeroNovo = "";
			System.out.println();
		}

		sc.close();
	}
}