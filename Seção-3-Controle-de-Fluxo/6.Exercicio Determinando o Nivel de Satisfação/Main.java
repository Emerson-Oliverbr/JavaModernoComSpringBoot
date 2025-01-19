public class Main {
	public static void main(String[] args) {

		int nivel = 5;

		String feedback;

		switch (nivel) {
		case 1 -> feedback = "Muito insatisfeito";
		case 2 -> feedback = "insatisfeito";
		case 3 -> feedback = "Neutro";
		case 4 -> feedback = "Satisfeito";
		case 5 -> feedback = "Muito Satisfeito";
		default -> feedback = "Desconhecido";
		}

		System.out.println(feedback);
	}
}