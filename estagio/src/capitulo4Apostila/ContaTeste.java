package capitulo4Apostila;

public class ContaTeste {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Data data = new Data();
		//Exercicio 2:

		c1.titular = "Alan";
		c1.numero = 1;
		c1.agencia = "40009-0";
		c1.saldo = 190.0;
		c1.dataAbertura = data;
		
		c1.deposita(100.0);
		System.out.println("Deposita:" + c1.saldo);
		c1.saca(70.0);
		System.out.println("Saca:" + c1.saldo);
		System.out.println("rendimento mensal:" + c1.calculaRendimento());
		
		//Exercicio 3: 
		System.out.println();
		System.out.println(c1.recuperarDadosParaImpressão());
		System.out.println();
		
		//Exercicio 4:
		Conta c2 = new Conta();
		c2.titular = "Daniel";
		c2.saldo = 100;

		Conta c3 = new Conta();
		c3.titular = "Daniel";
		c3.saldo = 100;

		if (c2 == c3) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}//nesse caso o retorno é diferente pois esta sendo comparado o endereço de memoria 
		
		//Exercicio 5:
		Conta c4 = new Conta();
		c4 = c1;
		
		System.out.println("Titular conta 1:");
		System.out.println(c1.titular);
		System.out.println("Titular conta 4:");
		System.out.println(c4.titular);
		//nesse caso a c4 recebe o valor dos atributos da C1
		
	}

}
