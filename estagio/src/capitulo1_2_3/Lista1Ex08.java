package capitulo1_2_3;

import java.util.Scanner;

public class Lista1Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia = 0, mes = 0, ano = 0;

		System.out.println("Informe o Dia:");
		dia = sc.nextInt();
		System.out.println("Informe o Mês:");
		mes = sc.nextInt();
		System.out.println("Informe o Ano:");
		ano = sc.nextInt();

		if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0 && ((mes == 1 || mes == 3 || mes == 5 || mes == 7
				|| mes == 8 || mes == 10 || mes == 12) || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30)
				|| (mes == 2 && (dia <= 29 && ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) || dia <= 28))) {
			System.out.println("Data válida");
		} else {
			System.out.println("Data inválida");
		}

		sc.close();
	}

}
