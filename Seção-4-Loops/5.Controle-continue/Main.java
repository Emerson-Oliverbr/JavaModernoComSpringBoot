public class Main {
	public static void main(String[]args) {
		for( int i=0; i<10; i++) {
			if(i == 5) {
				continue; // Pula a interação quando j é igual a 5
			}
			System.out.println(i);
		}
	}	
}
