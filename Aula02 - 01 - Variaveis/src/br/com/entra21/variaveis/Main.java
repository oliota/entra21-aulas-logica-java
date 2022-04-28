package br.com.entra21.variaveis;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		byte idade;
		idade = 33;

		byte outraIdade = 34;

		short ano = 2022;

		short anoPassado;

		anoPassado = 2021;

		System.out.println("Minha idade é " + (idade + outraIdade));

		System.out.println("Estamos em " + ano + " e ano passado foi " + anoPassado + ".");

		int habitantesBrasil = 212060000;

		System.out.println("No Brasil em " + ano + " temos exatamente " + habitantesBrasil + " habitantes. ");

		long habitantesTerra1500;
		habitantesTerra1500 = 790000000;

		double habitantesAtualmente = 7900000000.00;

		float peso = 70.5f, altura = 2.05f;

		System.out.println("Meu peso é " + peso);
		System.out.println("Minha altura é " + altura);

		char letra = 'R';

		boolean intervaloAntesDasOito = false;
		boolean intervaloAgora = true;

		String nomeCompleto = "";

		String nome;
		byte minhaIdade;
		float minhaAltura, salario;

		Scanner entrada;
		entrada = new Scanner(System.in);

		/*
		 * System.out.println("Por favor qual é o seu nome?"); nome =
		 * entrada.nextLine();
		 * 
		 * System.out.println("Informe a sua idade:"); minhaIdade = entrada.nextByte();
		 * 
		 * System.out.println("Informe agora altura:"); minhaAltura =
		 * entrada.nextFloat();
		 * 
		 * System.out.println("Informe seu salario sem mentir:"); salario =
		 * entrada.nextFloat();
		 * 
		 * System.out.println("Bem vindo " + nome +
		 * " agora consigo interagir com humanos já sei que vc tem " + minhaIdade +
		 * " anos.");
		 * 
		 * System.out.println("O " + nome + " que tem " + minhaAltura +
		 * "cm disse que ganha " + salario + " será mesmo?");
		 */

		nome = JOptionPane.showInputDialog("Informe novamente o seu nome completo");//syso + Scanner ao mesmo tempo

		JOptionPane.showMessageDialog(null, "Legal agora eu aprendi o seu nome " + nome);
		
		minhaIdade = Byte.parseByte(
				JOptionPane.showInputDialog("Informe a sua idade")
				) ;
		
		salario = Float.parseFloat( 
				JOptionPane.showInputDialog("Informe seu salario")
				);
		
		 
		
		JOptionPane.showMessageDialog(null, "Tá bom vc ganha "+salario);

	}

}
