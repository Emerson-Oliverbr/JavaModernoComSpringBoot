import code85.dados.Produto;

import java.util.Locale;

public class Estoque {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Produto produto = new Produto("Notebook", 3997.00, 1);
		Produto produto2 = new Produto("Monitor", 999.00, 1);

		System.out.println(produto.estoqueAtual());
		System.out.println(produto2.estoqueAtual());
	}
}