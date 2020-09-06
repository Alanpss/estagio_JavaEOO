package capitulo1_2_3;

import java.util.Scanner;

public class Lista1Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salarioHora, horasTrabalhadas;
		double salarioBruto = 0, salarioLiquido = 0, inss = 0;

		System.out.println("Informe o valor da haora trabalhada:");
		salarioHora = sc.nextInt();
		System.out.println("Informe a quantidade de horas trabalhadas:");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Informe o percentual de desconto do INSS:");
		System.out.println("As porcentagens são: 7.5, 9, 12, e 14 porcento");
		inss = sc.nextInt();

		salarioBruto = salarioHora * horasTrabalhadas;
		System.out.printf("O valor do salário bruto é R$:%.2f  %n", salarioBruto);

		if (inss == 7.5) {
			salarioLiquido = salarioBruto * 0.925;
			System.out.printf("O valor do salário liquido é R$:%.2f %n", salarioLiquido);
		} 
		else if (inss == 9) {
			salarioLiquido = salarioBruto * 0.91;
			System.out.printf("O valor do salário liquido é R$:%.2f %n", salarioLiquido);
		} 
		else if (inss == 12) {
			salarioLiquido = salarioBruto * 0.88;
			System.out.printf("O valor do salário liquido é R$:%.2f %n", salarioLiquido);
		} 
		else if (inss == 14) {
			salarioLiquido = salarioBruto * 0.86;
			System.out.printf("O valor do salário liquido é R$:%.2f %n", salarioLiquido);
		} 
		else {
			System.out.println("Porcentagem incorreta!");
		}

		System.out.printf("O valor do salário bruto é R$:%.2f  %n", salarioBruto);

		sc.close();
	}
}
