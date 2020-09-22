package capitulo4Lista;

public class Carro {
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

	// deve trocar a marcha se for necessário e mudar a velocidade atual
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
		return caracteristicas;
	}

	// imprime a velocidade, marcha atual e o estado das portas
	void exibirEstado() {
		Cambio.mudarMarcha(velocidadeAtual);
		System.out.printf("Velocidade atual = %d%n", velocidadeAtual);
		System.out.printf("Marcha Atual = %d%n", cambio.marchaAtual);
		System.out.printf("Estado da porta 1: %s%n", porta1.estado);
		System.out.printf("Estado da porta 2: %s%n", porta2.estado);
		System.out.printf("Estado da porta 3: %s%n", porta3.estado);
		System.out.printf("Estado da porta 4: %s%n", porta4.estado);

	}
}
