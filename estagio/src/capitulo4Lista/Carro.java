package capitulo4Lista;

class Carro {
	int ano;
	Porta porta1;
	Porta porta2;
	Porta porta3;
	Porta porta4;
	Motor motor;
	String marca;
	String modelo;
	Cambio cambio;
	int velocidadeAtual = 10;

	// troca a marcha se for necessário e mudar a velocidade atual
	void acelerar(int velocidadeAdicional) {
		velocidadeAtual += velocidadeAdicional;
		System.out.printf("Acelerado %d Km/h!%n", velocidadeAdicional);
		Cambio.mudarMarcha(velocidadeAtual);
	}

	// imprime todos as características (qtd de portas, motor, ano e modelo)
	String exibirCaracteristicas() {
		String caracteristicas = "Motor: " + this.motor.descricao;
		caracteristicas += "\nAno: " + this.ano;
		caracteristicas += "\nMarca: " + this.marca;
		caracteristicas += "\nModelo: " + this.modelo;
		caracteristicas += "\nQuantidade portas: " + this.contPortas();
		return caracteristicas;
	}

	// imprime a velocidade, marcha atual e o estado das portas

	void exibirEstado() {
		Cambio.mudarMarcha(velocidadeAtual);
		System.out.printf("Velocidade atual = %d%n", this.velocidadeAtual);
		System.out.printf("Marcha Atual = %d%n", Cambio.marchaAtual);
		
		if (porta1 != null)
			System.out.printf("Estado da porta 1: %s%n", this.porta1.estado);
		if (porta2 != null)
			System.out.printf("Estado da porta 2: %s%n", this.porta2.estado);
		if (porta3 != null)
			System.out.printf("Estado da porta 3: %s%n", this.porta3.estado);
		if (porta4 != null)
			System.out.printf("Estado da porta 4: %s%n", this.porta4.estado);

	}

	int contPortas() {
		int quantPorta = 0;
		if (porta1 != null) {
			quantPorta++;
		}
		if (porta2 != null) {
			quantPorta++;
		}
		if (porta3 != null) {
			quantPorta++;
		}
		if (porta4 != null) {
			quantPorta++;
		}
		return quantPorta;
	}
}
