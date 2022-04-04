import java.util.ArrayList;
import java.util.Scanner;

import appSalao.classes.Atendimento;
import appSalao.classes.Cliente;
import appSalao.classes.PrestServico;
import appSalao.classes.Profissional;
import appSalao.classes.Servico;

public class Main {
	
	//Criando uma lista de atendimentos de tamanho vari�vel
	static ArrayList<Atendimento> atendimentos = new ArrayList<>();
	static ArrayList<Profissional> profissionais = new ArrayList<>();
	static ArrayList<Servico> servicos = new ArrayList<>();
	
	public static void main(String[] args) {
			
		//Criando os profissionais 
		novoProfissional("Duda");//0
		novoProfissional("Aline");//1
		novoProfissional("Gabi");//2
		novoProfissional("Geovana");//3
		novoProfissional("Vaninha");//4

		//Criando os servi�os
		novoServico("Design de sombrancelha");//0
		novoServico("Extens�o de c�lios");//1
		novoServico("Make");//2
		novoServico("Bu�o");//3
		novoServico("Cabelo colorido");//4
		novoServico("Escova");//5
		novoServico("Corte");//6
		novoServico("Micropigmenta��o");//7
		
		
		//Criando os produto
//		Produto prod1 = new Produto("Perfume", 60);
//		Produto prod2 = new Produto("Blusa", 90);
//		Produto prod3 = new Produto("Cal�a", 150);
		
		//Adicionando o novo atendimento � lista de atendimentos
		novoAtendimento();
		
		//Printando o atendimento
		printAtendimento(0,0);
		System.out.println("");
		
		//adicionando o produto
//		atendimentos.get(0).addProduto(prod1);
	}
	
	
	//M�todos
	
	//M�todo cria��o atendimento
	public static void novoAtendimento() {
		
		Scanner teclado = new Scanner(System.in);
		
		//Criando o cliente		
		System.out.println("Digite o nome da Cliente: ");
		String nome = teclado.next();	
		Cliente cli = new Cliente(nome);
		
		//Definindo o servi�o
		System.out.println("Defina o servi�o: ");
		int indice = teclado.nextInt();
		Servico serv = servicos.get(indice);
		
		//Definindo o profissional
		System.out.println("Defina o profissinal");
		indice = teclado.nextInt();
		Profissional  pro = profissionais.get(indice);
		
		//Declarando uma presta��o de servi�o
		PrestServico prest_serv = new PrestServico(serv,pro);
		
		//Criando o atendimento com o cliente a presta��o de servi�o no arraylist
		Atendimento atend = new Atendimento(cli,prest_serv);	
		atendimentos.add(atend);
		
		teclado.close();

	}
	
	//Cria��o de profissionais na arraylist
	public static void novoProfissional(String nome) {
		//Criando um profissional e adicionando na arraylist
		Profissional p = new Profissional(nome);
		profissionais.add(p);
	}

	//Cria��o de Servi�o na arraylist
	public static void novoServico(String nome) {
		//Criando o servi�o e adicionando na arraylist
		Servico s = new Servico(nome);
		servicos.add(s);
	}
		
	//M�todo para imprimir atendimento
	public static void printAtendimento(int indice, int indice2) {

		System.out.println("Cliente: "  + atendimentos.get(indice).getCli().getNome());
		System.out.println("Profissional: " + atendimentos.get(indice).getPrestServ(indice2).getProfissional().getNome());
		System.out.println("Servi�o: " + atendimentos.get(indice).getPrestServ(indice2).getServico().getNome());
	}

	public static void fecharAtendimento(int indice) {
		
		atendimentos.remove(indice);
	}
}
