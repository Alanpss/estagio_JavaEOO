package capitulo5;

public class Conta {
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private int dia;
	private int mes;
	private int ano;
	private static int identificador;
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public static void setIdentificador(int identificador) {
		Conta.identificador = identificador;
	}

	public Conta(){
	Conta.identificador = identificador + 1;
	}
	
	public Conta(String titular) {
		this.titular = titular;
	}
	
	public static int getIdentificador() {
		return Conta.identificador;
	}
	
	public String getTitular() {
		return titular;
	}
	

	public void setTitular(String titular) {
		this.titular = titular;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getRendimento() {
		this.saldo = saldo * 0.1;
		return saldo;
	}

	public String recuperarDadosParaImpressão() {

		String dados = "Titular: " + this.titular;
		dados += "\nNúmero:" + this.numero;
		dados += "\nAgencia: " + this.agencia;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nCalculo Rendimento: " + this.getRendimento();
		return dados;
	}
}
