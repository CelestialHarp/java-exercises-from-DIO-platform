package topic03_Java_And_The_Art_Of_Abstraction_With_Classes_And_Encapsulation.Exercício_1;

public class BankAccount {
	//I find the way people normally structure attributes, getters and setters a little confusing, so I will comment their layers so that I cannot be confused, at least for now that I am a starter. Probably it will get less confusing over time.
	
	//Attributes
	private double balance = 0;
	
	private double overdraft = 0;
	
	
	//Constructor:
	public BankAccount(double depositAmount) {
		super();
		this.balance = depositAmount;
		if (depositAmount <= 500.00) {
			overdraft = 50.00;
		} else {
			overdraft = depositAmount * 0.5;
		}
	}
	
	
	//Getters and Setters:
	public double getBalance() {
		return balance;
	}

	public double getOverdraft() {
		return overdraft;
	}
	//automatically generated setter methods for overdraft and balance removed to avoid direct interaction.
	
	//My methods. I consider it to be adequate to have methods like these, that are basically other getter and setter methods, but with different quirks, because this way we preserve the simpler getter and setter methods for when the need comes, for example, when trying to extract useful data (although I am not a big fan of companies peeking private data, I understand many times it is good to understand better your publics and improving your enterprise).
	public void depositMoney(double depositAmount){
		this.balance += depositAmount;
	}
	public void withdrawMoney(double withdrawalAmount){
		double availiableAmount = this.balance + this.overdraft; 
		if (withdrawalAmount <= availiableAmount) {
			this.balance -= withdrawalAmount;
		} else {
			System.out.println("Total disponível insuficiente. \n Total disponível: \n R$:"+ availiableAmount + "Total faltante: R$" + (withdrawalAmount - availiableAmount));
			return;
		}
		if (this.balance < 0){
			
			double usedOverdraft = Math.abs(this.balance);
			double fee = usedOverdraft * 0.20; //I know that normally a variable declaration containing the percentage should be done, to avoid problems related to hard-coding, but in this context it is obviously irrelevant.
			this.balance -= fee;
			double remainingOverdraft = this.overdraft - usedOverdraft;
			System.out.println("Aviso, sua conta entrou no cheque especial. \n Valor usado: \n R$: " + usedOverdraft + "\nSerá cobrada uma taxa de 20% sobre este valor. \n" + "\nValor restante: R$:" + (remainingOverdraft));
			System.out.println("Sua dívida: R$" + this.balance);			
			
		}

	}
}
