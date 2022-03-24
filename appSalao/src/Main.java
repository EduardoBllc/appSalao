import java.util.ArrayList;
import java.util.Scanner;

import appSalao.classes.Atendimento;
import appSalao.classes.Cliente;
import appSalao.classes.Profissional;
import appSalao.classes.Servico;

public class Main {
	
	//Criando uma lista de atendimentos de tamanho vari�vel
	static ArrayList<Atendimento> atendimentos = new ArrayList<>();
	
	public static void main(String[] args) {
			
		//Criando os profissionais
		Profissional p1 = new Profissional("Duda");
		
		//Criando os servi�os
		Servico s1 = new Servico("Design de sombrancelha");
		
		//Adicionando o novo atendimento � lista de atendimentos
		atendimentos.add(novoAtendimento(p1,s1));

		printAtendimento(0);
	}
	
	//M�todo cria��o atendimento
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
	
	//M�todo para imprimir atendimento
	public static void printAtendimento(int indice) {

		System.out.println("Cliente: "  + atendimentos.get(indice).getCli().getNome());
		System.out.println("Profissional: " + atendimentos.get(indice).getPro().getNome());
		System.out.println("Servi�o: " + atendimentos.get(indice).getServ().getNome());
	}
}
