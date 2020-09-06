package capitulo1_2_3;

import java.util.Scanner;

public class Lista1Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o Nome");
		String nome = sc.next();

		System.out.println("Informe a Idade");
		int idade = sc.nextInt();

		if (idade < 12) {
			System.out.println(nome);
			System.out.println("Menor de 12 anos");
		} else if (idade >= 12 && idade < 18) {
			System.out.println(nome);
			System.out.println("Menor de idade");
		} else if (idade >= 65) {
			System.out.println(nome);
			System.out.println("Maior de idade ");
			System.out.println("Maior de 65 anos");
		} else {
			System.out.println(nome);
			System.out.println("Maior de idade");
		}

		sc.close();

	}

}
