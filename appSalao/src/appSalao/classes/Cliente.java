package appSalao.classes;

public class Cliente {
	private String nome;
	private int telefone;
	private int cpf;
	
	
	//Getters
	public String getNome() {
		return this.nome;
	}
	public int getTelefone() {
		return this.telefone;
	}
	public int getCPF() {
		return this.cpf;
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public void setCPF(int cpf) {
		this.cpf = cpf;
	}
	
	//Construtor
	public Cliente(String nome) {
		this.nome = nome;
	}
}
