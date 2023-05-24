package ifsc;

public class MainAnimal extends Animal{} {
	
	Cachorro ca = new Cachorro();
	ca.setNome("duquesa");
	ca.setRaca("raca");
	ca.setComprimento(30);
	ca.setNpatas(4);
	ca.setCor("Branco com marrom");
	ca.setEcossistema("desconhecido");
	
    Gato g = new Gato();
    g.setNome("mili");
	g.setRaca("raca");
	g.setComprimento(10);
	g.setNpatas(4);
	g.setCor("Branco");
	g.setEcossistema("desconhecido");
	
	for (int i = 0; i< Animal.size(); i++)
			System.out.println(Animal.get(i).getNome());
			System.out.println(Animal.get(i).getRaca());
			System.out.println(Animal.get(i).getComprimento());
			System.out.println(Animal.get(i).getNpatas());
	                System.out.println(Animal.get(i).getCor());
			System.out.println(Animal.get(i).getEcossistema());

}
