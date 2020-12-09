package capitulo1_2_3;

import java.util.Scanner;

public class BinarioParaDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor em binario:");
		String binario = sc.next();
		
		int potencia = 0, decimal = 0;
		
		for(int i = binario.length() -1 ; i >= 0; i--) {
			decimal += Math.pow(2, potencia) * Character.getNumericValue(binario .charAt(i));
			potencia++;
		}
		System.out.println(decimal);
		sc.close();
	}

}
