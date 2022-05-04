package br.com.entra21.exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Exiba em tela uma lista de opções para o usuário escolher e para cada escolha retornar uma mensagem diferente. ");

		byte opcao;
		Scanner entrada = new Scanner(System.in);
		System.out.println("1 = Primavera");
		System.out.println("2 = Outono");
		System.out.println("3 = Inverno");
		System.out.println("4 = Verão");
		System.out.println("Escolha sua estação favorita");
		opcao = entrada.nextByte();
		
		switch(opcao) {
		case 1:
			System.out.println("As flores aparecem");
			break;
			
		case 2:
			System.out.println("O inverno está chegando");
			break;
			
		case 3:
			System.out.println("Que frio");
			break;
			
		case 4:
			System.out.println("Praia do rosa, estaremos lá");
			break;
		
		}
		
	}

}
