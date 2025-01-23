public class Funcionario {
	String nome;
	String cargo;
	int idade;

	Funcionario() { // Construtor Default ou Construtor Padrão
	}

	Funcionario(String nome, String cargo, int idade) { // Construtor de 3 argumentos
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
	}

	Funcionario(String nome) { // Construtor com apenas 1 argumentos
		this.nome = nome;
	}
	

	public static void main(String[] args) {		

		Funcionario funcionario = new Funcionario("Emerson"); // Acessanso o construtor de 1 argumento
		Funcionario funcionario2 = new Funcionario("Daniela", "Desenvolvedora", 35); // Acessanso o construtor de 3 argumentos
		Funcionario funcionario3 = new Funcionario(); // Acessanso o construtor padrão, com argumentos inseridos pelo proprio java

		System.out.println("Nome: " + funcionario.nome);
		System.out.println("Cargo: " + funcionario.cargo);
		System.out.println("Idade: " + funcionario.idade);
		System.out.println("+--------------------------+");
		System.out.println("Nome: " + funcionario2.nome);
		System.out.println("Cargo: " + funcionario2.cargo);
		System.out.println("Idade: " + funcionario2.idade);
		System.out.println("+--------------------------+");
		System.out.println("Nome: " + funcionario3.nome);
		System.out.println("Cargo: " + funcionario3.cargo);
		System.out.println("Idade: " + funcionario3.idade);
	}
}