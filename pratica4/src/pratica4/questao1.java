package pratica4;

import java.util.Scanner;
import java.util.Arrays;

public class questao1 {

	public static void main(String[] args) {
		Scanner entrance = new Scanner(System.in);
		
		int[] notas = new int[10];
		int aux;
		int tamanhoVetor;
		int nota = 0;
		float mediaNotas = 0;
		
		for (int i = 0; i <= 9; i++) {
			System.out.println("Digite a nota do aluno" + i);
			nota = entrance.nextInt();
			
			notas[i] = nota;
			
			mediaNotas = mediaNotas + nota;
		}
		
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				if(notas[j]> notas[j+1]){
					aux = notas[j];
					notas[j] = notas[j+1];
					notas[j+1] = aux;
				}
			}
		}
		
		
		tamanhoVetor = notas.length;
		System.out.println("A maior nota é " + notas[tamanhoVetor - 1]);
		System.out.println("A segunda maior nota é " + notas[tamanhoVetor - 2]);
		System.out.println("A terceira maior nota é " + notas[tamanhoVetor - 3]);
		
		System.out.println("A média das notas é "+ mediaNotas / (tamanhoVetor - 1));
	}

}
