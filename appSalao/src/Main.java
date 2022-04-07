import java.util.ArrayList;
import java.util.Scanner;

import appSalao.classes.Atendimento;
import appSalao.classes.Cliente;
import appSalao.classes.PrestServico;
import appSalao.classes.Profissional;
import appSalao.classes.Servico;

public class Main {
	
	//Criando uma lista de atendimentos de tamanho variável
	static float faturamento;
	static ArrayList<Atendimento> atendimentos = new ArrayList<>();
	static ArrayList<Profissional> profissionais = new ArrayList<>();
	static ArrayList<Servico> servicos = new ArrayList<>();
	
	public static void main(String[] args) {
			
		//Criando os profissionais 
		novoProfissional("Duda",3);//0
		novoProfissional("Aline",1);//1
		novoProfissional("Gabi",2);//2
		novoProfissional("Geovana",2);//3
		novoProfissional("Vaninha",3);//4

		//Criando os serviços
		novoServico("Design de sombrancelha",30);//0
		novoServico("Extensão de cílios",150);//1
		novoServico("Make",90);//2
		novoServico("Buço",30);//3
		novoServico("Cabelo colorido");//4
		novoServico("Escova");//5
		novoServico("Corte");//6
		novoServico("Micropigmentação");//7
		
		//Adicionando o novo atendimento à lista de atendimentos
		novoAtendimento();
		
		//Printando o atendimento
		printAtendimento(0,0);
		System.out.println("");
		
		fecharAtendimento(0,0);
		System.out.println("Os ganhos de " + profissionais.get(0) + " são R$" + profissionais.get(0).getGanhos()) ;
	}
	
	
	//Métodos
	
	//Método criação atendimento
	public static void novoAtendimento() {
		
		Scanner teclado = new Scanner(System.in);
		
		//Criando o cliente		
		System.out.println("Digite o nome da Cliente: ");
		String nome = teclado.next();	
		Cliente cli = new Cliente(nome);
		
		//Definindo o serviço
		System.out.println("Defina o serviço: ");
		int indice = teclado.nextInt();
		Servico serv = servicos.get(indice);
		
		//Definindo o profissional
		System.out.println("Defina o profissinal");
		indice = teclado.nextInt();
		Profissional  pro = profissionais.get(indice);
		
		//Declarando uma prestação de serviço
		PrestServico prest_serv = new PrestServico(serv,pro);
		
		//Criando o atendimento com o cliente a prestação de serviço no arraylist
		Atendimento atend = new Atendimento(cli,prest_serv);	
		atendimentos.add(atend);
		
		teclado.close();

	}
	
	//Criação de profissionais na arraylist
	public static void novoProfissional(String nome, int div) {
		//Criando um profissional e adicionando na arraylist
		Profissional p = new Profissional(nome, div);
		profissionais.add(p);
	}

	//Criação de Serviço na arraylist
	public static void novoServico(String nome) {
		//Criando o serviço e adicionando na arraylist
		Servico s = new Servico(nome);
		servicos.add(s);
	}
	public static void novoServico(String nome, float valor) {
		//Criando o serviço e adicionando na arraylist
		Servico s = new Servico(nome, valor);
		servicos.add(s);
	}
		
	//Método para imprimir atendimento
	public static void printAtendimento(int indice, int indice2) {

		System.out.println("Cliente: "  + atendimentos.get(indice).getCli().getNome());
		System.out.println("Profissional: " + atendimentos.get(indice).getPrestServ(indice2).getProfissional().getNome());
		System.out.println("Serviço: " + atendimentos.get(indice).getPrestServ(indice2).getServico().getNome());
	}

	/**Método para fechar atendimento
	 * 
	 * @param indice do atendimento na ArrayList atendimentos
	 * @param indice2 do 
	 */
	public static void fecharAtendimento(int indice, int indice2) {
		//Adicionando o valor na conta 
		atendimentos.get(indice).addFaturPro(indice2,atendimentos.get(indice).getValor(indice2));
		System.out.println("Atendimento de " + atendimentos.get(indice).getCli() + " foi finalizado.");
		//Removendo o atendimento do ArrayList
		atendimentos.remove(indice);
	}
}
