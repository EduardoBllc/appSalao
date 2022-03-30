package appSalao.classes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Atendimento {
	private Cliente cli;
	private ArrayList<PrestServico> prest_servs = new ArrayList<>();;
	private LinkedList<Produto> produtos = new LinkedList<>();
	
	//Construtor
	public Atendimento(Cliente cli, PrestServico prest_serv) {
		this.cli = cli;
		this.prest_servs.add(prest_serv);
	}
	
	//Getters
	public Cliente getCli() {
		return this.cli;
	}
	public PrestServico getPrestServ(int indice) {
		return this.prest_servs.get(indice);
	}
	public Produto getProduto(int indice) {
		return this.produtos.get(indice);
	}
//	public LinkedList<Produto> getAllProdutos() {
//		return this.produtos;
//	}
	
	//Setters
	public void setCli(Cliente cli) {
		this.cli = cli;
	}
	public void setPrestServ(PrestServico prest_serv) {
		this.prest_servs.add(prest_serv);
	}	
	
	//Métodos
	//Adicionar produtos ao atendimento
	public void addProduto(Produto prod) {
		this.produtos.add(prod);
		System.out.println("O produto \"" + prod.getNome() + "\" foi adicionado ao atendimento de " + this.cli.getNome());
	}
	
	//Remover produtos do atendimento
	public void remProduto(int indice) {
		System.out.println("O produto \"" + produtos.get(indice).getNome() + "\" foi removido ao atendimento de " + this.cli.getNome());
		this.produtos.remove(indice);
	}
	
	public void addPrestServ(PrestServico prest_serv) {
		this.prest_servs.add(prest_serv);
		System.out.println("O serviço \"" + prest_serv.getServico().getNome() + "\" foi adicionado ao atendimento de " + this.cli.getNome());
	}
	
	public void remPrestServ(int indice) {
		System.out.println("O serviço \"" + prest_servs.get(indice).getServico().getNome() + "\" foi removido ao atendimento de " + this.cli.getNome());
		this.produtos.remove(indice);
	}

	
}
