package capitulo1_2_3;

import java.util.Scanner;

public class Lista1Ex06 {
	public static void main(String[] args) {
		// notas de um aluno
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		int matricula = 0;

		do {
				System.out.println("Informe o número da matricula");
				matricula = sc.nextInt();

				if (matricula == 999) {
					break;
				} else {

					System.out.println("Informe o valor da 1ª notas do aluno:");
					nota1 = sc.nextDouble();
					System.out.println("Informe o valor da 2ª notas do aluno:");
					nota2 = sc.nextDouble();
					System.out.println("Informe o valor da 3ª notas do aluno:");
					nota3 = sc.nextDouble();

					media = (nota1 + nota2 + nota3) / 3;

					System.out.printf("Matricula: %d%n", matricula);

					if (media > 6) {
						System.out.println("Aprovado");
					} else if (media >= 4 && media < 6) {
						System.out.println("Deverá fazer a Prova Final");
					} else {
						System.out.println("Reprovado");
					}

					System.out.println();

				}
			//}
		} while (matricula != 999);
		sc.close();
	}
}
