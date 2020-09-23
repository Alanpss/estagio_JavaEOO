package capitulo4Lista;

public class Principal {

	public static void main(String[] args) {
		//instanciando objetos
		Carro c1 = new Carro();
		Porta porta1 = new Porta();
		Porta porta2 = new Porta();
		Porta porta3 = new Porta();
		Porta porta4 = new Porta();
		Motor motor1 = new Motor();
		Cambio cambio1 = new Cambio();

		//alteração dos atributos
		c1.marca = "Fiat";
		c1.modelo = "Uno";
		c1.ano = 2012;
		c1.motor = motor1;
		motor1.descricao = "Fire 1.0";
		c1.porta1 = porta1;
		c1.porta2 = porta2;
		c1.porta3 = porta3;
		c1.porta4 = porta4;
		c1.cambio = cambio1;
		c1.velocidadeAtual = 30;
		
		c1.porta1.descricao = "Frente";
		c1.porta1.estado = "aberta";
		
		// chamada dos métodos
		System.out.println("Velocidade Atual: " + c1.velocidadeAtual);
		c1.acelerar(40);
		System.out.println("Velocidade Nova: " + c1.velocidadeAtual);
		System.out.println();

		System.out.println(c1.exibirCaracteristicas());
		System.out.println();

		c1.exibirEstado();
		System.out.println();
		
		c1.porta1.fechar(); 
		c1.porta1.fechar();
		System.out.println();
		c1.porta1.abrir();
		c1.porta1.abrir();
	}

}
