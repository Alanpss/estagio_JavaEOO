package capitulo1_2_3;

import java.util.Scanner;

public class lista1Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 0;

		System.out.println("Informe o numero correspondente a op��o abaixo:");
		System.out.println("1 - Solteiro(a)");
		System.out.println("2 - Desquitado(a)");
		System.out.println("3 - Casado(a)");
		System.out.println("4 - Divorciado(a)");
		System.out.println("5 - Vi�vo(a)");
		op = sc.nextInt();

		if (op > 5 && op == 0) {
			System.out.println("Op��o Inexistente");
		} else if (op == 1) {
			System.out.println("O estado civil � Solteiro(a).");
		} else if (op == 2) {
			System.out.println("O estado civil � Desquitado(a).");
		} else if (op == 3) {
			System.out.println("O estado civil � Casado(a).");
		} else if (op == 4) {
			System.out.println("O estado civil � Divorciado(a).");
		} else {
			System.out.println("O estado civil � Vi�vo(a).");
		}
		sc.close();
	}

}
