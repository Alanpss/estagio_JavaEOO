package capitulo1_2_3;

import java.util.Locale;

import java.util.Scanner;

public class Lista1Ex15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Informe o valor do salario");
		double salario = sc.nextDouble();

		if (salario <= 600) {
			System.out.println("Isento");
		} 
		else if (salario > 600 && salario <= 1200) {
			System.out.println("20% de desconto");
		} 
		else if (salario > 1200 && salario <= 2000) {
			System.out.println("25% de desconto");
		} 
		else {
			System.out.println("30% de desconto");
		}
		sc.close();
	}
}
