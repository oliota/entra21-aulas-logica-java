package br.com.entra21.aula15.exercicios.matrizes;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte option;

		do {

			System.out.println(escreverMenu());
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				criarMatriz2Niveis();
				break;

			case 2:
				initializeMatrix2Levels();
				break;

			case 3:
				criarMatrizes5vetores3posicoes();
				break;

			case 4:
				solicitarTamanhoMatrizParaPreencher();
				break;

			default:
				System.out.println("Digite uma opção válida");
				break;
			}

		} while (option != 0);

	}

	public static String escreverMenu() {

		String menu = "Escolha uma das opções no meu menu:\n";

		menu = menu + "\t0 - Sair\n";
		menu += "\t1 - Criar matriz de 2 níveis";
		menu += "\t2 - Inicializar matriz de 2 níveis";
		menu += "\t3 - Criar matriz de 5 vetores com 3 itens de capacidade em cada";
		menu += "\t4 - Criar matriz de quantos vetores e detalhes, conforme o desejo do usuario";

		return menu;
	}

	public static void criarMatriz2Niveis() {

		char matrizChars[][] = new char[2][3]; // dois vetores onde cada um pode armazenar 3 letras
		boolean matrizBooleans[][];
		matrizBooleans = new boolean[2][4]; // dois vetores onde cada um pode armazenar 4 valores lógicos
		byte matrizBytes[][] = new byte[4][3];
		short matrizShorts[][] = new short[2][3];
		int matrizInts[][] = new int[3][2];
		long matrizLongs[][] = new long[3][5];
		float matrizFloats[][] = new float[3][4];
		double matrizDoubles[][] = new double[5][3];

		System.out.println(
				"matrizChars tamanho =  " + matrizChars.length + " e cada vetor tem tamanho " + matrizChars[0].length);
		System.out.println("matrizBooleans tamanho =  " + matrizBooleans.length + " e cada vetor tem tamanho "
				+ matrizBooleans[0].length);
		System.out.println(
				"matrizBytes tamanho =  " + matrizBytes.length + " e cada vetor tem tamanho " + matrizBytes[0].length);
		System.out.println("matrizShorts tamanho =  " + matrizShorts.length + " e cada vetor tem tamanho "
				+ matrizShorts[0].length);
		System.out.println(
				"matrizInts tamanho =  " + matrizInts.length + " e cada vetor tem tamanho " + matrizInts[0].length);
		System.out.println(
				"matrizLongs tamanho =  " + matrizLongs.length + " e cada vetor tem tamanho " + matrizLongs[0].length);
		System.out.println("matrizFloats tamanho =  " + matrizFloats.length + " e cada vetor tem tamanho "
				+ matrizFloats[0].length);
		System.out.println("matrizDoubles tamanho =  " + matrizDoubles.length + " e cada vetor tem tamanho "
				+ matrizDoubles[0].length);

	}

	public static void initializeMatrix2Levels() {
//      2- Criar matrizes de 2 níveis inicializados para cada tipo primitivo e exibir o tamanho deles no console
//      Verificar os detalhes na perspectiva DEBUG

		char matrizChars[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 'A', 'E', 'V' }, { 'R', 'D', 'O' }, { 'F', 'F', 'C', 'A' }, // irregular porque tem tamanhos diferente
																				// de index
		};

		boolean matrizBooleans[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ true, false, true, false }, { true, false, true, false }, { true, false, true, false },
				// regular
				// porque
				// todos a
				// mesma
				// capacidade
				// de itens
				// por
				// vetores
		};

		byte matrizBytes[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 10, 20, 30, 44, 50 }, { 11, 22, 33 }, { 13, 24 }, { 18 }, // irregular porque tem tamanhos diferente
																			// de index
		};

		short matrizShorts[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 300, 400, 1000 }, { 500, 600, 100 }, { 1000, 4000, 5000 }, // regular porque todos a mesma capacidade
																				// de itens por vetores
		};

		int matrizInts[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 100 }, { 200 }, { 10000 }, // regular porque todos a mesma capacidade de itens por vetores
		};

		long matrizLongs[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 300, 400, 500, 600 }, { 10000000, 5000000, 300 }, { 1000000, 100000 }, // irregular porque tem
																							// tamanhos diferente de
																							// index

		};

		float matrizFloats[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 100000f }, { 20000f, 30000f }, { 30000000000f }, // irregular porque tem tamanhos diferente de index
		};

		double matrizDouble[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 100, 400, 500 }, { 100, 200, 400 }, { 1000, 4000, 5000, 6000 }, // irregular porque tem tamanhos
																					// diferente de index
		};

	}

	public static void criarMatrizes5vetores3posicoes() {

		byte matrizBytes[][] = new byte[5][3];

		System.out.println("Para o primeiro vetor, informe o primeiro valor:");
		matrizBytes[0][0] = input.nextByte();

		System.out.println("Para o primeiro vetor, informe o segundo valor:");
		matrizBytes[0][1] = input.nextByte();

		System.out.println("Para o primeiro vetor, informe o terceiro valor:");
		matrizBytes[0][2] = input.nextByte();

		// --------------------------------------------------------------------

		System.out.println("Para o segundo vetor, informe o primeiro valor:");
		matrizBytes[1][0] = input.nextByte();

		System.out.println("Para o segundo vetor, informe o segundo valor:");
		matrizBytes[1][1] = input.nextByte();

		System.out.println("Para o segundo vetor, informe o terceiro valor:");
		matrizBytes[1][2] = input.nextByte();

		for (byte vetor = 2; vetor < matrizBytes.length; vetor++) {// [2][3][4]// Continuando minha captura com FOR

			for (byte detalhe = 0; detalhe < matrizBytes[vetor].length; detalhe++) {
				System.out.println("Para o " + (vetor + 1) + "ª vetor informe o " + (detalhe + 1) + "ª valor");
				matrizBytes[vetor][detalhe] = input.nextByte();

			}
		}

	}

	public static void solicitarTamanhoMatrizParaPreencher() {

		byte tamanhoVetor, tamanhoDetalhe;
		byte matrizBytes[][];

		System.out.println("Quantos vetores vc quer na sua matriz: ");
		tamanhoVetor = input.nextByte();
		System.out.println("Quantos itens vc quer em cada vetor: ");
		tamanhoDetalhe = input.nextByte();

		matrizBytes = new byte[tamanhoVetor][tamanhoDetalhe];

		for (byte vetor = 0; vetor < matrizBytes.length; vetor++) {

			for (byte detalhe = 0; detalhe < matrizBytes[vetor].length; detalhe++) {

				System.out.println("Para o indice [" + vetor + "] detalhe [" + detalhe + "] informe o valor ");
				matrizBytes[vetor][detalhe] = input.nextByte();
			}
		}

		for (byte vetor = 0; vetor < matrizBytes.length; vetor++) {

			for (byte detalhe = 0; detalhe < matrizBytes[vetor].length; detalhe++) {

				System.out.println(
						"Matriz bytes [" + vetor + "] detalhe [" + detalhe + "] ==> " + matrizBytes[vetor][detalhe]);

			}
		}

	}

	public static void atribuirAleatoriamenteValoresDetalhesVetores() {

		byte matrizBytes[][] = new byte[30][10];
		String resposta;
		byte vetor = 0, detalhe = 0;

		do {
			System.out.println("Para o vetor" + vetor + "e detalhe" + detalhe + "informe o valor");
			matrizBytes[vetor][detalhe] = input.nextByte();

			System.out.println("Gostaria de inicializar outro valô ?");
			resposta = input.next();
			if (resposta.equalsIgnoreCase("sim")) {
				System.out.println("Qual vetor você quer acessar?");
				vetor = input.nextByte();
				System.out.println("Qual detalhe deste vetor você quer atualizar o valor?");
				detalhe = input.nextByte();

			}
		} while (resposta.equalsIgnoreCase("sim"));

	}

}