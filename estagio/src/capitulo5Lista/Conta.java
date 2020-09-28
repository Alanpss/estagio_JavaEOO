package capitulo5Lista;

public class Conta {
	private int numero;
	private String agencia;
	private String senha;
	private double saldo;
	private static int numeroContas;

	public Conta() {
		Conta.numeroContas = numeroContas + 1;
	}

	public static int getNumeroContas() {
		return numeroContas;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacaValor(double valor) {
		this.saldo = saldo - valor;
	}

	public void depositaValor(double valor) {
		this.saldo = saldo + valor;
	}

	public void transfere(double valor, Conta contaDestino) {
		if (valor <= saldo) {
			this.sacaValor(valor);
			contaDestino.depositaValor(valor);
		} else {
			System.out.println("Valor maior que o Saldo atual!");
		}
	}

	public String imprime() {
		String dados = "\nNumero: " + this.getNumero();
		dados += "\nAgencia: " + this.getAgencia();
		dados += "\nSaldo: " + this.getSaldo();
		return dados;
	}

}
