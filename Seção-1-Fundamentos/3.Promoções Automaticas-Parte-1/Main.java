public class Main {
	public static void main(String[] args) {
		byte a = 10;
		int b = a + 5; // a 'promovido par int antes do calculo 		

		int n1 = 10;
		float n2 = 1.5f;
		float n3 = n1 * n2; // a é promovido para float antes do calculo

		int n4 = 10;
		double n5 = 1.5;
		double n6 = n4 * n5;

		System.out.println("valor de a = " + a);
		System.out.println("valor de n3 = " + n3);
		System.out.println("valor de n6 = " + n6);
	}
}