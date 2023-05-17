package ifsc;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProduto {
	
	
	public static void main(String[] args) {
		ArrasyList<Produto> Pessoa = new ArrasyList<>;
		
		Produto p = new Produto();
		p.setNome("encomenda");
		p.setPreco(200);
		p.setFornecedor("Logistica");
		p.setCodBarras(654891);
		Produtos.add(p);
		
		Produto r = new Produto();
		r.setNome("roupas");
		r.setPreco(500);
		r.setFornecedor("Shein");
		r.setCodBarras(19516915);
		Produtos.add(r);
		
		Produto l = new Produto();
		l.setNome("livros");
		l.setPreco(50);
		l.setFornecedor("Amazon");
		l.setCodBarras(9472742);
		Produtos.add(l);
		
		for (int i = 0; i< Produto.size(); i++)
			System.out.println(Produto.get(i).getNome());
			System.out.println(Produto.get(i).getPreco());
			System.out.println(Produto.get(i).getFornecedor());
			System.out.println(Produto.get(i).getCodBarras());
		
		
	}

}
