package appSalao.classes;

/*
00 Design
01 Cílios
02 Make
03 Buço
04 Cabelo colorido
05 Pintura
06 Micro
07 Escova
08 Mechas
09 Penteado
10 Micropigmentação
11 Botox
12 Corte
*/

public class Profissional {
	protected boolean servicos[] = new boolean[13];
	protected String servicosNome[] = new String [servicos.length];
	
	
	{//Array de nome de serviços
		servicosNome[0] = "Design de sombrancelha";
		servicosNome[1] = "Cílios";
		servicosNome[2] = "Make";
		servicosNome[3] = "Buço";
		servicosNome[4] = "Cabelo colorido";
		servicosNome[5] = "Pintura";
		servicosNome[6] = "Micro";
		servicosNome[7] = "Escova";
		servicosNome[8] = "Mechas";
		servicosNome[9] = "Penteado";
		servicosNome[10] = "Micropigmentação";
		servicosNome[11] = "Botox";
		servicosNome[12] = "Corte";
	}
	
	private String nome;

	public Profissional(String nome) {
		
		this.nome = nome;
		/*Scanner teclado = new Scanner(System.in);
		//Definir array de ints com a quantidade de serviços prestados e seus números
		int set_servicos[] = new int[qtd];
		
		System.out.println("Digite os código de serviço: ");
		for(int i = 0; i < set_servicos.length;i ++) {
			//Usando os elementos da array de ints dos serviços como indice para validar na array de serviços
			set_servicos[i] = Integer.parseInt(teclado.nextLine());			
			servicos[set_servicos[i]] = true;
		}
		teclado.close();*/
	}
	
	//Getters
	public String getNome() {
		return this.nome;
	}	
	public boolean getServicos(int i) {
		return this.servicos[i];
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

