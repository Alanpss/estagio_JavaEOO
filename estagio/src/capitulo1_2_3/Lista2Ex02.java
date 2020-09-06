package capitulo1_2_3;

import java.util.Scanner;

public class Lista2Ex02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int result = 1, factorial = 0;

		System.out.println("Digite o número que deseja saber o fatorial:");
		int number = sc.nextInt();

		for (factorial = number; factorial >= 1; --factorial) {
			result *= factorial;
		}

		System.out.printf("O fatorial de %d é: %d %n", number, result);

		sc.close();

	}

}
