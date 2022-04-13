import java.util.ArrayList;
import java.util.Scanner;

import appSalao.classes.Atendimento;
import appSalao.classes.Cliente;
import appSalao.classes.PrestServico;
import appSalao.classes.Profissional;
import appSalao.classes.Servico;

public class Main {
	
	//Criando uma lista de atendimentos de tamanho vari�vel
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

		//Criando os servi�os
		novoServico("Design de sombrancelha",30);//0
		novoServico("Extens�o de c�lios",150);//1
		novoServico("Make",90);//2
		novoServico("Bu�o",30);//3
		novoServico("Cabelo colorido");//4
		novoServico("Escova");//5
		novoServico("Corte");//6
		novoServico("Micropigmenta��o");//7
		
		//Adicionando o novo atendimento � lista de atendimentos
		novoAtendimento();

		//Adicionando outro servi�o
		addPrestServ(0);
		
		//Printando o atendimento
		printAtendimento(0,0);
		System.out.println("");
		
		fecharAtendimento(0);
		System.out.println("Os ganhos de " + profissionais.get(0) + " s�o R$" + profissionais.get(0).getGanhos()) ;
		
	}
	
	//M�todos
	
	/**
	 * M�todo cria��o atendimento
	 */
	public static void novoAtendimento() {
		
		//Criando o cliente		
		System.out.println("Digite o nome da Cliente: ");
		String nome = teclado.next();	
		Cliente cli = new Cliente(nome);
		
		//Definindo profissional
		Profissional pro = defProfissional();
		
		//Definindo servi�o
		Servico serv = defServico();
		
		//Declarando uma presta��o de servi�o
		PrestServico prest_serv = new PrestServico(pro,serv);
		
		//Criando o atendimento com o cliente a presta��o de servi�o no arraylist
		Atendimento atend = new Atendimento(cli,prest_serv);	
		atendimentos.add(atend);

	}
	
	/**
	 * Defini��o de servi�o
	 * @return servi�o
	 */
	public static Servico defServico() {

		System.out.println("Defina o servi�o: ");
		int indice = teclado.nextInt();
		Servico serv = servicos.get(indice);
		
		return serv;
	}
	
	/**
	 * Defini��o de profissional
	 * @return profissional
	 */
	public static Profissional defProfissional() {
		
		System.out.println("Defina o profissinal");
		int indice = teclado.nextInt();
		Profissional pro = profissionais.get(indice);
		
		return pro;
	}
	
	/**
	 * Adi��o de servi�o prestado no atendimento
	 * @param indice
	 */
	public static void addPrestServ(int indice) {
		
		PrestServico pserv = new PrestServico(defProfissional(),defServico());
		atendimentos.get(indice).getAllPrestServ().add(pserv);
		System.out.println("O servi�o \"" + pserv.getServico().getNome() + "\" foi adicionado ao atendimento de " + atendimentos.get(indice).getNomeCliente());
	}
	
	/** 
	 * Cria��o de profissionais na arraylist
	 * @param nome
	 * @param div de faturamento
	 */
	public static void novoProfissional(String nome, int div) {
		//Criando um profissional e adicionando na arraylist
		Profissional p = new Profissional(nome, div);
		profissionais.add(p);
	}

	/**
	 * Cria��o de Servi�o na arraylist
	 * @param nome
	 */
	public static void novoServico(String nome) {
		//Criando o servi�o e adicionando na arraylist
		Servico s = new Servico(nome);
		servicos.add(s);
	}
	public static void novoServico(String nome, float valor) {
		//Criando o servi�o e adicionando na arraylist
		Servico s = new Servico(nome, valor);
		servicos.add(s);
	}
			
	/**
	 * M�todo para imprimir atendimento
	 * @param indice
	 * @param indice2
	 */
	public static void printAtendimento(int indice, int indice2) {

		System.out.println("Cliente: "  + atendimentos.get(indice).getCli().getNome() + "\n");
		int i;
		for(i = 0; i < atendimentos.get(indice).getAllPrestServ().size(); i ++) {
			System.out.println("Servi�o " + (i +1) + ":");
			System.out.println("Servi�o: " + atendimentos.get(indice).getPrestServ(i).getServico().getNome());
			System.out.println("Profissional: " + atendimentos.get(indice).getPrestServ(i).getProfissional().getNome() + "\n");
		}
	}

	/**
	 * M�todo para fechar atendimento
	 * @param indice do atendimento na ArrayList atendimentos
	 */
	public static void fecharAtendimento(int indice) {
		int i;
		//Adicionando o valor na conta 
		for(i = 0; i < (atendimentos.get(indice).getAllPrestServ().size() - 1); i++);
		{
			atendimentos.get(indice).addFaturPro(i,atendimentos.get(indice).getValor(i));
			faturamento += atendimentos.get(indice).getValor(i);
		}
		System.out.println("Atendimento de " + atendimentos.get(indice).getCli() + " foi finalizado.");
		//Removendo o atendimento do ArrayList
		atendimentos.remove(indice);
	}
}
