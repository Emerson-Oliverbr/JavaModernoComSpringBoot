public class Funcionario {
	String nome;
	String cargo;
	int idade;



	Funcionario(String nome, String cargo, int idade) {
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
	}

	Funcionario() {
	}

	public static void main(String[] args) {		

		Funcionario funcionario = new Funcionario("Emerson", "Desenvolvedor", 39);
		

		System.out.println("Nome: " + funcionario.nome);
		System.out.println("Cargo: " + funcionario.cargo);
		System.out.println("Idade: " + funcionario.idade);
	}
}