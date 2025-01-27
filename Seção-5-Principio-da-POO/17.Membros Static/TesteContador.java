class Contador {

	static int contagem = 0;

	public Contador() {
		contagem++;
	}
}

public class TesteContador {
	public static void main(String[] args) {

		Contador contador1 = new Contador();
		Contador contador2 = new Contador();
		Contador contador3 = new Contador();

		System.out.println("Número de objetos criados: " + Contador.contagem);

	}
}