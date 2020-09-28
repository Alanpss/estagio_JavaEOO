package capitulo5Lista;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();

		pessoa.criaConta("AJK", "9708");
		pessoa.setNome("Alan");
		pessoa.setCpf(48019720);
		pessoa.conta.setSaldo(900);
		pessoa.conta.depositaValor(100);
		pessoa.conta.sacaValor(200);
		System.out.println("Método imprime:" + pessoa.imprime());
		System.out.println("Número de contas: " + Conta.getNumeroContas());
		System.out.println();

		pessoa.criaConta("CDE", "9708");
		pessoa.setNome("Silvia");
		pessoa.setCpf(38449690);
		pessoa.conta.setSaldo(700);
		pessoa.conta.depositaValor(300);
		pessoa.conta.sacaValor(200);

		System.out.println("Método imprime:" + pessoa.imprime());
		System.out.println("Número de contas: " + Conta.getNumeroContas());

	}

}
