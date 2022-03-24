package appSalao.classes;

/*
00 Design
01 C�lios
02 Make
03 Bu�o
04 Cabelo colorido
05 Pintura
06 Micro
07 Escova
08 Mechas
09 Penteado
10 Micropigmenta��o
11 Botox
12 Corte
*/

public class Profissional {
	protected boolean servicos[] = new boolean[13];
	protected String servicosNome[] = new String [servicos.length];
	
	
	{//Array de nome de servi�os
		servicosNome[0] = "Design de sombrancelha";
		servicosNome[1] = "C�lios";
		servicosNome[2] = "Make";
		servicosNome[3] = "Bu�o";
		servicosNome[4] = "Cabelo colorido";
		servicosNome[5] = "Pintura";
		servicosNome[6] = "Micro";
		servicosNome[7] = "Escova";
		servicosNome[8] = "Mechas";
		servicosNome[9] = "Penteado";
		servicosNome[10] = "Micropigmenta��o";
		servicosNome[11] = "Botox";
		servicosNome[12] = "Corte";
	}
	
	private String nome;

	public Profissional(String nome) {
		
		this.nome = nome;
		/*Scanner teclado = new Scanner(System.in);
		//Definir array de ints com a quantidade de servi�os prestados e seus n�meros
		int set_servicos[] = new int[qtd];
		
		System.out.println("Digite os c�digo de servi�o: ");
		for(int i = 0; i < set_servicos.length;i ++) {
			//Usando os elementos da array de ints dos servi�os como indice para validar na array de servi�os
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
	
	//M�todos
	public void addServico(int cod) {
		//Habilitando o servi�o
		servicos[cod] = true;

	}
	
	public void imprimeServicos() {
		System.out.println("Servi�os prestados:");
		//Imprimindo cada servi�o usando o indice da bool array na array de nomes
		for(int i = 0; i < servicos.length; i ++) {
			if(servicos[i]) {
				System.out.println(servicosNome[i] );
			}
		}
	}
}

