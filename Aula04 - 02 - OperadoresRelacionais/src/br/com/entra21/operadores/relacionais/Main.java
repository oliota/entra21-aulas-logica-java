package br.com.entra21.operadores.relacionais;

public class Main {

	public static void main(String[] args) {
		System.out.println("Operadores relacionais");
		
		System.out.println("Menor < (dica  voltando ou apagando <<<<<-----  )");
		
		byte idadeA=51,idadeB=51; 
		boolean resultado;
		 
		resultado = idadeA < idadeB;//idadeA é menor que idadeB?;
		
		System.out.println("idadeA é (<)menor que idadeB ? "+resultado);
		
		System.out.println("idadeA é (<)menor que idadeB ? "+ (idadeA<idadeB));
		
		resultado = idadeA <= idadeB;
		
		System.out.println( idadeA+" é (<=)menor ou igual que "+ idadeB+" ? "+resultado);
		
		System.out.println("Maior > (dica é  'sempre em frente ----->>>>>>')");
		
		resultado = idadeA > idadeB;
		
		System.out.println(idadeA+" é maior (>) que "+idadeB+" ? "+resultado);
		
		resultado = idadeA >= idadeB;
		
		System.out.println(idadeA+" é maior ou igual (>=) que "+idadeB+" ? "+resultado );
		

	}

}
