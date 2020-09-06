package capitulo1_2_3;

import java.util.Scanner;

public class Lista1Ex03 {

	public static void main(String[] args) {
		//notas de um aluno
		Scanner sc = new Scanner(System.in); 
		double nota1 = 0, nota2 = 0, nota3 = 0, media = 0;
		
		System.out.println("Informe o valor das 3 notas do aluno");
		nota1 = sc.nextInt();
		nota2 = sc.nextInt();
		nota3 = sc.nextInt();
		
		media = (nota1 + nota2 + nota3)/3;
		
		if(media > 6)
			System.out.println("Aprovado");
		else if(media >= 4 && media <6)
			System.out.println("Deverá fazer a Prova Final");
		else 
			System.out.println("Reprovado");
		
		sc.close();
	}

}
