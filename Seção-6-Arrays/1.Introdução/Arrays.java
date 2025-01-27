public class Arrays {
	public static void main(String[] args) {

		int[] meuArray;

		meuArray = new int[3];

		meuArray[0] = 1; // preenche o array índice por índice
		meuArray[1] = 2;
		meuArray[2] = 3;

		meuArray = new int[] {4, 5, 6}; // preenche o array completamente, nesse caso esta substituindo a primeira opção
		
		System.out.println(meuArray[0]);
		System.out.println(meuArray[1]);
		System.out.println(meuArray[2]);

		System.out.println();
		meuArray[1] = 10;

		System.out.println(meuArray[0]);
		System.out.println(meuArray[1]);
		System.out.println(meuArray[2]);
		System.out.println();

		for(int i=0; i < meuArray.length; i++) {
			System.out.println(meuArray[i]);
		}

	}
}