package capitulo4Apostila;

//Exercicio 1:
class Conta {
	String titular;
	int numero;
	String agencia;
	double saldo;
	Data dataAbertura;

	// Exercicio 2:
	void saca(double valor) {
		this.saldo -= valor;
	}

	void deposita(double valor) {
		this.saldo += valor;
	}

	double calculaRendimento() {
		this.saldo = saldo * 0.1;
		return saldo;
	}

	String recuperarDadosParaImpressao() {

		String dados = "Titular: " + this.titular;
		dados += "\nN�mero:" + this.numero;
		dados += "\nAgencia: " + this.agencia;
		dados += "\nSaldo: " + this.saldo;
		// dados += "\nData de Abertura: " + this.dataAbertura;
		// Exercicio 7:
		// dados += "\nDia: " + this.dataAbertura.dia;
		// dados += "\nM�s: " + this.dataAbertura.mes;
		// dados += "\nAno: " + this.dataAbertura.ano;
		dados += "\nData de abertura:" + this.dataAbertura.formatada();
		dados += "\nCalculo Rendimento: " + this.calculaRendimento();
		return dados;
	}
}

class Data {
	int dia = 12;
	int mes = 02;
	int ano = 2015;
	
	//Exercicio 9:
	String formatada() {
		String formatada = this.dia + "/" + this.mes + "/" + this.ano;
		return formatada;
	}

}