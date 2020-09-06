package capitulo1_2_3;

import java.util.Scanner;

public class Lista1Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o tempo gasto na viagem");
		double tempo = sc.nextDouble();
		System.out.println("Informe a velocidade média:");
		double velocidade = sc.nextDouble();

		double distancia = velocidade * tempo;
		double quantLitro = distancia / 12;

		System.out.printf("A quantidade de combustível utilizada foi: %.3f", quantLitro);

		sc.close();

	}

}
