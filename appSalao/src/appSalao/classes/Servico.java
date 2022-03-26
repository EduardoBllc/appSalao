 package appSalao.classes;

public class Servico {
	private String nome;
	private float valor;
	
	
	//Getters
	public String getNome() {
		return this.nome;
	}
	public float getValor() {
		return this.valor;
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	//Construtor
	public Servico(String nome) {
		this.nome = nome;
	}
}
