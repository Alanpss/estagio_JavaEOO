package capitulo4Lista;

class Porta {
	String descricao;
	String estado;
	
	void abrir() {
		if (estado == "fechada") {
			estado = "aberta";
			System.out.println("A porta foi aberta");
		} else {
			System.out.println("A Porta já está aberta");
		}
	}

	void fechar() {
		if (estado == "aberta") {
			estado = "fechada";
			System.out.println("A porta foi fechada");
		} else {
			System.out.println("A Porta já está fechada");
		}
	}
}
