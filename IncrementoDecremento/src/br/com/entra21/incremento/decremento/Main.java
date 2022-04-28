package br.com.entra21.incremento.decremento;

public class Main {

	public static void main(String[] args) {
		 
		int idade=33;
		
		System.out.println("Minha idade com pre incremento "+(++idade));
		System.out.println("E agora ?"+idade);
		 
		byte contador=0;
		do {
			System.out.println(" contando "+(contador));

			contador++;
		}while(contador<=10);
		
		/*
		 * //aniversario idade = idade+1; //34 System.out.println(idade);
		 * 
		 * //ano 29/2 4 em 4 anos
		 * 
		 * idade= idade+4; System.out.println(idade);
		 * 
		 * idade++; System.out.println(idade);
		 * 
		 * idade+=2; System.out.println(idade);
		 * 
		 * idade= idade +2; System.out.println(idade);
		 * 
		 * idade*=2; System.out.println(idade);
		 * 
		 * idade = idade*2; System.out.println(idade);
		 * 
		 * 
		 * idade/=2; System.out.println(idade);
		 * 
		 * idade = idade/2; System.out.println(idade);
		 * 
		 * 
		 * idade--; System.out.println(idade);
		 * 
		 * idade-=10; System.out.println(idade);
		 * 
		 * idade=idade-10; System.out.println(idade);
		 */

	}

}
