import java.util.ArrayList;
import java.util.Scanner;

import appSalao.classes.Atendimento;
import appSalao.classes.Cliente;
import appSalao.classes.Produto;
import appSalao.classes.Profissional;
import appSalao.classes.Servico;

public class Main {
	
	//Criando uma lista de atendimentos de tamanho vari�vel
	static ArrayList<Atendimento> atendimentos = new ArrayList<>();
	static ArrayList<Profissional> profissionais = new ArrayList<>();
	static ArrayList<Servico> servicos = new ArrayList<>();
	
	public static void main(String[] args) {
			
		//Criando os profissionais
		Profissional p1 = new Profissional("Duda");

		//Adicionando os servi�os para o profissional
		p1.addServico(0);
		p1.addServico(1);
		p1.addServico(2);
		p1.addServico(3);
		p1.addServico(4);
		
		//Adicionando o profissional na ArrayList
		profissionais.add(p1);
		
		//Criando um produto
		Produto prod1 = new Produto("Perfume", 60);
			
		//Criando os servi�os e adicionando na Array List
		Servico s1 = new Servico("Design de sombrancelha");
		servicos.add(s1);
		
		//Adicionando o novo atendimento � lista de atendimentos
		atendimentos.add(novoAtendimento());
		
		//Printando o atendimento
		printAtendimento(0);
		System.out.println("");
		
		//adicionando o produto
		atendimentos.get(0).addProduto(prod1);
	}
	
	//M�todo cria��o atendimento
	public static Atendimento novoAtendimento() {
		
		//Iniciando vari�veis necess�rias
		Scanner teclado = new Scanner(System.in);
		int indice;
		Servico serv;
		Profissional pro;
		
		//Criando o cliente		
		System.out.println("Digite o nome da Cliente: ");
		String nome = teclado.next();	
		Cliente cli = new Cliente(nome);
		
		//Definindo o servi�o
		System.out.println("Defina o servi�o: ");
		indice = teclado.nextInt();
		serv = servicos.get(indice);
		
		//Definindo o profissional
		System.out.println("Defina o profissinal");
		indice = teclado.nextInt();
		pro = profissionais.get(indice);
		
		//Criando o atendimento com o cliente
		Atendimento atend = new Atendimento(cli,serv,pro);
		
		teclado.close();
		
		//Retornando o atendimento
		return atend;
	}
	
	//M�todo para imprimir atendimento
	public static void printAtendimento(int indice) {

		System.out.println("Cliente: "  + atendimentos.get(indice).getCli().getNome());
		System.out.println("Profissional: " + atendimentos.get(indice).getPro().getNome());
		System.out.println("Servi�o: " + atendimentos.get(indice).getServ().getNome());
	}
}
