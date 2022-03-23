package appSalao.classes;

import java.util.ArrayList;
import java.util.Scanner;

/*
00 Design
01 Cílios
02 Make
03 Buço
04 Cabelo colorido
05 Penteado
06 Micro
07 Escova
08 Mechas
09 Pintura
10 Micropigmentação
11 Botox
12 Corte
*/

public class Profissional {
	protected boolean servicos[] = new boolean[13];
	private String nome;

	public Profissional(String nome, int qtd) {
		Scanner teclado = new Scanner(System.in);
		this.nome = nome;
		
		//Definir array de ints com a quantidade de serviços prestados e seus números
		int set_servicos[] = new int[qtd];
		
		System.out.println("Digite os código de serviço: ");
		for(int i = 0; i < set_servicos.length;i ++) {
			//Usando os elementos da array de ints dos serviços como indice para validar na array de serviços
			set_servicos[i] = teclado.nextInt();			
			servicos[set_servicos[i]] = true;
		}
		
		teclado.close();
	}
	
	//Getters
	public String getNome() {
		return this.nome;
	}	
	public boolean getServicos(int i) {
		return this.servicos[i];
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimeServicos() {
		for(int i = 0; i < servicos.length; i ++) {
			System.out.println("servicos[" + i + "] = " + servicos[i] );
		}
	}
}

