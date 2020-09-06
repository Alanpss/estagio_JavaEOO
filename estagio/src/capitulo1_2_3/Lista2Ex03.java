package capitulo1_2_3;

import java.util.Scanner;

public class Lista2Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0, contDiv = 0;

		System.out.printf("Informe o numero:%n");
		number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				if (i % j == 0) {
					contDiv++;
				}
			}
			if (contDiv == 2) {
				System.out.printf("%d é  primo %n", i);
			}
			contDiv = 0;
		}

		sc.close();
	}
}
