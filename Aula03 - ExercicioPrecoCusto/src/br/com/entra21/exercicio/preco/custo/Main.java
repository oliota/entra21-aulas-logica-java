package br.com.entra21.exercicio.preco.custo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa que solicite o nome e preço de custo de um produto qualquer,"
				+ " após, processe um aumento de 65% e informe qual será o preço de venda.");
		
		String nomeProduto;
		float precoCusto,precoVenda;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o nome do produto?");
		nomeProduto = entrada.nextLine();
		
		System.out.println("Qual o valor de custo do produto "+nomeProduto+" ?");
		precoCusto = entrada.nextFloat();
		
		precoVenda = precoCusto + ( precoCusto * 10 /100);//forma longa
		precoVenda = precoCusto*1.10f; //truque da matematica
		
		System.out.println("O preço de venda é "+precoVenda);
		
		

	}

}
