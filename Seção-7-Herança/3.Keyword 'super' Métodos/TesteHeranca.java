class Animal {	
	public String nome; 
		public void fazerSom() {
			System.out.println("O animal faz som");
		}
    }

class Cachorro extends Animal {
	public void fazerSom() {
		super.fazerSom();
		System.out.println("O cachorro late");
	}
}

public class TesteHeranca {
	public static void main(String[] args) {
		Cachorro dorguerson = new Cachorro();
		dorguerson.nome = "Doguerson";
		System.out.println("O nome do animal: " + dorguerson.nome);
		dorguerson.fazerSom();		
	}
}