package topic02_Control_Structures_In_Java;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_2 {
	//[EN-US]: Write a code where the user enters their height and weight, calculates their BMI (BMI = weight / (height * height)), and displays a message based on the result (summarized description).
	
	//[PT-BR]: Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado (descrição resumida).
	public static void main(String Args[]) {
		
		//Creating scanner to get user input/Criando scanner para obter input do usuário
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		//Getting base and height sizes/Obtendo tamanhos da base e da altura
		System.out.print("Digite seu peso:");
		double weight = scanner.nextDouble();
		
		System.out.print("Digite a sua altura:");
		double height = scanner.nextDouble();
		//using doubles because it's good practice, because it is more supported and less risky.
		double BMI = weight/(height * height); 
		
		//there is no necessity of reserving the adequate message in a variable. I'll do it only when needed.
		//Implementing the logic in a way it's less verbose and thus easier to read.
		if (BMI <= 18.5) {
		} else if (BMI <= 24.9) {
            System.out.println("Peso ideal");
        } else if (BMI <= 29.9) {
        	System.out.println("Levemente acima do peso");
        } else if (BMI <= 34.9) {
        	System.out.println("Obesidade Grau I");
        } else if (BMI <= 39.9) {
        	System.out.println("Obesidade Grau II (Severa)");
        } else {
        	System.out.println("Obesidade III (Mórbida)");
        }

	}

}
