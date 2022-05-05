package br.com.entra21.aula06.revisao.exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escreva um programa que:\r\n"
				+ "Defina como constante a quantidade de notas de um aluno\r\n"
				+ "Capture nome e cada uma das notas\r\n"
				+ "Calcule a média\r\n"
				+ "Informe\r\n"
				+ "se reprovou (<3)\r\n"
				+ "senao se , em recuperação (<7)\r\n"
				+ "senão se, passou com a nota minima (=7)\r\n"
				+ "senão se, passou mas poderia ser melhor (<10)\r\n"
				+ "senão se, nota maxima (=10)\r\n"
				+ "senão (tem algo de errado com o seu calculo de média)");

		System.out.println("================================================");
		final byte QTD_NOTAS = 3;
		String nome;
		float primeiraNota, segundaNota, terceiraNota, media;
		Scanner entrada = new Scanner(System.in);

		System.out.println("informe o seu nome:");
		nome = entrada.nextLine();

		System.out.println(nome + ", informe sua 1ª nota:(exemplo 9,8)");
		primeiraNota = entrada.nextFloat();

		System.out.println(nome + ", informe sua 2ª nota:");
		segundaNota = entrada.nextFloat();

		System.out.println(nome + ", informe sua 3ª nota:");
		terceiraNota = entrada.nextFloat();

		media = (primeiraNota + segundaNota + terceiraNota) / QTD_NOTAS;

		System.out.println("Sua média resultou em :"+media);
		System.out.print("Sua situação é: ");
		if (media < 3) {
			System.out.println("reprovado");
		} else if (media < 7) {
			System.out.println("em recuperação"); 
		} else if (media == 7) {
			System.out.println("passou com a nota minima"); 
		} else if (media < 10) {
			System.out.println("passou mas poderia ser melhor"); 
		} else if (media == 10) {
			System.out.println("nota maxima"); 
		} else {
			System.out.println("tem algo de errado com o seu calculo de média"); 
		}
	}

}
