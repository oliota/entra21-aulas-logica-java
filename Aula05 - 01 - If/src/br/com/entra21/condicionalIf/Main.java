package br.com.entra21.condicionalIf;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre If");
		
		if(true) {
			System.out.println("Vai fazer isso quando der true");
			System.out.println("Somente true");
		}
		
		System.out.println("Aqui vai acontecer natualmente pq o codigo segue sempre em frente");
		
		if(false) {
			//nunca passaria aqui pois apenas quando resulta em true passa por esse bloco
		}
		
		byte idade =17;
		
		if(idade>=18) {// é maior de idade?
			System.out.println("é maior de idade");
		}
		
		if( (idade>=13) && (idade<18) ) {//é adolescente  (13~17)?
			System.out.println("é adolescente");
		}
		
		
		
		

	}

}
