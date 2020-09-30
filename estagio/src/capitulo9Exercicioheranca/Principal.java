package capitulo9Exercicioheranca;

public class Principal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Poodle poodle = new Poodle();
		Siames siames = new Siames();
		Cobra cobra = new Cobra();
		
		System.out.println("Testes classes pricncipais\n");
		//animal
		animal.setEspecie("");
		animal.setNome("");
		animal.barulho();
		System.out.println("Espécie: " + animal.getEspecie());
		System.out.println("Nome: " + animal.getNome());
		System.out.println();
		
		//cachorro
		poodle.setEspecie("Cachorro");
		poodle.setNome("Nina");
		System.out.println("Espécie: " + poodle.getEspecie());
		System.out.println("Nome: " + poodle.getNome());
		poodle.barulho();
		System.out.println();
		
		//gato
		siames.setEspecie("Gato");
		siames.setNome("Thor");
		System.out.println("Espécie: " + siames.getEspecie());
		System.out.println("Nome: " + siames.getNome());
		siames.barulho();
		System.out.println();
		
		
		//cobra
		cobra.setEspecie("Cobra");
		cobra.setNome("Juca");
		System.out.println("Espécie: " + cobra.getEspecie());
		System.out.println("Nome: " + cobra.getNome());
		cobra.barulho();
		
		
		
		
		
		
	}

}
