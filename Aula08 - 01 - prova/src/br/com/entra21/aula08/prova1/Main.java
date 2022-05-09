package br.com.entra21.aula08.prova1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String username;
		byte birthday;
		final byte MAX_DAY = 31;

		Scanner input = new Scanner(System.in);
		System.out.println("==============================================================");
		System.out.println("|-------------------- EXAM 1 - SIGNS ------------------------|");
		System.out.println("==============================================================");

		System.out.print("What's your name? ");
		username = input.nextLine();

		System.out.print(username + ", please tell me your birthday number:");
		birthday = input.nextByte();

		if (birthday > MAX_DAY) {
			System.out.println("There is no month with that day");
			main(null);
		} else {
			writeMenu();
			runSwitch(input.next().toLowerCase(), username, birthday);
		}
		input.close();
	}

	public static void writeMenu() {
		byte counter = 0;
		System.out.println("Select the number corresponding to the month of your birthday:");

		writeOption(++counter, "JANUARY");
		writeOption(++counter, "FEBRUARY");
		writeOption(++counter, "MARCH");
		writeOption(++counter, "APRIL");
		writeOption(++counter, "MAY");
		writeOption(++counter, "JUNE");
		writeOption(++counter, "JULY");
		writeOption(++counter, "AUGUST");
		writeOption(++counter, "SEPTEMBER");
		writeOption(++counter, "OCTOBER");
		writeOption(++counter, "NOVEMBER");
		writeOption(++counter, "DECEMBER");
	}

	public static void writeOption(byte monthNumber, String monthName) {
		// break line each 3 months
		final String SPACE = " ";
		final String EMPTY = "";
		final String TAB = "\t\t";

		if (monthNumber % 3 == 0) {
			System.out.println((monthNumber < 10 ? SPACE : EMPTY) + monthNumber + " - " + monthName + TAB);
	} else {
			System.out.print((monthNumber < 10 ? SPACE : EMPTY) + monthNumber + " - " + monthName + TAB);
		}
	}

	private static void runSwitch(String option, String username, byte birthdayNumber) {
		switch (option) {
		case "1", "january":
			runJanuary(checkDayMonths(1), birthdayNumber);
			break;
		case "2", "february":
			runFebruary(checkDayMonths(2), birthdayNumber);
			break;
		case "3", "march":
			runMarch(checkDayMonths(3), birthdayNumber);
			break;
		case "4", "april":
			runApril(checkDayMonths(4), birthdayNumber);
			break;
		case "5", "may":
			runMay(checkDayMonths(5), birthdayNumber);
			break;
		case "6", "june":
			runJune(checkDayMonths(6), birthdayNumber);
			break;
		case "7", "july":
			runJuly(checkDayMonths(7), birthdayNumber);
			break;
		case "8", "august":
			runAugust(checkDayMonths(8), birthdayNumber);
			break;
		case "9", "september":
			runSeptember(checkDayMonths(9), birthdayNumber);
			break;
		case "10", "october":
			runOctober(checkDayMonths(10), birthdayNumber);
			break;
		case "11", "november":
			runNovember(checkDayMonths(11), birthdayNumber);
			break;
		case "12", "december":
			runDecember(checkDayMonths(12), birthdayNumber);
			break;
		default:
			System.out.println("Invalid option! Try again!");
			main(null);
			return;
		}
		runAgain();
	}

	public static boolean checkDayMonths(int monthNumber) {
		final byte MAX_29 = 29;
		final byte MAX_30 = 30;
		final byte MAX_31 = 31;
		switch (monthNumber) {
		case 2:
			return monthNumber <= MAX_29;
		case 4, 6, 9, 11:
			return monthNumber <= MAX_30;
		default:
			return monthNumber <= MAX_31;
		}

	}

	private static void runAgain() {
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to run the program again? (Yes or no)");
		switch (input.nextLine().toLowerCase()) {
		case "yes":
			main(null);
			break;
		case "no":
			System.out.println("Thanks for using this program.");
			break;

		default:
			System.out.println("Please respond with one of the available options.");
			runAgain();
			break;
		}

	}

	private static void runJanuary(boolean valid, byte birthdayNumber) {
		if (valid) {
			if (birthdayNumber < 21) {
				System.out.println("Capricorn");
				// in portuguese : As inquietações íntimas precisam ser tratadas com delicadeza
				// e cuidado, sem se apoiar nelas para tomar iniciativas severas que, com
				// certeza, seriam contraproducentes, um verdadeiro tiro saindo pela culatra."
				System.out.println(
						"Intimate concerns need to be handled with delicacy and care, without relying on them to take severe initiatives that would certainly be counterproductive, a real backfire.");
			} else {
				System.out.println("Aquarius");
				// in portuguese : "Alguém deve ter a culpa, com certeza! Esse negócio de
				// culpados e vítimas é
				// um jogo bastante delicado, porque, dia mais, dia menos, os culpados se
				// transformam em vítimas, e vice-versa. Melhor não se meter nesse jogo.
				System.out.println(
						"Someone must be at fault for sure! This business of culprits and victims is a very delicate game, because, day in and day out, the culprits become victims, and vice versa. Better not get involved in this game.");
			}
		}
	}

	private static void runFebruary(boolean valid, byte birthdayNumber) {
		if (valid) {
			if (birthdayNumber < 19) {
				System.out.println("Aquarius");
				// in portuguese : "Alguém deve ter a culpa, com certeza! Esse negócio de
				// culpados e vítimas é
				// um jogo bastante delicado, porque, dia mais, dia menos, os culpados se
				// transformam em vítimas, e vice-versa. Melhor não se meter nesse jogo.
				System.out.println(
						"Someone must be at fault for sure! This business of culprits and victims is a very delicate game, because, day in and day out, the culprits become victims, and vice versa. Better not get involved in this game.");
			} else {
				System.out.println("Pisces");
				// in portuguese : Evite o estresse, ciente de que, para isso, você precisará
				// encarar os
				// contratempos com bom humor, sabendo que nada disso é resultado de uma
				// conspiração para derrubar você, apenas uma arritmia dos fatos da vida.
				System.out.println(
						"Avoid stress, knowing that to do so, you will need to face setbacks with good humor, knowing that none of this is the result of a conspiracy to bring you down, just an arrhythmia of the facts of life.");
			}
		}
	}

	private static void runMarch(boolean valid, byte birthdayNumber) {
		if (valid) {
			if (birthdayNumber < 21) {
				System.out.println("Pisces");
				// in portuguese : Evite o estresse, ciente de que, para isso, você precisará
				// encarar os
				// contratempos com bom humor, sabendo que nada disso é resultado de uma
				// conspiração para derrubar você, apenas uma arritmia dos fatos da vida.
				System.out.println(
						"Avoid stress, knowing that to do so, you will need to face setbacks with good humor, knowing that none of this is the result of a conspiracy to bring you down, just an arrhythmia of the facts of life.");
			} else {
				System.out.println("Aries");
				// in portuguese : A vontade de passar bons momentos, de regozijo e alegria, há
				// de ser
				// respeitada, mas também, é preciso escolher a dedo os momentos de colocar em
				// marcha tal perspectiva, para que seja contagiante, e não motivo de crítica.
				System.out.println(
						"The desire to have a good time, of rejoicing and joy, must be respected, but it is also necessary to carefully choose the moments to put this perspective in motion, so that it is contagious, and not a reason for criticism.");
			}
		}
	}

	private static void runApril(boolean valid, byte birthdayNumber) {
		if (valid) {
			if (birthdayNumber < 21) {
				System.out.println("Aries");
				// in portuguese : A vontade de passar bons momentos, de regozijo e alegria, há
				// de ser
				// respeitada, mas também, é preciso escolher a dedo os momentos de colocar em
				// marcha tal perspectiva, para que seja contagiante, e não motivo de crítica.
				System.out.println(
						"The desire to have a good time, of rejoicing and joy, must be respected, but it is also necessary to carefully choose the moments to put this perspective in motion, so that it is contagious, and not a reason for criticism.");
			} else {
				System.out.println("Taurus");
				// in portuguese : O sossego que sua alma gostaria de experimentar está
				// disponível, mas precisa
				// de sua ajuda para ser desfrutado, porque, mesmo havendo todas as condições
				// para sossegar, se você persiste no mau humor será tudo em vão.
				System.out.println(
						"The peace that your soul would like to experience is available, but it needs your help to enjoy it, because, even with all the conditions for calm, if you persist in a bad mood, it will all be in vain.");
			}
		}
	}

	private static void runMay(boolean valid, byte birthdayNumber) {
		if (valid) {
			if (birthdayNumber < 21) {
				System.out.println("Taurus");
				// in portuguese : O sossego que sua alma gostaria de experimentar está
				// disponível, mas precisa
				// de sua ajuda para ser desfrutado, porque, mesmo havendo todas as condições
				// para sossegar, se você persiste no mau humor será tudo em vão.
				System.out.println(
						"The peace that your soul would like to experience is available, but it needs your help to enjoy it, because, even with all the conditions for calm, if you persist in a bad mood, it will all be in vain.");
			} else {
				System.out.println("Gemini");
				// in portuguese : Você tem muito a dizer, mas precisa encontrar a hora certa
				// para se expressar,
				// porque se ficar comentando suas ideias com todo mundo, essas perderão a força
				// que lhes é inerente. Amadureça as ideias e depois se expresse."
				System.out.println(
						"You have a lot to say, but you need to find the right time to express yourself, because if you talk about your ideas with everyone, they will lose their inherent strength. Mature ideas and then express yourself.");
			}
		}
	}

	private static void runJune(boolean valid, byte birthdayNumber) {
		if (valid) {
			if (birthdayNumber < 21) {
				System.out.println("Gemini");
				// in portuguese : Você tem muito a dizer, mas precisa encontrar a hora certa
				// para se expressar,
				// porque se ficar comentando suas ideias com todo mundo, essas perderão a força
				// que lhes é inerente. Amadureça as ideias e depois se expresse."
				System.out.println(
						"You have a lot to say, but you need to find the right time to express yourself, because if you talk about your ideas with everyone, they will lose their inherent strength. Mature ideas and then express yourself.");
			} else {
				System.out.println("Cancer");
				// in portuguese : Preocupar-se excessivamente com dinheiro é a melhor forma de
				// distorcer o
				// fluxo de recursos, porque você fará tudo aos trancos e barrancos, com a alma
				// sobressaltada. Dinheiro bom é dinheiro que circula. Só isso."
				System.out.println(
						"Worrying excessively about money is the best way to distort the flow of resources, because you will do everything in fits and starts, with a jumpy soul. Good money is money that circulates. Just that.");
			}
		}
	}

	private static void runJuly(boolean valid, byte birthdayNumber) {
		if (valid) {
			if (birthdayNumber < 23) {
				System.out.println("Cancer");
				// in portuguese : Preocupar-se excessivamente com dinheiro é a melhor forma de
				// distorcer o
				// fluxo de recursos, porque você fará tudo aos trancos e barrancos, com a alma
				// sobressaltada. Dinheiro bom é dinheiro que circula. Só isso."
				System.out.println(
						"Worrying excessively about money is the best way to distort the flow of resources, because you will do everything in fits and starts, with a jumpy soul. Good money is money that circulates. Just that.");
			} else {
				System.out.println("Leo");
				// in portuguese : Intervir nos acontecimentos seria uma tentação no dia de
				// hoje, porque o
				// melhor seria você fazer cara de paisagem e se mimetizar no cenário, esperando
				// que as horas passem e que o mínimo de encrenca aconteça."
				System.out.println(
						"Intervening in events would be a temptation today, because the best thing would be for you to look like a landscape and mimic the scenery, waiting for the hours to pass and for the least amount of trouble to happen.");
			}
		}
	}

	private static void runAugust(boolean valid, byte birthdayNumber) {
		if (valid) {
			if (birthdayNumber < 23) {
				System.out.println("Leo");
				// in portuguese : Intervir nos acontecimentos seria uma tentação no dia de
				// hoje, porque o
				// melhor seria você fazer cara de paisagem e se mimetizar no cenário, esperando
				// que as horas passem e que o mínimo de encrenca aconteça."
				System.out.println(
						"Intervening in events would be a temptation today, because the best thing would be for you to look like a landscape and mimic the scenery, waiting for the hours to pass and for the least amount of trouble to happen.");
			} else {
				System.out.println("Virgo");
				// in portuguese : O silêncio será de grande ajuda nesta parte do caminho, pois,
				// assim você
				// evitará se enredar em discussões estéreis, que não levariam a nenhum lugar
				// positivo. O silêncio há de ser sua companhia mais confiável agora.
				System.out.println(
						"Silence will be of great help in this part of the way, because then you will avoid getting entangled in sterile discussions, which would not lead to any positive place. Silence will be your most reliable companion now.");
			}
		}
	}

	private static void runSeptember(boolean valid, byte birthdayNumber) {
		if (valid) {
			if (birthdayNumber < 23) {
				System.out.println("Virgo");
				// in portuguese : O silêncio será de grande ajuda nesta parte do caminho, pois,
				// assim você
				// evitará se enredar em discussões estéreis, que não levariam a nenhum lugar
				// positivo. O silêncio há de ser sua companhia mais confiável agora.
				System.out.println(
						"Silence will be of great help in this part of the way, because then you will avoid getting entangled in sterile discussions, which would not lead to any positive place. Silence will be your most reliable companion now.");
			} else {
				System.out.println("Libra");
				// in portuguese : A desconexão entre as pessoas é evidente, mesmo entre aquelas
				// que normalmente
				// se comunicam bem entre si. Tudo isso vai passar, não precisa de atenção de
				// sua parte, mas de divina indiferença, porque vai passar, com certeza.
				System.out.println(
						"The disconnect between people is evident, even among those who normally communicate well with each other. All this will pass, it doesn't need attention on your part, but divine indifference, because it will pass, for sure.");
			}
		}
	}

	private static void runOctober(boolean valid, byte birthdayNumber) {
		if (valid) {
			if (birthdayNumber < 23) {
				System.out.println("Libra");
				// in portuguese : A desconexão entre as pessoas é evidente, mesmo entre aquelas
				// que normalmente
				// se comunicam bem entre si. Tudo isso vai passar, não precisa de atenção de
				// sua parte, mas de divina indiferença, porque vai passar, com certeza.
				System.out.println(
						"The disconnect between people is evident, even among those who normally communicate well with each other. All this will pass, it doesn't need attention on your part, but divine indifference, because it will pass, for sure.");
			} else {
				System.out.println("Scorpio");
				// in portuguese : Para você fazer o que quer, você precisará se expor bastante,
				// e hoje não
				// seria um dia interessante para ficar nessa posição, a qual, até poderia
				// brindar com certo avanço, mas ao preço de inúmeros efeitos colaterais.
				System.out.println(
						"For you to do what you want, you will need to expose yourself a lot, and today would not be an interesting day to stay in that position, which could even offer some advancement, but at the price of numerous side effects.");
			}
		}
	}

	private static void runNovember(boolean valid, byte birthdayNumber) {
		if (valid) {
			if (birthdayNumber < 23) {
				System.out.println("Scorpio");
				// in portuguese : Para você fazer o que quer, você precisará se expor bastante,
				// e hoje não
				// seria um dia interessante para ficar nessa posição, a qual, até poderia
				// brindar com certo avanço, mas ao preço de inúmeros efeitos colaterais.
				System.out.println(
						"For you to do what you want, you will need to expose yourself a lot, and today would not be an interesting day to stay in that position, which could even offer some advancement, but at the price of numerous side effects.");
			} else {
				System.out.println("Sagittarius");
				// in portuguese : Tudo que você imagina ter percebido direito e entendido
				// perfeitamente, é tudo
				// que precisa ser revisto também, porque a realidade anda cheia de véus e
				// distorções, sendo muito difícil discernir verdade de mentira.
				System.out.println(
						"Everything that you think you have understood correctly and understood perfectly, is everything that needs to be reviewed too, because reality is full of veils and distortions, and it is very difficult to discern truth from lies.");
			}
		}
	}

	private static void runDecember(boolean valid, byte birthdayNumber) {
		if (valid) {
			if (birthdayNumber < 23) {
				System.out.println("Sagittarius");
				// in portuguese : Tudo que você imagina ter percebido direito e entendido
				// perfeitamente, é tudo
				// que precisa ser revisto também, porque a realidade anda cheia de véus e
				// distorções, sendo muito difícil discernir verdade de mentira.
				System.out.println(
						"Everything that you think you have understood correctly and understood perfectly, is everything that needs to be reviewed too, because reality is full of veils and distortions, and it is very difficult to discern truth from lies.");
			} else {
				System.out.println("Capricorn");
				// in portuguese : As inquietações íntimas precisam ser tratadas com delicadeza
				// e cuidado, sem se apoiar nelas para tomar iniciativas severas que, com
				// certeza, seriam contraproducentes, um verdadeiro tiro saindo pela culatra."
				System.out.println(
						"Intimate concerns need to be handled with delicacy and care, without relying on them to take severe initiatives that would certainly be counterproductive, a real backfire.");
			}
		}
	}

}
