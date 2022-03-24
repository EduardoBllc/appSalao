import java.util.ArrayList;
import java.util.Scanner;

import appSalao.classes.Atendimento;
import appSalao.classes.Cliente;
import appSalao.classes.Profissional;
import appSalao.classes.Servico;

public class Main {
	
	//Criando uma lista de atendimentos de tamanho variável
	static ArrayList<Atendimento> atendimentos = new ArrayList<>();
	
	public static void main(String[] args) {
			
		//Criando os profissionais
		Profissional p1 = new Profissional("Duda");
		
		//Criando os serviços
		Servico s1 = new Servico("Design de sombrancelha");
		
		//Adicionando o novo atendimento à lista de atendimentos
		atendimentos.add(novoAtendimento(p1,s1));

		printAtendimento(0);
	}
	
	//Método criação atendimento
	public static Atendimento novoAtendimento(Profissional pro, Servico serv) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Criando o cliente
		System.out.println("Digite o nome da Cliente: ");
		String nome = teclado.next();	
		Cliente cli = new Cliente(nome);
		
		//Criando o atendimento com o cliente
		Atendimento atend = new Atendimento(cli,pro,serv);
		
		//Retornando o atendimento
		return atend;
		
	}
	
	//Método para imprimir atendimento
	public static void printAtendimento(int indice) {

		System.out.println("Cliente: "  + atendimentos.get(indice).getCli().getNome());
		System.out.println("Profissional: " + atendimentos.get(indice).getPro().getNome());
		System.out.println("Serviço: " + atendimentos.get(indice).getServ().getNome());
	}
}
