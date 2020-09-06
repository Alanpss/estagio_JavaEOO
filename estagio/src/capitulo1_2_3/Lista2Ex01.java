package capitulo1_2_3;

import java.util.Scanner;

public class Lista2Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número:");
		int number = sc.nextInt();

		if (number % 2 == 0)
			System.out.println("O número é par");
		else
			System.out.println("O número é impar");

		sc.close();
	}
}
