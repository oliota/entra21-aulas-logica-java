package br.com.entra21.aula14.matrizes;

import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);
	// definindo minha variavel entrada do tipo Scanner acessivel em toda a classe Main
	// como o metodo main é static, tanto metodos ou variaveis devem ser static para se relacionarem com o metodo main

	public static void main(String[] args) {

		byte opcao;

		do {
			System.out.println(escreverMenuMatrizes());
			opcao = entrada.nextByte();
			switch (opcao) {
			case 0: System.out.println("Saindo..."); break;
			case 1: aprenderMatrizesSimples(); break;
			case 2: aprenderMatrizesInicializadas(); break;
			default: System.out.println("Para!!! O menu ta simples , só 1 ou 2"); break;

			}

		} while (opcao != 0);
		System.out.println("Fim da aula sobre matrizes");

	}

	private static String escreverMenuMatrizes() {
		String conteudoMenu = "";
		conteudoMenu += "Escolha uma opção para aprender:\n";
		conteudoMenu += "\t1 - Inicializando matrizes com tamanho definidos\n";
		conteudoMenu += "\t2 - Inicializando matrizes com valores predeterminados\n";
		return conteudoMenu;
	}

	private static void aprenderMatrizesSimples() {
		System.out.println("Aprendendo sobre matrizes simples");

		System.out.println("Armazenar as 3 notas de todos os 10 alunos");
		float notas[][];
		notas = new float[10][5];// aqui eu defini diretamente no código o tamanho da minha matriz
		// primeiro indice é a quantidade de vetores
		// segundo indice é a capacidade de cada vetor
		// apenas no nivel ficam os valores
		
		byte quantidadeAlunos,quantidadeNotas;
		System.out.println("Informe a quantidade de alunos");
		quantidadeAlunos= entrada.nextByte();
		
		System.out.println("Informe a quantidade de notas para cada aluno");
		quantidadeNotas= entrada.nextByte();
		
		//quem decide o tamanho da minha matriz é o usuario
		float novasNotas[][]= new float[quantidadeAlunos][quantidadeNotas];
		
		for(byte aluno=0;aluno<novasNotas.length; aluno++) {
			System.out.println("Nessa posição ["+aluno+"] temos "+novasNotas[aluno].length+ " notas");
			for(byte nota=0; nota< novasNotas[aluno].length ; nota++) {
				System.out.println("\t valor da nota ["+nota+"]  ===> "+ novasNotas[aluno][nota]);
			}
			
		}
		
		System.out.println("Confiando que tenho no minimo 2 alunos");
		System.out.println("Olha as notas do segundo aluno");
		System.out.println(novasNotas[1][0]);
		System.out.println(novasNotas[1][1]);
		System.out.println(novasNotas[1][2]);

	}

	private static void aprenderMatrizesInicializadas() {
		System.out.println("Aprendendo sobre matrizes inicializadas e irregulares");
		
		
		float salarioAlunos[][]= {
				{1000  , 1250.50f , 2500.35f},//   ===>>  [0][0] |  [0][1]  |  [0][2]
				{2600  , 3500     , 4500    },//   ===>>  [1][0] |  [1][1]  |  [1][2]
				{50000 , 150000   , 2000000 },//   ===>>  [2][0] |  [2][1]  |  [2][2]
				{50000 , 150000   , 2000000 },//   ===>>  [3][0] |  [3][1]  |  [3][2]
 		};//length 4
		
		
		byte matrizIrregular[][]= {
				{1,2,3,4,5,6,7},// length 7	
				{4,3,2,1}, // length 4	
				{10,12}, // length 2	
				{-127,0,127}, // length 3	
		};//length 4
		
		String ementas[][]= {
			{"Metodologias ágeis","introdução","metodologias","git"},
			{"lógica com java","variaveis","constantes","comentários","desvios condicionais","laços de repetição"},
			{"POO","Classes","Objetos","Herança","Polimorfismo","Encapsulamento","conceitos"},
			
		};// length 3

	}

}
