package code85.dados;

public class Funcionario {
	private String nome;
	private double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;		
	}

	public String obterInfo() {
		return "Nome: " + nome + ", Salario: " + String.format("%.2f", salario);
	}
	
}