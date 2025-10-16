package topic01_Java_Programming_Language_Basics;

import java.util.Scanner;

public class Exercise_4 {
	
	public static void main(String Args[]) {
		//[EN-US]: Write a code which takes the name and age of 2 people and prints the age difference between them
		
		//[PT-BR]:Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Idade da pessoa 1:");
		int person1sAge = scanner.nextInt();
		
		System.out.print("Idade da pessoa 2:");
		int person2sAge = scanner.nextInt();
		int ageDifference;
		if (person2sAge > person1sAge) {
			ageDifference = person2sAge - person1sAge;
		} else {
			ageDifference = person1sAge - person2sAge;
		}
		
		System.out.printf("\n A diferença de idade entre a pessoa pessoa 1 e a pessoa 2 é de %d anos.", ageDifference);
	}
}
