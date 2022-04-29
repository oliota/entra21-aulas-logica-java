package br.com.entra21.ifelse;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo a usar o if com else");
		
		if(false) {
			System.out.println("Vai passar aqui quando a condição resultar em true");
		}else {
			System.out.println("Vai passar aqui quando a condição resultar em false");
		}
		
		byte idade=18;
		
		if(idade>17) {//é maior de idade?
			System.out.println("é de maior");
		}else {
			System.out.println("Não é permitido menores aqui!!!");
		}

	}

}
