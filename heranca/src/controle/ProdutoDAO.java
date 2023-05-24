package controle;

public class ProdutoDAO {

	import java.util.ArrayList;

import modelo.Produto;

	    private ArrayList<Produto> listar;

	    public void setListar(ArrayList<Produto> listar) {
			this.listar = listar;
		}

		public ArrayList<Produto> getListar() {
			return listar;
		}

		public void setListarProdutos(ArrayList<Produto> listarProdutos) {
			this.listar = listar;
		}

		public ProdutoDAO() {
	        this.listar = new ArrayList<>();
	    }

	    public boolean inserir(Produto produto) {
	        return listar.add(produto);
	    }

	    public boolean atualizar(Produto produto) {
	        for (Produto p : listar) {
	            if (p.getId() == produto.getId()) {
	                p.setNome(produto.getNome());
	                p.getCodBarras(produto.getCodBarras());
	                return true;
	            }
	        }
	        return false;
	    }

	    public boolean excluir(int id) {
	        for (Produto produto : listar) {
	            if (produto.getId() == id) {
	                return listar.remove(produto);
	            }
	        }
	        return false;
	    }
	    
	    public boolean alterar(Produto produto) {
	        for (Produto p : listar) {
	            if (p.getId() == produto.getId()) {
	                p.setNome(produto.getNome());
	                p.getCodBarras(produto.getCodBarras());
	                return true;
	            }
	        }
	        return false;
	    }

	    public ArrayList<Produto> listar() {
	        return listar;
	    }
	}
