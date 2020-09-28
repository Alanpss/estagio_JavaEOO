package capitulo5Lista;

public class Pessoa {
	private String nome;
	private int cpf;
	public Conta conta;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public String imprime() {
		String informacoes = "\nNome: " + this.getNome();
		informacoes += "\nCPF: " + this.getCpf();
		informacoes += "\nNumero: " + this.conta.getNumero();
		informacoes += "\nAgencia: " + this.conta.getAgencia();
		informacoes += "\nSaldo: " + this.conta.getSaldo();
		return informacoes;
	}

	public void criaConta(String agencia, String senha) {
		Conta conta = new Conta();

		conta.setNumero((int) (Math.random() * 10));
		conta.setAgencia(agencia);
		conta.setSenha(senha);
		this.conta = conta;
	}

}
