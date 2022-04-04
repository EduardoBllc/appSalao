package appSalao.classes;

public class Produto {
	String nome;
	float valor;
	
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
}
