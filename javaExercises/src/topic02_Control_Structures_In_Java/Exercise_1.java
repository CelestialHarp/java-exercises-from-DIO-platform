package topic02_Control_Structures_In_Java;

import java.util.Scanner;

public class Exercise_1 {
	//[EN-US]: Write a code where the user enters a number and the multiplication table from 1 to 10 for that number is generated
	
	//[PT-BR]: Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
	public static void main(String Args[]) {
		
		//Getting user input
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número para ser gerada a tabuada: ");
		int factor1 = scanner.nextInt();
		int result = 0;
		//Spitting every piece of the multiplication table a time.
		for (int factor2 = 0; factor2 < 11; factor2++) {
			result =  factor1 * factor2;
			System.out.printf("%d x %d = %d \n", factor1, factor2, result);
		}
	}
}
