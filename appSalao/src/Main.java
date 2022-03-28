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
		novoProfissional("Duda",01234);
		novoProfissional("Aline",12609);

		//Criando um produto
		Produto prod1 = new Produto("Perfume", 60);
			
		//Criando os serviços e adicionando na Array List
		novoServico("Design de sombrancelha");//0
		novoServico("Extensão de cílios");//1
		novoServico("Make");//2
		novoServico("Buço");//3
		novoServico("Cabelo colorido");//4
		
		
		//Adicionando o novo atendimento à lista de atendimentos
		atendimentos.add(novoAtendimento());
		
		//Printando o atendimento
		printAtendimento(0,0);
		System.out.println("");
		
		//adicionando o produto
		atendimentos.get(0).addProduto(prod1);
	}
	
	
	//Métodos
	
	//Método criação atendimento
	public static Atendimento novoAtendimento() {
		
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
	
	//Método de criação e adição de profissional no array list
	public static void novoProfissional(String nome, int cod) {
		//Criando um profissional
		Profissional p = new Profissional(nome);
		//Transformando a int cod em uma string e depois usando ela como um char array em um foreach para transformar cada caractere em um código separado
		for(char num: String.valueOf(cod).toCharArray()) {
			//Transformando o char num do laço foreach em uma string para poder transformá-lo em uma int e passando para o método addServico como um índice
			p.addServico(Integer.parseInt(String.valueOf(num)));
		}
		//Adicionando profissional na arraylist
		profissionais.add(p);
	}

	public static void novoServico(String nome) {
		Servico s = new Servico(nome);
		servicos.add(s);
	}
}
