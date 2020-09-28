package capitulo5;

public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		//DataFormatada d1 = new DataFormatada();
		int identificador = Conta.getIdentificador();
		
		//Exercicio 3:
		c1.setTitular("Alan");
		c1.setNumero(1);
		c1.setAgencia("40009-0");
		c1.setSaldo(190.0);
		
		//DataFormatada.getDia 
		
		System.out.println("Titular: " + c1.getTitular());
		System.out.println("Numero:" + c1.getNumero());
		System.out.println("Agencia: " + c1.getAgencia());
		System.out.println("Saldo: " +c1.getSaldo());
		
		System.out.println("Identificador: " + identificador);
		
		System.out.println("Data: " + DataFormatada.formatada());
		
	}

}
