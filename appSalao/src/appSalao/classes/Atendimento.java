package appSalao.classes;

import java.util.LinkedList;

public class Atendimento {
	private Cliente cli;
	private Servico serv;
	private Profissional pro;
	private LinkedList<Produto> produtos = new LinkedList<>();
	
	//Construtor
	public Atendimento(Cliente cli, Servico serv, Profissional pro) {
		this.cli = cli;
		this.serv = serv;
		this.pro = pro;
	}
	
	//Getters
	public Cliente getCli() {
		return this.cli;
	}
	public Servico getServ() {
		return this.serv;
	}
	public Produto getProduto(int indice) {
		return this.produtos.get(indice);
	}
	public LinkedList<Produto> getAllProdutos() {
		return this.produtos;
	}
	public Profissional getPro() {
		return pro;
	}
	
	//Setters
	public void setCli(Cliente cli) {
		this.cli = cli;
	}
	public void setServ(Servico serv) {
		this.serv = serv;
	}
	public void setPro(Profissional pro) {
		this.pro = pro;
	}
	
	
	//Métodos
	//Adicionar produtos ao atendimento
	public void addProduto(Produto prod) {
		this.produtos.add(prod);
		System.out.println("O produto \"" + prod.getNome() + "\" foi adicionado ao atendimento de " + this.cli.getNome());
	}
	
	//Remover produtos do atendimento
	public void remProduto(int indice) {
		this.produtos.remove(indice);
		System.out.println("O produto \"" + produtos.get(indice).getNome() + "\" foi adicionado ao atendimento de " + this.cli.getNome());
	}

}
