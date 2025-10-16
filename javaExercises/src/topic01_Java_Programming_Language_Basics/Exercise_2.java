package topic01_Java_Programming_Language_Basics;

import java.util.Scanner;

public class Exercise_2 {
		public static void main(String Args[]) {
			//[EN-US]: Write a code which takes the size of the side of a square, calculates it's area and exhibit it on the screen: formula: area=side X side
			
			//[PT-BR]: Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela: fórmula: área=lado X lado
			
			//Creating scanner to get user input/Criando scanner para obter input do usuário
			Scanner scanner = new Scanner(System.in);
			//Getting side's size/Obtendo tamanho do lado
			System.out.print("Digite o tamanho de um lado do quadrado cuja área será calculada:");
			int side = scanner.nextInt();
			
			//calculating area
			int area = (side * side);
			//Displaying the formatted message/Mostrando a mensagem formatada
			System.out.println("Fórmula: Área = lado X lado");
			System.out.printf("%d = %d X %d", area, side, side);
			
		}
}
