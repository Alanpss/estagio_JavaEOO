package capitulo1_2_3;

import java.util.Scanner;

public class Lista1Ex04 {

	public static void main(String[] args) {
		// 5) maior nota
		Scanner sc = new Scanner(System.in);
		double nota1 = 0, nota2 = 0, nota3 = 0;

		System.out.println("Informe 3 notas diferentes");
		System.out.println("Informe o valor da 1� notas do aluno:");
		nota1 = sc.nextDouble();
		System.out.println("Informe o valor da 2� notas do aluno:");
		nota2 = sc.nextDouble();
		System.out.println("Informe o valor da 3� notas do aluno:");
		nota3 = sc.nextDouble();

		if (nota1 > nota2 && nota1 > nota3) {
			System.out.printf("A maior nota � a Primeira que foi: %.2f", nota1);
		} else if (nota2 > nota1 && nota2 > nota3) {
			System.out.printf("A mair nota � a Segunda que foi:  %.2f", nota2);
		} else if (nota3 > nota1 && nota3 > nota2) {
			System.out.printf("A maior nota � a Terceira que foi: %.2f", nota3);
		}

		sc.close();
	}

}
