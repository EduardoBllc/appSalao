package appSalao.classes;

public class Atendimento {
	private Cliente cli;
	private Profissional pro;
	private Servico serv;
	private Produto prod;
	private float valor;
	
	//Construtor
	public Atendimento(Cliente cli, Profissional pro, Servico serv) {
		this.cli = cli;
		this.pro = pro;
		this.serv = serv;
	}
	
	//Getters
	public Cliente getCli() {
		return this.cli;
	}
	public Profissional getPro() {
		return this.pro;
	}
	public Servico getServ() {
		return this.serv;
	}
	public float getValor() {
		return this.valor;
	}
	public Produto getProduto() {
		return this.prod;
	}
	
	//Setters
	public void setCli(Cliente cli) {
		this.cli = cli;
	}
	public void setPro(Profissional pro) {
		this.pro = pro;
	}
	public void setServ(Servico serv) {
		this.serv = serv;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public void setProduto(Produto prod) {
		this.prod = prod;
	}
}
