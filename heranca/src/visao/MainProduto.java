package visao;

import modelo.Produto;

public class MainProduto {

		Produto p = new Produto();
		p.setNome("Bebidas");
		p.setCodBarras(1314);
		Produtos.add(p);
        
		ProdutoDAO pdao = new ProdutoDAO();
		pdao.setNome("desconhecido");
		pdao.setCodBarras(13725);
		Produtos.add(pdao);
		
		for (int i = 0; i< Produto.size(); i++)
			System.out.println(Produto.get(i).getNome());
			System.out.println(Produto.get(i).getCodBarras());

}


