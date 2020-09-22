package capitulo4Desafio;

public class FibonacciCalculo {

	public static void main(String[] args) {

		Fibonacci fibonacci = new Fibonacci();
		System.out.println("Sequencia: ");
		for (int i = 1; i <= 6; i++) {
			int resultado = fibonacci.calculaFibonacci(i);
			System.out.println(resultado);
		}

	}
}