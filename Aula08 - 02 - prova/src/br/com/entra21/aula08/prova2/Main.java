package br.com.entra21.aula08.prova2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String option;

		System.out.println("==============================================================");
		System.out.println("|------------------ EXAM 2 - CALCULATOR ---------------------|");
		System.out.println("==============================================================");
 
		System.out.println("0 = quit");
		System.out.println("1 = add");
		System.out.println("2 = subtract");
		System.out.println("3 = multiply");
		System.out.println("4 = divide");
		System.out.println("===================================");
		System.out.println("choose an option");
		option= input.next();//using next because there is only one word to capture
		
		runSwitch(option.toLowerCase());
		
		input.close();//closing Scanner is important to deallocate memory
		
	}

	private static void runSwitch(String chosenOption) {
		final String INVALID_OPTION="Invalid option try again";
		switch(chosenOption){

		case "0","quit":
			System.out.println("closing calculator");
			break;
		case "1","add":
			runAdd(inputNumber((byte)1),inputNumber((byte)2));
			break;
		case "2","subtract":
			runSubtract(inputNumber((byte)1),inputNumber((byte)2));
			break;
		case "3","multiply":
			runMultiply(inputNumber((byte)1),inputNumber((byte)2));
			break;
		case "4","divide":
			rundDivide(inputNumber((byte)1),inputNumber((byte)2));
			break;
		default:
			System.out.println(INVALID_OPTION);
			main(null);
			break;
			
		}  
	}
 

	private static float inputNumber(byte position) { 
		System.out.println("inform the "+position+""+(position==1?"st":"nd")+" number");
		float number;
		number=new Scanner(System.in).nextFloat(); 
		return number;
	}

	private static void runAdd(float firstNumber, float secondNumber) {
		System.out.println(writeMath(firstNumber,"+",secondNumber)+(firstNumber+secondNumber));
		main(null);
	}

	private static void runSubtract(float firstNumber, float secondNumber) {
		System.out.println(writeMath(firstNumber,"-",secondNumber)+(firstNumber-secondNumber));
		main(null);
	}

	private static void runMultiply(float firstNumber, float secondNumber) {
		System.out.println(writeMath(firstNumber,"x",secondNumber)+(firstNumber*secondNumber));
		main(null);
	}
	private static void rundDivide(float firstNumber, float secondNumber) {
		System.out.println(writeMath(firstNumber,"/",secondNumber)+(firstNumber/secondNumber));
		main(null);
	}

	private static String writeMath(float firstNumber, String operation,float secondNumber) {
		return "("+firstNumber+" "+operation+" "+secondNumber+")=";
	}
}
