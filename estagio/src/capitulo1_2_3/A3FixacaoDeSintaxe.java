package capitulo1_2_3;

public class A3FixacaoDeSintaxe {

	public static void main(String[] args) {
		// imprimir todos os n�meros de 150 a 300
		int i = 0;
		for (i = 150; i <= 300; i++)
			System.out.println(i);

		// imprimir soma de 1 a 1000
		int i2 = 0, soma = 0;
		for (i2 = 1; i2 <= 1000; i2++) {
			soma += i2;
			System.out.println(soma);
		}

		System.out.println();

		// imprimir todos os multiplos de 3 at� 100
		int i3 = 0;
		for (i3 = 3; i3 < 100; i3++) {
			if (i3 % 3 == 0)
				System.out.println(i3);
		}

		System.out.println();

		// fatorial de 1 a 10
		int fatorial = 1;
		for (int n = 1; n <= 10; n++) {
			fatorial *= n;
			System.out.printf("O fatorial de %d �: %d %n", n, fatorial);
		}

		System.out.println();

		// S�rie de Fibonacci
		int numero1 = 1, numero2 = 0, i5 = 0, aux = 0;

		for (i5 = 0; i5 < 15; i5++) {
			System.out.println(numero1);
			aux = numero1;
			numero1 += numero2;
			numero2 = aux;
		}
		System.out.println("Fibonacci");
		System.out.println();

		// Novo valor
		int x = 0, valor = 13;
		for (x = valor; x > 1;) {

			if (x % 2 == 0) {
				x = x / 2;
				valor = x;
				System.out.println(x);
			} else {
				x = 3 * x + 1;
				valor = x;
				System.out.println(x);
			}
		}
		System.out.println("");
		
		//ex8
		System.out.println("Ex8:");
		int n = 4; // número de linhas que queremos imprimir   
        for (int i9 = 1; i9 <= n; i9++){   
            for (int j = 1; j <= i9; j++){   
                System.out.print((i9*j) + " ");  
            }
            System.out.println("");
        }
	}
}
