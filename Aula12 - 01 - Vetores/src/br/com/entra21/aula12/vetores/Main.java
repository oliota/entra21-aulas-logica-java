package br.com.entra21.aula12.vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Aprendendo sobre Vetores
		Scanner inPut = new Scanner(System.in);
		byte option;

		do {
			System.out.println("0- Exit");
			System.out.println("01- Declarando Vetores");
			System.out.println("02- Acessando Índices");
			System.out.println("03- Atribuindo Valores e Índices");
			System.out.println("04- Médias com Valores");
			option = inPut.nextByte();

			switch (option) {

			case 0:
				// meu case vazio só para não cair no default porque o zero atende a condição no
				// menu
				break;

			case 1:
				// chamada de função
				declararVetores(); // dentro desses paranteses estariam meus argumentos
				break;

			case 2:
				// chama o caso 2 02- Acessando Índices
				acessarIndices();
				break;

			case 3:
				// Atualizar valores
				atualizarValores();
				break;
			case 4:
				calcularMediaComVetores();
				break;
			}

		} while (option != 0); // Condição atendida enquanto o user não digitar 0

	}

	public static void declararVetores() { // aqui dentro do parênteses estão os parametros
		System.out.println("Aprendendo sobre Vetores");

		byte idades[]; // Primeiro, criar a variável que é um vetor de algum tipo

		idades = new byte[15]; // Segundo, definir o tamanho

		System.out.println("O tamanho é " + idades.length); // Depois, usar ou atualizar

		// como acessar cada posição e ver oq tem nela
		float notas[] = { 1, 3.5f, 8 }; // Criei a variável e 2 defini o tamanho e os valores

	}

	public static void acessarIndices() {
		System.out.println("Aprendendo sobre Vetores");

		byte idades[]; // Primeiro, criar a variável que é um vetor de algum tipo

		idades = new byte[15]; // Segundo, definir o tamanho

		System.out.println("O tamanho é " + idades.length); // Depois, usar ou atualizar
		System.out.println("O que tem no indice [1] " + idades[1]);
		System.out.println("O que tem no ultimo indice " + idades[2]);

	}

	public static void atualizarValores() {
		float notas[] = { 1, 3.5f, 8 }; // Criei a variável e 2 defini o tamanho e os valores
		notas[0] = 33; // manda uma nota para o índice "0"
		notas[2] = 12; // manda uma nota para o índice "2"

	}

	public static void calcularMediaComVetores() {
		Scanner entrada = new Scanner(System.in);
		float notas[] = new float[2];

		for (byte contador = 0; contador < notas.length; contador++) {
			// System.out.println("Contagem em "+contador);
			System.out.println("Informe a " + (contador + 1) + "ª nota:");
			notas[contador] = entrada.nextFloat();

		}
		System.out.println("A segunda nota foi " + notas[1]);
		float soma = 0;
		for (byte contador = 0; contador < notas.length; contador++) {
			System.out.println(notas[contador]);
			soma = soma + notas[contador];
		} 
		
		
		System.out.println("Soma = "+soma);
		System.out.println("Média = "+ soma/notas.length);
	}
}