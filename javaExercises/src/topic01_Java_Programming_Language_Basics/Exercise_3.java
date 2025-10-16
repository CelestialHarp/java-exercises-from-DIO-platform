package topic01_Java_Programming_Language_Basics;

import java.util.Scanner;

public class Exercise_3 {
	public static void main(String Args[]) {
		//[EN-US]: Write a code which takes the base and height of a rectangle, calculate it's area and exhibit on the screen: formula: area = base X height
		
		//[PT-BR]:Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela fórmula: área=base X altura
		
		//Creating scanner to get user input/Criando scanner para obter input do usuário
		Scanner scanner = new Scanner(System.in);
		//Getting base and height sizes/Obtendo tamanhos da base e da altura
		System.out.print("Digite o tamanho da base do retângulo cuja área será calculada:");
		int base = scanner.nextInt();
		
		System.out.print("Digite o tamanho da altura do retângulo cuja área será calculada:");
		int height = scanner.nextInt();
		//...
		
		//calculating area
		int area = (base * height);
		//Displaying the formatted message/Mostrando a mensagem formatada
		System.out.println("Fórmula: Área = base X altura");
		System.out.printf("%d = %d X %d", area, base, height);
		
	}
 
}
