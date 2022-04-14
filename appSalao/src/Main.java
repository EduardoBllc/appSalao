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
	
	static Scanner teclado = new Scanner(System.in);
	
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
		novoAtendimento(profissionais.get(0), servicos.get(1));

		//Adicionando outro serviço
		addPrestServ(0,profissionais.get(0), servicos.get(2));
		
		//Printando o atendimento
		printAtendimento(0);
		
		fecharAtendimento(0);
		System.out.println("Os ganhos de " + profissionais.get(0) + " são R$" + profissionais.get(0).getGanhos()) ;
		
	}
	
	//Métodos
	
	/**
	 * Definição de serviço
	 * @return serviço
	 */
	public static Servico defServico() {

		System.out.println("Defina o serviço: ");
		int indice = teclado.nextInt();
		Servico serv = servicos.get(indice);
		
		return serv;
	}
	
	/**
	 * Definição de profissional
	 * @return profissional
	 */
	public static Profissional defProfissional() {
		
		System.out.println("Defina o profissinal");
		int indice = teclado.nextInt();
		Profissional pro = profissionais.get(indice);
		
		return pro;
	}
	
	/**
	 * Adição de serviço prestado no atendimento
	 * @param indice
	 */
	public static void addPrestServ(int indice) {
		PrestServico pserv = new PrestServico(defProfissional(),defServico());
		atendimentos.get(indice).getAllPrestServ().add(pserv);
		System.out.println("O serviço \"" + pserv.getServico().getNome() + "\" com " + pserv.getProfissional() +  " foi adicionado ao atendimento de " + atendimentos.get(indice).getCliente());
	}
	/**
	 * Adição de serviço prestado no atendimento
	 * @param indice
	 * @param profissional
	 * @param serviço
	 */
	public static void addPrestServ(int indice, Profissional pro, Servico serv) {
		PrestServico pserv = new PrestServico(pro,serv);
		atendimentos.get(indice).getAllPrestServ().add(pserv);
		System.out.println("O serviço \"" + pserv.getServico().getNome() + "\" com " + pserv.getProfissional() +  " foi adicionado ao atendimento de " + atendimentos.get(indice).getCliente());
	}
	
	/** 
	 * Criação de profissionais na arraylist
	 * @param nome
	 * @param div de faturamento
	 */
	public static void novoProfissional(String nome, int div) {
		//Criando um profissional e adicionando na arraylist
		Profissional p = new Profissional(nome, div);
		profissionais.add(p);
	}

	/**
	 * Criação de Serviço na arraylist
	 * @param nome
	 */
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
	
	/**
	 * Método criação de atendimento
	 */
	public static void novoAtendimento() {
		
		//Criando o cliente		
		System.out.println("Digite o nome da Cliente: ");
		String nome = teclado.nextLine();	
		Cliente cli = new Cliente(nome);
		
		//Definindo profissional
		Profissional pro = defProfissional();
		
		//Definindo serviço
		Servico serv = defServico();
		
		//Declarando uma prestação de serviço
		PrestServico prest_serv = new PrestServico(pro,serv);
		
		//Criando o atendimento com o cliente a prestação de serviço no arraylist
		Atendimento atend = new Atendimento(cli,prest_serv);	
		atendimentos.add(atend);
	}
	/**
	 * Método criação de atendimento
	 * @param profissional
	 * @param serviço
	 */
	public static void novoAtendimento(Profissional pro, Servico serv) {
		
		//Criando o cliente		
		System.out.println("Digite o nome da Cliente: ");
		String nome = teclado.nextLine();	
		Cliente cli = new Cliente(nome);
		
		//Declarando uma prestação de serviço
		PrestServico prest_serv = new PrestServico(pro,serv);
				
		//Criando o atendimento com o cliente a prestação de serviço no arraylist
		Atendimento atend = new Atendimento(cli,prest_serv);	
		atendimentos.add(atend);
		
	}
	
	/**
	 * Método para imprimir atendimento
	 * @param indice
	 */
	public static void printAtendimento(int indice) {

		System.out.println("Cliente: "  + atendimentos.get(indice).getCliente().getNome() + "\n");
		for(int i = 0; i < atendimentos.get(indice).getAllPrestServ().size(); i ++) {
			System.out.println("Serviço " + (i +1) + ":");
			System.out.println("Serviço: " + atendimentos.get(indice).getPrestServ(i).getServico().getNome());
			System.out.println("Profissional: " + atendimentos.get(indice).getPrestServ(i).getProfissional().getNome() + "\n");
		}
	}

	/**
	 * Método para fechar atendimento
	 * @param indice do atendimento na ArrayList atendimentos
	 */
	public static void fecharAtendimento(int indice) {
		//Adicionando o valor na conta 
		for(int i = 0; i < atendimentos.get(indice).getAllPrestServ().size(); i++)
		{
			atendimentos.get(indice).addFaturPro(i,atendimentos.get(indice).getValor(i));
			faturamento += atendimentos.get(indice).getValor(i);
		}

		System.out.println("Atendimento de " + atendimentos.get(indice).getCliente() + " foi finalizado.");
		//Removendo o atendimento do ArrayList
		atendimentos.remove(indice);
	}

}
