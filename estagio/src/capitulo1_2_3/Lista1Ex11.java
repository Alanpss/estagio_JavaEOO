package capitulo1_2_3;

import java.util.Scanner;

public class Lista1Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do Salario minimo");
		double salarioMinimo = sc.nextDouble();

		System.out.println("Informe a quantidade de quilowatts usada");
		double quantQuilowatts = sc.nextDouble();

		double valorQuilowatts = ((salarioMinimo / 7) / 100);
		System.out.printf("Cada quilowatts vale: R$ %.2f ", valorQuilowatts);

		double valorPagar = quantQuilowatts * valorQuilowatts;
		System.out.printf("%nValor a pagar: R$ %.2f ", valorPagar);

		sc.close();
	}

}
