package capitulo1_2_3;

public class A2BalancoTrimestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 1700;

		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		int mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco) / 3;

		System.out.println(gastosTrimestre);
		System.out.printf("O valor da média mensal é = %d", mediaMensal);
	}

}
