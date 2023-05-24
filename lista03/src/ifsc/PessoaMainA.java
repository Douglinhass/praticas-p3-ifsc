package ifsc;

public class PessoaMainA {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		p.cpf = 1284392182l;
		p.nome = "Douglas";
		p.data = "10/10/2006";

		System.out.println("A pessoa" + p.nome + " tem o CPF n° " + p.cpf);
		
		Pessoa p1 = new Pessoa();
		p1.cpf = 1284392182l;
		p1.nome = "Douglas";
		p1.data = "10/10/2006";

		System.out.println("A pessoa" + p1.nome + " tem o CPF n° " + p1.cpf);
		
		Pessoa p2 = new Pessoa();
		p2.cpf = 1284392182l;
		p2.nome = "Douglas";
		p2.data = "10/10/2006";

		System.out.println("A pessoa" + p2.nome + " tem o CPF n° " + p2.cpf);

	}
}
