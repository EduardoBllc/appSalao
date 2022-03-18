package appSalao.classes;

import java.util.Scanner;

public class Profissionais {
	protected boolean servicos[] = new boolean[5];
	private String nome;

	
	public boolean getServicos(int i) {
		return this.servicos[i];
	}
	
	public Profissionais(String nome, int qtd) {
		Scanner teclado = new Scanner(System.in);
		this.nome = nome;
		int set_servicos[] = new int[qtd];
		
		for(int i = 0; i < set_servicos.length;i ++) {
			set_servicos[i] = teclado.nextInt();			
			servicos[set_servicos[i]] = true;
		}
		
		teclado.close();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimeServicos() {
		for(int i = 0; i < servicos.length; i ++) {
			System.out.println("servicos[" + i + "] = " + servicos[i] );
		}
	}
}

