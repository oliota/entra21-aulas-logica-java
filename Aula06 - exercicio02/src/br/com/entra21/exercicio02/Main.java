package br.com.entra21.exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Com o mesmo formato do exercício 1 , agora aceite apenas String como resposta");
		
		String escolha;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha sua cor favorita entre as opções :\nVerde\nAmarelo\nAzul\nVermelho");
		escolha= entrada.nextLine(); 
		switch(escolha) { 
		case "verde":  
			System.out.println("Gosta de verde");
			break; 
		case "amarelo":  
			System.out.println("Gosta de verde");
			break; 
		case "azul":
			System.out.println("Gosta de azul");
			break; 
		case "vermelho":
			System.out.println("Gosta de vermelho");
			break;
		
		}
		

	}

}
