package topic02_Control_Structures_In_Java;

import java.util.Scanner;

public class Exercise_3 {
	//[EN-US]: Write a code in which the user enters a first number, then a second number greater than the first and chooses between the options even or odd. With that the code must inform all even or odd numbers (according to the first selection) in the given range, including the numbers informed and in descending order.
	
	//[PT-BR]: Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente
	public static void main(String Args[]) {
		//For now on, I'll stop adding the comment I was making here, about getting user input, as well as other comments about obvious things I was making just to prove I understand what I'm doing./Vou parar de fazer o comentário sobre obter input do usuário, como também outros comentários sobre coisas óbvias que estava fazendo apenas para provar que eu sei o que eu tô fazendo.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número inteiro.");
		int startNumber = scanner.nextInt();
		//I realized, while I was doing it with a while loop, that it should not be done with it because if It were to be done this way you would have to initialize the variable before the loop, and if the initialization value, if greater than the startNumber, would not trigger the command block inside the loop, what would happen if the user picked a negative number, which is possible because negative numbers also count as even or odds. So, I decide to do it with a do-while loop, which ends the previous dilemma.
		int endNumber;
		do {
			System.out.print("Digite um segundo número inteiro maior que o primeiro.");
			endNumber = scanner.nextInt();
		} while (endNumber <= startNumber);
		
		//I'll not involve it with a try and catch for now because the professor probably didn't intend it for the students to do so.
		System.out.print("Escolha entre par e ímpar. Digite par ou ímpar para escolher");
		String option = scanner.next();

		
		if (option.equals("par")) {
			System.out.printf("Pares entre %d e %d: \n", startNumber, endNumber);
			for (int i = startNumber; i < endNumber; i++) {
				int isEven = i % 2;
				if (isEven == 0) {
					System.out.printf("%d: \n", i);
				}
				
			}
			
		} else {
			System.out.printf("Ímpares entre %d e %d: \n", startNumber, endNumber);
			for (int i = startNumber; i < endNumber; i++) {
				int isOdd = i % 2;
				if (!(isOdd == 0)) {
					System.out.printf("%d \n", i);
				}
			}
		}
		
	}

}
