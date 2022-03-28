package appSalao.classes;

public class Profissional {
	private String nome;
	private float ganhos;
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
	public Profissional(String nome) {
		this.nome = nome;
	}
	
	//Getters
	public String getNome() {
		return this.nome;
	}	
	public boolean getServicos(int i) {
		return this.servicos[i];
	}
	public float getFaturamento() {
		return this.ganhos;
	}
	
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Métodos
	public void addServico(int cod) {
		//Habilitando o serviço
		servicos[cod] = true;
	}
	
	public void imprimeServicos() {
		System.out.println("Serviços prestados:");
		//Imprimindo cada serviço usando o indice da bool array na array de nomes
		for(int i = 0; i < servicos.length; i ++) {
			if(servicos[i]) {
				System.out.println(servicosNome[i] );
			}
		}
	}
}

