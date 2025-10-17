package topic02_Control_Structures_In_Java;

import java.util.Scanner;

public class Exercise_4 {
	//[EN-US]: Write a code in which the user informs an initial number, and after other N numbers. The execution of the code should continue until the second informed number divided by the first number have a division rest different from 0. Numbers that are lesser than the first number must be ignored.
	
	//[PT-BR]: Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados
	public static void main(String Args[]) {
		Scanner scanner = new Scanner(System.in);
		int remainder;
		System.out.println("Welcome to divison Izanami. A loop that only breaks when divisions have a remainder. Enjoy your stay!");
		do {
			System.out.print("Let's start. Choose a number to be the divisor:");
			int divisor = scanner.nextInt();
			int dividend;
			do {
				System.out.print("Choose a number to be devided. The number should be greater than the previous one.");
				dividend = scanner.nextInt();
			} while (dividend < divisor);
			remainder = dividend % divisor;
			System.out.printf("The remainder is equal to %d\n", remainder);
		} while (remainder == 0);
		
	}
}
