package capitulo1_2_3;

import java.util.Scanner;

public class Lista1Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variaveis
		int numero = 0, opSexo, idade, horasTrabalhadas, quantFuncionario;
		//Contadores
		int contFuncionarios = 0, contHomens = 0, contMulheres = 0;
		double salarioHora, mediaSalarioMulheres, mediaSalarial, somaSalario = 0, salario;
		String sexo = "";

		do {
			contFuncionarios++;
			for (int i = 0; i < contFuncionarios; i++) {
				System.out.println("Informe o número do funcionário:");
				numero = sc.nextInt();

				if (numero == 999) {
					break;
				} 
				else {
					System.out.println("Informe o '1'para sexo maculino e '2' para Feminino:");
					opSexo = sc.nextInt();
					if (opSexo == 1) {
						sexo = "Masculino";
						contHomens++;
					} 
					else if (opSexo == 2) {
						sexo = "Feminino";
						contMulheres++;
					} 
					else {
						System.out.println("Opção errada");
					}

					System.out.println("Informe a idade:");
					idade = sc.nextInt();

					System.out.println("Horas Trabalhadas:");
					horasTrabalhadas = sc.nextInt();

					System.out.println("Informe o valor do Salario Hora");
					salarioHora = sc.nextDouble();

					// calculo salario
					salario = horasTrabalhadas * salarioHora;
					somaSalario += salario;

					// calcula quantidade funcionarios
					quantFuncionario = contHomens + contMulheres;

					// media salario funcionarios
					mediaSalarial = salario / quantFuncionario;

					System.out.printf("O número do funcionário é = %d%n o sexo = %s%n a idadede = %d%n o salario Hora é = %.2f%n e a Quantidade de horas trabalhadas é = %d%n",numero, sexo, idade, salarioHora, horasTrabalhadas);
				}
			}
		} while (numero != 999);

		System.out.printf("A quantidade de homens é igual a: %d", contHomens);
		System.out.println();
		sc.close();
	}

}
