package pratica4;

import java.util.Scanner;
import java.util.ArrayList;

public class questao3 {

	public static void main(String[] args) {
		Scanner escreva = new Scanner(System.in);
		
		String item, autor, data, descricao, local;
		int options, menu;
		
		ArrayList<String> arrayItens = new ArrayList();
		
		
		for(int i=0; i<10; i++) {
			
		System.out.println("Escolha sua opção: \n1 - Cadastrar Item Perdido \n2 - Buscar Item \n3 - Sair");
		
		options = escreva.nextInt();
		
		 switch(options) {
		 
		 	 case 1:
				 System.out.println("Informe o item: ");
				 item = escreva.next();
				 System.out.println("Informe o autor: ");
				 autor = escreva.next();
				 System.out.println("Informe a data: ");
				 data = escreva.next();
				 System.out.println("Informe a descricao: ");
				 descricao = escreva.next();
				 System.out.println("Informe o local: ");
				 local = escreva.next();
			 
				 arrayItens.add(item+" / "+autor+" / "+data+" / "+descricao+" / "+local);
			 break;
			 
		 	 case 2:
		 		System.out.printf("Listando itens cadastrados\n");
		 	    int n = arrayItens.size();
		 	    for (i=0; i<n; i++) {
		 	      System.out.printf("Posição %d- %s\n", i, arrayItens.get(i));
		 	    }
		 	    System.out.println("Encontrou seu item? Informe a posição para retira-lo \nCaso nao tenha encontrado seu item digite -1");
		 	    menu = escreva.nextInt();
		 	    if(menu<=10 && menu>=0) {		 	    	
		 	    System.out.println("Item Encontrado na posição "+menu+" e Recuperado com Sucesso!");
		 	    }else if(menu==-1) {
		 	    	System.out.println("Retornando ao menu principal");
		 	    }else
		 	    	System.out.println("Opção inválida!");
		 	    
		 	 case 3:
		 		 System.exit(0);

		 	}
		 }	
	}

}
