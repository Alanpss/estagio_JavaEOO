package capitulo1_2_3;

import java.util.Scanner;

public class Lista1Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome da pessoa");
		String nome = sc.next();

		System.out.println("Informe a idade da pessoa");
		int idade = sc.nextInt();

		if (idade <= 10) {
			System.out.printf("%s deverá pagar R$:30,00", nome);
		} else if (idade > 10 && idade <= 29) {
			System.out.printf("%s deverá pagar R$:60,00", nome);
		} else if (idade > 29 && idade <= 45) {
			System.out.printf("%s deverá pagar R$:120,00", nome);
		} else if (idade > 45 && idade <= 59) {
			System.out.printf("%s deverá pagar R$:150,00", nome);
		} else if (idade > 59 && idade <= 65) {
			System.out.printf("%s deverá pagar R$:250,00", nome);
		} else {
			System.out.printf("%s deverá pagar R$:400,00", nome);
		}
		System.out.println("");
		sc.close();
	}

}
