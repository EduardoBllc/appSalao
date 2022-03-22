package appSalao.classes;

public class Servico {
	private float valor;
	private int tipo;
	
	public Servico(float valor,int qtd) {
		this.valor = valor;		
	}
	
	public void mudarValor(float valor) {
		this.valor = valor;
	}
	
	public float getValor() {
		return this.valor;
	}
	
	//se servicos[tipo] = true, profissional faz parte da array de habilitados
}
