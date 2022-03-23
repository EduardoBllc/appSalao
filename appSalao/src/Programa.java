import java.util.ArrayList;
import java.util.Scanner;

import appSalao.classes.Atendimento;
import appSalao.classes.Cliente;
import appSalao.classes.Profissional;
import appSalao.classes.Servico;

public class Programa {

	public static void main(String[] args) {
		
		//Criando uma lista de atendimentos de tamanho variável
		ArrayList<Atendimento> atendimentos = new ArrayList<>();
		
		//Criando os profissionais
		Profissional p1 = new Profissional("Duda", 5);
		
		//Criando os serviços
		Servico s1 = new Servico("Design de sombrancelha");
		
		//Adicionando o novo atendimento à lista de atendimentos
		atendimentos.add(novoAtendimento(p1,s1));

		System.out.println(atendimentos.get(0).getCli().getNome());
	}
	
	public static Atendimento novoAtendimento(Profissional pro, Servico serv) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Criando o cliente
		String cli_nome = teclado.nextLine();
		Cliente cli = new Cliente(cli_nome);
		
		//Criando o atendimento com o cliente
		Atendimento a = new Atendimento(cli,pro,serv);
		
		teclado.close();
		
		//Retornando o atendimento
		return a;
		
		}
}
