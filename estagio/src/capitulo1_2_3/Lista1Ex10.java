package capitulo1_2_3;

public class Lista1Ex10 {

	public static void main(String[] args) {
		int cont = 0;

		do {
			int carta = (int) (Math.random() * 13) + 1;
			int naipe = (int) (Math.random() * 4) + 1;
			if (carta == 1) {
				if (naipe == 1) {
					System.out.println("A de Paus");
				} else if (naipe == 2) {
					System.out.println("A de Copas");
				} else if (naipe == 3) {
					System.out.println("A de Espada");
				} else {
					System.out.println("A de Ouro");
				}
			} else if (carta == 2) {
				if (naipe == 1) {
					System.out.println("2 de Paus");
				} else if (naipe == 2) {
					System.out.println("2 de Copas");
				} else if (naipe == 3) {
					System.out.println("2 de Espada");
				} else {
					System.out.println("2 de Ouro");
				}
			} else if (carta == 3) {
				if (naipe == 1) {
					System.out.println("3 de Paus");
				} else if (naipe == 2) {
					System.out.println("3 de Copas");
				} else if (naipe == 3) {
					System.out.println("3 de Espada");
				} else {
					System.out.println("3 de Ouro");
				}
			} else if (carta == 4) {
				if (naipe == 1) {
					System.out.println("4 de Paus");
				} else if (naipe == 2) {
					System.out.println("4 de Copas");
				} else if (naipe == 3) {
					System.out.println("4 de Espada");
				} else {
					System.out.println("4 de Ouro");
				}
			} else if (carta == 5) {
				if (naipe == 1) {
					System.out.println("5 de Paus");
				} else if (naipe == 2) {
					System.out.println("5 de Copas");
				} else if (naipe == 3) {
					System.out.println("5 de Espada");
				} else {
					System.out.println("5 de Ouro");
				}
			} else if (carta == 6) {
				if (naipe == 1) {
					System.out.println("6 de Paus");
				} else if (naipe == 2) {
					System.out.println("6 de Copas");
				} else if (naipe == 3) {
					System.out.println("6 de Espada");
				} else {
					System.out.println("6 de Ouro");
				}
			} else if (carta == 7) {
				if (naipe == 1) {
					System.out.println("7 de Paus");
				} else if (naipe == 2) {
					System.out.println("7 de Copas");
				} else if (naipe == 3) {
					System.out.println("7 de Espada");
				} else {
					System.out.println("7 de Ouro");
				}
			} else if (carta == 8) {
				if (naipe == 1) {
					System.out.println("8 de Paus");
				} else if (naipe == 2) {
					System.out.println("8 de Copas");
				} else if (naipe == 3) {
					System.out.println("8 de Espada");
				} else {
					System.out.println("8 de Ouro");
				}
			} else if (carta == 9) {
				if (naipe == 1) {
					System.out.println("9 de Paus");
				} else if (naipe == 2) {
					System.out.println("9 de Copas");
				} else if (naipe == 3) {
					System.out.println("9 de Espada");
				} else {
					System.out.println("9 de Ouro");
				}
			} else if (carta == 10) {
				if (naipe == 1) {
					System.out.println("10 de Paus");
				} else if (naipe == 2) {
					System.out.println("10 de Copas");
				} else if (naipe == 3) {
					System.out.println("10 de Espada");
				} else {
					System.out.println("10 de Ouro");
				}
			} else if (carta == 11) {
				if (naipe == 1) {
					System.out.println("Q de Paus");
				} else if (naipe == 2) {
					System.out.println("Q de Copas");
				} else if (naipe == 3) {
					System.out.println("Q de Espada");
				} else {
					System.out.println("Q de Ouro");
				}
			} else if (carta == 12) {
				if (naipe == 1) {
					System.out.println("J de Paus");
				} else if (naipe == 2) {
					System.out.println("J de Copas");
				} else if (naipe == 3) {
					System.out.println("J de Espada");
				} else {
					System.out.println("J de Ouro");
				}
			} else {
				if (naipe == 1) {
					System.out.println("K de Paus");
				} else if (naipe == 2) {
					System.out.println("K de Copas");
				} else if (naipe == 3) {
					System.out.println("K de Espada");
				} else {
					System.out.println("K de Ouro");
				}
			}
			cont++;
		} while (cont < 10);

	}
}
