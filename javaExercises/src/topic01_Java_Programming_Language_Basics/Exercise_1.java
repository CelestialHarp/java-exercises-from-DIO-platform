package topic01_Java_Programming_Language_Basics;

import java.util.Scanner;

public class Exercise_1 {
	//[EN-US]:Write a code which takes the name and birth date of someone and prints on the screen the following message: "Hello, 'Someone', you have 'X' Years".
	
	//[PT-BR]: Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos".
	
	public static void main(String Args[]) {
		//Creating scanner to get user input/Criando scanner para obter input do usuário
		Scanner scanner = new Scanner(System.in);
		//Getting name and age/Obtendo nome e idade
		System.out.print("Digite o seu nome:");
		String name = scanner.nextLine();
		System.out.print("Digite a sua idade:");
		int age = scanner.nextInt();
		//Displaying the formatted message/Mostrando a mensagem formatada
		System.out.printf("Olá %s, você tem %d anos.", name, age);
		
	}
}
