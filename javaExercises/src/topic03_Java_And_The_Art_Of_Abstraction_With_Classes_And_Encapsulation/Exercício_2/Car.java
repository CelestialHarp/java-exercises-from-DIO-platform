package topic03_Java_And_The_Art_Of_Abstraction_With_Classes_And_Encapsulation.Exercício_2;
	
	enum Gear {
		/*I know the readme doesn't ask me for a reverse gear but every car has a reverse gear.
		 *  Probably my professor just cut out the reverse one because it would be easier for the student to implement the code.
		 */
		reverse(-1),
		neutral(0),
		first(1),
		second(2),
		third(3),
		fourth(4),
		fifth(5),
		sixth(6);
		
		private final int gearNumber;
		
		public int getNumber() {
			return this.gearNumber;
		}
		
		Gear(int i) {
			this.gearNumber = i;
		}
		
		public static Gear getGearByNumber(int number) {
			for (Gear g : values()) {
				if (g.gearNumber == number) {
					return g;
				}
			}
			return null;
		}
		
	}
	public class Car {
		//Atributes:
		private String name;
		
		private boolean isTurnedOn = false;
		//since there's only two orientations, I chose boolean.
		private boolean isHeadingRight;
		private int speed = 0;
		private Gear currentGear;
		
		
		
		public Car(String name) {
			this.setName(name);
			this.setIsTurnedOn(false);
			this.currentGear = Gear.neutral;
			this.speed = 0;
		}
		
	
		//getters and Setters:
		
		public String getName() {
			return name;
		}
		
		private void setName(String name) {
			this.name = name;
			
		}
	
		public boolean getIsTurnedOn() {
			return this.isTurnedOn;
			
		}
		
		public void setIsTurnedOn(boolean b) {
			if (this.speed != 0 && this.currentGear.getNumber() != 0) {
				System.out.println("Você não pode desligar o carro com ele em movimento.");
			} else {
				this.isTurnedOn = b;
			}
			
		}
		
		public String getOrientation() {
			if (this.speed == 0) {
				return "Parado";
			} else {
				return isHeadingRight ? "Virando para Direita" : "Virando para Esquerda";
			}
		}
	
		public void setOrientation(boolean isHeadingRight) {
			if (this.speed >= 1 && this.speed <= 40) {
				this.isHeadingRight = isHeadingRight;
				System.out.println(isHeadingRight ? "Virando para a direita." : "Virando para a esquerda.");
			} else {
				// Seu código não checava essa regra.
				System.out.println("Não é possível virar se a velocidade não estiver entre 1 e 40 Km/h.");
			}
			this.isHeadingRight = isHeadingRight;
		}
		
		public int getSpeed() {
			return this.speed;
		}
	
	
		public Gear getCurrentGear() {
			return this.currentGear;
		}
	
		public void setCurrentGear(int gearNumber) {
			Gear desiredGear = Gear.getGearByNumber(gearNumber);
			//I learned a really good way of making long logic expressions that must have the same output more pleasant to see and easier to grasp:
			if (
			//Conditions to detter the user from jumping a gear. For instance, from the 1st to the 3rd. 
			(this.currentGear.getNumber() == -1 && (desiredGear.getNumber() < -1 || desiredGear.getNumber() > 0)) ||
			(this.currentGear.getNumber() == 0 && (desiredGear.getNumber() < -1 || desiredGear.getNumber() > 1 )) ||
			(this.currentGear.getNumber() == 1 && (desiredGear.getNumber() < 0 || desiredGear.getNumber() > 2 )) ||
			(this.currentGear.getNumber() == 2 && (desiredGear.getNumber() < 1 || desiredGear.getNumber() > 3 )) ||
			(this.currentGear.getNumber() == 3 && (desiredGear.getNumber() < 2 || desiredGear.getNumber() > 4 )) ||
			(this.currentGear.getNumber() == 4 && (desiredGear.getNumber() < 3 || desiredGear.getNumber() > 5 )) ||
			(this.currentGear.getNumber() == 5 && (desiredGear.getNumber() < 4 || desiredGear.getNumber() > 6 )) ||
			(this.currentGear.getNumber() == 6 && (desiredGear.getNumber() < 5 || desiredGear.getNumber() > 6 ))) {
				System.out.println("Não é possível alterar para a marcha desejada. Altere gradualmente, conforme a velocidade");
			} else {
				this.currentGear = desiredGear;
			}
		}
		
		//My methods:
		public void setSpeed (int value) {
			int speed = this.speed;
			int desiredSpeed = (speed += value);
			/*The following if statement is just a representation of the system's constrictions according to the readme, but starting from the speed, not the gear. 
			 * So, it goes, beginning in the starred line, just as the readme reads: "f the car is in gear 0 (neutral) it cannot accelerate",
			 * "if it is in 1st gear its speed can be between 0km and 20km", and so on. The only difference from what would
			 * be the exact code my professor wants me to write would be that in the line 144 it would just check if the gears 0 and 1 are not engaged, not also the -1.
			 * I'm proud of the way I implemented the restrictions, they've turned what would be  a big succession of if statements checking conditions which otherwise
			 * would be difficult to pinpoint by reading the readme into a smaller set of restrictions, one after another, that can be read in a way that is much more
			 * similar to the exact way restrictions are given in the read.me, except for the inverted way I put the logic propositions, which I have found more intuitive.
			 * NOTE: As I've already said, I know I implemented restrictions that weren't given in the readme, but since this is just a simple exercise, it is not a problem.
			 * The starred line is just a way of saying "if the desired is speed is 0 and the gear isn't neutral nor the first, neither the reverse, it shouldn't be possible
			 * to make the change". It's a way I found to give 0 as a possible velocity for those three gears. interestingly, I lost a little time dealing with the ||
			 * operator because in natural language people tend to say these kinds of conditions as ors, but actually what I needed was an &&.
			 * 
			 */
			if (
			(desiredSpeed >= -20 && desiredSpeed < 0) && (this.currentGear.getNumber() != -1) ||
			(desiredSpeed == 0) && (this.currentGear.getNumber() != -1 && this.currentGear.getNumber() != 0 && this.currentGear.getNumber() != 1) || //*
			(desiredSpeed > 0 && desiredSpeed <= 20) && (this.currentGear.getNumber() != 1) ||
			(desiredSpeed > 20 && desiredSpeed <= 40) && (this.currentGear.getNumber() != 2) ||
			(desiredSpeed > 40 && desiredSpeed <= 60) && (this.currentGear.getNumber() != 3) ||
			(desiredSpeed > 60 && desiredSpeed <= 80) && (this.currentGear.getNumber() != 4) ||
			(desiredSpeed > 80 && desiredSpeed <= 100) && (this.currentGear.getNumber() != 5) ||
			(desiredSpeed > 100 && desiredSpeed <= 120) && (this.currentGear.getNumber() != 6)) {
				System.out.println("Não é possível alterar a velocidade, mude de marcha");
			} else {
				this.speed += value;
			}
		}
}
