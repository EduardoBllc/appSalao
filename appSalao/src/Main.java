import java.util.ArrayList;
import java.util.Scanner;

import appSalao.classes.Atendimento;
import appSalao.classes.Cliente;
import appSalao.classes.PrestServico;
import appSalao.classes.Produto;
import appSalao.classes.Profissional;
import appSalao.classes.Servico;

public class Main {
	
	//Criando uma lista de atendimentos de tamanho variável
	static ArrayList<Atendimento> atendimentos = new ArrayList<>();
	static ArrayList<Profissional> profissionais = new ArrayList<>();
	static ArrayList<Servico> servicos = new ArrayList<>();
	
	public static void main(String[] args) {
			
		//Criando os profissionais
		Profissional p1 = new Profissional("Duda");

		//Adicionando os serviços para o profissional
		p1.addServico(0);
		p1.addServico(1);
		p1.addServico(2);
		p1.addServico(3);
		p1.addServico(4);
		
		//Adicionando o profissional na ArrayList
		profissionais.add(p1);
		
		//Criando um produto
		Produto prod1 = new Produto("Perfume", 60);
			
		//Criando os serviços e adicionando na Array List
		Servico s1 = new Servico("Design de sombrancelha");
		servicos.add(s1);
		
		//Adicionando o novo atendimento à lista de atendimentos
		atendimentos.add(novoAtendimento());
		
		//Printando o atendimento
		printAtendimento(0,0);
		System.out.println("");
		
		//adicionando o produto
		atendimentos.get(0).addProduto(prod1);
	}
	
	//Método criação atendimento
	public static Atendimento novoAtendimento() {
		
		//Iniciando variáveis necessárias
		Scanner teclado = new Scanner(System.in);
		int indice;
		PrestServico prest_serv;
		Profissional pro;
		
		//Criando o cliente		
		System.out.println("Digite o nome da Cliente: ");
		String nome = teclado.next();	
		Cliente cli = new Cliente(nome);
		
		//Definindo o serviço
		System.out.println("Defina o serviço: ");
		indice = teclado.nextInt();
		Servico serv = servicos.get(indice);
		
		//Definindo o profissional
		System.out.println("Defina o profissinal");
		indice = teclado.nextInt();
		pro = profissionais.get(indice);
		
		prest_serv = new PrestServico(serv,pro);
		
		//Criando o atendimento com o cliente
		Atendimento atend = new Atendimento(cli,prest_serv);
		
		teclado.close();
		
		//Retornando o atendimento
		return atend;
	}
	
	//Método para imprimir atendimento
	public static void printAtendimento(int indice, int indice2) {

		System.out.println("Cliente: "  + atendimentos.get(indice).getCli().getNome());
		System.out.println("Profissional: " + atendimentos.get(indice).getPrestServ(indice2).getProfissional().getNome());
		System.out.println("Serviço: " + atendimentos.get(indice).getPrestServ(indice2).getServico().getNome());
	}
}
