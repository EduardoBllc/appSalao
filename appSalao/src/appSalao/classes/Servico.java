 package appSalao.classes;

public class Servico {
	private String nome;
	private float valor;
	private int tipo;
	
	public Servico() {
		
	}
	
	public void mudarValor(float valor) {
		this.valor = valor;
	}
	
	public float getValor() {
		return this.valor;
	}
	
	//se servicos[tipo] = true, profissional faz parte da array de habilitados
}
