public class Main {
	public static void main(String[] args) {

		String dia = "Terca";

		String tipoDeDia = switch (dia) {
		case "Segunda", "Terca", "Quarta", "Quinta", "Sexta" -> "Dia util";
		case "Sabado", "Domingo" -> "Fim de semana";
		default -> "Desconhecido";
		};

		System.out.println(tipoDeDia);
	}
}