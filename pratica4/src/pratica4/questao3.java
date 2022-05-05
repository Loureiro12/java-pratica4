package pratica4;

import java.util.Scanner;
import java.util.ArrayList;

public class questao3 {

	public static void main(String[] args) {
		Scanner entrance = new Scanner(System.in);
		
		ArrayList<String> itens = new ArrayList();
		
		int opcao;
		String nomeItem;
		String autor;
		String local;
		String data;
		String descricao;
		
		
		System.out.println("Escolha uma das opcoes abaixo: ");
		System.out.println("(1) Cadastrar Item Perdido");
		System.out.println("(2) Buscar Item");
		System.out.println("(3) Sair");

		opcao = entrance.nextInt();
		
		switch(opcao) {
		case 1: 
			
			
			System.out.println("Digite o nome do item perdido: ");
			nomeItem = entrance.next();
			
			System.out.println("Digite o nome do autor do iten: ");
			autor = entrance.next();
			
			System.out.println("Digite o nome do autor do iten: ");
			autor = entrance.next();
			
			System.out.println("Digite o local do iten: ");
			local = entrance.next();
			
			System.out.println("Digite a data do iten: ");
			data = entrance.next();
			
			System.out.println("Digite a descricao do iten: ");
			descricao = entrance.next();
			
			
		case 2:
			
		case 3:
		}
	}

}
