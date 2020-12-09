package capitulo1_2_3;

import java.util.Scanner;

public class Lista2Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0;

		System.out.println("Digite os valores de A, B e C da equacao:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		double x1 = 0, x2 = 0;
		double delta = ((b * b) - (4 * a * c));

		if (delta >= 0) {
			x1 = (-b + (Math.sqrt(delta))) / (2 * a);
			System.out.println(x1);

			x2 = (-b - (Math.sqrt(delta))) / (2 * a);
			System.out.println(x2);
		} else
			System.out.println("Nenhuma raiz real");

		sc.close();
	}

}
