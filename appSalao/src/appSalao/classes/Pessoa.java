package appSalao.classes;

public abstract class Pessoa {
	private String nome;

//Construtor
public Pessoa(String nome) {
	this.nome = nome;
	}

//Getters
public String getNome() {
	return this.nome;
}

//Setters
public void setNome(String nome) {
	this.nome = nome;
	}
}
