package br.com.entra21.operador.ternario;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre operador ternario");
		
		String nome;
		boolean condicao=false;
		
		nome= (true)?"Nome":"Sobrenome";
		
		System.out.println("Então vc é "+ (condicao?"de maior":"de menor") );
		
		
		byte idade = 30;
		
		if(idade>17) {
			System.out.println("Vc é de maior");
		}else { 
			System.out.println("Vc é de menor");
		}
		
		System.out.println("Vc é de "+  (idade>17?" de maior":" de menor" ));
		
		 
		
		

	}

}
