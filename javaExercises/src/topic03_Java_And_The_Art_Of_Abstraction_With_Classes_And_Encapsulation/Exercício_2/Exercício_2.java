package topic03_Java_And_The_Art_Of_Abstraction_With_Classes_And_Encapsulation.Exercício_2;
//In the former exercises I place the task to do here in the comment, even though sometimes they were a bit large, to save me the time of structuring a read.me for each one of tasks. But since the descriptions for now on have grown larger, I will be making read.mes for them.

import java.util.Scanner;

public class Exercício_2 {
	
	private final static Scanner scanner = new Scanner(System.in);
	private static Car car = null;
	
	public static void main(String Args[]) {
		
		int option = -1;		
		while (car == null) {
			System.out.println("Bem-vindo ao driver simulation.");
			System.out.println("Você ainda não tem um carro. Para jogar, você precisa adquirir um. Digite 1 para adquirir um carro ou 0 para sair.");
			option = scanner.nextInt();
			scanner.nextLine();
			switch (option) {
				case 0 -> System.exit(0);
				case 1 -> {
					System.out.println("Digite o nome do carro que deseja adquirir:");
					String name = scanner.nextLine(); 
					car = new Car(name);
				}
			}
				
		}
		while (car != null){
			System.out.println("Bem-vindo ao seu " + car.getName());
			System.out.println("Marcha Atual: " + car.getCurrentGear() + "\nVelocidade Atual: " + car.getSpeed()+ "Km/h" + "\nMotor:" + (car.getIsTurnedOn()? "Ligado" : "Desligado"));
			System.out.println("Eis as opções disponíveis:");
			System.out.println("1 Ligar o carro");
			System.out.println("2 Desligar o carro");
			System.out.println("3 Acelerar");
			System.out.println("4 Diminuir a velocidade");
			System.out.println("5 Virar para esquerda");
			System.out.println("6 Virar para direita");
			System.out.println("7 Trocar a marcha");
			System.out.println("0 - Sair");
			option = scanner.nextInt();
			scanner.nextLine();
			if (!(car.getIsTurnedOn()) && option != 1) {
				System.out.println("Seu carro não está ligado, possível usar nenhuma opção. Digite 1 para ligar o carro ou 0 para sair.");
				option = scanner.nextInt();
				scanner.nextLine();
			}
	     		switch (option) {
					case 0 -> System.exit(0);
					case 1 -> car.setIsTurnedOn(true);
					case 2 -> car.setIsTurnedOn(false);
					case 3 -> {
							System.out.println("Pisando no acelerador.\n Velocidade atual:"+ car.getSpeed() + "Km/h" + "\nAperte enter para aumentar mais um km, ou 0 para sair");
							String answer = "";
							while(!(answer.equals("0"))) {
							answer = scanner.nextLine();
								car.setSpeed(1);
								System.out.println("Velocidade atual: " + car.getSpeed());
								if(car.getSpeed() == 120) {
									System.out.println("Velocidade máxima.");
									break;
								}
							};
						
					}
					case 4 -> {
						System.out.println("Pisando no freio.\n Velocidade atual:"+ car.getSpeed() + "Km/h" + "\nAperte enter para diminuir mais um km, ou 0 para sair");
						String answer = "";
						while(!(answer.equals("0"))) {
							answer = scanner.nextLine();
							car.setSpeed(-1);
							System.out.println("Velocidade atual: " + car.getSpeed());
							if(car.getSpeed() == -20) {
								System.out.println("Velocidade reversa máxima.");
								break;
							}
						};
					
					}
					case 5 -> car.setOrientation(false);
					case 6 -> car.setOrientation(true);
					case 7 -> {
						System.out.println("Digite a marcha desejada");
						int desiredGear = scanner.nextInt();
						scanner.nextLine();
						car.setCurrentGear(desiredGear);
					}
				}
	     		
			
		}
		System.out.println("Você saiu do seu carro.");
		scanner.close();
	}
	
}
