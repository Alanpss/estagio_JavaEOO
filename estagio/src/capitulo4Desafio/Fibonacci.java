package capitulo4Desafio;

public class Fibonacci {

	int calculaFibonacci(int numero) {

		if (numero < 2) {
			return 1;
		}
		return calculaFibonacci(numero - 1) + calculaFibonacci(numero - 2);
		
	}
}
