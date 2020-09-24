package capitulo5;

public class Conta {
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;

	// Exercicio 2:
	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double calculaRendimento() {
		this.saldo = saldo * 0.1;
		return saldo;
	}

	public String recuperarDadosParaImpress�o() {

		String dados = "Titular: " + this.titular;
		dados += "\nN�mero:" + this.numero;
		dados += "\nAgencia: " + this.agencia;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nCalculo Rendimento: " + this.calculaRendimento();
		return dados;
	}
}
