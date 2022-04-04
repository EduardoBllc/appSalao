package appSalao.classes;

public class Cliente extends Pessoa{
	private String nome;
	private int telefone;
	private int cpf;
	
	
	//Getters
	public int getTelefone() {
		return this.telefone;
	}
	public int getCPF() {
		return this.cpf;
	}
	
	//Setters
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public void setCPF(int cpf) {
		this.cpf = cpf;
	}
	
	//Construtor
	public Cliente(String nome) {
		super(nome);
	}
}
