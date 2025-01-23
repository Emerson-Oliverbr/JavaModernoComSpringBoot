public class Carro {
	String marca;
	String modelo;
	int anoDefabricacao;

	Carro() {
	}

	Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	Carro(String marca, String modelo, int anoDefabricacao) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoDefabricacao = anoDefabricacao;
	}

	public static void main(String[] args) {

		Carro carro1 = new Carro();

		System.out.println("Construtor Default: ");
		System.out.println("Nome do carro: " + carro1.modelo);		
		System.out.println("Modelo do carro: " + carro1.modelo);
		System.out.println("Ano do carro: " + carro1.anoDefabricacao);
	
		System.out.println("+------------------");

		System.out.println("Construtor de 2 atributos:  ");

		Carro carro2 = new Carro("Ford", "Fiesta");

		System.out.println("Marca do carro: " + carro2.marca);
		System.out.println("Modelo do carro: " + carro2.modelo);
		System.out.println("Ano do carro: " + carro2.anoDefabricacao);

		System.out.println("+------------------");
		
		System.out.println("Construtor de 3 atributos:  ");
		Carro carro3 = new Carro("Chevrolet", "Corsa", 1997);
		System.out.println("Marca do carro: " + carro3.marca);
		System.out.println("Modelo do carro: " + carro3.modelo);
		System.out.println("Ano do carro: " + carro3.anoDefabricacao);
	}
}
