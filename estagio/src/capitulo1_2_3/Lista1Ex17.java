package capitulo1_2_3;

import java.util.Scanner;

public class Lista1Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Variaveis
		int numero = 0, opSexo, idade, horasTrabalhadas, quantFuncionario;

		// Contadores
		int contHomens = 0, contMulheres = 0, contMulher30 = 0;
		double salarioHora, mediaSalarioMulheres = 0, mediaSalarial = 0, somaSalario = 0, somaSalarioMulher = 0,
		       somaSalarioMulher30 = 0, salario, salarioMulheres = 0, mediaSalarioMulheres30 = 0,salarioMulheres30 = 0;
		String sexo = "";

		do {
			// contFuncionarios++;
			System.out.println("Informe o numero do funcionario:");
			numero = sc.nextInt();

			if (numero == 999) {
				break;
			}

			System.out.println("Informe o '1'para sexo maculino e '2' para Feminino:");
			opSexo = sc.nextInt();

			if (opSexo == 1) {
				sexo = "Masculino";
				contHomens++;
			} else if (opSexo == 2) {
				sexo = "Feminino";
				contMulheres++;
			} else {
				System.out.println("Opcao errada");
			}

			System.out.println("Informe a idade:");
			idade = sc.nextInt();

			System.out.println("Horas Trabalhadas:");
			horasTrabalhadas = sc.nextInt();

			System.out.println("Informe o valor do Salario Hora");
			salarioHora = sc.nextDouble();

			// media salario mulheres
			if (opSexo == 2) {
				salarioMulheres = horasTrabalhadas * salarioHora;
				somaSalarioMulher += salarioMulheres;
				mediaSalarioMulheres = somaSalarioMulher / contMulheres;
			}

			// media salario mulheres < 30
			if (opSexo == 2 && idade < 30) {
				contMulher30++;
				salarioMulheres30 = horasTrabalhadas * salarioHora;
				somaSalarioMulher30 += salarioMulheres30;
				mediaSalarioMulheres30 = somaSalarioMulher30 / contMulher30;
			}

			// calculo salario todos os funcionarios
			salario = horasTrabalhadas * salarioHora;
			somaSalario += salario;

			// calcula quantidade funcionarios
			quantFuncionario = contHomens + contMulheres;

			// media salario todos funcionarios
			mediaSalarial = somaSalario / quantFuncionario;

			System.out.printf(
					"O n�mero do funcionario e = %d%n" + "O sexo = %s%n" + "A idadede = %d%n"
					+ "O Salario Hora e = %.2f%n" + "A quantidade de horas trabalhadas e = %d%n",
					numero, sexo, idade, salarioHora, horasTrabalhadas);

		} while (numero != 999);

		System.out.printf("A quantidade de homens e igual a: %d", contHomens);
		System.out.println();
		System.out.printf("A Media salarial das Mulheres eh: %.2f", mediaSalarioMulheres);
		System.out.println();
		System.out.printf("A Media salarial das Mulheres com menos de 30 anos e: %.2f", mediaSalarioMulheres30);
		System.out.println();
		System.out.printf("A Media salarial de todos os funcionarios eh: %.2f", mediaSalarial);
		System.out.println();
		sc.close();
	}

}
