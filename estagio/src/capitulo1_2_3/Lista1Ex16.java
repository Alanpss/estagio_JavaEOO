package capitulo1_2_3;

import java.util.Scanner;

public class Lista1Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Variaveis
		int numero = 0, opSexo = 0, idade = 0, contHomens = 0, contMulheres = 0;
		String sexo = "";
		double somaIdadeHomens = 0, somaIdadeMulheres = 0, mediaIdadeHomens = 0;

		do {
			System.out.println("Informe o número da pessoa");
			numero = sc.nextInt();

			if (numero == 999) {
				break;
			}
			System.out.println("Sexo: Informe '1' para masculino e '2' para Feminino");
			opSexo = sc.nextInt();

			System.out.println("Informe a idade da pessoa");
			idade = sc.nextInt();

			// Sexo e contagem
			if (opSexo == 1) {
				sexo = "Masculino";
				contHomens++;
				somaIdadeHomens += idade;

			} else if (opSexo == 2) {
				sexo = "Feminino";
				contMulheres++;
				somaIdadeMulheres += idade;

			} else {
				System.out.println("Opção errada");
			}
			System.out.printf("O número da pessoa é = %d, o sexo = %s e a idadede = %d%n", numero, sexo, idade);
		} while (numero != 999);

		mediaIdadeHomens = somaIdadeHomens / contHomens;

		// Saidas de dados
		System.out.printf("A media de idade dos homens é de: %d anos", (int) mediaIdadeHomens);
		System.out.println();
		System.out.printf("A soma das idades das Mulheres é igual a: %d", (int) somaIdadeMulheres);
		System.out.println();

		if (contMulheres > contHomens) {
			System.out.println("Há mais Mulheres que Homens");
		} else if (contHomens > contMulheres) {
			System.out.println("Há mais Homens que Mulheres");
		} else
			System.out.println("Há a mesma quantidade de Homens e Mulheres");

		sc.close();
	}
}
