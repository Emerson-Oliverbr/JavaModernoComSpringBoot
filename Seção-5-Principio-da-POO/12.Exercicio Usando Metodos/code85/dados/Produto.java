package code85.dados;

public class Produto {
	private String nome;
	private double preco;
	private int quantidadeEmEStoque;

	public Produto(String nome, double preco, int quantidadeEmEStoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEmEStoque = quantidadeEmEStoque;
	}

	public String estoqueAtual() {
		return "Nome: " + nome + ", Preco R$ " + String.format("%.2f", preco) + ", Quantidade: " + quantidadeEmEStoque;

	}
}