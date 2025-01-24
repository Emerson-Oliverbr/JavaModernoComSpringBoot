package code85.dados;

public class Funcionario {
	private String nome;
	double salario;

	private Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		System.out.println("Nome: " + nome);
		System.out.printf("Salario: R$ %.2f%n" , salario);
	}

	public Funcionario() {
		Funcionario func = new Funcionario("Laura", 5000.00);
	}
}