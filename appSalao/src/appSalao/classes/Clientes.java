package appSalao.classes;

public class Clientes {
	private String nome;
	private int telefone;
	private int cpf;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public int getCPF() {
		return this.cpf;
	}
	
	public void setCPF(int cpf) {
		this.cpf = cpf;
	}
	
	public Clientes(String nome, int telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
}
