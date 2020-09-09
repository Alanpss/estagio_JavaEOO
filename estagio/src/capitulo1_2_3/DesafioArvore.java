package capitulo1_2_3;

import java.util.Scanner;

public class DesafioArvore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int asteristico = 1;
		System.out.println("Digite o nomero de asteristico da base da arvore, sendo ele impar:");
		int base = sc.nextInt();

		if (base % 2 == 1) {
			for (int linha = 1; linha <= base; linha++) {
				for (int coluna = 1; coluna <= base; coluna++) { 
					if (coluna == base) { 
						for (int i = 1; i <= asteristico; i++) {
							System.out.print("*");
						}
						asteristico += 2;
						base--;
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
