import code85.dados.Funcionario;
import code85.dados.TestePackage;

import java.util.Locale;

public class FolhaDePagamento {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		

		Funcionario funcionario = new Funcionario("Emerson", 5000.0);

		System.out.println(funcionario.obterInfo());

	}
}