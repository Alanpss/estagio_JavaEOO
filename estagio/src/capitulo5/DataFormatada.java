package capitulo5;

public class DataFormatada {
	private static int dia = 19;
	private static int mes = 02;
	private static int ano = 2015;

	public static int getDia() {
		return dia;
	}

	public static void setDia(int dia) {
		DataFormatada.dia = dia;
	}

	public static int getMes() {
		return mes;
	}

	public static void setMes(int mes) {
		DataFormatada.mes = mes;
	}

	public static int getAno() {
		return ano;
	}

	public static void setAno(int ano) {
		DataFormatada.ano = ano;
	}

	public static String formatada() {
		String formatada = null;
		if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0 && ((mes == 1 || mes == 3 || mes == 5 || mes == 7
				|| mes == 8 || mes == 10 || mes == 12) || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30)
				|| (mes == 2 && (dia <= 29 && ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) || dia <= 28))) {

			formatada = dia + "/" + mes + "/" + ano;
		}
		return formatada;
	}

}
