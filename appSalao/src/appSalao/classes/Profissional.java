package appSalao.classes;

public class Profissional extends Pessoa{
	private int div;
	private float faturamento;
	private boolean servicos[] = new boolean[13];
	private String servicosNome[] = new String [servicos.length];

	
	{//Array de nome de serviços
		servicosNome[0] = "Design de sombrancelha";
		servicosNome[1] = "Buço";
		servicosNome[2] = "Cílios";
		servicosNome[3] = "Make";
		servicosNome[4] = "Cabelo colorido";
		servicosNome[5] = "Pintura";
		servicosNome[6] = "Micro";
		servicosNome[7] = "Escova";
		servicosNome[8] = "Mechas";
		servicosNome[9] = "Micropigmentação";
		servicosNome[10] = "Penteado";
		servicosNome[11] = "Botox";
		servicosNome[12] = "Corte";
	}

	//Construtor
	public Profissional(String nome, int div) {
		super(nome);
		this.div = div;
	}
		
	//Getters
	public boolean getServicos(int i) {
		return this.servicos[i];
	}
	public float getGanhos() {
		return (this.faturamento/div);
	}
	public float getFaturamento() {
		return this.faturamento;
	}
	
	
	//Setters
	public void addFaturamento(float valor) {
		this.faturamento += valor;
	}
	
	//Métodos
	public void addServico(int cod) {
		//Habilitando o serviço
		servicos[cod] = true;
	}
	

}

