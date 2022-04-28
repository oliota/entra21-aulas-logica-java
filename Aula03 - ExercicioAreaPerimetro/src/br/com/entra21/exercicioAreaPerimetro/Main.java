package br.com.entra21.exercicioAreaPerimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args ) {
		System.out.println("Faça um programa que solicite a base e altura de um retângulo e informe sua área e perimetro." );
		System.out.println("Sabendo que a área é calculada com base no produto entre base e altura.");
		System.out.println("O perímetro é obtido ao somar todos os vertices do retângulo.");
		
		//criar variaveis
		float base,altura,area,perimetro;//boas praticas de nomenclatura
		
		Scanner entrada= new Scanner(System.in);
		
		//definir valores as variaveis
		
		System.out.println("Informe a base do retangulo");
		base = entrada.nextFloat();
		
		System.out.println("Informe a altura do retangulo");
		altura = entrada.nextFloat();
		
		//momento de processamentos...
		area = base * altura;
		perimetro = base * 2 + altura * 2;
		 
		System.out.println("Area é "+base+" x "+altura);
		System.out.println("Perimetro é "+base+" + "+ base+" + "+altura+" + "+altura);
		System.out.println("O resultado da área é: "+area+" , o resultado do perimetro é: "+perimetro+".");
		
		
		
		
		
		
		
		
		
	}

}
