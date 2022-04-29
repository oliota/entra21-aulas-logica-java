package br.com.entra21.operadores.logicos;

public class Main {

	public static void main(String[] args) {
		System.out.println("Operadores lógicos");
		
		System.out.println("E  - AND - && - eComercial - (SHIFT+7) - (Alt+38) = expressão restritiva");
		System.out.println("Entre 2 booleans ao utilizar o &&  para resultar em true , ambos tem que ser true");
		System.out.println("Em outra palavras se houver um false em uma comparação com && resultará em false");
		
		System.out.println("Tabela verdade do E");
		System.out.println("T && T = T");
		System.out.println("T && F = F");
		System.out.println("F && T = F");
		System.out.println("F && F = F");
		
		
		byte idade=19;
		float altura=1.8f;
		double dinheiro;
		boolean resultado;
		
		resultado = idade<18;//false
		
		resultado = altura>=2.0f;//false
		
		resultado = (idade<18) && (altura>=2.0f);
		//             (false) && (false)
		//                    false
		
		idade=15;
		altura=1.9f;
		resultado = (idade<18) && (altura>=2.0f);
		//           (true)    &&  (false)
		//                    false
		
		idade=20;
		altura=2.10f;
		dinheiro=20000;
		
		resultado = (idade>=18) && (altura>=2.0f) && (dinheiro >=50000) ;
		//           (true)    &&  (true)      &&  (false)
		//            ( true)  && (false)
		//            ( false )
		
		idade=30;
		altura=2.15f;
		dinheiro=100000;
		resultado = (idade>=18) && (altura>=2.0f) && (dinheiro >=50000) ;
		//           (true)      &&  (true)  && (true)
		//                       (true)    &&  (true)
		//                                 (true)
		
		idade=40;
		altura=2.35f;
		dinheiro=100000;
		
		resultado = ( (idade>=18) && (idade<=45)  ) && (altura<2.35)  && (dinheiro>=50000);
		//           ( (true) && (true)           ) && (altura<2.35)  && (dinheiro>=50000)
		//           ( true  ) && (altura<2.35)  && (dinheiro>=50000)
		//           (true) &&  (false)&& (dinheiro>=50000)
		//            (true) && (false) && (true)
		//            (false) && (true)
		//                     false
		
		
		
		//---------------------------------------------------------
		

		System.out.println("OU  - OR - || - pipe - (SHIFT+\\) - (Alt+124) = expressão inclusiva");

		System.out.println("Entre 2 booleans ao utilizar o || para resultar em true , basta que apenas um seja true");
		System.out.println("Em outra palavras apenas quando ambos forem false com || resultará em false");
		
		System.out.println("Tabela verdade do OU");
		System.out.println("T || T = T");
		System.out.println("T || F = T");
		System.out.println("F || T = T");
		System.out.println("F || F = F");
		
		idade=17;
		dinheiro=1000;
		
		resultado = (idade>=18) || (dinheiro>=1000);//entrar na rave7dias no sitio
		//           (false)  || (dinheiro>=1000)
		//            (false)   || (true)
		//                     (true)
		
		
		resultado = (idade<=14) || (idade>=18);//melhor epoca para os pais?
		//          (false) || (idade>=18) 
		//            (false) || (false)
		//              (false)
		
		idade=3;
		resultado = (idade<=14) || (idade>=18);//melhor epoca para os pais?
		//          (true)   || (idade>=18)
		//              (true) || (false)
		//                    (true)
		
		
		
		
		
		
	}
}
