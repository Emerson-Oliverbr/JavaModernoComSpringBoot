package code85.dados; // Declaração de pacotes 

public class Funcionario {
	String nome;
	double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		System.out.println("Nome: " + nome);
		System.out.println("Salario: " + salario);
	}
}