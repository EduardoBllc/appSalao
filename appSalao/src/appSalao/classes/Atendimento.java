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
	public ArrayList<PrestServico> getAllPrestServ() {
		return this.prest_servs;
	}
	public Produto getProduto(int indice) {
		return this.produtos.get(indice);
	}
	public String getNomeCliente() {
		return this.cli.getNome();
	}
	public String getNomeProfissional(int indice) {
		return this.prest_servs.get(indice).pro.getNome();
	}
	public float getValor(int indice) {
		return this.prest_servs.get(indice).getValor();
	}
	public Profissional getProfissional(int indice) {
		return this.prest_servs.get(indice).getProfissional();
	}
	
	//Setters
	public void setCli(Cliente cli) {
		this.cli = cli;
	}
	public void setPrestServ(PrestServico prest_serv) {
		this.prest_servs.add(prest_serv);
	}	
	
	//Métodos
	
	/**
	 * Adicionar produtos ao atendimento
	 * @param produto a ser adicionado
	 */
	public void addProduto(Produto prod) {
		this.produtos.add(prod);
		System.out.println("O produto \"" + prod.getNome() + "\" foi adicionado ao atendimento de " + this.cli.getNome());
	}
	
	/**
	 * Remover produtos do atendimento
	 * @param indice do Produto na ArrayList
	 */
	public void remProduto(int indice) {
		System.out.println("O produto \"" + produtos.get(indice).getNome() + "\" foi removido ao atendimento de " + this.cli.getNome());
		this.produtos.remove(indice);
	}
		
	/**
	 * Remoção do serviço prestado de sua ArrayList
	 * @param indice da prestação de serviço na ArrayList
	 */
	public void remPrestServ(int indice) {
		System.out.println("O serviço \"" + prest_servs.get(indice).getServico().getNome() + "\" foi removido ao atendimento de " + this.cli.getNome());
		this.produtos.remove(indice);
	}
	
	/**
	 * Realizar pagamento no fechamento de atendimento
	 * 
	 */
	public void addFaturPro(int indice, float valor) {
		//Adicionar valor no faturamento do profissional
		prest_servs.get(indice).getProfissional().addFaturamento(valor);
	}
	
}
