package appSalao.classes;

public class PrestServico {
	Servico serv;
	Profissional pro;
	float valor;
	
	//Construtor
	public PrestServico(Servico serv, Profissional pro) {
		this.serv = serv;
		this.pro = pro;
		
		if(serv.getValor() != 0) {
			this.valor = serv.getValor();
		}
	}
	
	//Getters
	public float getValor() {
		return this.valor;
	}
	public Servico getServico() {
		return this.serv;
	}
	public Profissional getProfissional() {
		return this.pro;
	}
	
	//Setters
	public void setValor(float valor) {
		this.valor = valor;
	}
	public void setServico(Servico serv) {
		this.serv = serv;
	}
	public void setProfissional(Profissional pro) {
		this.pro = pro;
	}
}
