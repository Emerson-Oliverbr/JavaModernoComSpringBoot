class Animal {	
		public void comer() {
			System.out.println("O aninal come");
		}
    }

class Cachorro extends Animal {
	public void latir() {
		System.out.println("O cachorro late");
	}
}

public class TesteHeranca {
	public static void main(String[] args) {
		Cachorro dorguerson = new Cachorro();

		dorguerson.latir();
		dorguerson.comer();
	}
}