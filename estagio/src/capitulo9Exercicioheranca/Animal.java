package capitulo9Exercicioheranca;

public class Animal {
	protected String especie;
	protected String nome;
	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void barulho() {
		System.out.println("Som não definido");
	}

}
