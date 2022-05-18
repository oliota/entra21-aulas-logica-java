package br.com.entra21.aula11.exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte option;

		do {
			System.out.println("Escolha uma das opções: ");
			System.out.println(" 0 - \"Sair ");
			System.out.println(" 1 - Calculando a soma ");
			System.out.println(" 2 - Repetir 20 quebrar linha a cada 5 ");
			System.out.println(" 3 - Capturar idade de 20 pessoas e exibir a soma de todas elas ");
			System.out.println(" 4 - Repetir 20 quebrar linha a cada 5 ");
			System.out.println(" 5 - Entre 10 pessoas quem é o mais novo");
			System.out.println(" 5 - Entre 10 pessoas quem é o mais novo");
			System.out.println(" 6 -  ");
			System.out.println(" 7 -  ");
			System.out.println(" 8 - Capture N numeros acumule a soma e só para quando for informado um numero negativo ");
			System.out.println(" 9 - Calcular media para N notas");
			option = input.nextByte();
			switch (option) {
			case 0:
				System.out.println("Saindo...");
				break;
			case 1:
				calculandoSoma();
				break;
			case 2:
				runRepeat20();
				break;
			case 3:
				sumAge();
				break;
			case 4:
				maioresDeIdade();
				break;
			case 5:
				exibirMaisNovo();
				break;
			case 6:
				System.out.println("Ainda não implementado...");
				break;
			case 7:
				System.out.println("Ainda não implementado...");
				break;
			case 8:
				exerciseOito();
				break;
			case 9:
				mediaAlunos();
				break;
			default:
				System.out.println("Escolha uma opção válida!");
				break;
			}

		} while (option != 0);
		System.out.println("Obrigada por usar o programa Lista de Exercicios!");
	}

	public static void calculandoSoma() {
		System.out.println("CALCULANDO A SOMA");
		byte soma = 0;
		for (byte counter = 1; counter <= 15; counter++) {
			System.out.println(
					"Soma = soma + counter,  " + soma + " = " + soma + " + " + counter + " ==> " + (soma + counter));
			soma = (byte) (soma + counter);

		}
	}

	private static void runRepeat20() {

		for (byte cont = 1; cont <= 20; cont++) {

			System.out.print("Eu gosto de algoritmos " + (cont % 5 == 0 ? "\n" : ""));

			/*
			 * if (cont % 5 == 0) {
			 *
			 * System.out.print("\n");
			 *
			 * }
			 */

		}

	}

	public static void sumAge() {
		int sumAge = 0;
		byte age;
		Scanner input = new Scanner(System.in);

		for (byte count = 1; count <= 5; count++) {
			System.out.println("No momento a soma está em " + sumAge);
			System.out.println("Por favor, insira a idade: ");
			age = input.nextByte();
			sumAge = sumAge + age;
		}
		System.out.println("A soma total das idades foi " + sumAge);
	}

	private static void maioresDeIdade() {
		System.out.println("Exibir apenas os maiores de idade");
		byte maiores = 0;
		byte idade, cont;

		Scanner input = new Scanner(System.in);
		for (cont = 1; cont <= 20; cont++) {
			System.out.println("Informe a idade da pessoa " + cont);
			idade = input.nextByte();
			if (idade >= 18) {
				maiores++;
				System.out.println("A última pessoa informada era de maior.");
			}
		}
		System.out.println("Entre " + (cont - 1) + " pessoas, apenas " + maiores + " são maiores de idade");
	}

	private static void exibirMaisNovo() {
		Scanner input = new Scanner(System.in);
		String name, youngerName = "valor";
		byte age, ageMinimal = 0;

		for (byte count = 1; count <= 10; count++) {

			System.out.println("Digite seu nome: ");
			name = input.next();
			System.out.println(name + " por favor, Digite sua idade: ");
			age = input.nextByte();
			// no primeiro laço sempre a primeira idade vai ser a menor
			if (count == 1) {
				ageMinimal = age;
				youngerName = name;
				System.out.println("Sou o primeiro e por isso sou o mais novo " + name + " " + age);
			} else {
				// a partir do segundo laço já tenho como comparar com "ageMinimal"
				System.out.println("Estou no laço " + count + " e preciso verificar");
				if (age < ageMinimal) {
					System.out.println(
							"Ainda bem que testei porque a pessoa mais nova é " + name + " com " + age + " anos");
					ageMinimal = age;
					youngerName = name;
				}

			}

		}
		System.out.println("Após isso tudo o mais novo é: " + youngerName + " " + ageMinimal);

	}

	public static void exerciseOito() {

		// Escreva um algoritmo que leia uma sequência de números do usuário e realize a
		// soma desses números. Encerre a execução quando um número negativo for
		// digitado.

		Scanner inPut = new Scanner(System.in);
		int number, sum = 0; // se não inicializa um valor na váriavel ela fica com lixo da memória.

		do {

			System.out.println("What number do you want?");
			number = inPut.nextInt();
			if (number >= 0) {
				sum = sum + number;
			} // somente números positivos serão somados, ou números naturais.

		} while (number >= 0); // enquanto o número for maior que zero repita

		System.out.println("Your sum is: " + sum);

	}

	private static void mediaAlunos() {
		Scanner input = new Scanner(System.in);
		byte quantidade;
		float nota, soma = 0f;
		System.out.println("Quantas notas vc quer capturar?");
		quantidade = input.nextByte();

		for (byte contador = 1; contador <= quantidade; contador++) {
			System.out.println("Informe a " + contador + "ª nota");
			nota = input.nextFloat();
			soma = soma + nota;
		}
		System.out.println("Soma =" + soma);
		System.out.println("Media =" + soma / quantidade);
	}

}