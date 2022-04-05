package appSalao.classes;

public class Produto {
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
	public Produto(String nome) {
		this.nome = nome;
	}
	public Produto(String nome, float valor) {
		this.nome = nome;
		this.valor = valor;
	}
}
