package capitulo1_2_3;

import java.util.Scanner;

public class Lista1Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1 = 0, nota2 = 0, nota3 = 0;
		// int maior = 0, menor = 0;

		System.out.println("Informe o valor da 1ª notas do aluno:");
		nota1 = sc.nextDouble();
		System.out.println("Informe o valor da 2ª notas do aluno:");
		nota2 = sc.nextDouble();
		System.out.println("Informe o valor da 3ª notas do aluno:");
		nota3 = sc.nextDouble();

		if (nota1 >= nota2 && nota1 >= nota3) {
			if (nota2 == nota3) {
				System.out.printf("A maior nota é %.2f e a menor %.2f", nota1, nota3);
			} else if (nota2 > nota3) {
				System.out.printf("A mair nota é %.2f e a menor %.2f", nota1, nota3);
			} else {
				System.out.printf("A maior nota é %.2f e a menor %.2f", nota1, nota2);
			}
		} else if (nota2 >= nota1 && nota2 >= nota3) {
			if (nota1 == nota3) {
				System.out.printf("A maior nota é %.2f e a menor %.2f", nota2, nota3);
			} else if (nota1 > nota3) {
				System.out.printf("A maior nota é %.2f e a menor %.2f", nota2, nota3);
			} else {
				System.out.printf("A maior nota é %.2f e a menor %.2f", nota2, nota1);
			}
		} else if (nota3 >= nota1 && nota3 >= nota2) {
			if (nota2 == nota1) {
				System.out.printf("A maior nota é %.2f e a menor %.2f", nota3, nota2);
			} else if (nota2 > nota1) {
				System.out.printf("A maior nota é %.2f e a menor %.2f", nota3, nota1);
			} else {
				System.out.printf("A maior nota é %.2f e a menor %.2f", nota3, nota2);
			}
		}

		sc.close();
	}

}
