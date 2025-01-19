public class Main {
	public static void main(String[] args) {

		//var usuario = new Usuario(); // Inferência do tipo Usuario
		var numero = 10; // Inferência int "Pois o valor 10 é um int"
		int numero2 = numero;
		//byte numero3 = numero; // Erro de tipo incompativel
		var numero4 = 10.5; // Inferência do tipo double
		
		System.out.println("Valor de numero = " + numero); 
		System.out.println("Valor de numero = " + numero4); 
	}
}