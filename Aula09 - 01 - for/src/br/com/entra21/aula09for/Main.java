package br.com.entra21.aula09for;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Aprendendo sobre laços de repetição - for");
		String opcao;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Sobre o for escolha uma opção para aprender mais");
		System.out.println("1 - for simples");
		System.out.println("2 - for dentro de for");
		System.out.println("3 - Solicite ao usuário uma quantidade limite e exiba em tela a repetição de 1 até o limite");
		System.out.println("4 - Solicite ao usuário um valor numero para exibir a contagem regressiva até o zero");
		System.out.println("5 - Retorne a tabuada do numero escolhido");
		System.out.println("6 - Retornar todas as tabuadas de 1 até a tabuada do numero informado pelo usuário");
		opcao = entrada.nextLine();

		switch (opcao.toLowerCase()) {

		case "1", "for simples":
			// funcao aula for simples
			aulaForSimples();// função do tipo procedimento nao tem argumento nem retorno
			break;

		case "2":
			// olha veio por numero
		case "for dentro de for":
			// funcao aula complexa
			aulaForDentroDeFor();// função do tipo procedimento nao tem argumento nem retorno
			break;

		case "3":
			exercicioForLimite();
			break;
		case "4":
			break;
		case "5":
			break;
		case "6":
			break;

		}
		
		 

	}

	public static void aulaForSimples() {
		
		System.out.println("Aprendendo sobre FOR da maneira simples");
		
		System.out.println("Repetição simples de forma linear de 1 em 1");
		for (int contador1 = 1; contador1 < 10; contador1++) {
			System.out.println("Repetindo o contador1 pela " + contador1 + "ª vez.");
		}

		System.out.println("O incremento ou decremento não precisa ser de 1 em 1");
		for (int contador2 = 1; contador2 <= 30; contador2 += 4) {
			System.out.println("Repetindo mas pulando de 4 em 4 o contador esta em " + contador2);

		}

		System.out.println("Também é possivel fazer de forma regressiva");
		for (int contador3 = 50; contador3 > -10; contador3--) {
			System.out.println("Contagem regressiva " + contador3);
		}

		System.out.println("Fazer coisas legais que eu não sabia quando colava na tabuada");

		byte fator = 12;
		int contador4;
		int resultado;
		for (contador4 = 1; contador4 < 11; contador4++) {
			resultado = contador4 * fator;
			System.out.println(contador4 + " x " + fator + "=" + resultado);
		}
	}

	public static void aulaForDentroDeFor() {

		System.out.println("Aprendendo sobre FOR da maneira mais complexa");
		
		byte nivelMaior=5,nivelDetalhe=10;
		
		for(int contador=1;contador<=nivelMaior;contador++) {
			// no primeiro for devo repetir até a quantidade e nesse caso seria 2x
			System.out.println("Para o nivel maior repetindo pela "+contador+"ª vez:");
			
			//porém aqui dentro tem um outro for
			for(int contadorInterno=1;contadorInterno<=nivelDetalhe;contadorInterno++) {
				//no for interno vou repetir 3x
				System.out.println("\tPara o nivel detalhe repetindo pela "+contadorInterno+"ª vez:");
				//minha repetição interna acaba aqui
			}
			//vou ter que esperar esse for interno acabar para dar a volta no meu for principal
			//até aqui é o primeiro for
		}
		

	}

	public static void exercicioForLimite() {
		
	}
	
}
